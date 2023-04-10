package emu.grasscutter.server.http.documentation;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.Grasscutter.ServerRunMode;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.server.http.Router;
import emu.grasscutter.utils.FileUtils;
import emu.grasscutter.utils.objects.HandbookBody;
import io.javalin.Javalin;
import io.javalin.http.Context;

/** Handles requests for the new GM Handbook. */
public final class HandbookHandler implements Router {
    private final byte[] handbook;
    private final boolean serve;

    /**
     * Constructor for the handbook router.
     * Enables serving the handbook if the handbook file is found.
     */
    public HandbookHandler() {
        this.handbook = FileUtils.readResource("/handbook.html");
        this.serve = this.handbook.length > 0;
    }

    @Override
    public void applyRoutes(Javalin javalin) {
        // The handbook content. (built from src/handbook)
        javalin.get("/handbook", this::serveHandbook);

        // Handbook control routes.
        javalin.post("/handbook/avatar", this::grantAvatar);
    }

    /**
     * @return True if the server can execute handbook commands.
     */
    private boolean controlSupported() {
        return Grasscutter.getRunMode() == ServerRunMode.HYBRID;
    }

    /**
     * Serves the handbook if it is found.
     *
     * @route GET /handbook
     * @param ctx The Javalin request context.
     */
    private void serveHandbook(Context ctx) {
        if (!this.serve) {
            ctx.status(500).result("Handbook not found.");
        } else {
            ctx.contentType("text/html").result(this.handbook);
        }
    }

    /**
     * Grants the avatar to the user.
     *
     * @route POST /handbook/avatar
     * @param ctx The Javalin request context.
     */
    private void grantAvatar(Context ctx) {
        if (!this.controlSupported()) {
            ctx.status(500).result("Handbook control not supported.");
            return;
        }

        // Parse the request body into a class.
        var request = ctx.bodyAsClass(HandbookBody.GrantAvatar.class);
        // Validate the request.
        if (request.getPlayer() == null || request.getAvatar() == null) {
            ctx.status(400).result("Invalid request.");
            return;
        }

        try {
            // Parse the requested player.
            var playerId = Integer.parseInt(request.getPlayer());
            var player = Grasscutter.getGameServer().getPlayerByUid(playerId);

            // Parse the requested avatar.
            var avatarId = Integer.parseInt(request.getAvatar());
            var avatarData = GameData.getAvatarDataMap().get(avatarId);

            // Validate the request.
            if (player == null || avatarData == null) {
                ctx.status(400).result("Invalid player UID or avatar ID.");
                return;
            }

            // Create the new avatar.
            var avatar = new Avatar(avatarData);
            avatar.setLevel(request.getLevel());
            avatar.setPromoteLevel(Avatar.getMinPromoteLevel(avatar.getLevel()));
            avatar.getSkillDepot().getSkillsAndEnergySkill().forEach(id ->
                avatar.setSkillLevel(id, request.getTalentLevels()));
            avatar.forceConstellationLevel(request.getConstellations());
            avatar.recalcStats(true); avatar.save();

            player.addAvatar(avatar); // Add the avatar.
            ctx.json(HandbookBody.Response.builder()
                .status(200)
                .message("Avatar granted.")
                .build());
        } catch (NumberFormatException ignored) {
            ctx.status(500).result("Invalid player UID or avatar ID.");
        }
    }
}