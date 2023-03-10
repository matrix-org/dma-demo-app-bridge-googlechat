// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * Protobuf enum {@code UserAccountState}
 */
public enum UserAccountState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>USER_ACCOUNT_STATE_UNKNOWN = 0;</code>
   */
  USER_ACCOUNT_STATE_UNKNOWN(0),
  /**
   * <code>ENABLED = 1;</code>
   */
  ENABLED(1),
  /**
   * <code>DISABLED = 2;</code>
   */
  DISABLED(2),
  /**
   * <code>DELETED = 3;</code>
   */
  DELETED(3),
  /**
   * <code>TEMPORARY_UNAVAILABLE = 4;</code>
   */
  TEMPORARY_UNAVAILABLE(4),
  ;

  /**
   * <code>USER_ACCOUNT_STATE_UNKNOWN = 0;</code>
   */
  public static final int USER_ACCOUNT_STATE_UNKNOWN_VALUE = 0;
  /**
   * <code>ENABLED = 1;</code>
   */
  public static final int ENABLED_VALUE = 1;
  /**
   * <code>DISABLED = 2;</code>
   */
  public static final int DISABLED_VALUE = 2;
  /**
   * <code>DELETED = 3;</code>
   */
  public static final int DELETED_VALUE = 3;
  /**
   * <code>TEMPORARY_UNAVAILABLE = 4;</code>
   */
  public static final int TEMPORARY_UNAVAILABLE_VALUE = 4;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UserAccountState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UserAccountState forNumber(int value) {
    switch (value) {
      case 0: return USER_ACCOUNT_STATE_UNKNOWN;
      case 1: return ENABLED;
      case 2: return DISABLED;
      case 3: return DELETED;
      case 4: return TEMPORARY_UNAVAILABLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UserAccountState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UserAccountState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UserAccountState>() {
          public UserAccountState findValueByNumber(int number) {
            return UserAccountState.forNumber(number);
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
    return org.matrix.dma.gchat.proto.GoogleChat.getDescriptor().getEnumTypes().get(16);
  }

  private static final UserAccountState[] VALUES = values();

  public static UserAccountState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UserAccountState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:UserAccountState)
}

