// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGFestivalDetailInfo.proto

package emu.grasscutter.net.proto;

public final class GCGFestivalDetailInfoOuterClass {
    private GCGFestivalDetailInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GCGFestivalDetailInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GCGFestivalDetailInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool OOLFCFMNBOJ = 15;</code>
         *
         * @return The oOLFCFMNBOJ.
         */
        boolean getOOLFCFMNBOJ();
    }
    /**
     *
     *
     * <pre>
     * Name: ELCAKMDGIBA
     * </pre>
     *
     * Protobuf type {@code GCGFestivalDetailInfo}
     */
    public static final class GCGFestivalDetailInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GCGFestivalDetailInfo)
            GCGFestivalDetailInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GCGFestivalDetailInfo.newBuilder() to construct.
        private GCGFestivalDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GCGFestivalDetailInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GCGFestivalDetailInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GCGFestivalDetailInfo(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 120:
                            {
                                oOLFCFMNBOJ_ = input.readBool();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                    .internal_static_GCGFestivalDetailInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                    .internal_static_GCGFestivalDetailInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo.class,
                            emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                                    .Builder.class);
        }

        public static final int OOLFCFMNBOJ_FIELD_NUMBER = 15;
        private boolean oOLFCFMNBOJ_;
        /**
         * <code>bool OOLFCFMNBOJ = 15;</code>
         *
         * @return The oOLFCFMNBOJ.
         */
        @java.lang.Override
        public boolean getOOLFCFMNBOJ() {
            return oOLFCFMNBOJ_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (oOLFCFMNBOJ_ != false) {
                output.writeBool(15, oOLFCFMNBOJ_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (oOLFCFMNBOJ_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, oOLFCFMNBOJ_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo other =
                    (emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo) obj;

            if (getOOLFCFMNBOJ() != other.getOOLFCFMNBOJ()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + OOLFCFMNBOJ_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOOLFCFMNBOJ());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Name: ELCAKMDGIBA
         * </pre>
         *
         * Protobuf type {@code GCGFestivalDetailInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GCGFestivalDetailInfo)
                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                        .internal_static_GCGFestivalDetailInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                        .internal_static_GCGFestivalDetailInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                                        .class,
                                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                oOLFCFMNBOJ_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                        .internal_static_GCGFestivalDetailInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                    build() {
                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                    buildPartial() {
                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo result =
                        new emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo(
                                this);
                result.oOLFCFMNBOJ_ = oOLFCFMNBOJ_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo other) {
                if (other
                        == emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                                .getDefaultInstance()) return this;
                if (other.getOOLFCFMNBOJ() != false) {
                    setOOLFCFMNBOJ(other.getOOLFCFMNBOJ());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean oOLFCFMNBOJ_;
            /**
             * <code>bool OOLFCFMNBOJ = 15;</code>
             *
             * @return The oOLFCFMNBOJ.
             */
            @java.lang.Override
            public boolean getOOLFCFMNBOJ() {
                return oOLFCFMNBOJ_;
            }
            /**
             * <code>bool OOLFCFMNBOJ = 15;</code>
             *
             * @param value The oOLFCFMNBOJ to set.
             * @return This builder for chaining.
             */
            public Builder setOOLFCFMNBOJ(boolean value) {

                oOLFCFMNBOJ_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool OOLFCFMNBOJ = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOOLFCFMNBOJ() {

                oOLFCFMNBOJ_ = false;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:GCGFestivalDetailInfo)
        }

        // @@protoc_insertion_point(class_scope:GCGFestivalDetailInfo)
        private static final emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass
                        .GCGFestivalDetailInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo();
        }

        public static emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GCGFestivalDetailInfo> PARSER =
                new com.google.protobuf.AbstractParser<GCGFestivalDetailInfo>() {
                    @java.lang.Override
                    public GCGFestivalDetailInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GCGFestivalDetailInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GCGFestivalDetailInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GCGFestivalDetailInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GCGFestivalDetailInfoOuterClass.GCGFestivalDetailInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GCGFestivalDetailInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GCGFestivalDetailInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033GCGFestivalDetailInfo.proto\",\n\025GCGFest"
                    + "ivalDetailInfo\022\023\n\013OOLFCFMNBOJ\030\017 \001(\010B!\n\031e"
                    + "mu.grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GCGFestivalDetailInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GCGFestivalDetailInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GCGFestivalDetailInfo_descriptor,
                        new java.lang.String[] {
                            "OOLFCFMNBOJ",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}