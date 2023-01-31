// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code ReadReceiptSet}
 */
public final class ReadReceiptSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReadReceiptSet)
    ReadReceiptSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadReceiptSet.newBuilder() to construct.
  private ReadReceiptSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadReceiptSet() {
    readReceipts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadReceiptSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_ReadReceiptSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_ReadReceiptSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.ReadReceiptSet.class, org.matrix.dma.gchat.proto.ReadReceiptSet.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <code>optional bool enabled = 1;</code>
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int READ_RECEIPTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.matrix.dma.gchat.proto.ReadReceipt> readReceipts_;
  /**
   * <code>repeated .ReadReceipt read_receipts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.matrix.dma.gchat.proto.ReadReceipt> getReadReceiptsList() {
    return readReceipts_;
  }
  /**
   * <code>repeated .ReadReceipt read_receipts = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.matrix.dma.gchat.proto.ReadReceiptOrBuilder> 
      getReadReceiptsOrBuilderList() {
    return readReceipts_;
  }
  /**
   * <code>repeated .ReadReceipt read_receipts = 2;</code>
   */
  @java.lang.Override
  public int getReadReceiptsCount() {
    return readReceipts_.size();
  }
  /**
   * <code>repeated .ReadReceipt read_receipts = 2;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ReadReceipt getReadReceipts(int index) {
    return readReceipts_.get(index);
  }
  /**
   * <code>repeated .ReadReceipt read_receipts = 2;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.ReadReceiptOrBuilder getReadReceiptsOrBuilder(
      int index) {
    return readReceipts_.get(index);
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
      output.writeBool(1, enabled_);
    }
    for (int i = 0; i < readReceipts_.size(); i++) {
      output.writeMessage(2, readReceipts_.get(i));
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
        .computeBoolSize(1, enabled_);
    }
    for (int i = 0; i < readReceipts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, readReceipts_.get(i));
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.ReadReceiptSet)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.ReadReceiptSet other = (org.matrix.dma.gchat.proto.ReadReceiptSet) obj;

    if (hasEnabled() != other.hasEnabled()) return false;
    if (hasEnabled()) {
      if (getEnabled()
          != other.getEnabled()) return false;
    }
    if (!getReadReceiptsList()
        .equals(other.getReadReceiptsList())) return false;
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
    if (hasEnabled()) {
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
    }
    if (getReadReceiptsCount() > 0) {
      hash = (37 * hash) + READ_RECEIPTS_FIELD_NUMBER;
      hash = (53 * hash) + getReadReceiptsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.ReadReceiptSet parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.ReadReceiptSet prototype) {
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
   * Protobuf type {@code ReadReceiptSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReadReceiptSet)
      org.matrix.dma.gchat.proto.ReadReceiptSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_ReadReceiptSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_ReadReceiptSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.ReadReceiptSet.class, org.matrix.dma.gchat.proto.ReadReceiptSet.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.ReadReceiptSet.newBuilder()
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
      enabled_ = false;
      if (readReceiptsBuilder_ == null) {
        readReceipts_ = java.util.Collections.emptyList();
      } else {
        readReceipts_ = null;
        readReceiptsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_ReadReceiptSet_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.ReadReceiptSet getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.ReadReceiptSet.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.ReadReceiptSet build() {
      org.matrix.dma.gchat.proto.ReadReceiptSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.ReadReceiptSet buildPartial() {
      org.matrix.dma.gchat.proto.ReadReceiptSet result = new org.matrix.dma.gchat.proto.ReadReceiptSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.matrix.dma.gchat.proto.ReadReceiptSet result) {
      if (readReceiptsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          readReceipts_ = java.util.Collections.unmodifiableList(readReceipts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.readReceipts_ = readReceipts_;
      } else {
        result.readReceipts_ = readReceiptsBuilder_.build();
      }
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.ReadReceiptSet result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
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
      if (other instanceof org.matrix.dma.gchat.proto.ReadReceiptSet) {
        return mergeFrom((org.matrix.dma.gchat.proto.ReadReceiptSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.ReadReceiptSet other) {
      if (other == org.matrix.dma.gchat.proto.ReadReceiptSet.getDefaultInstance()) return this;
      if (other.hasEnabled()) {
        setEnabled(other.getEnabled());
      }
      if (readReceiptsBuilder_ == null) {
        if (!other.readReceipts_.isEmpty()) {
          if (readReceipts_.isEmpty()) {
            readReceipts_ = other.readReceipts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureReadReceiptsIsMutable();
            readReceipts_.addAll(other.readReceipts_);
          }
          onChanged();
        }
      } else {
        if (!other.readReceipts_.isEmpty()) {
          if (readReceiptsBuilder_.isEmpty()) {
            readReceiptsBuilder_.dispose();
            readReceiptsBuilder_ = null;
            readReceipts_ = other.readReceipts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            readReceiptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReadReceiptsFieldBuilder() : null;
          } else {
            readReceiptsBuilder_.addAllMessages(other.readReceipts_);
          }
        }
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
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              org.matrix.dma.gchat.proto.ReadReceipt m =
                  input.readMessage(
                      org.matrix.dma.gchat.proto.ReadReceipt.PARSER,
                      extensionRegistry);
              if (readReceiptsBuilder_ == null) {
                ensureReadReceiptsIsMutable();
                readReceipts_.add(m);
              } else {
                readReceiptsBuilder_.addMessage(m);
              }
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

    private boolean enabled_ ;
    /**
     * <code>optional bool enabled = 1;</code>
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private java.util.List<org.matrix.dma.gchat.proto.ReadReceipt> readReceipts_ =
      java.util.Collections.emptyList();
    private void ensureReadReceiptsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        readReceipts_ = new java.util.ArrayList<org.matrix.dma.gchat.proto.ReadReceipt>(readReceipts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.matrix.dma.gchat.proto.ReadReceipt, org.matrix.dma.gchat.proto.ReadReceipt.Builder, org.matrix.dma.gchat.proto.ReadReceiptOrBuilder> readReceiptsBuilder_;

    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public java.util.List<org.matrix.dma.gchat.proto.ReadReceipt> getReadReceiptsList() {
      if (readReceiptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(readReceipts_);
      } else {
        return readReceiptsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public int getReadReceiptsCount() {
      if (readReceiptsBuilder_ == null) {
        return readReceipts_.size();
      } else {
        return readReceiptsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public org.matrix.dma.gchat.proto.ReadReceipt getReadReceipts(int index) {
      if (readReceiptsBuilder_ == null) {
        return readReceipts_.get(index);
      } else {
        return readReceiptsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder setReadReceipts(
        int index, org.matrix.dma.gchat.proto.ReadReceipt value) {
      if (readReceiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadReceiptsIsMutable();
        readReceipts_.set(index, value);
        onChanged();
      } else {
        readReceiptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder setReadReceipts(
        int index, org.matrix.dma.gchat.proto.ReadReceipt.Builder builderForValue) {
      if (readReceiptsBuilder_ == null) {
        ensureReadReceiptsIsMutable();
        readReceipts_.set(index, builderForValue.build());
        onChanged();
      } else {
        readReceiptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder addReadReceipts(org.matrix.dma.gchat.proto.ReadReceipt value) {
      if (readReceiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadReceiptsIsMutable();
        readReceipts_.add(value);
        onChanged();
      } else {
        readReceiptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder addReadReceipts(
        int index, org.matrix.dma.gchat.proto.ReadReceipt value) {
      if (readReceiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReadReceiptsIsMutable();
        readReceipts_.add(index, value);
        onChanged();
      } else {
        readReceiptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder addReadReceipts(
        org.matrix.dma.gchat.proto.ReadReceipt.Builder builderForValue) {
      if (readReceiptsBuilder_ == null) {
        ensureReadReceiptsIsMutable();
        readReceipts_.add(builderForValue.build());
        onChanged();
      } else {
        readReceiptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder addReadReceipts(
        int index, org.matrix.dma.gchat.proto.ReadReceipt.Builder builderForValue) {
      if (readReceiptsBuilder_ == null) {
        ensureReadReceiptsIsMutable();
        readReceipts_.add(index, builderForValue.build());
        onChanged();
      } else {
        readReceiptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder addAllReadReceipts(
        java.lang.Iterable<? extends org.matrix.dma.gchat.proto.ReadReceipt> values) {
      if (readReceiptsBuilder_ == null) {
        ensureReadReceiptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, readReceipts_);
        onChanged();
      } else {
        readReceiptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder clearReadReceipts() {
      if (readReceiptsBuilder_ == null) {
        readReceipts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        readReceiptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public Builder removeReadReceipts(int index) {
      if (readReceiptsBuilder_ == null) {
        ensureReadReceiptsIsMutable();
        readReceipts_.remove(index);
        onChanged();
      } else {
        readReceiptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public org.matrix.dma.gchat.proto.ReadReceipt.Builder getReadReceiptsBuilder(
        int index) {
      return getReadReceiptsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public org.matrix.dma.gchat.proto.ReadReceiptOrBuilder getReadReceiptsOrBuilder(
        int index) {
      if (readReceiptsBuilder_ == null) {
        return readReceipts_.get(index);  } else {
        return readReceiptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public java.util.List<? extends org.matrix.dma.gchat.proto.ReadReceiptOrBuilder> 
         getReadReceiptsOrBuilderList() {
      if (readReceiptsBuilder_ != null) {
        return readReceiptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(readReceipts_);
      }
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public org.matrix.dma.gchat.proto.ReadReceipt.Builder addReadReceiptsBuilder() {
      return getReadReceiptsFieldBuilder().addBuilder(
          org.matrix.dma.gchat.proto.ReadReceipt.getDefaultInstance());
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public org.matrix.dma.gchat.proto.ReadReceipt.Builder addReadReceiptsBuilder(
        int index) {
      return getReadReceiptsFieldBuilder().addBuilder(
          index, org.matrix.dma.gchat.proto.ReadReceipt.getDefaultInstance());
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    public java.util.List<org.matrix.dma.gchat.proto.ReadReceipt.Builder> 
         getReadReceiptsBuilderList() {
      return getReadReceiptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.matrix.dma.gchat.proto.ReadReceipt, org.matrix.dma.gchat.proto.ReadReceipt.Builder, org.matrix.dma.gchat.proto.ReadReceiptOrBuilder> 
        getReadReceiptsFieldBuilder() {
      if (readReceiptsBuilder_ == null) {
        readReceiptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.matrix.dma.gchat.proto.ReadReceipt, org.matrix.dma.gchat.proto.ReadReceipt.Builder, org.matrix.dma.gchat.proto.ReadReceiptOrBuilder>(
                readReceipts_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        readReceipts_ = null;
      }
      return readReceiptsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ReadReceiptSet)
  }

  // @@protoc_insertion_point(class_scope:ReadReceiptSet)
  private static final org.matrix.dma.gchat.proto.ReadReceiptSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.ReadReceiptSet();
  }

  public static org.matrix.dma.gchat.proto.ReadReceiptSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ReadReceiptSet>
      PARSER = new com.google.protobuf.AbstractParser<ReadReceiptSet>() {
    @java.lang.Override
    public ReadReceiptSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadReceiptSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadReceiptSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.ReadReceiptSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

