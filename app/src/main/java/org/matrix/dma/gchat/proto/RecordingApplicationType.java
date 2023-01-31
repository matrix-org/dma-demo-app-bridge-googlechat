// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

/**
 * <pre>
 *ComGoogleRtcMeetingsV1RecordingApplicationType
 * </pre>
 *
 * Protobuf enum {@code RecordingApplicationType}
 */
public enum RecordingApplicationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RECORDING_APPLICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  RECORDING_APPLICATION_TYPE_UNSPECIFIED(0),
  /**
   * <code>RECORDING = 1;</code>
   */
  RECORDING(1),
  /**
   * <code>GLIVE_STREAM = 3;</code>
   */
  GLIVE_STREAM(3),
  /**
   * <code>BROADCAST = 4;</code>
   */
  BROADCAST(4),
  ;

  /**
   * <code>RECORDING_APPLICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RECORDING_APPLICATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RECORDING = 1;</code>
   */
  public static final int RECORDING_VALUE = 1;
  /**
   * <code>GLIVE_STREAM = 3;</code>
   */
  public static final int GLIVE_STREAM_VALUE = 3;
  /**
   * <code>BROADCAST = 4;</code>
   */
  public static final int BROADCAST_VALUE = 4;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RecordingApplicationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RecordingApplicationType forNumber(int value) {
    switch (value) {
      case 0: return RECORDING_APPLICATION_TYPE_UNSPECIFIED;
      case 1: return RECORDING;
      case 3: return GLIVE_STREAM;
      case 4: return BROADCAST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RecordingApplicationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RecordingApplicationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RecordingApplicationType>() {
          public RecordingApplicationType findValueByNumber(int number) {
            return RecordingApplicationType.forNumber(number);
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
    return org.matrix.dma.gchat.proto.GoogleChat.getDescriptor().getEnumTypes().get(12);
  }

  private static final RecordingApplicationType[] VALUES = values();

  public static RecordingApplicationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RecordingApplicationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:RecordingApplicationType)
}

