//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializereadReceiptChangedEvent")
public inline fun readReceiptChangedEvent(block: org.matrix.dma.gchat.proto.ReadReceiptChangedEventKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.ReadReceiptChangedEvent =
  org.matrix.dma.gchat.proto.ReadReceiptChangedEventKt.Dsl._create(org.matrix.dma.gchat.proto.ReadReceiptChangedEvent.newBuilder()).apply { block() }._build()
public object ReadReceiptChangedEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.ReadReceiptChangedEvent.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.ReadReceiptChangedEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.ReadReceiptChangedEvent = _builder.build()

    /**
     * <code>optional .GroupId group_id = 1;</code>
     */
    public var groupId: org.matrix.dma.gchat.proto.GroupId
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <code>optional .GroupId group_id = 1;</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }
    /**
     * <code>optional .GroupId group_id = 1;</code>
     * @return Whether the groupId field is set.
     */
    public fun hasGroupId(): kotlin.Boolean {
      return _builder.hasGroupId()
    }
    public val ReadReceiptChangedEventKt.Dsl.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
      get() = _builder.groupIdOrNull

    /**
     * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
     */
    public var readReceiptSet: org.matrix.dma.gchat.proto.ReadReceiptSet
      @JvmName("getReadReceiptSet")
      get() = _builder.getReadReceiptSet()
      @JvmName("setReadReceiptSet")
      set(value) {
        _builder.setReadReceiptSet(value)
      }
    /**
     * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
     */
    public fun clearReadReceiptSet() {
      _builder.clearReadReceiptSet()
    }
    /**
     * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
     * @return Whether the readReceiptSet field is set.
     */
    public fun hasReadReceiptSet(): kotlin.Boolean {
      return _builder.hasReadReceiptSet()
    }
    public val ReadReceiptChangedEventKt.Dsl.readReceiptSetOrNull: org.matrix.dma.gchat.proto.ReadReceiptSet?
      get() = _builder.readReceiptSetOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.ReadReceiptChangedEvent.copy(block: org.matrix.dma.gchat.proto.ReadReceiptChangedEventKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.ReadReceiptChangedEvent =
  org.matrix.dma.gchat.proto.ReadReceiptChangedEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.ReadReceiptChangedEventOrBuilder.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
  get() = if (hasGroupId()) getGroupId() else null

public val org.matrix.dma.gchat.proto.ReadReceiptChangedEventOrBuilder.readReceiptSetOrNull: org.matrix.dma.gchat.proto.ReadReceiptSet?
  get() = if (hasReadReceiptSet()) getReadReceiptSet() else null

