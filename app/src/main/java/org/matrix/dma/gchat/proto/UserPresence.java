// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code UserPresence}
 */
public final class UserPresence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserPresence)
    UserPresenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserPresence.newBuilder() to construct.
  private UserPresence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserPresence() {
    presence_ = 0;
    dndState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserPresence();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserPresence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserPresence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.UserPresence.class, org.matrix.dma.gchat.proto.UserPresence.Builder.class);
  }

  private int bitField0_;
  public static final int USER_ID_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.UserId userId_;
  /**
   * <code>optional .UserId user_id = 1;</code>
   * @return Whether the userId field is set.
   */
  @java.lang.Override
  public boolean hasUserId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .UserId user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserId getUserId() {
    return userId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : userId_;
  }
  /**
   * <code>optional .UserId user_id = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserIdOrBuilder getUserIdOrBuilder() {
    return userId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : userId_;
  }

  public static final int PRESENCE_FIELD_NUMBER = 2;
  private int presence_ = 0;
  /**
   * <code>optional .Presence presence = 2;</code>
   * @return Whether the presence field is set.
   */
  @java.lang.Override public boolean hasPresence() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .Presence presence = 2;</code>
   * @return The presence.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.Presence getPresence() {
    org.matrix.dma.gchat.proto.Presence result = org.matrix.dma.gchat.proto.Presence.forNumber(presence_);
    return result == null ? org.matrix.dma.gchat.proto.Presence.UNDEFINED_PRESENCE : result;
  }

  public static final int ACTIVE_UNTIL_FIELD_NUMBER = 4;
  private long activeUntil_ = 0L;
  /**
   * <code>optional int64 active_until = 4;</code>
   * @return Whether the activeUntil field is set.
   */
  @java.lang.Override
  public boolean hasActiveUntil() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int64 active_until = 4;</code>
   * @return The activeUntil.
   */
  @java.lang.Override
  public long getActiveUntil() {
    return activeUntil_;
  }

  public static final int DND_STATE_FIELD_NUMBER = 3;
  private int dndState_ = 0;
  /**
   * <code>optional .DndState_State dnd_state = 3;</code>
   * @return Whether the dndState field is set.
   */
  @java.lang.Override public boolean hasDndState() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .DndState_State dnd_state = 3;</code>
   * @return The dndState.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.DndState_State getDndState() {
    org.matrix.dma.gchat.proto.DndState_State result = org.matrix.dma.gchat.proto.DndState_State.forNumber(dndState_);
    return result == null ? org.matrix.dma.gchat.proto.DndState_State.DND_STATE_STATE_UNKNOWN : result;
  }

  public static final int USER_STATUS_FIELD_NUMBER = 5;
  private org.matrix.dma.gchat.proto.UserStatus userStatus_;
  /**
   * <code>optional .UserStatus user_status = 5;</code>
   * @return Whether the userStatus field is set.
   */
  @java.lang.Override
  public boolean hasUserStatus() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional .UserStatus user_status = 5;</code>
   * @return The userStatus.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserStatus getUserStatus() {
    return userStatus_ == null ? org.matrix.dma.gchat.proto.UserStatus.getDefaultInstance() : userStatus_;
  }
  /**
   * <code>optional .UserStatus user_status = 5;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserStatusOrBuilder getUserStatusOrBuilder() {
    return userStatus_ == null ? org.matrix.dma.gchat.proto.UserStatus.getDefaultInstance() : userStatus_;
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
      output.writeMessage(1, getUserId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, presence_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(3, dndState_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(4, activeUntil_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeMessage(5, getUserStatus());
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
        .computeMessageSize(1, getUserId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, presence_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dndState_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, activeUntil_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getUserStatus());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.UserPresence)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.UserPresence other = (org.matrix.dma.gchat.proto.UserPresence) obj;

    if (hasUserId() != other.hasUserId()) return false;
    if (hasUserId()) {
      if (!getUserId()
          .equals(other.getUserId())) return false;
    }
    if (hasPresence() != other.hasPresence()) return false;
    if (hasPresence()) {
      if (presence_ != other.presence_) return false;
    }
    if (hasActiveUntil() != other.hasActiveUntil()) return false;
    if (hasActiveUntil()) {
      if (getActiveUntil()
          != other.getActiveUntil()) return false;
    }
    if (hasDndState() != other.hasDndState()) return false;
    if (hasDndState()) {
      if (dndState_ != other.dndState_) return false;
    }
    if (hasUserStatus() != other.hasUserStatus()) return false;
    if (hasUserStatus()) {
      if (!getUserStatus()
          .equals(other.getUserStatus())) return false;
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
    if (hasUserId()) {
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
    }
    if (hasPresence()) {
      hash = (37 * hash) + PRESENCE_FIELD_NUMBER;
      hash = (53 * hash) + presence_;
    }
    if (hasActiveUntil()) {
      hash = (37 * hash) + ACTIVE_UNTIL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getActiveUntil());
    }
    if (hasDndState()) {
      hash = (37 * hash) + DND_STATE_FIELD_NUMBER;
      hash = (53 * hash) + dndState_;
    }
    if (hasUserStatus()) {
      hash = (37 * hash) + USER_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getUserStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UserPresence parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.UserPresence prototype) {
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
   * Protobuf type {@code UserPresence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserPresence)
      org.matrix.dma.gchat.proto.UserPresenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserPresence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserPresence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.UserPresence.class, org.matrix.dma.gchat.proto.UserPresence.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.UserPresence.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUserIdFieldBuilder();
        getUserStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = null;
      if (userIdBuilder_ != null) {
        userIdBuilder_.dispose();
        userIdBuilder_ = null;
      }
      presence_ = 0;
      activeUntil_ = 0L;
      dndState_ = 0;
      userStatus_ = null;
      if (userStatusBuilder_ != null) {
        userStatusBuilder_.dispose();
        userStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UserPresence_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserPresence getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.UserPresence.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserPresence build() {
      org.matrix.dma.gchat.proto.UserPresence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UserPresence buildPartial() {
      org.matrix.dma.gchat.proto.UserPresence result = new org.matrix.dma.gchat.proto.UserPresence(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.UserPresence result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userIdBuilder_ == null
            ? userId_
            : userIdBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.presence_ = presence_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.activeUntil_ = activeUntil_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dndState_ = dndState_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.userStatus_ = userStatusBuilder_ == null
            ? userStatus_
            : userStatusBuilder_.build();
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof org.matrix.dma.gchat.proto.UserPresence) {
        return mergeFrom((org.matrix.dma.gchat.proto.UserPresence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.UserPresence other) {
      if (other == org.matrix.dma.gchat.proto.UserPresence.getDefaultInstance()) return this;
      if (other.hasUserId()) {
        mergeUserId(other.getUserId());
      }
      if (other.hasPresence()) {
        setPresence(other.getPresence());
      }
      if (other.hasActiveUntil()) {
        setActiveUntil(other.getActiveUntil());
      }
      if (other.hasDndState()) {
        setDndState(other.getDndState());
      }
      if (other.hasUserStatus()) {
        mergeUserStatus(other.getUserStatus());
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
            case 10: {
              input.readMessage(
                  getUserIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.Presence tmpValue =
                  org.matrix.dma.gchat.proto.Presence.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                presence_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
            case 24: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.DndState_State tmpValue =
                  org.matrix.dma.gchat.proto.DndState_State.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(3, tmpRaw);
              } else {
                dndState_ = tmpRaw;
                bitField0_ |= 0x00000008;
              }
              break;
            } // case 24
            case 32: {
              activeUntil_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getUserStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private org.matrix.dma.gchat.proto.UserId userId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder> userIdBuilder_;
    /**
     * <code>optional .UserId user_id = 1;</code>
     * @return Whether the userId field is set.
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     * @return The userId.
     */
    public org.matrix.dma.gchat.proto.UserId getUserId() {
      if (userIdBuilder_ == null) {
        return userId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : userId_;
      } else {
        return userIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public Builder setUserId(org.matrix.dma.gchat.proto.UserId value) {
      if (userIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userId_ = value;
      } else {
        userIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public Builder setUserId(
        org.matrix.dma.gchat.proto.UserId.Builder builderForValue) {
      if (userIdBuilder_ == null) {
        userId_ = builderForValue.build();
      } else {
        userIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public Builder mergeUserId(org.matrix.dma.gchat.proto.UserId value) {
      if (userIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          userId_ != null &&
          userId_ != org.matrix.dma.gchat.proto.UserId.getDefaultInstance()) {
          getUserIdBuilder().mergeFrom(value);
        } else {
          userId_ = value;
        }
      } else {
        userIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userId_ = null;
      if (userIdBuilder_ != null) {
        userIdBuilder_.dispose();
        userIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.UserId.Builder getUserIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.UserIdOrBuilder getUserIdOrBuilder() {
      if (userIdBuilder_ != null) {
        return userIdBuilder_.getMessageOrBuilder();
      } else {
        return userId_ == null ?
            org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : userId_;
      }
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder> 
        getUserIdFieldBuilder() {
      if (userIdBuilder_ == null) {
        userIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder>(
                getUserId(),
                getParentForChildren(),
                isClean());
        userId_ = null;
      }
      return userIdBuilder_;
    }

    private int presence_ = 0;
    /**
     * <code>optional .Presence presence = 2;</code>
     * @return Whether the presence field is set.
     */
    @java.lang.Override public boolean hasPresence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Presence presence = 2;</code>
     * @return The presence.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.Presence getPresence() {
      org.matrix.dma.gchat.proto.Presence result = org.matrix.dma.gchat.proto.Presence.forNumber(presence_);
      return result == null ? org.matrix.dma.gchat.proto.Presence.UNDEFINED_PRESENCE : result;
    }
    /**
     * <code>optional .Presence presence = 2;</code>
     * @param value The presence to set.
     * @return This builder for chaining.
     */
    public Builder setPresence(org.matrix.dma.gchat.proto.Presence value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      presence_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Presence presence = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPresence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      presence_ = 0;
      onChanged();
      return this;
    }

    private long activeUntil_ ;
    /**
     * <code>optional int64 active_until = 4;</code>
     * @return Whether the activeUntil field is set.
     */
    @java.lang.Override
    public boolean hasActiveUntil() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 active_until = 4;</code>
     * @return The activeUntil.
     */
    @java.lang.Override
    public long getActiveUntil() {
      return activeUntil_;
    }
    /**
     * <code>optional int64 active_until = 4;</code>
     * @param value The activeUntil to set.
     * @return This builder for chaining.
     */
    public Builder setActiveUntil(long value) {
      
      activeUntil_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 active_until = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveUntil() {
      bitField0_ = (bitField0_ & ~0x00000004);
      activeUntil_ = 0L;
      onChanged();
      return this;
    }

    private int dndState_ = 0;
    /**
     * <code>optional .DndState_State dnd_state = 3;</code>
     * @return Whether the dndState field is set.
     */
    @java.lang.Override public boolean hasDndState() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .DndState_State dnd_state = 3;</code>
     * @return The dndState.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.DndState_State getDndState() {
      org.matrix.dma.gchat.proto.DndState_State result = org.matrix.dma.gchat.proto.DndState_State.forNumber(dndState_);
      return result == null ? org.matrix.dma.gchat.proto.DndState_State.DND_STATE_STATE_UNKNOWN : result;
    }
    /**
     * <code>optional .DndState_State dnd_state = 3;</code>
     * @param value The dndState to set.
     * @return This builder for chaining.
     */
    public Builder setDndState(org.matrix.dma.gchat.proto.DndState_State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      dndState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .DndState_State dnd_state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDndState() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dndState_ = 0;
      onChanged();
      return this;
    }

    private org.matrix.dma.gchat.proto.UserStatus userStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserStatus, org.matrix.dma.gchat.proto.UserStatus.Builder, org.matrix.dma.gchat.proto.UserStatusOrBuilder> userStatusBuilder_;
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     * @return Whether the userStatus field is set.
     */
    public boolean hasUserStatus() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     * @return The userStatus.
     */
    public org.matrix.dma.gchat.proto.UserStatus getUserStatus() {
      if (userStatusBuilder_ == null) {
        return userStatus_ == null ? org.matrix.dma.gchat.proto.UserStatus.getDefaultInstance() : userStatus_;
      } else {
        return userStatusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public Builder setUserStatus(org.matrix.dma.gchat.proto.UserStatus value) {
      if (userStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userStatus_ = value;
      } else {
        userStatusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public Builder setUserStatus(
        org.matrix.dma.gchat.proto.UserStatus.Builder builderForValue) {
      if (userStatusBuilder_ == null) {
        userStatus_ = builderForValue.build();
      } else {
        userStatusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public Builder mergeUserStatus(org.matrix.dma.gchat.proto.UserStatus value) {
      if (userStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          userStatus_ != null &&
          userStatus_ != org.matrix.dma.gchat.proto.UserStatus.getDefaultInstance()) {
          getUserStatusBuilder().mergeFrom(value);
        } else {
          userStatus_ = value;
        }
      } else {
        userStatusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public Builder clearUserStatus() {
      bitField0_ = (bitField0_ & ~0x00000010);
      userStatus_ = null;
      if (userStatusBuilder_ != null) {
        userStatusBuilder_.dispose();
        userStatusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public org.matrix.dma.gchat.proto.UserStatus.Builder getUserStatusBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getUserStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    public org.matrix.dma.gchat.proto.UserStatusOrBuilder getUserStatusOrBuilder() {
      if (userStatusBuilder_ != null) {
        return userStatusBuilder_.getMessageOrBuilder();
      } else {
        return userStatus_ == null ?
            org.matrix.dma.gchat.proto.UserStatus.getDefaultInstance() : userStatus_;
      }
    }
    /**
     * <code>optional .UserStatus user_status = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserStatus, org.matrix.dma.gchat.proto.UserStatus.Builder, org.matrix.dma.gchat.proto.UserStatusOrBuilder> 
        getUserStatusFieldBuilder() {
      if (userStatusBuilder_ == null) {
        userStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.UserStatus, org.matrix.dma.gchat.proto.UserStatus.Builder, org.matrix.dma.gchat.proto.UserStatusOrBuilder>(
                getUserStatus(),
                getParentForChildren(),
                isClean());
        userStatus_ = null;
      }
      return userStatusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UserPresence)
  }

  // @@protoc_insertion_point(class_scope:UserPresence)
  private static final org.matrix.dma.gchat.proto.UserPresence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.UserPresence();
  }

  public static org.matrix.dma.gchat.proto.UserPresence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UserPresence>
      PARSER = new com.google.protobuf.AbstractParser<UserPresence>() {
    @java.lang.Override
    public UserPresence parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserPresence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserPresence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserPresence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

