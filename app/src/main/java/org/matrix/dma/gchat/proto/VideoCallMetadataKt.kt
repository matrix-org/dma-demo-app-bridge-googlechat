//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializevideoCallMetadata")
public inline fun videoCallMetadata(block: org.matrix.dma.gchat.proto.VideoCallMetadataKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.VideoCallMetadata =
  org.matrix.dma.gchat.proto.VideoCallMetadataKt.Dsl._create(org.matrix.dma.gchat.proto.VideoCallMetadata.newBuilder()).apply { block() }._build()
public object VideoCallMetadataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.VideoCallMetadata.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.VideoCallMetadata.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.VideoCallMetadata = _builder.build()

    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public var meetingSpace: org.matrix.dma.gchat.proto.MeetingSpace
      @JvmName("getMeetingSpace")
      get() = _builder.getMeetingSpace()
      @JvmName("setMeetingSpace")
      set(value) {
        _builder.setMeetingSpace(value)
      }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     */
    public fun clearMeetingSpace() {
      _builder.clearMeetingSpace()
    }
    /**
     * <code>optional .MeetingSpace meeting_space = 1;</code>
     * @return Whether the meetingSpace field is set.
     */
    public fun hasMeetingSpace(): kotlin.Boolean {
      return _builder.hasMeetingSpace()
    }
    public val VideoCallMetadataKt.Dsl.meetingSpaceOrNull: org.matrix.dma.gchat.proto.MeetingSpace?
      get() = _builder.meetingSpaceOrNull

    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     */
    public var wasCreatedInCurrentGroup: kotlin.Boolean
      @JvmName("getWasCreatedInCurrentGroup")
      get() = _builder.getWasCreatedInCurrentGroup()
      @JvmName("setWasCreatedInCurrentGroup")
      set(value) {
        _builder.setWasCreatedInCurrentGroup(value)
      }
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     */
    public fun clearWasCreatedInCurrentGroup() {
      _builder.clearWasCreatedInCurrentGroup()
    }
    /**
     * <code>optional bool was_created_in_current_group = 2;</code>
     * @return Whether the wasCreatedInCurrentGroup field is set.
     */
    public fun hasWasCreatedInCurrentGroup(): kotlin.Boolean {
      return _builder.hasWasCreatedInCurrentGroup()
    }

    /**
     * <code>optional bool should_not_render = 3;</code>
     */
    public var shouldNotRender: kotlin.Boolean
      @JvmName("getShouldNotRender")
      get() = _builder.getShouldNotRender()
      @JvmName("setShouldNotRender")
      set(value) {
        _builder.setShouldNotRender(value)
      }
    /**
     * <code>optional bool should_not_render = 3;</code>
     */
    public fun clearShouldNotRender() {
      _builder.clearShouldNotRender()
    }
    /**
     * <code>optional bool should_not_render = 3;</code>
     * @return Whether the shouldNotRender field is set.
     */
    public fun hasShouldNotRender(): kotlin.Boolean {
      return _builder.hasShouldNotRender()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.VideoCallMetadata.copy(block: org.matrix.dma.gchat.proto.VideoCallMetadataKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.VideoCallMetadata =
  org.matrix.dma.gchat.proto.VideoCallMetadataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.VideoCallMetadataOrBuilder.meetingSpaceOrNull: org.matrix.dma.gchat.proto.MeetingSpace?
  get() = if (hasMeetingSpace()) getMeetingSpace() else null

