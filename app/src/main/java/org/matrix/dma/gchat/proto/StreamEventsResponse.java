// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * <pre>
 * echo "&lt;base64 encoded stream response&gt;" | base64 -d - | protoc --decode StreamEventsResponse googlechat.proto
 * </pre>
 *
 * Protobuf type {@code StreamEventsResponse}
 */
public final class StreamEventsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StreamEventsResponse)
    StreamEventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamEventsResponse.newBuilder() to construct.
  private StreamEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamEventsResponse() {
    sampleId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamEventsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_StreamEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_StreamEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.StreamEventsResponse.class, org.matrix.dma.gchat.proto.StreamEventsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int EVENT_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.Event event_;
  /**
   * <code>optional .Event event = 1;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .Event event = 1;</code>
   * @return The event.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.Event getEvent() {
    return event_ == null ? org.matrix.dma.gchat.proto.Event.getDefaultInstance() : event_;
  }
  /**
   * <code>optional .Event event = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.EventOrBuilder getEventOrBuilder() {
    return event_ == null ? org.matrix.dma.gchat.proto.Event.getDefaultInstance() : event_;
  }

  public static final int SAMPLE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sampleId_ = "";
  /**
   * <code>optional string sample_id = 2;</code>
   * @return Whether the sampleId field is set.
   */
  @java.lang.Override
  public boolean hasSampleId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string sample_id = 2;</code>
   * @return The sampleId.
   */
  @java.lang.Override
  public java.lang.String getSampleId() {
    java.lang.Object ref = sampleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        sampleId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string sample_id = 2;</code>
   * @return The bytes for sampleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSampleIdBytes() {
    java.lang.Object ref = sampleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sampleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLOCK_SYNC_RESPONSE_FIELD_NUMBER = 3;
  private org.matrix.dma.gchat.proto.ClockSyncResponse clockSyncResponse_;
  /**
   * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
   * @return Whether the clockSyncResponse field is set.
   */
  @java.lang.Override
  public boolean hasClockSyncResponse() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
   * @return The clockSyncResponse.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ClockSyncResponse getClockSyncResponse() {
    return clockSyncResponse_ == null ? org.matrix.dma.gchat.proto.ClockSyncResponse.getDefaultInstance() : clockSyncResponse_;
  }
  /**
   * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ClockSyncResponseOrBuilder getClockSyncResponseOrBuilder() {
    return clockSyncResponse_ == null ? org.matrix.dma.gchat.proto.ClockSyncResponse.getDefaultInstance() : clockSyncResponse_;
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
      output.writeMessage(1, getEvent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sampleId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getClockSyncResponse());
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
        .computeMessageSize(1, getEvent());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sampleId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getClockSyncResponse());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.StreamEventsResponse)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.StreamEventsResponse other = (org.matrix.dma.gchat.proto.StreamEventsResponse) obj;

    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
    if (hasSampleId() != other.hasSampleId()) return false;
    if (hasSampleId()) {
      if (!getSampleId()
          .equals(other.getSampleId())) return false;
    }
    if (hasClockSyncResponse() != other.hasClockSyncResponse()) return false;
    if (hasClockSyncResponse()) {
      if (!getClockSyncResponse()
          .equals(other.getClockSyncResponse())) return false;
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
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    if (hasSampleId()) {
      hash = (37 * hash) + SAMPLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSampleId().hashCode();
    }
    if (hasClockSyncResponse()) {
      hash = (37 * hash) + CLOCK_SYNC_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getClockSyncResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.StreamEventsResponse parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.StreamEventsResponse prototype) {
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
   * <pre>
   * echo "&lt;base64 encoded stream response&gt;" | base64 -d - | protoc --decode StreamEventsResponse googlechat.proto
   * </pre>
   *
   * Protobuf type {@code StreamEventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StreamEventsResponse)
      org.matrix.dma.gchat.proto.StreamEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_StreamEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_StreamEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.StreamEventsResponse.class, org.matrix.dma.gchat.proto.StreamEventsResponse.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.StreamEventsResponse.newBuilder()
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
        getEventFieldBuilder();
        getClockSyncResponseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      sampleId_ = "";
      clockSyncResponse_ = null;
      if (clockSyncResponseBuilder_ != null) {
        clockSyncResponseBuilder_.dispose();
        clockSyncResponseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_StreamEventsResponse_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.StreamEventsResponse getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.StreamEventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.StreamEventsResponse build() {
      org.matrix.dma.gchat.proto.StreamEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.StreamEventsResponse buildPartial() {
      org.matrix.dma.gchat.proto.StreamEventsResponse result = new org.matrix.dma.gchat.proto.StreamEventsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.StreamEventsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.event_ = eventBuilder_ == null
            ? event_
            : eventBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sampleId_ = sampleId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clockSyncResponse_ = clockSyncResponseBuilder_ == null
            ? clockSyncResponse_
            : clockSyncResponseBuilder_.build();
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
      if (other instanceof org.matrix.dma.gchat.proto.StreamEventsResponse) {
        return mergeFrom((org.matrix.dma.gchat.proto.StreamEventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.StreamEventsResponse other) {
      if (other == org.matrix.dma.gchat.proto.StreamEventsResponse.getDefaultInstance()) return this;
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
      }
      if (other.hasSampleId()) {
        sampleId_ = other.sampleId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasClockSyncResponse()) {
        mergeClockSyncResponse(other.getClockSyncResponse());
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
                  getEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sampleId_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getClockSyncResponseFieldBuilder().getBuilder(),
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

    private org.matrix.dma.gchat.proto.Event event_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Event, org.matrix.dma.gchat.proto.Event.Builder, org.matrix.dma.gchat.proto.EventOrBuilder> eventBuilder_;
    /**
     * <code>optional .Event event = 1;</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .Event event = 1;</code>
     * @return The event.
     */
    public org.matrix.dma.gchat.proto.Event getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? org.matrix.dma.gchat.proto.Event.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public Builder setEvent(org.matrix.dma.gchat.proto.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
      } else {
        eventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public Builder setEvent(
        org.matrix.dma.gchat.proto.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public Builder mergeEvent(org.matrix.dma.gchat.proto.Event value) {
      if (eventBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          event_ != null &&
          event_ != org.matrix.dma.gchat.proto.Event.getDefaultInstance()) {
          getEventBuilder().mergeFrom(value);
        } else {
          event_ = value;
        }
      } else {
        eventBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public Builder clearEvent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public org.matrix.dma.gchat.proto.Event.Builder getEventBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    public org.matrix.dma.gchat.proto.EventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            org.matrix.dma.gchat.proto.Event.getDefaultInstance() : event_;
      }
    }
    /**
     * <code>optional .Event event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Event, org.matrix.dma.gchat.proto.Event.Builder, org.matrix.dma.gchat.proto.EventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.Event, org.matrix.dma.gchat.proto.Event.Builder, org.matrix.dma.gchat.proto.EventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
    }

    private java.lang.Object sampleId_ = "";
    /**
     * <code>optional string sample_id = 2;</code>
     * @return Whether the sampleId field is set.
     */
    public boolean hasSampleId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string sample_id = 2;</code>
     * @return The sampleId.
     */
    public java.lang.String getSampleId() {
      java.lang.Object ref = sampleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sampleId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sample_id = 2;</code>
     * @return The bytes for sampleId.
     */
    public com.google.protobuf.ByteString
        getSampleIdBytes() {
      java.lang.Object ref = sampleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sampleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sample_id = 2;</code>
     * @param value The sampleId to set.
     * @return This builder for chaining.
     */
    public Builder setSampleId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sampleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sample_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleId() {
      sampleId_ = getDefaultInstance().getSampleId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string sample_id = 2;</code>
     * @param value The bytes for sampleId to set.
     * @return This builder for chaining.
     */
    public Builder setSampleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sampleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private org.matrix.dma.gchat.proto.ClockSyncResponse clockSyncResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.ClockSyncResponse, org.matrix.dma.gchat.proto.ClockSyncResponse.Builder, org.matrix.dma.gchat.proto.ClockSyncResponseOrBuilder> clockSyncResponseBuilder_;
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     * @return Whether the clockSyncResponse field is set.
     */
    public boolean hasClockSyncResponse() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     * @return The clockSyncResponse.
     */
    public org.matrix.dma.gchat.proto.ClockSyncResponse getClockSyncResponse() {
      if (clockSyncResponseBuilder_ == null) {
        return clockSyncResponse_ == null ? org.matrix.dma.gchat.proto.ClockSyncResponse.getDefaultInstance() : clockSyncResponse_;
      } else {
        return clockSyncResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public Builder setClockSyncResponse(org.matrix.dma.gchat.proto.ClockSyncResponse value) {
      if (clockSyncResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clockSyncResponse_ = value;
      } else {
        clockSyncResponseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public Builder setClockSyncResponse(
        org.matrix.dma.gchat.proto.ClockSyncResponse.Builder builderForValue) {
      if (clockSyncResponseBuilder_ == null) {
        clockSyncResponse_ = builderForValue.build();
      } else {
        clockSyncResponseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public Builder mergeClockSyncResponse(org.matrix.dma.gchat.proto.ClockSyncResponse value) {
      if (clockSyncResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          clockSyncResponse_ != null &&
          clockSyncResponse_ != org.matrix.dma.gchat.proto.ClockSyncResponse.getDefaultInstance()) {
          getClockSyncResponseBuilder().mergeFrom(value);
        } else {
          clockSyncResponse_ = value;
        }
      } else {
        clockSyncResponseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public Builder clearClockSyncResponse() {
      bitField0_ = (bitField0_ & ~0x00000004);
      clockSyncResponse_ = null;
      if (clockSyncResponseBuilder_ != null) {
        clockSyncResponseBuilder_.dispose();
        clockSyncResponseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public org.matrix.dma.gchat.proto.ClockSyncResponse.Builder getClockSyncResponseBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getClockSyncResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    public org.matrix.dma.gchat.proto.ClockSyncResponseOrBuilder getClockSyncResponseOrBuilder() {
      if (clockSyncResponseBuilder_ != null) {
        return clockSyncResponseBuilder_.getMessageOrBuilder();
      } else {
        return clockSyncResponse_ == null ?
            org.matrix.dma.gchat.proto.ClockSyncResponse.getDefaultInstance() : clockSyncResponse_;
      }
    }
    /**
     * <code>optional .ClockSyncResponse clock_sync_response = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.ClockSyncResponse, org.matrix.dma.gchat.proto.ClockSyncResponse.Builder, org.matrix.dma.gchat.proto.ClockSyncResponseOrBuilder> 
        getClockSyncResponseFieldBuilder() {
      if (clockSyncResponseBuilder_ == null) {
        clockSyncResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.ClockSyncResponse, org.matrix.dma.gchat.proto.ClockSyncResponse.Builder, org.matrix.dma.gchat.proto.ClockSyncResponseOrBuilder>(
                getClockSyncResponse(),
                getParentForChildren(),
                isClean());
        clockSyncResponse_ = null;
      }
      return clockSyncResponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:StreamEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:StreamEventsResponse)
  private static final org.matrix.dma.gchat.proto.StreamEventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.StreamEventsResponse();
  }

  public static org.matrix.dma.gchat.proto.StreamEventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StreamEventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamEventsResponse>() {
    @java.lang.Override
    public StreamEventsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.StreamEventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

