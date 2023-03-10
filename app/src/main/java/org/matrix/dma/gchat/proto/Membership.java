// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code Membership}
 */
public final class Membership extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Membership)
    MembershipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Membership.newBuilder() to construct.
  private Membership(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Membership() {
    membershipState_ = 0;
    inviteCategory_ = 0;
    membershipRole_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Membership();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_Membership_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_Membership_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.Membership.class, org.matrix.dma.gchat.proto.Membership.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.MembershipId id_;
  /**
   * <code>optional .MembershipId id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .MembershipId id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MembershipId getId() {
    return id_ == null ? org.matrix.dma.gchat.proto.MembershipId.getDefaultInstance() : id_;
  }
  /**
   * <code>optional .MembershipId id = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MembershipIdOrBuilder getIdOrBuilder() {
    return id_ == null ? org.matrix.dma.gchat.proto.MembershipId.getDefaultInstance() : id_;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private long createTime_ = 0L;
  /**
   * <code>optional int64 create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 create_time = 2;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public long getCreateTime() {
    return createTime_;
  }

  public static final int MEMBERSHIP_STATE_FIELD_NUMBER = 3;
  private int membershipState_ = 0;
  /**
   * <code>optional .MembershipState membership_state = 3;</code>
   * @return Whether the membershipState field is set.
   */
  @java.lang.Override public boolean hasMembershipState() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .MembershipState membership_state = 3;</code>
   * @return The membershipState.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.MembershipState getMembershipState() {
    org.matrix.dma.gchat.proto.MembershipState result = org.matrix.dma.gchat.proto.MembershipState.forNumber(membershipState_);
    return result == null ? org.matrix.dma.gchat.proto.MembershipState.MEMBER_UNKNOWN : result;
  }

  public static final int INVITE_CATEGORY_FIELD_NUMBER = 4;
  private int inviteCategory_ = 0;
  /**
   * <code>optional .InviteCategory invite_category = 4;</code>
   * @return Whether the inviteCategory field is set.
   */
  @java.lang.Override public boolean hasInviteCategory() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .InviteCategory invite_category = 4;</code>
   * @return The inviteCategory.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.InviteCategory getInviteCategory() {
    org.matrix.dma.gchat.proto.InviteCategory result = org.matrix.dma.gchat.proto.InviteCategory.forNumber(inviteCategory_);
    return result == null ? org.matrix.dma.gchat.proto.InviteCategory.UNKNOWN_INVITE : result;
  }

  public static final int MEMBERSHIP_ROLE_FIELD_NUMBER = 5;
  private int membershipRole_ = 0;
  /**
   * <code>optional .MembershipRole membership_role = 5;</code>
   * @return Whether the membershipRole field is set.
   */
  @java.lang.Override public boolean hasMembershipRole() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional .MembershipRole membership_role = 5;</code>
   * @return The membershipRole.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.MembershipRole getMembershipRole() {
    org.matrix.dma.gchat.proto.MembershipRole result = org.matrix.dma.gchat.proto.MembershipRole.forNumber(membershipRole_);
    return result == null ? org.matrix.dma.gchat.proto.MembershipRole.ROLE_UNKNOWN : result;
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
      output.writeMessage(1, getId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, createTime_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, membershipState_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(4, inviteCategory_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeEnum(5, membershipRole_);
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
        .computeMessageSize(1, getId());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, createTime_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, membershipState_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, inviteCategory_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, membershipRole_);
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.Membership)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.Membership other = (org.matrix.dma.gchat.proto.Membership) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (getCreateTime()
          != other.getCreateTime()) return false;
    }
    if (hasMembershipState() != other.hasMembershipState()) return false;
    if (hasMembershipState()) {
      if (membershipState_ != other.membershipState_) return false;
    }
    if (hasInviteCategory() != other.hasInviteCategory()) return false;
    if (hasInviteCategory()) {
      if (inviteCategory_ != other.inviteCategory_) return false;
    }
    if (hasMembershipRole() != other.hasMembershipRole()) return false;
    if (hasMembershipRole()) {
      if (membershipRole_ != other.membershipRole_) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCreateTime());
    }
    if (hasMembershipState()) {
      hash = (37 * hash) + MEMBERSHIP_STATE_FIELD_NUMBER;
      hash = (53 * hash) + membershipState_;
    }
    if (hasInviteCategory()) {
      hash = (37 * hash) + INVITE_CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + inviteCategory_;
    }
    if (hasMembershipRole()) {
      hash = (37 * hash) + MEMBERSHIP_ROLE_FIELD_NUMBER;
      hash = (53 * hash) + membershipRole_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.Membership parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.Membership parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.Membership parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.Membership prototype) {
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
   * Protobuf type {@code Membership}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Membership)
      org.matrix.dma.gchat.proto.MembershipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_Membership_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_Membership_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.Membership.class, org.matrix.dma.gchat.proto.Membership.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.Membership.newBuilder()
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
        getIdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      createTime_ = 0L;
      membershipState_ = 0;
      inviteCategory_ = 0;
      membershipRole_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_Membership_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.Membership getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.Membership.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.Membership build() {
      org.matrix.dma.gchat.proto.Membership result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.Membership buildPartial() {
      org.matrix.dma.gchat.proto.Membership result = new org.matrix.dma.gchat.proto.Membership(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.Membership result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = idBuilder_ == null
            ? id_
            : idBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createTime_ = createTime_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.membershipState_ = membershipState_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.inviteCategory_ = inviteCategory_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.membershipRole_ = membershipRole_;
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
      if (other instanceof org.matrix.dma.gchat.proto.Membership) {
        return mergeFrom((org.matrix.dma.gchat.proto.Membership)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.Membership other) {
      if (other == org.matrix.dma.gchat.proto.Membership.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasCreateTime()) {
        setCreateTime(other.getCreateTime());
      }
      if (other.hasMembershipState()) {
        setMembershipState(other.getMembershipState());
      }
      if (other.hasInviteCategory()) {
        setInviteCategory(other.getInviteCategory());
      }
      if (other.hasMembershipRole()) {
        setMembershipRole(other.getMembershipRole());
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
                  getIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              createTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.MembershipState tmpValue =
                  org.matrix.dma.gchat.proto.MembershipState.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(3, tmpRaw);
              } else {
                membershipState_ = tmpRaw;
                bitField0_ |= 0x00000004;
              }
              break;
            } // case 24
            case 32: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.InviteCategory tmpValue =
                  org.matrix.dma.gchat.proto.InviteCategory.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(4, tmpRaw);
              } else {
                inviteCategory_ = tmpRaw;
                bitField0_ |= 0x00000008;
              }
              break;
            } // case 32
            case 40: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.MembershipRole tmpValue =
                  org.matrix.dma.gchat.proto.MembershipRole.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(5, tmpRaw);
              } else {
                membershipRole_ = tmpRaw;
                bitField0_ |= 0x00000010;
              }
              break;
            } // case 40
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

    private org.matrix.dma.gchat.proto.MembershipId id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MembershipId, org.matrix.dma.gchat.proto.MembershipId.Builder, org.matrix.dma.gchat.proto.MembershipIdOrBuilder> idBuilder_;
    /**
     * <code>optional .MembershipId id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     * @return The id.
     */
    public org.matrix.dma.gchat.proto.MembershipId getId() {
      if (idBuilder_ == null) {
        return id_ == null ? org.matrix.dma.gchat.proto.MembershipId.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public Builder setId(org.matrix.dma.gchat.proto.MembershipId value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
      } else {
        idBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public Builder setId(
        org.matrix.dma.gchat.proto.MembershipId.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public Builder mergeId(org.matrix.dma.gchat.proto.MembershipId value) {
      if (idBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          id_ != null &&
          id_ != org.matrix.dma.gchat.proto.MembershipId.getDefaultInstance()) {
          getIdBuilder().mergeFrom(value);
        } else {
          id_ = value;
        }
      } else {
        idBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.MembershipId.Builder getIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    public org.matrix.dma.gchat.proto.MembershipIdOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            org.matrix.dma.gchat.proto.MembershipId.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>optional .MembershipId id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MembershipId, org.matrix.dma.gchat.proto.MembershipId.Builder, org.matrix.dma.gchat.proto.MembershipIdOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.MembershipId, org.matrix.dma.gchat.proto.MembershipId.Builder, org.matrix.dma.gchat.proto.MembershipIdOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private long createTime_ ;
    /**
     * <code>optional int64 create_time = 2;</code>
     * @return Whether the createTime field is set.
     */
    @java.lang.Override
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 create_time = 2;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public long getCreateTime() {
      return createTime_;
    }
    /**
     * <code>optional int64 create_time = 2;</code>
     * @param value The createTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTime(long value) {
      
      createTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 create_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      createTime_ = 0L;
      onChanged();
      return this;
    }

    private int membershipState_ = 0;
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     * @return Whether the membershipState field is set.
     */
    @java.lang.Override public boolean hasMembershipState() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     * @return The membershipState.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.MembershipState getMembershipState() {
      org.matrix.dma.gchat.proto.MembershipState result = org.matrix.dma.gchat.proto.MembershipState.forNumber(membershipState_);
      return result == null ? org.matrix.dma.gchat.proto.MembershipState.MEMBER_UNKNOWN : result;
    }
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     * @param value The membershipState to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipState(org.matrix.dma.gchat.proto.MembershipState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      membershipState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMembershipState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      membershipState_ = 0;
      onChanged();
      return this;
    }

    private int inviteCategory_ = 0;
    /**
     * <code>optional .InviteCategory invite_category = 4;</code>
     * @return Whether the inviteCategory field is set.
     */
    @java.lang.Override public boolean hasInviteCategory() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .InviteCategory invite_category = 4;</code>
     * @return The inviteCategory.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.InviteCategory getInviteCategory() {
      org.matrix.dma.gchat.proto.InviteCategory result = org.matrix.dma.gchat.proto.InviteCategory.forNumber(inviteCategory_);
      return result == null ? org.matrix.dma.gchat.proto.InviteCategory.UNKNOWN_INVITE : result;
    }
    /**
     * <code>optional .InviteCategory invite_category = 4;</code>
     * @param value The inviteCategory to set.
     * @return This builder for chaining.
     */
    public Builder setInviteCategory(org.matrix.dma.gchat.proto.InviteCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      inviteCategory_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .InviteCategory invite_category = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInviteCategory() {
      bitField0_ = (bitField0_ & ~0x00000008);
      inviteCategory_ = 0;
      onChanged();
      return this;
    }

    private int membershipRole_ = 0;
    /**
     * <code>optional .MembershipRole membership_role = 5;</code>
     * @return Whether the membershipRole field is set.
     */
    @java.lang.Override public boolean hasMembershipRole() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional .MembershipRole membership_role = 5;</code>
     * @return The membershipRole.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.MembershipRole getMembershipRole() {
      org.matrix.dma.gchat.proto.MembershipRole result = org.matrix.dma.gchat.proto.MembershipRole.forNumber(membershipRole_);
      return result == null ? org.matrix.dma.gchat.proto.MembershipRole.ROLE_UNKNOWN : result;
    }
    /**
     * <code>optional .MembershipRole membership_role = 5;</code>
     * @param value The membershipRole to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipRole(org.matrix.dma.gchat.proto.MembershipRole value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      membershipRole_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .MembershipRole membership_role = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMembershipRole() {
      bitField0_ = (bitField0_ & ~0x00000010);
      membershipRole_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Membership)
  }

  // @@protoc_insertion_point(class_scope:Membership)
  private static final org.matrix.dma.gchat.proto.Membership DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.Membership();
  }

  public static org.matrix.dma.gchat.proto.Membership getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Membership>
      PARSER = new com.google.protobuf.AbstractParser<Membership>() {
    @java.lang.Override
    public Membership parsePartialFrom(
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

  public static com.google.protobuf.Parser<Membership> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Membership> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.Membership getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

