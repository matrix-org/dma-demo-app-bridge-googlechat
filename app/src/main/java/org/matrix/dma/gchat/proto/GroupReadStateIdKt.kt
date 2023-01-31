//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializegroupReadStateId")
public inline fun groupReadStateId(block: org.matrix.dma.gchat.proto.GroupReadStateIdKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.GroupReadStateId =
  org.matrix.dma.gchat.proto.GroupReadStateIdKt.Dsl._create(org.matrix.dma.gchat.proto.GroupReadStateId.newBuilder()).apply { block() }._build()
public object GroupReadStateIdKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.GroupReadStateId.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.GroupReadStateId.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.GroupReadStateId = _builder.build()

    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public var userId: org.matrix.dma.gchat.proto.UserId
      @JvmName("getUserId")
      get() = _builder.getUserId()
      @JvmName("setUserId")
      set(value) {
        _builder.setUserId(value)
      }
    /**
     * <code>optional .UserId user_id = 1;</code>
     */
    public fun clearUserId() {
      _builder.clearUserId()
    }
    /**
     * <code>optional .UserId user_id = 1;</code>
     * @return Whether the userId field is set.
     */
    public fun hasUserId(): kotlin.Boolean {
      return _builder.hasUserId()
    }
    public val GroupReadStateIdKt.Dsl.userIdOrNull: org.matrix.dma.gchat.proto.UserId?
      get() = _builder.userIdOrNull

    /**
     * <code>optional .GroupId group_id = 2;</code>
     */
    public var groupId: org.matrix.dma.gchat.proto.GroupId
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <code>optional .GroupId group_id = 2;</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }
    /**
     * <code>optional .GroupId group_id = 2;</code>
     * @return Whether the groupId field is set.
     */
    public fun hasGroupId(): kotlin.Boolean {
      return _builder.hasGroupId()
    }
    public val GroupReadStateIdKt.Dsl.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
      get() = _builder.groupIdOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.GroupReadStateId.copy(block: org.matrix.dma.gchat.proto.GroupReadStateIdKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.GroupReadStateId =
  org.matrix.dma.gchat.proto.GroupReadStateIdKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.GroupReadStateIdOrBuilder.userIdOrNull: org.matrix.dma.gchat.proto.UserId?
  get() = if (hasUserId()) getUserId() else null

public val org.matrix.dma.gchat.proto.GroupReadStateIdOrBuilder.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
  get() = if (hasGroupId()) getGroupId() else null

