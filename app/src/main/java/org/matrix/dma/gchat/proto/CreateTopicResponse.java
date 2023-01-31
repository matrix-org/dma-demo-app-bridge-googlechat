// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code CreateTopicResponse}
 */
public final class CreateTopicResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateTopicResponse)
    CreateTopicResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTopicResponse.newBuilder() to construct.
  private CreateTopicResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTopicResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTopicResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateTopicResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateTopicResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.CreateTopicResponse.class, org.matrix.dma.gchat.proto.CreateTopicResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TOPIC_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.Topic topic_;
  /**
   * <code>optional .Topic topic = 1;</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .Topic topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.Topic getTopic() {
    return topic_ == null ? org.matrix.dma.gchat.proto.Topic.getDefaultInstance() : topic_;
  }
  /**
   * <code>optional .Topic topic = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.TopicOrBuilder getTopicOrBuilder() {
    return topic_ == null ? org.matrix.dma.gchat.proto.Topic.getDefaultInstance() : topic_;
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

  public static final int CURRENT_GROUP_REVISION_FIELD_NUMBER = 3;
  private org.matrix.dma.gchat.proto.ReadRevision currentGroupRevision_;
  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   * @return Whether the currentGroupRevision field is set.
   */
  @java.lang.Override
  public boolean hasCurrentGroupRevision() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   * @return The currentGroupRevision.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ReadRevision getCurrentGroupRevision() {
    return currentGroupRevision_ == null ? org.matrix.dma.gchat.proto.ReadRevision.getDefaultInstance() : currentGroupRevision_;
  }
  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getCurrentGroupRevisionOrBuilder() {
    return currentGroupRevision_ == null ? org.matrix.dma.gchat.proto.ReadRevision.getDefaultInstance() : currentGroupRevision_;
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
      output.writeMessage(1, getTopic());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getGroupRevision());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getCurrentGroupRevision());
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
        .computeMessageSize(1, getTopic());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroupRevision());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCurrentGroupRevision());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.CreateTopicResponse)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.CreateTopicResponse other = (org.matrix.dma.gchat.proto.CreateTopicResponse) obj;

    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic()
          .equals(other.getTopic())) return false;
    }
    if (hasGroupRevision() != other.hasGroupRevision()) return false;
    if (hasGroupRevision()) {
      if (!getGroupRevision()
          .equals(other.getGroupRevision())) return false;
    }
    if (hasCurrentGroupRevision() != other.hasCurrentGroupRevision()) return false;
    if (hasCurrentGroupRevision()) {
      if (!getCurrentGroupRevision()
          .equals(other.getCurrentGroupRevision())) return false;
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
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    if (hasGroupRevision()) {
      hash = (37 * hash) + GROUP_REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getGroupRevision().hashCode();
    }
    if (hasCurrentGroupRevision()) {
      hash = (37 * hash) + CURRENT_GROUP_REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentGroupRevision().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateTopicResponse parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.CreateTopicResponse prototype) {
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
   * Protobuf type {@code CreateTopicResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateTopicResponse)
      org.matrix.dma.gchat.proto.CreateTopicResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateTopicResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateTopicResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.CreateTopicResponse.class, org.matrix.dma.gchat.proto.CreateTopicResponse.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.CreateTopicResponse.newBuilder()
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
        getTopicFieldBuilder();
        getGroupRevisionFieldBuilder();
        getCurrentGroupRevisionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      groupRevision_ = null;
      if (groupRevisionBuilder_ != null) {
        groupRevisionBuilder_.dispose();
        groupRevisionBuilder_ = null;
      }
      currentGroupRevision_ = null;
      if (currentGroupRevisionBuilder_ != null) {
        currentGroupRevisionBuilder_.dispose();
        currentGroupRevisionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateTopicResponse_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateTopicResponse getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.CreateTopicResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateTopicResponse build() {
      org.matrix.dma.gchat.proto.CreateTopicResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateTopicResponse buildPartial() {
      org.matrix.dma.gchat.proto.CreateTopicResponse result = new org.matrix.dma.gchat.proto.CreateTopicResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.CreateTopicResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topicBuilder_ == null
            ? topic_
            : topicBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupRevision_ = groupRevisionBuilder_ == null
            ? groupRevision_
            : groupRevisionBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.currentGroupRevision_ = currentGroupRevisionBuilder_ == null
            ? currentGroupRevision_
            : currentGroupRevisionBuilder_.build();
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
      if (other instanceof org.matrix.dma.gchat.proto.CreateTopicResponse) {
        return mergeFrom((org.matrix.dma.gchat.proto.CreateTopicResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.CreateTopicResponse other) {
      if (other == org.matrix.dma.gchat.proto.CreateTopicResponse.getDefaultInstance()) return this;
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (other.hasGroupRevision()) {
        mergeGroupRevision(other.getGroupRevision());
      }
      if (other.hasCurrentGroupRevision()) {
        mergeCurrentGroupRevision(other.getCurrentGroupRevision());
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
                  getTopicFieldBuilder().getBuilder(),
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
            case 26: {
              input.readMessage(
                  getCurrentGroupRevisionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private org.matrix.dma.gchat.proto.Topic topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Topic, org.matrix.dma.gchat.proto.Topic.Builder, org.matrix.dma.gchat.proto.TopicOrBuilder> topicBuilder_;
    /**
     * <code>optional .Topic topic = 1;</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     * @return The topic.
     */
    public org.matrix.dma.gchat.proto.Topic getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? org.matrix.dma.gchat.proto.Topic.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public Builder setTopic(org.matrix.dma.gchat.proto.Topic value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
      } else {
        topicBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public Builder setTopic(
        org.matrix.dma.gchat.proto.Topic.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public Builder mergeTopic(org.matrix.dma.gchat.proto.Topic value) {
      if (topicBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          topic_ != null &&
          topic_ != org.matrix.dma.gchat.proto.Topic.getDefaultInstance()) {
          getTopicBuilder().mergeFrom(value);
        } else {
          topic_ = value;
        }
      } else {
        topicBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public Builder clearTopic() {
      bitField0_ = (bitField0_ & ~0x00000001);
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public org.matrix.dma.gchat.proto.Topic.Builder getTopicBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    public org.matrix.dma.gchat.proto.TopicOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            org.matrix.dma.gchat.proto.Topic.getDefaultInstance() : topic_;
      }
    }
    /**
     * <code>optional .Topic topic = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Topic, org.matrix.dma.gchat.proto.Topic.Builder, org.matrix.dma.gchat.proto.TopicOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.Topic, org.matrix.dma.gchat.proto.Topic.Builder, org.matrix.dma.gchat.proto.TopicOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
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

    private org.matrix.dma.gchat.proto.ReadRevision currentGroupRevision_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.ReadRevision, org.matrix.dma.gchat.proto.ReadRevision.Builder, org.matrix.dma.gchat.proto.ReadRevisionOrBuilder> currentGroupRevisionBuilder_;
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     * @return Whether the currentGroupRevision field is set.
     */
    public boolean hasCurrentGroupRevision() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     * @return The currentGroupRevision.
     */
    public org.matrix.dma.gchat.proto.ReadRevision getCurrentGroupRevision() {
      if (currentGroupRevisionBuilder_ == null) {
        return currentGroupRevision_ == null ? org.matrix.dma.gchat.proto.ReadRevision.getDefaultInstance() : currentGroupRevision_;
      } else {
        return currentGroupRevisionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public Builder setCurrentGroupRevision(org.matrix.dma.gchat.proto.ReadRevision value) {
      if (currentGroupRevisionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        currentGroupRevision_ = value;
      } else {
        currentGroupRevisionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public Builder setCurrentGroupRevision(
        org.matrix.dma.gchat.proto.ReadRevision.Builder builderForValue) {
      if (currentGroupRevisionBuilder_ == null) {
        currentGroupRevision_ = builderForValue.build();
      } else {
        currentGroupRevisionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public Builder mergeCurrentGroupRevision(org.matrix.dma.gchat.proto.ReadRevision value) {
      if (currentGroupRevisionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          currentGroupRevision_ != null &&
          currentGroupRevision_ != org.matrix.dma.gchat.proto.ReadRevision.getDefaultInstance()) {
          getCurrentGroupRevisionBuilder().mergeFrom(value);
        } else {
          currentGroupRevision_ = value;
        }
      } else {
        currentGroupRevisionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public Builder clearCurrentGroupRevision() {
      bitField0_ = (bitField0_ & ~0x00000004);
      currentGroupRevision_ = null;
      if (currentGroupRevisionBuilder_ != null) {
        currentGroupRevisionBuilder_.dispose();
        currentGroupRevisionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public org.matrix.dma.gchat.proto.ReadRevision.Builder getCurrentGroupRevisionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCurrentGroupRevisionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    public org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getCurrentGroupRevisionOrBuilder() {
      if (currentGroupRevisionBuilder_ != null) {
        return currentGroupRevisionBuilder_.getMessageOrBuilder();
      } else {
        return currentGroupRevision_ == null ?
            org.matrix.dma.gchat.proto.ReadRevision.getDefaultInstance() : currentGroupRevision_;
      }
    }
    /**
     * <code>optional .ReadRevision current_group_revision = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.ReadRevision, org.matrix.dma.gchat.proto.ReadRevision.Builder, org.matrix.dma.gchat.proto.ReadRevisionOrBuilder> 
        getCurrentGroupRevisionFieldBuilder() {
      if (currentGroupRevisionBuilder_ == null) {
        currentGroupRevisionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.ReadRevision, org.matrix.dma.gchat.proto.ReadRevision.Builder, org.matrix.dma.gchat.proto.ReadRevisionOrBuilder>(
                getCurrentGroupRevision(),
                getParentForChildren(),
                isClean());
        currentGroupRevision_ = null;
      }
      return currentGroupRevisionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CreateTopicResponse)
  }

  // @@protoc_insertion_point(class_scope:CreateTopicResponse)
  private static final org.matrix.dma.gchat.proto.CreateTopicResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.CreateTopicResponse();
  }

  public static org.matrix.dma.gchat.proto.CreateTopicResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CreateTopicResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateTopicResponse>() {
    @java.lang.Override
    public CreateTopicResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTopicResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTopicResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.CreateTopicResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

