// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code JAddOnsLabelContentPairWidget}
 */
public final class JAddOnsLabelContentPairWidget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:JAddOnsLabelContentPairWidget)
    JAddOnsLabelContentPairWidgetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JAddOnsLabelContentPairWidget.newBuilder() to construct.
  private JAddOnsLabelContentPairWidget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JAddOnsLabelContentPairWidget() {
    labelContentPair_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JAddOnsLabelContentPairWidget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_JAddOnsLabelContentPairWidget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_JAddOnsLabelContentPairWidget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.class, org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.Builder.class);
  }

  public static final int LABEL_CONTENT_PAIR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair> labelContentPair_;
  /**
   * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair> getLabelContentPairList() {
    return labelContentPair_;
  }
  /**
   * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder> 
      getLabelContentPairOrBuilderList() {
    return labelContentPair_;
  }
  /**
   * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
   */
  @java.lang.Override
  public int getLabelContentPairCount() {
    return labelContentPair_.size();
  }
  /**
   * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.JAddOnsLabelContentPair getLabelContentPair(int index) {
    return labelContentPair_.get(index);
  }
  /**
   * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder getLabelContentPairOrBuilder(
      int index) {
    return labelContentPair_.get(index);
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
    for (int i = 0; i < labelContentPair_.size(); i++) {
      output.writeMessage(1, labelContentPair_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < labelContentPair_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, labelContentPair_.get(i));
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget other = (org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget) obj;

    if (!getLabelContentPairList()
        .equals(other.getLabelContentPairList())) return false;
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
    if (getLabelContentPairCount() > 0) {
      hash = (37 * hash) + LABEL_CONTENT_PAIR_FIELD_NUMBER;
      hash = (53 * hash) + getLabelContentPairList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget prototype) {
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
   * Protobuf type {@code JAddOnsLabelContentPairWidget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:JAddOnsLabelContentPairWidget)
      org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidgetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_JAddOnsLabelContentPairWidget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_JAddOnsLabelContentPairWidget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.class, org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.newBuilder()
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
      if (labelContentPairBuilder_ == null) {
        labelContentPair_ = java.util.Collections.emptyList();
      } else {
        labelContentPair_ = null;
        labelContentPairBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_JAddOnsLabelContentPairWidget_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget build() {
      org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget buildPartial() {
      org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget result = new org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget result) {
      if (labelContentPairBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          labelContentPair_ = java.util.Collections.unmodifiableList(labelContentPair_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.labelContentPair_ = labelContentPair_;
      } else {
        result.labelContentPair_ = labelContentPairBuilder_.build();
      }
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget) {
        return mergeFrom((org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget other) {
      if (other == org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget.getDefaultInstance()) return this;
      if (labelContentPairBuilder_ == null) {
        if (!other.labelContentPair_.isEmpty()) {
          if (labelContentPair_.isEmpty()) {
            labelContentPair_ = other.labelContentPair_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLabelContentPairIsMutable();
            labelContentPair_.addAll(other.labelContentPair_);
          }
          onChanged();
        }
      } else {
        if (!other.labelContentPair_.isEmpty()) {
          if (labelContentPairBuilder_.isEmpty()) {
            labelContentPairBuilder_.dispose();
            labelContentPairBuilder_ = null;
            labelContentPair_ = other.labelContentPair_;
            bitField0_ = (bitField0_ & ~0x00000001);
            labelContentPairBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLabelContentPairFieldBuilder() : null;
          } else {
            labelContentPairBuilder_.addAllMessages(other.labelContentPair_);
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
            case 10: {
              org.matrix.dma.gchat.proto.JAddOnsLabelContentPair m =
                  input.readMessage(
                      org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.PARSER,
                      extensionRegistry);
              if (labelContentPairBuilder_ == null) {
                ensureLabelContentPairIsMutable();
                labelContentPair_.add(m);
              } else {
                labelContentPairBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair> labelContentPair_ =
      java.util.Collections.emptyList();
    private void ensureLabelContentPairIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labelContentPair_ = new java.util.ArrayList<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair>(labelContentPair_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.matrix.dma.gchat.proto.JAddOnsLabelContentPair, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder, org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder> labelContentPairBuilder_;

    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public java.util.List<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair> getLabelContentPairList() {
      if (labelContentPairBuilder_ == null) {
        return java.util.Collections.unmodifiableList(labelContentPair_);
      } else {
        return labelContentPairBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public int getLabelContentPairCount() {
      if (labelContentPairBuilder_ == null) {
        return labelContentPair_.size();
      } else {
        return labelContentPairBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPair getLabelContentPair(int index) {
      if (labelContentPairBuilder_ == null) {
        return labelContentPair_.get(index);
      } else {
        return labelContentPairBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder setLabelContentPair(
        int index, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair value) {
      if (labelContentPairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelContentPairIsMutable();
        labelContentPair_.set(index, value);
        onChanged();
      } else {
        labelContentPairBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder setLabelContentPair(
        int index, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder builderForValue) {
      if (labelContentPairBuilder_ == null) {
        ensureLabelContentPairIsMutable();
        labelContentPair_.set(index, builderForValue.build());
        onChanged();
      } else {
        labelContentPairBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder addLabelContentPair(org.matrix.dma.gchat.proto.JAddOnsLabelContentPair value) {
      if (labelContentPairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelContentPairIsMutable();
        labelContentPair_.add(value);
        onChanged();
      } else {
        labelContentPairBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder addLabelContentPair(
        int index, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair value) {
      if (labelContentPairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelContentPairIsMutable();
        labelContentPair_.add(index, value);
        onChanged();
      } else {
        labelContentPairBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder addLabelContentPair(
        org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder builderForValue) {
      if (labelContentPairBuilder_ == null) {
        ensureLabelContentPairIsMutable();
        labelContentPair_.add(builderForValue.build());
        onChanged();
      } else {
        labelContentPairBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder addLabelContentPair(
        int index, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder builderForValue) {
      if (labelContentPairBuilder_ == null) {
        ensureLabelContentPairIsMutable();
        labelContentPair_.add(index, builderForValue.build());
        onChanged();
      } else {
        labelContentPairBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder addAllLabelContentPair(
        java.lang.Iterable<? extends org.matrix.dma.gchat.proto.JAddOnsLabelContentPair> values) {
      if (labelContentPairBuilder_ == null) {
        ensureLabelContentPairIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, labelContentPair_);
        onChanged();
      } else {
        labelContentPairBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder clearLabelContentPair() {
      if (labelContentPairBuilder_ == null) {
        labelContentPair_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        labelContentPairBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public Builder removeLabelContentPair(int index) {
      if (labelContentPairBuilder_ == null) {
        ensureLabelContentPairIsMutable();
        labelContentPair_.remove(index);
        onChanged();
      } else {
        labelContentPairBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder getLabelContentPairBuilder(
        int index) {
      return getLabelContentPairFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder getLabelContentPairOrBuilder(
        int index) {
      if (labelContentPairBuilder_ == null) {
        return labelContentPair_.get(index);  } else {
        return labelContentPairBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public java.util.List<? extends org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder> 
         getLabelContentPairOrBuilderList() {
      if (labelContentPairBuilder_ != null) {
        return labelContentPairBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(labelContentPair_);
      }
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder addLabelContentPairBuilder() {
      return getLabelContentPairFieldBuilder().addBuilder(
          org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.getDefaultInstance());
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder addLabelContentPairBuilder(
        int index) {
      return getLabelContentPairFieldBuilder().addBuilder(
          index, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.getDefaultInstance());
    }
    /**
     * <code>repeated .JAddOnsLabelContentPair label_content_pair = 1;</code>
     */
    public java.util.List<org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder> 
         getLabelContentPairBuilderList() {
      return getLabelContentPairFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.matrix.dma.gchat.proto.JAddOnsLabelContentPair, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder, org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder> 
        getLabelContentPairFieldBuilder() {
      if (labelContentPairBuilder_ == null) {
        labelContentPairBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.matrix.dma.gchat.proto.JAddOnsLabelContentPair, org.matrix.dma.gchat.proto.JAddOnsLabelContentPair.Builder, org.matrix.dma.gchat.proto.JAddOnsLabelContentPairOrBuilder>(
                labelContentPair_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        labelContentPair_ = null;
      }
      return labelContentPairBuilder_;
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


    // @@protoc_insertion_point(builder_scope:JAddOnsLabelContentPairWidget)
  }

  // @@protoc_insertion_point(class_scope:JAddOnsLabelContentPairWidget)
  private static final org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget();
  }

  public static org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<JAddOnsLabelContentPairWidget>
      PARSER = new com.google.protobuf.AbstractParser<JAddOnsLabelContentPairWidget>() {
    @java.lang.Override
    public JAddOnsLabelContentPairWidget parsePartialFrom(
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

  public static com.google.protobuf.Parser<JAddOnsLabelContentPairWidget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JAddOnsLabelContentPairWidget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.JAddOnsLabelContentPairWidget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

