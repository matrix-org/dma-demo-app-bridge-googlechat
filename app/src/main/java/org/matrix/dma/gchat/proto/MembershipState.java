// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf enum {@code MembershipState}
 */
public enum MembershipState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MEMBER_UNKNOWN = 0;</code>
   */
  MEMBER_UNKNOWN(0),
  /**
   * <code>MEMBER_INVITED = 1;</code>
   */
  MEMBER_INVITED(1),
  /**
   * <code>MEMBER_JOINED = 2;</code>
   */
  MEMBER_JOINED(2),
  /**
   * <code>MEMBER_NOT_A_MEMBER = 3;</code>
   */
  MEMBER_NOT_A_MEMBER(3),
  /**
   * <code>MEMBER_FAILED = 4;</code>
   */
  MEMBER_FAILED(4),
  ;

  /**
   * <code>MEMBER_UNKNOWN = 0;</code>
   */
  public static final int MEMBER_UNKNOWN_VALUE = 0;
  /**
   * <code>MEMBER_INVITED = 1;</code>
   */
  public static final int MEMBER_INVITED_VALUE = 1;
  /**
   * <code>MEMBER_JOINED = 2;</code>
   */
  public static final int MEMBER_JOINED_VALUE = 2;
  /**
   * <code>MEMBER_NOT_A_MEMBER = 3;</code>
   */
  public static final int MEMBER_NOT_A_MEMBER_VALUE = 3;
  /**
   * <code>MEMBER_FAILED = 4;</code>
   */
  public static final int MEMBER_FAILED_VALUE = 4;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MembershipState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MembershipState forNumber(int value) {
    switch (value) {
      case 0: return MEMBER_UNKNOWN;
      case 1: return MEMBER_INVITED;
      case 2: return MEMBER_JOINED;
      case 3: return MEMBER_NOT_A_MEMBER;
      case 4: return MEMBER_FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MembershipState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MembershipState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MembershipState>() {
          public MembershipState findValueByNumber(int number) {
            return MembershipState.forNumber(number);
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
    return org.matrix.dma.gchat.proto.GoogleChat.getDescriptor().getEnumTypes().get(19);
  }

  private static final MembershipState[] VALUES = values();

  public static MembershipState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MembershipState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MembershipState)
}

