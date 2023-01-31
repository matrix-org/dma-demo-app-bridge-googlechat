// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code UserBlockRelationship}
 */
public final class UserBlockRelationship extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserBlockRelationship)
    UserBlockRelationshipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserBlockRelationship.newBuilder() to construct.
  private UserBlockRelationship(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserBlockRelationship() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserBlockRelationship();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserBlockRelationship_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserBlockRelationship_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.UserBlockRelationship.class, org.matrix.dma.gchat.proto.UserBlockRelationship.Builder.class);
  }

  private int bitField0_;
  public static final int IS_BLOCKED_BY_REQUESTER_FIELD_NUMBER = 1;
  private boolean isBlockedByRequester_ = false;
  /**
   * <code>optional bool is_blocked_by_requester = 1;</code>
   * @return Whether the isBlockedByRequester field is set.
   */
  @java.lang.Override
  public boolean hasIsBlockedByRequester() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool is_blocked_by_requester = 1;</code>
   * @return The isBlockedByRequester.
   */
  @java.lang.Override
  public boolean getIsBlockedByRequester() {
    return isBlockedByRequester_;
  }

  public static final int HAS_BLOCKED_REQUESTER_FIELD_NUMBER = 2;
  private boolean hasBlockedRequester_ = false;
  /**
   * <code>optional bool has_blocked_requester = 2;</code>
   * @return Whether the hasBlockedRequester field is set.
   */
  @java.lang.Override
  public boolean hasHasBlockedRequester() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool has_blocked_requester = 2;</code>
   * @return The hasBlockedRequester.
   */
  @java.lang.Override
  public boolean getHasBlockedRequester() {
    return hasBlockedRequester_;
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
      output.writeBool(1, isBlockedByRequester_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, hasBlockedRequester_);
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
        .computeBoolSize(1, isBlockedByRequester_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasBlockedRequester_);
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.UserBlockRelationship)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.UserBlockRelationship other = (org.matrix.dma.gchat.proto.UserBlockRelationship) obj;

    if (hasIsBlockedByRequester() != other.hasIsBlockedByRequester()) return false;
    if (hasIsBlockedByRequester()) {
      if (getIsBlockedByRequester()
          != other.getIsBlockedByRequester()) return false;
    }
    if (hasHasBlockedRequester() != other.hasHasBlockedRequester()) return false;
    if (hasHasBlockedRequester()) {
      if (getHasBlockedRequester()
          != other.getHasBlockedRequester()) return false;
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
    if (hasIsBlockedByRequester()) {
      hash = (37 * hash) + IS_BLOCKED_BY_REQUESTER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBlockedByRequester());
    }
    if (hasHasBlockedRequester()) {
      hash = (37 * hash) + HAS_BLOCKED_REQUESTER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasBlockedRequester());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserBlockRelationship parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.UserBlockRelationship prototype) {
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
   * Protobuf type {@code UserBlockRelationship}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserBlockRelationship)
      org.matrix.dma.gchat.proto.UserBlockRelationshipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserBlockRelationship_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserBlockRelationship_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.UserBlockRelationship.class, org.matrix.dma.gchat.proto.UserBlockRelationship.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.UserBlockRelationship.newBuilder()
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
      isBlockedByRequester_ = false;
      hasBlockedRequester_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserBlockRelationship_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserBlockRelationship getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.UserBlockRelationship.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserBlockRelationship build() {
      org.matrix.dma.gchat.proto.UserBlockRelationship result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserBlockRelationship buildPartial() {
      org.matrix.dma.gchat.proto.UserBlockRelationship result = new org.matrix.dma.gchat.proto.UserBlockRelationship(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.UserBlockRelationship result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isBlockedByRequester_ = isBlockedByRequester_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hasBlockedRequester_ = hasBlockedRequester_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof org.matrix.dma.gchat.proto.UserBlockRelationship) {
        return mergeFrom((org.matrix.dma.gchat.proto.UserBlockRelationship)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.UserBlockRelationship other) {
      if (other == org.matrix.dma.gchat.proto.UserBlockRelationship.getDefaultInstance()) return this;
      if (other.hasIsBlockedByRequester()) {
        setIsBlockedByRequester(other.getIsBlockedByRequester());
      }
      if (other.hasHasBlockedRequester()) {
        setHasBlockedRequester(other.getHasBlockedRequester());
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
              isBlockedByRequester_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              hasBlockedRequester_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private boolean isBlockedByRequester_ ;
    /**
     * <code>optional bool is_blocked_by_requester = 1;</code>
     * @return Whether the isBlockedByRequester field is set.
     */
    @java.lang.Override
    public boolean hasIsBlockedByRequester() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool is_blocked_by_requester = 1;</code>
     * @return The isBlockedByRequester.
     */
    @java.lang.Override
    public boolean getIsBlockedByRequester() {
      return isBlockedByRequester_;
    }
    /**
     * <code>optional bool is_blocked_by_requester = 1;</code>
     * @param value The isBlockedByRequester to set.
     * @return This builder for chaining.
     */
    public Builder setIsBlockedByRequester(boolean value) {
      
      isBlockedByRequester_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_blocked_by_requester = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsBlockedByRequester() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isBlockedByRequester_ = false;
      onChanged();
      return this;
    }

    private boolean hasBlockedRequester_ ;
    /**
     * <code>optional bool has_blocked_requester = 2;</code>
     * @return Whether the hasBlockedRequester field is set.
     */
    @java.lang.Override
    public boolean hasHasBlockedRequester() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool has_blocked_requester = 2;</code>
     * @return The hasBlockedRequester.
     */
    @java.lang.Override
    public boolean getHasBlockedRequester() {
      return hasBlockedRequester_;
    }
    /**
     * <code>optional bool has_blocked_requester = 2;</code>
     * @param value The hasBlockedRequester to set.
     * @return This builder for chaining.
     */
    public Builder setHasBlockedRequester(boolean value) {
      
      hasBlockedRequester_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool has_blocked_requester = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasBlockedRequester() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hasBlockedRequester_ = false;
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


    // @@protoc_insertion_point(builder_scope:UserBlockRelationship)
  }

  // @@protoc_insertion_point(class_scope:UserBlockRelationship)
  private static final org.matrix.dma.gchat.proto.UserBlockRelationship DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.UserBlockRelationship();
  }

  public static org.matrix.dma.gchat.proto.UserBlockRelationship getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UserBlockRelationship>
      PARSER = new com.google.protobuf.AbstractParser<UserBlockRelationship>() {
    @java.lang.Override
    public UserBlockRelationship parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserBlockRelationship> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserBlockRelationship> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserBlockRelationship getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

