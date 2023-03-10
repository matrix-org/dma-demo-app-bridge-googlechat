// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code VideoCallMetadata}
 */
public final class VideoCallMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VideoCallMetadata)
    VideoCallMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoCallMetadata.newBuilder() to construct.
  private VideoCallMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoCallMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoCallMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_VideoCallMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_VideoCallMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.VideoCallMetadata.class, org.matrix.dma.gchat.proto.VideoCallMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int MEETING_SPACE_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.MeetingSpace meetingSpace_;
  /**
   * <code>optional .MeetingSpace meeting_space = 1;</code>
   * @return Whether the meetingSpace field is set.
   */
  @java.lang.Override
  public boolean hasMeetingSpace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .MeetingSpace meeting_space = 1;</code>
   * @return The meetingSpace.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MeetingSpace getMeetingSpace() {
    return meetingSpace_ == null ? org.matrix.dma.gchat.proto.MeetingSpace.getDefaultInstance() : meetingSpace_;
  }
  /**
   * <code>optional .MeetingSpace meeting_space = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MeetingSpaceOrBuilder getMeetingSpaceOrBuilder() {
    return meetingSpace_ == null ? org.matrix.dma.gchat.proto.MeetingSpace.getDefaultInstance() : meetingSpace_;
  }

  public static final int WAS_CREATED_IN_CURRENT_GROUP_FIELD_NUMBER = 2;
  private boolean wasCreatedInCurrentGroup_ = false;
  /**
   * <code>optional bool was_created_in_current_group = 2;</code>
   * @return Whether the wasCreatedInCurrentGroup field is set.
   */
  @java.lang.Override
  public boolean hasWasCreatedInCurrentGroup() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool was_created_in_current_group = 2;</code>
   * @return The wasCreatedInCurrentGroup.
   */
  @java.lang.Override
  public boolean getWasCreatedInCurrentGroup() {
    return wasCreatedInCurrentGroup_;
  }

  public static final int SHOULD_NOT_RENDER_FIELD_NUMBER = 3;
  private boolean shouldNotRender_ = false;
  /**
   * <code>optional bool should_not_render = 3;</code>
   * @return Whether the shouldNotRender field is set.
   */
  @java.lang.Override
  public boolean hasShouldNotRender() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional bool should_not_render = 3;</code>
   * @return The shouldNotRender.
   */
  @java.lang.Override
  public boolean getShouldNotRender() {
    return shouldNotRender_;
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
      output.writeMessage(1, getMeetingSpace());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, wasCreatedInCurrentGroup_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, shouldNotRender_);
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
        .computeMessageSize(1, getMeetingSpace());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, wasCreatedInCurrentGroup_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, shouldNotRender_);
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.VideoCallMetadata)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.VideoCallMetadata other = (org.matrix.dma.gchat.proto.VideoCallMetadata) obj;

    if (hasMeetingSpace() != other.hasMeetingSpace()) return false;
    if (hasMeetingSpace()) {
      if (!getMeetingSpace()
          .equals(other.getMeetingSpace())) return false;
    }
    if (hasWasCreatedInCurrentGroup() != other.hasWasCreatedInCurrentGroup()) return false;
    if (hasWasCreatedInCurrentGroup()) {
      if (getWasCreatedInCurrentGroup()
          != other.getWasCreatedInCurrentGroup()) return false;
    }
    if (hasShouldNotRender() != other.hasShouldNotRender()) return false;
    if (hasShouldNotRender()) {
      if (getShouldNotRender()
          != other.getShouldNotRender()) return false;
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
    if (hasMeetingSpace()) {
      hash = (37 * hash) + MEETING_SPACE_FIELD_NUMBER;
      hash = (53 * hash) + getMeetingSpace().hashCode();
    }
    if (hasWasCreatedInCurrentGroup()) {
      hash = (37 * hash) + WAS_CREATED_IN_CURRENT_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getWasCreatedInCurrentGroup());
    }
    if (hasShouldNotRender()) {
      hash = (37 * hash) + SHOULD_NOT_RENDER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getShouldNotRender());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.VideoCallMetadata parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.VideoCallMetadata prototype) {
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
   * Protobuf type {@code VideoCallMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VideoCallMetadata)
      org.matrix.dma.gchat.proto.VideoCallMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_VideoCallMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_VideoCallMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.VideoCallMetadata.class, org.matrix.dma.gchat.proto.VideoCallMetadata.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.VideoCallMetadata.newBuilder()
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
        getMeetingSpaceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      meetingSpace_ = null;
      if (meetingSpaceBuilder_ != null) {
        meetingSpaceBuilder_.dispose();
        meetingSpaceBuilder_ = null;
      }
      wasCreatedInCurrentGroup_ = false;
      shouldNotRender_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_VideoCallMetadata_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.VideoCallMetadata getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.VideoCallMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.VideoCallMetadata build() {
      org.matrix.dma.gchat.proto.VideoCallMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.VideoCallMetadata buildPartial() {
      org.matrix.dma.gchat.proto.VideoCallMetadata result = new org.matrix.dma.gchat.proto.VideoCallMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.VideoCallMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.meetingSpace_ = meetingSpaceBuilder_ == null
            ? meetingSpace_
            : meetingSpaceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.wasCreatedInCurrentGroup_ = wasCreatedInCurrentGroup_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.shouldNotRender_ = shouldNotRender_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof org.matrix.dma.gchat.proto.VideoCallMetadata) {
        return mergeFrom((org.matrix.dma.gchat.proto.VideoCallMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.VideoCallMetadata other) {
      if (other == org.matrix.dma.gchat.proto.VideoCallMetadata.getDefaultInstance()) return this;
      if (other.hasMeetingSpace()) {
        mergeMeetingSpace(other.getMeetingSpace());
      }
      if (other.hasWasCreatedInCurrentGroup()) {
        setWasCreatedInCurrentGroup(other.getWasCreatedInCurrentGroup());
      }
      if (other.hasShouldNotRender()) {
        setShouldNotRender(other.getShouldNotRender());
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
                  getMeetingSpaceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              wasCreatedInCurrentGroup_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              shouldNotRender_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private org.matrix.dma.gchat.proto.MeetingSpace meetingSpace_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MeetingSpace, org.matrix.dma.gchat.proto.MeetingSpace.Builder, org.matrix.dma.gchat.proto.MeetingSpaceOrBuilder> meetingSpaceBuilder_;
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     * @return Whether the meetingSpace field is set.
     */
    public boolean hasMeetingSpace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     * @return The meetingSpace.
     */
    public org.matrix.dma.gchat.proto.MeetingSpace getMeetingSpace() {
      if (meetingSpaceBuilder_ == null) {
        return meetingSpace_ == null ? org.matrix.dma.gchat.proto.MeetingSpace.getDefaultInstance() : meetingSpace_;
      } else {
        return meetingSpaceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public Builder setMeetingSpace(org.matrix.dma.gchat.proto.MeetingSpace value) {
      if (meetingSpaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meetingSpace_ = value;
      } else {
        meetingSpaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public Builder setMeetingSpace(
        org.matrix.dma.gchat.proto.MeetingSpace.Builder builderForValue) {
      if (meetingSpaceBuilder_ == null) {
        meetingSpace_ = builderForValue.build();
      } else {
        meetingSpaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public Builder mergeMeetingSpace(org.matrix.dma.gchat.proto.MeetingSpace value) {
      if (meetingSpaceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          meetingSpace_ != null &&
          meetingSpace_ != org.matrix.dma.gchat.proto.MeetingSpace.getDefaultInstance()) {
          getMeetingSpaceBuilder().mergeFrom(value);
        } else {
          meetingSpace_ = value;
        }
      } else {
        meetingSpaceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public Builder clearMeetingSpace() {
      bitField0_ = (bitField0_ & ~0x00000001);
      meetingSpace_ = null;
      if (meetingSpaceBuilder_ != null) {
        meetingSpaceBuilder_.dispose();
        meetingSpaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public org.matrix.dma.gchat.proto.MeetingSpace.Builder getMeetingSpaceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMeetingSpaceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public org.matrix.dma.gchat.proto.MeetingSpaceOrBuilder getMeetingSpaceOrBuilder() {
      if (meetingSpaceBuilder_ != null) {
        return meetingSpaceBuilder_.getMessageOrBuilder();
      } else {
        return meetingSpace_ == null ?
            org.matrix.dma.gchat.proto.MeetingSpace.getDefaultInstance() : meetingSpace_;
      }
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.MeetingSpace, org.matrix.dma.gchat.proto.MeetingSpace.Builder, org.matrix.dma.gchat.proto.MeetingSpaceOrBuilder> 
        getMeetingSpaceFieldBuilder() {
      if (meetingSpaceBuilder_ == null) {
        meetingSpaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.MeetingSpace, org.matrix.dma.gchat.proto.MeetingSpace.Builder, org.matrix.dma.gchat.proto.MeetingSpaceOrBuilder>(
                getMeetingSpace(),
                getParentForChildren(),
                isClean());
        meetingSpace_ = null;
      }
      return meetingSpaceBuilder_;
    }

    private boolean wasCreatedInCurrentGroup_ ;
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     * @return Whether the wasCreatedInCurrentGroup field is set.
     */
    @java.lang.Override
    public boolean hasWasCreatedInCurrentGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     * @return The wasCreatedInCurrentGroup.
     */
    @java.lang.Override
    public boolean getWasCreatedInCurrentGroup() {
      return wasCreatedInCurrentGroup_;
    }
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     * @param value The wasCreatedInCurrentGroup to set.
     * @return This builder for chaining.
     */
    public Builder setWasCreatedInCurrentGroup(boolean value) {
      
      wasCreatedInCurrentGroup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWasCreatedInCurrentGroup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      wasCreatedInCurrentGroup_ = false;
      onChanged();
      return this;
    }

    private boolean shouldNotRender_ ;
    /**
     * <code>optional bool should_not_render = 3;</code>
     * @return Whether the shouldNotRender field is set.
     */
    @java.lang.Override
    public boolean hasShouldNotRender() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool should_not_render = 3;</code>
     * @return The shouldNotRender.
     */
    @java.lang.Override
    public boolean getShouldNotRender() {
      return shouldNotRender_;
    }
    /**
     * <code>optional bool should_not_render = 3;</code>
     * @param value The shouldNotRender to set.
     * @return This builder for chaining.
     */
    public Builder setShouldNotRender(boolean value) {
      
      shouldNotRender_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool should_not_render = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShouldNotRender() {
      bitField0_ = (bitField0_ & ~0x00000004);
      shouldNotRender_ = false;
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


    // @@protoc_insertion_point(builder_scope:VideoCallMetadata)
  }

  // @@protoc_insertion_point(class_scope:VideoCallMetadata)
  private static final org.matrix.dma.gchat.proto.VideoCallMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.VideoCallMetadata();
  }

  public static org.matrix.dma.gchat.proto.VideoCallMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<VideoCallMetadata>
      PARSER = new com.google.protobuf.AbstractParser<VideoCallMetadata>() {
    @java.lang.Override
    public VideoCallMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoCallMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoCallMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.VideoCallMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

