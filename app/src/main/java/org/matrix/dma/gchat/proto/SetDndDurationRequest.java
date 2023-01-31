// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code SetDndDurationRequest}
 */
public final class SetDndDurationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetDndDurationRequest)
    SetDndDurationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetDndDurationRequest.newBuilder() to construct.
  private SetDndDurationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetDndDurationRequest() {
    currentDndState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetDndDurationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_SetDndDurationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_SetDndDurationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.SetDndDurationRequest.class, org.matrix.dma.gchat.proto.SetDndDurationRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code SetDndDurationRequest.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>AVAILABLE = 1;</code>
     */
    AVAILABLE(1),
    /**
     * <code>DND = 2;</code>
     */
    DND(2),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>AVAILABLE = 1;</code>
     */
    public static final int AVAILABLE_VALUE = 1;
    /**
     * <code>DND = 2;</code>
     */
    public static final int DND_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return AVAILABLE;
        case 2: return DND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.SetDndDurationRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SetDndDurationRequest.State)
  }

  private int bitField0_;
  public static final int REQUEST_HEADER_FIELD_NUMBER = 100;
  private org.matrix.dma.gchat.proto.RequestHeader requestHeader_;
  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   * @return Whether the requestHeader field is set.
   */
  @java.lang.Override
  public boolean hasRequestHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   * @return The requestHeader.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.RequestHeader getRequestHeader() {
    return requestHeader_ == null ? org.matrix.dma.gchat.proto.RequestHeader.getDefaultInstance() : requestHeader_;
  }
  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.RequestHeaderOrBuilder getRequestHeaderOrBuilder() {
    return requestHeader_ == null ? org.matrix.dma.gchat.proto.RequestHeader.getDefaultInstance() : requestHeader_;
  }

  public static final int CURRENT_DND_STATE_FIELD_NUMBER = 2;
  private int currentDndState_ = 0;
  /**
   * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
   * @return Whether the currentDndState field is set.
   */
  @java.lang.Override public boolean hasCurrentDndState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
   * @return The currentDndState.
   */
  @java.lang.Override public org.matrix.dma.gchat.proto.SetDndDurationRequest.State getCurrentDndState() {
    org.matrix.dma.gchat.proto.SetDndDurationRequest.State result = org.matrix.dma.gchat.proto.SetDndDurationRequest.State.forNumber(currentDndState_);
    return result == null ? org.matrix.dma.gchat.proto.SetDndDurationRequest.State.UNKNOWN : result;
  }

  public static final int NEW_DND_DURATION_USEC_FIELD_NUMBER = 1;
  private long newDndDurationUsec_ = 0L;
  /**
   * <pre>
   *oneof DndExpiry {
   * </pre>
   *
   * <code>optional int64 new_dnd_duration_usec = 1;</code>
   * @return Whether the newDndDurationUsec field is set.
   */
  @java.lang.Override
  public boolean hasNewDndDurationUsec() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *oneof DndExpiry {
   * </pre>
   *
   * <code>optional int64 new_dnd_duration_usec = 1;</code>
   * @return The newDndDurationUsec.
   */
  @java.lang.Override
  public long getNewDndDurationUsec() {
    return newDndDurationUsec_;
  }

  public static final int DND_EXPIRY_TIMESTAMP_USEC_FIELD_NUMBER = 3;
  private long dndExpiryTimestampUsec_ = 0L;
  /**
   * <pre>
   *}
   * </pre>
   *
   * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
   * @return Whether the dndExpiryTimestampUsec field is set.
   */
  @java.lang.Override
  public boolean hasDndExpiryTimestampUsec() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   *}
   * </pre>
   *
   * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
   * @return The dndExpiryTimestampUsec.
   */
  @java.lang.Override
  public long getDndExpiryTimestampUsec() {
    return dndExpiryTimestampUsec_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(1, newDndDurationUsec_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, currentDndState_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(3, dndExpiryTimestampUsec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(100, getRequestHeader());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, newDndDurationUsec_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, currentDndState_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dndExpiryTimestampUsec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, getRequestHeader());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.SetDndDurationRequest)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.SetDndDurationRequest other = (org.matrix.dma.gchat.proto.SetDndDurationRequest) obj;

    if (hasRequestHeader() != other.hasRequestHeader()) return false;
    if (hasRequestHeader()) {
      if (!getRequestHeader()
          .equals(other.getRequestHeader())) return false;
    }
    if (hasCurrentDndState() != other.hasCurrentDndState()) return false;
    if (hasCurrentDndState()) {
      if (currentDndState_ != other.currentDndState_) return false;
    }
    if (hasNewDndDurationUsec() != other.hasNewDndDurationUsec()) return false;
    if (hasNewDndDurationUsec()) {
      if (getNewDndDurationUsec()
          != other.getNewDndDurationUsec()) return false;
    }
    if (hasDndExpiryTimestampUsec() != other.hasDndExpiryTimestampUsec()) return false;
    if (hasDndExpiryTimestampUsec()) {
      if (getDndExpiryTimestampUsec()
          != other.getDndExpiryTimestampUsec()) return false;
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
    if (hasRequestHeader()) {
      hash = (37 * hash) + REQUEST_HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getRequestHeader().hashCode();
    }
    if (hasCurrentDndState()) {
      hash = (37 * hash) + CURRENT_DND_STATE_FIELD_NUMBER;
      hash = (53 * hash) + currentDndState_;
    }
    if (hasNewDndDurationUsec()) {
      hash = (37 * hash) + NEW_DND_DURATION_USEC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNewDndDurationUsec());
    }
    if (hasDndExpiryTimestampUsec()) {
      hash = (37 * hash) + DND_EXPIRY_TIMESTAMP_USEC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDndExpiryTimestampUsec());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.SetDndDurationRequest parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.SetDndDurationRequest prototype) {
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
   * Protobuf type {@code SetDndDurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetDndDurationRequest)
      org.matrix.dma.gchat.proto.SetDndDurationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_SetDndDurationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_SetDndDurationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.SetDndDurationRequest.class, org.matrix.dma.gchat.proto.SetDndDurationRequest.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.SetDndDurationRequest.newBuilder()
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
        getRequestHeaderFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      requestHeader_ = null;
      if (requestHeaderBuilder_ != null) {
        requestHeaderBuilder_.dispose();
        requestHeaderBuilder_ = null;
      }
      currentDndState_ = 0;
      newDndDurationUsec_ = 0L;
      dndExpiryTimestampUsec_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_SetDndDurationRequest_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.SetDndDurationRequest getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.SetDndDurationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.SetDndDurationRequest build() {
      org.matrix.dma.gchat.proto.SetDndDurationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.SetDndDurationRequest buildPartial() {
      org.matrix.dma.gchat.proto.SetDndDurationRequest result = new org.matrix.dma.gchat.proto.SetDndDurationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.SetDndDurationRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestHeader_ = requestHeaderBuilder_ == null
            ? requestHeader_
            : requestHeaderBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.currentDndState_ = currentDndState_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newDndDurationUsec_ = newDndDurationUsec_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dndExpiryTimestampUsec_ = dndExpiryTimestampUsec_;
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
      if (other instanceof org.matrix.dma.gchat.proto.SetDndDurationRequest) {
        return mergeFrom((org.matrix.dma.gchat.proto.SetDndDurationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.SetDndDurationRequest other) {
      if (other == org.matrix.dma.gchat.proto.SetDndDurationRequest.getDefaultInstance()) return this;
      if (other.hasRequestHeader()) {
        mergeRequestHeader(other.getRequestHeader());
      }
      if (other.hasCurrentDndState()) {
        setCurrentDndState(other.getCurrentDndState());
      }
      if (other.hasNewDndDurationUsec()) {
        setNewDndDurationUsec(other.getNewDndDurationUsec());
      }
      if (other.hasDndExpiryTimestampUsec()) {
        setDndExpiryTimestampUsec(other.getDndExpiryTimestampUsec());
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
              newDndDurationUsec_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              org.matrix.dma.gchat.proto.SetDndDurationRequest.State tmpValue =
                  org.matrix.dma.gchat.proto.SetDndDurationRequest.State.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                currentDndState_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
            case 24: {
              dndExpiryTimestampUsec_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 24
            case 802: {
              input.readMessage(
                  getRequestHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 802
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

    private org.matrix.dma.gchat.proto.RequestHeader requestHeader_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.RequestHeader, org.matrix.dma.gchat.proto.RequestHeader.Builder, org.matrix.dma.gchat.proto.RequestHeaderOrBuilder> requestHeaderBuilder_;
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     * @return Whether the requestHeader field is set.
     */
    public boolean hasRequestHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     * @return The requestHeader.
     */
    public org.matrix.dma.gchat.proto.RequestHeader getRequestHeader() {
      if (requestHeaderBuilder_ == null) {
        return requestHeader_ == null ? org.matrix.dma.gchat.proto.RequestHeader.getDefaultInstance() : requestHeader_;
      } else {
        return requestHeaderBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public Builder setRequestHeader(org.matrix.dma.gchat.proto.RequestHeader value) {
      if (requestHeaderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestHeader_ = value;
      } else {
        requestHeaderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public Builder setRequestHeader(
        org.matrix.dma.gchat.proto.RequestHeader.Builder builderForValue) {
      if (requestHeaderBuilder_ == null) {
        requestHeader_ = builderForValue.build();
      } else {
        requestHeaderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public Builder mergeRequestHeader(org.matrix.dma.gchat.proto.RequestHeader value) {
      if (requestHeaderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          requestHeader_ != null &&
          requestHeader_ != org.matrix.dma.gchat.proto.RequestHeader.getDefaultInstance()) {
          getRequestHeaderBuilder().mergeFrom(value);
        } else {
          requestHeader_ = value;
        }
      } else {
        requestHeaderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public Builder clearRequestHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestHeader_ = null;
      if (requestHeaderBuilder_ != null) {
        requestHeaderBuilder_.dispose();
        requestHeaderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public org.matrix.dma.gchat.proto.RequestHeader.Builder getRequestHeaderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public org.matrix.dma.gchat.proto.RequestHeaderOrBuilder getRequestHeaderOrBuilder() {
      if (requestHeaderBuilder_ != null) {
        return requestHeaderBuilder_.getMessageOrBuilder();
      } else {
        return requestHeader_ == null ?
            org.matrix.dma.gchat.proto.RequestHeader.getDefaultInstance() : requestHeader_;
      }
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.RequestHeader, org.matrix.dma.gchat.proto.RequestHeader.Builder, org.matrix.dma.gchat.proto.RequestHeaderOrBuilder> 
        getRequestHeaderFieldBuilder() {
      if (requestHeaderBuilder_ == null) {
        requestHeaderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.RequestHeader, org.matrix.dma.gchat.proto.RequestHeader.Builder, org.matrix.dma.gchat.proto.RequestHeaderOrBuilder>(
                getRequestHeader(),
                getParentForChildren(),
                isClean());
        requestHeader_ = null;
      }
      return requestHeaderBuilder_;
    }

    private int currentDndState_ = 0;
    /**
     * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
     * @return Whether the currentDndState field is set.
     */
    @java.lang.Override public boolean hasCurrentDndState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
     * @return The currentDndState.
     */
    @java.lang.Override
    public org.matrix.dma.gchat.proto.SetDndDurationRequest.State getCurrentDndState() {
      org.matrix.dma.gchat.proto.SetDndDurationRequest.State result = org.matrix.dma.gchat.proto.SetDndDurationRequest.State.forNumber(currentDndState_);
      return result == null ? org.matrix.dma.gchat.proto.SetDndDurationRequest.State.UNKNOWN : result;
    }
    /**
     * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
     * @param value The currentDndState to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentDndState(org.matrix.dma.gchat.proto.SetDndDurationRequest.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      currentDndState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .SetDndDurationRequest.State current_dnd_state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentDndState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      currentDndState_ = 0;
      onChanged();
      return this;
    }

    private long newDndDurationUsec_ ;
    /**
     * <pre>
     *oneof DndExpiry {
     * </pre>
     *
     * <code>optional int64 new_dnd_duration_usec = 1;</code>
     * @return Whether the newDndDurationUsec field is set.
     */
    @java.lang.Override
    public boolean hasNewDndDurationUsec() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *oneof DndExpiry {
     * </pre>
     *
     * <code>optional int64 new_dnd_duration_usec = 1;</code>
     * @return The newDndDurationUsec.
     */
    @java.lang.Override
    public long getNewDndDurationUsec() {
      return newDndDurationUsec_;
    }
    /**
     * <pre>
     *oneof DndExpiry {
     * </pre>
     *
     * <code>optional int64 new_dnd_duration_usec = 1;</code>
     * @param value The newDndDurationUsec to set.
     * @return This builder for chaining.
     */
    public Builder setNewDndDurationUsec(long value) {
      
      newDndDurationUsec_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *oneof DndExpiry {
     * </pre>
     *
     * <code>optional int64 new_dnd_duration_usec = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewDndDurationUsec() {
      bitField0_ = (bitField0_ & ~0x00000004);
      newDndDurationUsec_ = 0L;
      onChanged();
      return this;
    }

    private long dndExpiryTimestampUsec_ ;
    /**
     * <pre>
     *}
     * </pre>
     *
     * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
     * @return Whether the dndExpiryTimestampUsec field is set.
     */
    @java.lang.Override
    public boolean hasDndExpiryTimestampUsec() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *}
     * </pre>
     *
     * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
     * @return The dndExpiryTimestampUsec.
     */
    @java.lang.Override
    public long getDndExpiryTimestampUsec() {
      return dndExpiryTimestampUsec_;
    }
    /**
     * <pre>
     *}
     * </pre>
     *
     * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
     * @param value The dndExpiryTimestampUsec to set.
     * @return This builder for chaining.
     */
    public Builder setDndExpiryTimestampUsec(long value) {
      
      dndExpiryTimestampUsec_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *}
     * </pre>
     *
     * <code>optional int64 dnd_expiry_timestamp_usec = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDndExpiryTimestampUsec() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dndExpiryTimestampUsec_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:SetDndDurationRequest)
  }

  // @@protoc_insertion_point(class_scope:SetDndDurationRequest)
  private static final org.matrix.dma.gchat.proto.SetDndDurationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.SetDndDurationRequest();
  }

  public static org.matrix.dma.gchat.proto.SetDndDurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SetDndDurationRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetDndDurationRequest>() {
    @java.lang.Override
    public SetDndDurationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetDndDurationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetDndDurationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.SetDndDurationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

