// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf type {@code CreateMembershipResult}
 */
public final class CreateMembershipResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateMembershipResult)
    CreateMembershipResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMembershipResult.newBuilder() to construct.
  private CreateMembershipResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMembershipResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMembershipResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateMembershipResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateMembershipResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.dma.gchat.proto.CreateMembershipResult.class, org.matrix.dma.gchat.proto.CreateMembershipResult.Builder.class);
  }

  private int bitField0_;
  public static final int MEMBERSHIP_FIELD_NUMBER = 1;
  private org.matrix.dma.gchat.proto.Membership membership_;
  /**
   * <pre>
   * optional FailureReason reason = 2;
   * repeated SupplementalReason supplemental_reasons = 3;
   * </pre>
   *
   * <code>optional .Membership membership = 1;</code>
   * @return Whether the membership field is set.
   */
  @java.lang.Override
  public boolean hasMembership() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * optional FailureReason reason = 2;
   * repeated SupplementalReason supplemental_reasons = 3;
   * </pre>
   *
   * <code>optional .Membership membership = 1;</code>
   * @return The membership.
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.Membership getMembership() {
    return membership_ == null ? org.matrix.dma.gchat.proto.Membership.getDefaultInstance() : membership_;
  }
  /**
   * <pre>
   * optional FailureReason reason = 2;
   * repeated SupplementalReason supplemental_reasons = 3;
   * </pre>
   *
   * <code>optional .Membership membership = 1;</code>
   */
  @java.lang.Override
  public org.matrix.dma.gchat.proto.MembershipOrBuilder getMembershipOrBuilder() {
    return membership_ == null ? org.matrix.dma.gchat.proto.Membership.getDefaultInstance() : membership_;
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
      output.writeMessage(1, getMembership());
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
        .computeMessageSize(1, getMembership());
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
    if (!(obj instanceof org.matrix.dma.gchat.proto.CreateMembershipResult)) {
      return super.equals(obj);
    }
    org.matrix.dma.gchat.proto.CreateMembershipResult other = (org.matrix.dma.gchat.proto.CreateMembershipResult) obj;

    if (hasMembership() != other.hasMembership()) return false;
    if (hasMembership()) {
      if (!getMembership()
          .equals(other.getMembership())) return false;
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
    if (hasMembership()) {
      hash = (37 * hash) + MEMBERSHIP_FIELD_NUMBER;
      hash = (53 * hash) + getMembership().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.dma.gchat.proto.CreateMembershipResult parseFrom(
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
  public static Builder newBuilder(org.matrix.dma.gchat.proto.CreateMembershipResult prototype) {
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
   * Protobuf type {@code CreateMembershipResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateMembershipResult)
      org.matrix.dma.gchat.proto.CreateMembershipResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateMembershipResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateMembershipResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.dma.gchat.proto.CreateMembershipResult.class, org.matrix.dma.gchat.proto.CreateMembershipResult.Builder.class);
    }

    // Construct using org.matrix.dma.gchat.proto.CreateMembershipResult.newBuilder()
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
        getMembershipFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      membership_ = null;
      if (membershipBuilder_ != null) {
        membershipBuilder_.dispose();
        membershipBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.dma.gchat.proto.GoogleChat.internal_static_CreateMembershipResult_descriptor;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateMembershipResult getDefaultInstanceForType() {
      return org.matrix.dma.gchat.proto.CreateMembershipResult.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateMembershipResult build() {
      org.matrix.dma.gchat.proto.CreateMembershipResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.dma.gchat.proto.CreateMembershipResult buildPartial() {
      org.matrix.dma.gchat.proto.CreateMembershipResult result = new org.matrix.dma.gchat.proto.CreateMembershipResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.dma.gchat.proto.CreateMembershipResult result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.membership_ = membershipBuilder_ == null
            ? membership_
            : membershipBuilder_.build();
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
      if (other instanceof org.matrix.dma.gchat.proto.CreateMembershipResult) {
        return mergeFrom((org.matrix.dma.gchat.proto.CreateMembershipResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.dma.gchat.proto.CreateMembershipResult other) {
      if (other == org.matrix.dma.gchat.proto.CreateMembershipResult.getDefaultInstance()) return this;
      if (other.hasMembership()) {
        mergeMembership(other.getMembership());
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
                  getMembershipFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private org.matrix.dma.gchat.proto.Membership membership_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Membership, org.matrix.dma.gchat.proto.Membership.Builder, org.matrix.dma.gchat.proto.MembershipOrBuilder> membershipBuilder_;
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     * @return Whether the membership field is set.
     */
    public boolean hasMembership() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     * @return The membership.
     */
    public org.matrix.dma.gchat.proto.Membership getMembership() {
      if (membershipBuilder_ == null) {
        return membership_ == null ? org.matrix.dma.gchat.proto.Membership.getDefaultInstance() : membership_;
      } else {
        return membershipBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public Builder setMembership(org.matrix.dma.gchat.proto.Membership value) {
      if (membershipBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        membership_ = value;
      } else {
        membershipBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public Builder setMembership(
        org.matrix.dma.gchat.proto.Membership.Builder builderForValue) {
      if (membershipBuilder_ == null) {
        membership_ = builderForValue.build();
      } else {
        membershipBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public Builder mergeMembership(org.matrix.dma.gchat.proto.Membership value) {
      if (membershipBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          membership_ != null &&
          membership_ != org.matrix.dma.gchat.proto.Membership.getDefaultInstance()) {
          getMembershipBuilder().mergeFrom(value);
        } else {
          membership_ = value;
        }
      } else {
        membershipBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public Builder clearMembership() {
      bitField0_ = (bitField0_ & ~0x00000001);
      membership_ = null;
      if (membershipBuilder_ != null) {
        membershipBuilder_.dispose();
        membershipBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public org.matrix.dma.gchat.proto.Membership.Builder getMembershipBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMembershipFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    public org.matrix.dma.gchat.proto.MembershipOrBuilder getMembershipOrBuilder() {
      if (membershipBuilder_ != null) {
        return membershipBuilder_.getMessageOrBuilder();
      } else {
        return membership_ == null ?
            org.matrix.dma.gchat.proto.Membership.getDefaultInstance() : membership_;
      }
    }
    /**
     * <pre>
     * optional FailureReason reason = 2;
     * repeated SupplementalReason supplemental_reasons = 3;
     * </pre>
     *
     * <code>optional .Membership membership = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.dma.gchat.proto.Membership, org.matrix.dma.gchat.proto.Membership.Builder, org.matrix.dma.gchat.proto.MembershipOrBuilder> 
        getMembershipFieldBuilder() {
      if (membershipBuilder_ == null) {
        membershipBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.dma.gchat.proto.Membership, org.matrix.dma.gchat.proto.Membership.Builder, org.matrix.dma.gchat.proto.MembershipOrBuilder>(
                getMembership(),
                getParentForChildren(),
                isClean());
        membership_ = null;
      }
      return membershipBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CreateMembershipResult)
  }

  // @@protoc_insertion_point(class_scope:CreateMembershipResult)
  private static final org.matrix.dma.gchat.proto.CreateMembershipResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.dma.gchat.proto.CreateMembershipResult();
  }

  public static org.matrix.dma.gchat.proto.CreateMembershipResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CreateMembershipResult>
      PARSER = new com.google.protobuf.AbstractParser<CreateMembershipResult>() {
    @java.lang.Override
    public CreateMembershipResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMembershipResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMembershipResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.dma.gchat.proto.CreateMembershipResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

