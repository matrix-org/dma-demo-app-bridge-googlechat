// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code InviteState}
 */
public final class InviteState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InviteState)
    InviteStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InviteState.newBuilder() to construct.
  private InviteState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InviteState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InviteState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_InviteState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_InviteState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.InviteState.class, org.matrix.dma.gchat.proto.InviteState.Builder.class);
  }

  private int bitField0_;
  public static final int INVITER_USER_ID_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.UserId inviterUserId_;
  /**
   * <code>optional .UserId inviter_user_id = 1;</code>
   * @return Whether the inviterUserId field is set.
   */
  @java.lang.Override
  public boolean hasInviterUserId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .UserId inviter_user_id = 1;</code>
   * @return The inviterUserId.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserId getInviterUserId() {
    return inviterUserId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : inviterUserId_;
  }
  /**
   * <code>optional .UserId inviter_user_id = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.UserIdOrBuilder getInviterUserIdOrBuilder() {
    return inviterUserId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : inviterUserId_;
  }

  public static final int INVITATION_MESSAGE_ID_FIELD_NUMBER = 2;
  private org.matrix.dma.gchat.proto.MessageId invitationMessageId_;
  /**
   * <code>optional .MessageId invitation_message_id = 2;</code>
   * @return Whether the invitationMessageId field is set.
   */
  @java.lang.Override
  public boolean hasInvitationMessageId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .MessageId invitation_message_id = 2;</code>
   * @return The invitationMessageId.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MessageId getInvitationMessageId() {
    return invitationMessageId_ == null ? org.matrix.dma.gchat.proto.MessageId.getDefaultInstance() : invitationMessageId_;
  }
  /**
   * <code>optional .MessageId invitation_message_id = 2;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MessageIdOrBuilder getInvitationMessageIdOrBuilder() {
    return invitationMessageId_ == null ? org.matrix.dma.gchat.proto.MessageId.getDefaultInstance() : invitationMessageId_;
  }

  public static final int SHOW_WELCOME_MAT_FIELD_NUMBER = 3;
  private boolean showWelcomeMat_ = false;
  /**
   * <code>optional bool show_welcome_mat = 3;</code>
   * @return Whether the showWelcomeMat field is set.
   */
  @java.lang.Override
  public boolean hasShowWelcomeMat() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional bool show_welcome_mat = 3;</code>
   * @return The showWelcomeMat.
   */
  @java.lang.Override
  public boolean getShowWelcomeMat() {
    return showWelcomeMat_;
  }

  public static final int INVITE_TYPE_FIELD_NUMBER = 5;
  private org.matrix.dma.gchat.proto.InviteType inviteType_;
  /**
   * <code>optional .InviteType invite_type = 5;</code>
   * @return Whether the inviteType field is set.
   */
  @java.lang.Override
  public boolean hasInviteType() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .InviteType invite_type = 5;</code>
   * @return The inviteType.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.InviteType getInviteType() {
    return inviteType_ == null ? org.matrix.dma.gchat.proto.InviteType.getDefaultInstance() : inviteType_;
  }
  /**
   * <code>optional .InviteType invite_type = 5;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.InviteTypeOrBuilder getInviteTypeOrBuilder() {
    return inviteType_ == null ? org.matrix.dma.gchat.proto.InviteType.getDefaultInstance() : inviteType_;
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
      output.writeMessage(1, getInviterUserId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getInvitationMessageId());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, showWelcomeMat_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(5, getInviteType());
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
        .computeMessageSize(1, getInviterUserId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInvitationMessageId());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, showWelcomeMat_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getInviteType());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.InviteState)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.InviteState other = (org.matrix.dma.gchat.proto.InviteState) obj;

    if (hasInviterUserId() != other.hasInviterUserId()) return false;
    if (hasInviterUserId()) {
      if (!getInviterUserId()
          .equals(other.getInviterUserId())) return false;
    }
    if (hasInvitationMessageId() != other.hasInvitationMessageId()) return false;
    if (hasInvitationMessageId()) {
      if (!getInvitationMessageId()
          .equals(other.getInvitationMessageId())) return false;
    }
    if (hasShowWelcomeMat() != other.hasShowWelcomeMat()) return false;
    if (hasShowWelcomeMat()) {
      if (getShowWelcomeMat()
          != other.getShowWelcomeMat()) return false;
    }
    if (hasInviteType() != other.hasInviteType()) return false;
    if (hasInviteType()) {
      if (!getInviteType()
          .equals(other.getInviteType())) return false;
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
    if (hasInviterUserId()) {
      hash = (37 * hash) + INVITER_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInviterUserId().hashCode();
    }
    if (hasInvitationMessageId()) {
      hash = (37 * hash) + INVITATION_MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInvitationMessageId().hashCode();
    }
    if (hasShowWelcomeMat()) {
      hash = (37 * hash) + SHOW_WELCOME_MAT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getShowWelcomeMat());
    }
    if (hasInviteType()) {
      hash = (37 * hash) + INVITE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInviteType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.InviteState parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.InviteState prototype) {
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
   * Protobuf type {@code InviteState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InviteState)
      org.matrix.dma.gchat.proto.InviteStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_InviteState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_InviteState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.InviteState.class, org.matrix.dma.gchat.proto.InviteState.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.InviteState.newBuilder()
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
        getInviterUserIdFieldBuilder();
        getInvitationMessageIdFieldBuilder();
        getInviteTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inviterUserId_ = null;
      if (inviterUserIdBuilder_ != null) {
        inviterUserIdBuilder_.dispose();
        inviterUserIdBuilder_ = null;
      }
      invitationMessageId_ = null;
      if (invitationMessageIdBuilder_ != null) {
        invitationMessageIdBuilder_.dispose();
        invitationMessageIdBuilder_ = null;
      }
      showWelcomeMat_ = false;
      inviteType_ = null;
      if (inviteTypeBuilder_ != null) {
        inviteTypeBuilder_.dispose();
        inviteTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_InviteState_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.InviteState getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.InviteState.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.InviteState build() {
      org.matrix.dma.gchat.proto.InviteState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.InviteState buildPartial() {
      org.matrix.dma.gchat.proto.InviteState result = new org.matrix.dma.gchat.proto.InviteState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.InviteState result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inviterUserId_ = inviterUserIdBuilder_ == null
            ? inviterUserId_
            : inviterUserIdBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.invitationMessageId_ = invitationMessageIdBuilder_ == null
            ? invitationMessageId_
            : invitationMessageIdBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.showWelcomeMat_ = showWelcomeMat_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.inviteType_ = inviteTypeBuilder_ == null
            ? inviteType_
            : inviteTypeBuilder_.build();
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof org.matrix.dma.gchat.proto.InviteState) {
        return mergeFrom((org.matrix.dma.gchat.proto.InviteState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.InviteState other) {
      if (other == org.matrix.dma.gchat.proto.InviteState.getDefaultInstance()) return this;
      if (other.hasInviterUserId()) {
        mergeInviterUserId(other.getInviterUserId());
      }
      if (other.hasInvitationMessageId()) {
        mergeInvitationMessageId(other.getInvitationMessageId());
      }
      if (other.hasShowWelcomeMat()) {
        setShowWelcomeMat(other.getShowWelcomeMat());
      }
      if (other.hasInviteType()) {
        mergeInviteType(other.getInviteType());
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
                  getInviterUserIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInvitationMessageIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              showWelcomeMat_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 42: {
              input.readMessage(
                  getInviteTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
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

    private org.matrix.dma.gchat.proto.UserId inviterUserId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder> inviterUserIdBuilder_;
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     * @return Whether the inviterUserId field is set.
     */
    public boolean hasInviterUserId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     * @return The inviterUserId.
     */
    public org.matrix.dma.gchat.proto.UserId getInviterUserId() {
      if (inviterUserIdBuilder_ == null) {
        return inviterUserId_ == null ? org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : inviterUserId_;
      } else {
        return inviterUserIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public Builder setInviterUserId(org.matrix.dma.gchat.proto.UserId value) {
      if (inviterUserIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inviterUserId_ = value;
      } else {
        inviterUserIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public Builder setInviterUserId(
        org.matrix.dma.gchat.proto.UserId.Builder builderForValue) {
      if (inviterUserIdBuilder_ == null) {
        inviterUserId_ = builderForValue.build();
      } else {
        inviterUserIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public Builder mergeInviterUserId(org.matrix.dma.gchat.proto.UserId value) {
      if (inviterUserIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          inviterUserId_ != null &&
          inviterUserId_ != org.matrix.dma.gchat.proto.UserId.getDefaultInstance()) {
          getInviterUserIdBuilder().mergeFrom(value);
        } else {
          inviterUserId_ = value;
        }
      } else {
        inviterUserIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public Builder clearInviterUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inviterUserId_ = null;
      if (inviterUserIdBuilder_ != null) {
        inviterUserIdBuilder_.dispose();
        inviterUserIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.UserId.Builder getInviterUserIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInviterUserIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.UserIdOrBuilder getInviterUserIdOrBuilder() {
      if (inviterUserIdBuilder_ != null) {
        return inviterUserIdBuilder_.getMessageOrBuilder();
      } else {
        return inviterUserId_ == null ?
            org.matrix.dma.gchat.proto.UserId.getDefaultInstance() : inviterUserId_;
      }
    }
    /**
     * <code>optional .UserId inviter_user_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder> 
        getInviterUserIdFieldBuilder() {
      if (inviterUserIdBuilder_ == null) {
        inviterUserIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.UserId, org.matrix.dma.gchat.proto.UserId.Builder, org.matrix.dma.gchat.proto.UserIdOrBuilder>(
                getInviterUserId(),
                getParentForChildren(),
                isClean());
        inviterUserId_ = null;
      }
      return inviterUserIdBuilder_;
    }

    private org.matrix.dma.gchat.proto.MessageId invitationMessageId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MessageId, org.matrix.dma.gchat.proto.MessageId.Builder, org.matrix.dma.gchat.proto.MessageIdOrBuilder> invitationMessageIdBuilder_;
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     * @return Whether the invitationMessageId field is set.
     */
    public boolean hasInvitationMessageId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     * @return The invitationMessageId.
     */
    public org.matrix.dma.gchat.proto.MessageId getInvitationMessageId() {
      if (invitationMessageIdBuilder_ == null) {
        return invitationMessageId_ == null ? org.matrix.dma.gchat.proto.MessageId.getDefaultInstance() : invitationMessageId_;
      } else {
        return invitationMessageIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public Builder setInvitationMessageId(org.matrix.dma.gchat.proto.MessageId value) {
      if (invitationMessageIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        invitationMessageId_ = value;
      } else {
        invitationMessageIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public Builder setInvitationMessageId(
        org.matrix.dma.gchat.proto.MessageId.Builder builderForValue) {
      if (invitationMessageIdBuilder_ == null) {
        invitationMessageId_ = builderForValue.build();
      } else {
        invitationMessageIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public Builder mergeInvitationMessageId(org.matrix.dma.gchat.proto.MessageId value) {
      if (invitationMessageIdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          invitationMessageId_ != null &&
          invitationMessageId_ != org.matrix.dma.gchat.proto.MessageId.getDefaultInstance()) {
          getInvitationMessageIdBuilder().mergeFrom(value);
        } else {
          invitationMessageId_ = value;
        }
      } else {
        invitationMessageIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public Builder clearInvitationMessageId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      invitationMessageId_ = null;
      if (invitationMessageIdBuilder_ != null) {
        invitationMessageIdBuilder_.dispose();
        invitationMessageIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public org.matrix.dma.gchat.proto.MessageId.Builder getInvitationMessageIdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInvitationMessageIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    public org.matrix.dma.gchat.proto.MessageIdOrBuilder getInvitationMessageIdOrBuilder() {
      if (invitationMessageIdBuilder_ != null) {
        return invitationMessageIdBuilder_.getMessageOrBuilder();
      } else {
        return invitationMessageId_ == null ?
            org.matrix.dma.gchat.proto.MessageId.getDefaultInstance() : invitationMessageId_;
      }
    }
    /**
     * <code>optional .MessageId invitation_message_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MessageId, org.matrix.dma.gchat.proto.MessageId.Builder, org.matrix.dma.gchat.proto.MessageIdOrBuilder> 
        getInvitationMessageIdFieldBuilder() {
      if (invitationMessageIdBuilder_ == null) {
        invitationMessageIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.MessageId, org.matrix.dma.gchat.proto.MessageId.Builder, org.matrix.dma.gchat.proto.MessageIdOrBuilder>(
                getInvitationMessageId(),
                getParentForChildren(),
                isClean());
        invitationMessageId_ = null;
      }
      return invitationMessageIdBuilder_;
    }

    private boolean showWelcomeMat_ ;
    /**
     * <code>optional bool show_welcome_mat = 3;</code>
     * @return Whether the showWelcomeMat field is set.
     */
    @java.lang.Override
    public boolean hasShowWelcomeMat() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool show_welcome_mat = 3;</code>
     * @return The showWelcomeMat.
     */
    @java.lang.Override
    public boolean getShowWelcomeMat() {
      return showWelcomeMat_;
    }
    /**
     * <code>optional bool show_welcome_mat = 3;</code>
     * @param value The showWelcomeMat to set.
     * @return This builder for chaining.
     */
    public Builder setShowWelcomeMat(boolean value) {
      
      showWelcomeMat_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool show_welcome_mat = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowWelcomeMat() {
      bitField0_ = (bitField0_ & ~0x00000004);
      showWelcomeMat_ = false;
      onChanged();
      return this;
    }

    private org.matrix.dma.gchat.proto.InviteType inviteType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.InviteType, org.matrix.dma.gchat.proto.InviteType.Builder, org.matrix.dma.gchat.proto.InviteTypeOrBuilder> inviteTypeBuilder_;
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     * @return Whether the inviteType field is set.
     */
    public boolean hasInviteType() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     * @return The inviteType.
     */
    public org.matrix.dma.gchat.proto.InviteType getInviteType() {
      if (inviteTypeBuilder_ == null) {
        return inviteType_ == null ? org.matrix.dma.gchat.proto.InviteType.getDefaultInstance() : inviteType_;
      } else {
        return inviteTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public Builder setInviteType(org.matrix.dma.gchat.proto.InviteType value) {
      if (inviteTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inviteType_ = value;
      } else {
        inviteTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public Builder setInviteType(
        org.matrix.dma.gchat.proto.InviteType.Builder builderForValue) {
      if (inviteTypeBuilder_ == null) {
        inviteType_ = builderForValue.build();
      } else {
        inviteTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public Builder mergeInviteType(org.matrix.dma.gchat.proto.InviteType value) {
      if (inviteTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          inviteType_ != null &&
          inviteType_ != org.matrix.dma.gchat.proto.InviteType.getDefaultInstance()) {
          getInviteTypeBuilder().mergeFrom(value);
        } else {
          inviteType_ = value;
        }
      } else {
        inviteTypeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public Builder clearInviteType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      inviteType_ = null;
      if (inviteTypeBuilder_ != null) {
        inviteTypeBuilder_.dispose();
        inviteTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public org.matrix.dma.gchat.proto.InviteType.Builder getInviteTypeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getInviteTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    public org.matrix.dma.gchat.proto.InviteTypeOrBuilder getInviteTypeOrBuilder() {
      if (inviteTypeBuilder_ != null) {
        return inviteTypeBuilder_.getMessageOrBuilder();
      } else {
        return inviteType_ == null ?
            org.matrix.dma.gchat.proto.InviteType.getDefaultInstance() : inviteType_;
      }
    }
    /**
     * <code>optional .InviteType invite_type = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.InviteType, org.matrix.dma.gchat.proto.InviteType.Builder, org.matrix.dma.gchat.proto.InviteTypeOrBuilder> 
        getInviteTypeFieldBuilder() {
      if (inviteTypeBuilder_ == null) {
        inviteTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.InviteType, org.matrix.dma.gchat.proto.InviteType.Builder, org.matrix.dma.gchat.proto.InviteTypeOrBuilder>(
                getInviteType(),
                getParentForChildren(),
                isClean());
        inviteType_ = null;
      }
      return inviteTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:InviteState)
  }

  // @@protoc_insertion_point(class_scope:InviteState)
  private static final org.matrix.dma.gchat.proto.InviteState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.InviteState();
  }

  public static org.matrix.dma.gchat.proto.InviteState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<InviteState>
      PARSER = new com.google.protobuf.AbstractParser<InviteState>() {
    @java.lang.Override
    public InviteState parsePartialFrom(
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

  public static com.google.protobuf.Parser<InviteState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InviteState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.InviteState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

