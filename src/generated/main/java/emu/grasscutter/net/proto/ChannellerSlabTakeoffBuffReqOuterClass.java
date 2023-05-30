// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabTakeoffBuffReq.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabTakeoffBuffReqOuterClass {
    private ChannellerSlabTakeoffBuffReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ChannellerSlabTakeoffBuffReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ChannellerSlabTakeoffBuffReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 buff_id = 7;</code>
         *
         * @return The buffId.
         */
        int getBuffId();

        /**
         * <code>uint32 slot_id = 15;</code>
         *
         * @return The slotId.
         */
        int getSlotId();

        /**
         * <code>bool is_mp = 5;</code>
         *
         * @return The isMp.
         */
        boolean getIsMp();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8112
     * Obf: KDBPPMGGOGJ
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabTakeoffBuffReq}
     */
    public static final class ChannellerSlabTakeoffBuffReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ChannellerSlabTakeoffBuffReq)
            ChannellerSlabTakeoffBuffReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ChannellerSlabTakeoffBuffReq.newBuilder() to construct.
        private ChannellerSlabTakeoffBuffReq(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ChannellerSlabTakeoffBuffReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ChannellerSlabTakeoffBuffReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ChannellerSlabTakeoffBuffReq(
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
                        case 40:
                            {
                                isMp_ = input.readBool();
                                break;
                            }
                        case 56:
                            {
                                buffId_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                slotId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                    .internal_static_ChannellerSlabTakeoffBuffReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                    .internal_static_ChannellerSlabTakeoffBuffReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                    .ChannellerSlabTakeoffBuffReq.class,
                            emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                    .ChannellerSlabTakeoffBuffReq.Builder.class);
        }

        public static final int BUFF_ID_FIELD_NUMBER = 7;
        private int buffId_;
        /**
         * <code>uint32 buff_id = 7;</code>
         *
         * @return The buffId.
         */
        @java.lang.Override
        public int getBuffId() {
            return buffId_;
        }

        public static final int SLOT_ID_FIELD_NUMBER = 15;
        private int slotId_;
        /**
         * <code>uint32 slot_id = 15;</code>
         *
         * @return The slotId.
         */
        @java.lang.Override
        public int getSlotId() {
            return slotId_;
        }

        public static final int IS_MP_FIELD_NUMBER = 5;
        private boolean isMp_;
        /**
         * <code>bool is_mp = 5;</code>
         *
         * @return The isMp.
         */
        @java.lang.Override
        public boolean getIsMp() {
            return isMp_;
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
            if (isMp_ != false) {
                output.writeBool(5, isMp_);
            }
            if (buffId_ != 0) {
                output.writeUInt32(7, buffId_);
            }
            if (slotId_ != 0) {
                output.writeUInt32(15, slotId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isMp_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, isMp_);
            }
            if (buffId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, buffId_);
            }
            if (slotId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, slotId_);
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
                    emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                            .ChannellerSlabTakeoffBuffReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass.ChannellerSlabTakeoffBuffReq
                    other =
                            (emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                            .ChannellerSlabTakeoffBuffReq)
                                    obj;

            if (getBuffId() != other.getBuffId()) return false;
            if (getSlotId() != other.getSlotId()) return false;
            if (getIsMp() != other.getIsMp()) return false;
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
            hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
            hash = (53 * hash) + getBuffId();
            hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSlotId();
            hash = (37 * hash) + IS_MP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsMp());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
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
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq
                        prototype) {
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
         * CmdId: 8112
         * Obf: KDBPPMGGOGJ
         * </pre>
         *
         * Protobuf type {@code ChannellerSlabTakeoffBuffReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ChannellerSlabTakeoffBuffReq)
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .internal_static_ChannellerSlabTakeoffBuffReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .internal_static_ChannellerSlabTakeoffBuffReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                        .ChannellerSlabTakeoffBuffReq.class,
                                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                        .ChannellerSlabTakeoffBuffReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass.ChannellerSlabTakeoffBuffReq.newBuilder()
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
                buffId_ = 0;

                slotId_ = 0;

                isMp_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .internal_static_ChannellerSlabTakeoffBuffReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                            .ChannellerSlabTakeoffBuffReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                            .ChannellerSlabTakeoffBuffReq
                    build() {
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                            .ChannellerSlabTakeoffBuffReq
                    buildPartial() {
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq
                        result =
                                new emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                        .ChannellerSlabTakeoffBuffReq(this);
                result.buffId_ = buffId_;
                result.slotId_ = slotId_;
                result.isMp_ = isMp_;
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
                        emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                            .ChannellerSlabTakeoffBuffReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                    .ChannellerSlabTakeoffBuffReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq.getDefaultInstance()) return this;
                if (other.getBuffId() != 0) {
                    setBuffId(other.getBuffId());
                }
                if (other.getSlotId() != 0) {
                    setSlotId(other.getSlotId());
                }
                if (other.getIsMp() != false) {
                    setIsMp(other.getIsMp());
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
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                .ChannellerSlabTakeoffBuffReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                                            .ChannellerSlabTakeoffBuffReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int buffId_;
            /**
             * <code>uint32 buff_id = 7;</code>
             *
             * @return The buffId.
             */
            @java.lang.Override
            public int getBuffId() {
                return buffId_;
            }
            /**
             * <code>uint32 buff_id = 7;</code>
             *
             * @param value The buffId to set.
             * @return This builder for chaining.
             */
            public Builder setBuffId(int value) {

                buffId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 buff_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBuffId() {

                buffId_ = 0;
                onChanged();
                return this;
            }

            private int slotId_;
            /**
             * <code>uint32 slot_id = 15;</code>
             *
             * @return The slotId.
             */
            @java.lang.Override
            public int getSlotId() {
                return slotId_;
            }
            /**
             * <code>uint32 slot_id = 15;</code>
             *
             * @param value The slotId to set.
             * @return This builder for chaining.
             */
            public Builder setSlotId(int value) {

                slotId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 slot_id = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSlotId() {

                slotId_ = 0;
                onChanged();
                return this;
            }

            private boolean isMp_;
            /**
             * <code>bool is_mp = 5;</code>
             *
             * @return The isMp.
             */
            @java.lang.Override
            public boolean getIsMp() {
                return isMp_;
            }
            /**
             * <code>bool is_mp = 5;</code>
             *
             * @param value The isMp to set.
             * @return This builder for chaining.
             */
            public Builder setIsMp(boolean value) {

                isMp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_mp = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsMp() {

                isMp_ = false;
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

            // @@protoc_insertion_point(builder_scope:ChannellerSlabTakeoffBuffReq)
        }

        // @@protoc_insertion_point(class_scope:ChannellerSlabTakeoffBuffReq)
        private static final emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                            .ChannellerSlabTakeoffBuffReq();
        }

        public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ChannellerSlabTakeoffBuffReq> PARSER =
                new com.google.protobuf.AbstractParser<ChannellerSlabTakeoffBuffReq>() {
                    @java.lang.Override
                    public ChannellerSlabTakeoffBuffReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ChannellerSlabTakeoffBuffReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ChannellerSlabTakeoffBuffReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ChannellerSlabTakeoffBuffReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffReqOuterClass
                        .ChannellerSlabTakeoffBuffReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ChannellerSlabTakeoffBuffReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ChannellerSlabTakeoffBuffReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"ChannellerSlabTakeoffBuffReq.proto\"O\n\034"
                    + "ChannellerSlabTakeoffBuffReq\022\017\n\007buff_id\030"
                    + "\007 \001(\r\022\017\n\007slot_id\030\017 \001(\r\022\r\n\005is_mp\030\005 \001(\010B\033\n"
                    + "\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ChannellerSlabTakeoffBuffReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_ChannellerSlabTakeoffBuffReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ChannellerSlabTakeoffBuffReq_descriptor,
                        new java.lang.String[] {
                            "BuffId", "SlotId", "IsMp",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}