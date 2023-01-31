// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code GroupData}
 */
public final class GroupData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GroupData)
    GroupDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupData.newBuilder() to construct.
  private GroupData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupData() {
    retentionState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_GroupData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_GroupData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.GroupData.class, org.matrix.dma.gchat.proto.GroupData.Builder.class);
  }

  private int bitField0_;
  public static final int RETENTION_STATE_FIELD_NUMBER = 1;
  private int retentionState_ = 0;
  /**
   * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
   * @return Whether the retentionState field is set.
   */
  @java.lang.Override public boolean hasRetentionState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
   * @return The retentionState.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.RetentionSettings.RetentionState getRetentionState() {
    org.matrix.dma.gchat.proto.RetentionSettings.RetentionState result = org.matrix.dma.gchat.proto.RetentionSettings.RetentionState.forNumber(retentionState_);
    return result == null ? org.matrix.dma.gchat.proto.RetentionSettings.RetentionState.UNKNOWN_RETENTION_STATE : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, retentionState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, retentionState_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.matrix.dma.gchat.proto.GroupData)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.GroupData other = (org.matrix.dma.gchat.proto.GroupData) obj;

    if (hasRetentionState() != other.hasRetentionState()) return false;
    if (hasRetentionState()) {
      if (retentionState_ != other.retentionState_) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRetentionState()) {
      hash = (37 * hash) + RETENTION_STATE_FIELD_NUMBER;
      hash = (53 * hash) + retentionState_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.GroupData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.matrix.dma.gchat.proto.GroupData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GroupData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GroupData)
      org.matrix.dma.gchat.proto.GroupDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_GroupData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_GroupData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.GroupData.class, org.matrix.dma.gchat.proto.GroupData.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.GroupData.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      retentionState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_GroupData_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.GroupData getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.GroupData.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.GroupData build() {
      org.matrix.dma.gchat.proto.GroupData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.GroupData buildPartial() {
      org.matrix.dma.gchat.proto.GroupData result = new org.matrix.dma.gchat.proto.GroupData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.GroupData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.retentionState_ = retentionState_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.matrix.dma.gchat.proto.GroupData) {
        return mergeFrom((org.matrix.dma.gchat.proto.GroupData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.GroupData other) {
      if (other == org.matrix.dma.gchat.proto.GroupData.getDefaultInstance()) return this;
      if (other.hasRetentionState()) {
        setRetentionState(other.getRetentionState());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.RetentionSettings.RetentionState tmpValue =
                  org.matrix.dma.gchat.proto.RetentionSettings.RetentionState.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                retentionState_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int retentionState_ = 0;
    /**
     * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
     * @return Whether the retentionState field is set.
     */
    @java.lang.Override public boolean hasRetentionState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
     * @return The retentionState.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.RetentionSettings.RetentionState getRetentionState() {
      org.matrix.dma.gchat.proto.RetentionSettings.RetentionState result = org.matrix.dma.gchat.proto.RetentionSettings.RetentionState.forNumber(retentionState_);
      return result == null ? org.matrix.dma.gchat.proto.RetentionSettings.RetentionState.UNKNOWN_RETENTION_STATE : result;
    }
    /**
     * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
     * @param value The retentionState to set.
     * @return This builder for chaining.
     */
    public Builder setRetentionState(org.matrix.dma.gchat.proto.RetentionSettings.RetentionState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      retentionState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .RetentionSettings.RetentionState retention_state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRetentionState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      retentionState_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GroupData)
  }

  // @@protoc_insertion_point(class_scope:GroupData)
  private static final org.matrix.dma.gchat.proto.GroupData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.GroupData();
  }

  public static org.matrix.dma.gchat.proto.GroupData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GroupData>
      PARSER = new com.google.protobuf.AbstractParser<GroupData>() {
    @java.lang.Override
    public GroupData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GroupData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.GroupData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

