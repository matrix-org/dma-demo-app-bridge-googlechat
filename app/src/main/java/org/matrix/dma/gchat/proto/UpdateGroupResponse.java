// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code UpdateGroupResponse}
 */
public final class UpdateGroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateGroupResponse)
    UpdateGroupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGroupResponse.newBuilder() to construct.
  private UpdateGroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGroupResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGroupResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UpdateGroupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UpdateGroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.UpdateGroupResponse.class, org.matrix.dma.gchat.proto.UpdateGroupResponse.Builder.class);
  }

  private int bitField0_;
  public static final int GROUP_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.Group group_;
  /**
   * <code>optional .Group group = 1;</code>
   * @return Whether the group field is set.
   */
  @java.lang.Override
  public boolean hasGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .Group group = 1;</code>
   * @return The group.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.Group getGroup() {
    return group_ == null ? org.matrix.dma.gchat.proto.Group.getDefaultInstance() : group_;
  }
  /**
   * <code>optional .Group group = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.GroupOrBuilder getGroupOrBuilder() {
    return group_ == null ? org.matrix.dma.gchat.proto.Group.getDefaultInstance() : group_;
  }

  public static final int GROUP_REVISION_FIELD_NUMBER = 2;
  private org.matrix.dma.gchat.proto.WriteRevision groupRevision_;
  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   * @return Whether the groupRevision field is set.
   */
  @java.lang.Override
  public boolean hasGroupRevision() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   * @return The groupRevision.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.WriteRevision getGroupRevision() {
    return groupRevision_ == null ? org.matrix.dma.gchat.proto.WriteRevision.getDefaultInstance() : groupRevision_;
  }
  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.WriteRevisionOrBuilder getGroupRevisionOrBuilder() {
    return groupRevision_ == null ? org.matrix.dma.gchat.proto.WriteRevision.getDefaultInstance() : groupRevision_;
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
      output.writeMessage(1, getGroup());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getGroupRevision());
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
        .computeMessageSize(1, getGroup());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroupRevision());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.UpdateGroupResponse)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.UpdateGroupResponse other = (org.matrix.dma.gchat.proto.UpdateGroupResponse) obj;

    if (hasGroup() != other.hasGroup()) return false;
    if (hasGroup()) {
      if (!getGroup()
          .equals(other.getGroup())) return false;
    }
    if (hasGroupRevision() != other.hasGroupRevision()) return false;
    if (hasGroupRevision()) {
      if (!getGroupRevision()
          .equals(other.getGroupRevision())) return false;
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
    if (hasGroup()) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
    }
    if (hasGroupRevision()) {
      hash = (37 * hash) + GROUP_REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getGroupRevision().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.UpdateGroupResponse parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.UpdateGroupResponse prototype) {
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
   * Protobuf type {@code UpdateGroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateGroupResponse)
      org.matrix.dma.gchat.proto.UpdateGroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UpdateGroupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UpdateGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.UpdateGroupResponse.class, org.matrix.dma.gchat.proto.UpdateGroupResponse.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.UpdateGroupResponse.newBuilder()
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
        getGroupFieldBuilder();
        getGroupRevisionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      group_ = null;
      if (groupBuilder_ != null) {
        groupBuilder_.dispose();
        groupBuilder_ = null;
      }
      groupRevision_ = null;
      if (groupRevisionBuilder_ != null) {
        groupRevisionBuilder_.dispose();
        groupRevisionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_UpdateGroupResponse_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UpdateGroupResponse getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.UpdateGroupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UpdateGroupResponse build() {
      org.matrix.dma.gchat.proto.UpdateGroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.UpdateGroupResponse buildPartial() {
      org.matrix.dma.gchat.proto.UpdateGroupResponse result = new org.matrix.dma.gchat.proto.UpdateGroupResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.UpdateGroupResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.group_ = groupBuilder_ == null
            ? group_
            : groupBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupRevision_ = groupRevisionBuilder_ == null
            ? groupRevision_
            : groupRevisionBuilder_.build();
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
      if (other instanceof org.matrix.dma.gchat.proto.UpdateGroupResponse) {
        return mergeFrom((org.matrix.dma.gchat.proto.UpdateGroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.UpdateGroupResponse other) {
      if (other == org.matrix.dma.gchat.proto.UpdateGroupResponse.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
      }
      if (other.hasGroupRevision()) {
        mergeGroupRevision(other.getGroupRevision());
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
                  getGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGroupRevisionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private org.matrix.dma.gchat.proto.Group group_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Group, org.matrix.dma.gchat.proto.Group.Builder, org.matrix.dma.gchat.proto.GroupOrBuilder> groupBuilder_;
    /**
     * <code>optional .Group group = 1;</code>
     * @return Whether the group field is set.
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .Group group = 1;</code>
     * @return The group.
     */
    public org.matrix.dma.gchat.proto.Group getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? org.matrix.dma.gchat.proto.Group.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public Builder setGroup(org.matrix.dma.gchat.proto.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
      } else {
        groupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public Builder setGroup(
        org.matrix.dma.gchat.proto.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public Builder mergeGroup(org.matrix.dma.gchat.proto.Group value) {
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          group_ != null &&
          group_ != org.matrix.dma.gchat.proto.Group.getDefaultInstance()) {
          getGroupBuilder().mergeFrom(value);
        } else {
          group_ = value;
        }
      } else {
        groupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public Builder clearGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      group_ = null;
      if (groupBuilder_ != null) {
        groupBuilder_.dispose();
        groupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public org.matrix.dma.gchat.proto.Group.Builder getGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public org.matrix.dma.gchat.proto.GroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            org.matrix.dma.gchat.proto.Group.getDefaultInstance() : group_;
      }
    }
    /**
     * <code>optional .Group group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Group, org.matrix.dma.gchat.proto.Group.Builder, org.matrix.dma.gchat.proto.GroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.Group, org.matrix.dma.gchat.proto.Group.Builder, org.matrix.dma.gchat.proto.GroupOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private org.matrix.dma.gchat.proto.WriteRevision groupRevision_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.WriteRevision, org.matrix.dma.gchat.proto.WriteRevision.Builder, org.matrix.dma.gchat.proto.WriteRevisionOrBuilder> groupRevisionBuilder_;
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     * @return Whether the groupRevision field is set.
     */
    public boolean hasGroupRevision() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     * @return The groupRevision.
     */
    public org.matrix.dma.gchat.proto.WriteRevision getGroupRevision() {
      if (groupRevisionBuilder_ == null) {
        return groupRevision_ == null ? org.matrix.dma.gchat.proto.WriteRevision.getDefaultInstance() : groupRevision_;
      } else {
        return groupRevisionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public Builder setGroupRevision(org.matrix.dma.gchat.proto.WriteRevision value) {
      if (groupRevisionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupRevision_ = value;
      } else {
        groupRevisionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public Builder setGroupRevision(
        org.matrix.dma.gchat.proto.WriteRevision.Builder builderForValue) {
      if (groupRevisionBuilder_ == null) {
        groupRevision_ = builderForValue.build();
      } else {
        groupRevisionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public Builder mergeGroupRevision(org.matrix.dma.gchat.proto.WriteRevision value) {
      if (groupRevisionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          groupRevision_ != null &&
          groupRevision_ != org.matrix.dma.gchat.proto.WriteRevision.getDefaultInstance()) {
          getGroupRevisionBuilder().mergeFrom(value);
        } else {
          groupRevision_ = value;
        }
      } else {
        groupRevisionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public Builder clearGroupRevision() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupRevision_ = null;
      if (groupRevisionBuilder_ != null) {
        groupRevisionBuilder_.dispose();
        groupRevisionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public org.matrix.dma.gchat.proto.WriteRevision.Builder getGroupRevisionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGroupRevisionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public org.matrix.dma.gchat.proto.WriteRevisionOrBuilder getGroupRevisionOrBuilder() {
      if (groupRevisionBuilder_ != null) {
        return groupRevisionBuilder_.getMessageOrBuilder();
      } else {
        return groupRevision_ == null ?
            org.matrix.dma.gchat.proto.WriteRevision.getDefaultInstance() : groupRevision_;
      }
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.WriteRevision, org.matrix.dma.gchat.proto.WriteRevision.Builder, org.matrix.dma.gchat.proto.WriteRevisionOrBuilder> 
        getGroupRevisionFieldBuilder() {
      if (groupRevisionBuilder_ == null) {
        groupRevisionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.WriteRevision, org.matrix.dma.gchat.proto.WriteRevision.Builder, org.matrix.dma.gchat.proto.WriteRevisionOrBuilder>(
                getGroupRevision(),
                getParentForChildren(),
                isClean());
        groupRevision_ = null;
      }
      return groupRevisionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UpdateGroupResponse)
  }

  // @@protoc_insertion_point(class_scope:UpdateGroupResponse)
  private static final org.matrix.dma.gchat.proto.UpdateGroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.UpdateGroupResponse();
  }

  public static org.matrix.dma.gchat.proto.UpdateGroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UpdateGroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGroupResponse>() {
    @java.lang.Override
    public UpdateGroupResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGroupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGroupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.UpdateGroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

