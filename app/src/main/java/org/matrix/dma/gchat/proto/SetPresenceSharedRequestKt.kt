//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializesetPresenceSharedRequest")
public inline fun setPresenceSharedRequest(block: org.matrix.dma.gchat.proto.SetPresenceSharedRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SetPresenceSharedRequest =
  org.matrix.dma.gchat.proto.SetPresenceSharedRequestKt.Dsl._create(org.matrix.dma.gchat.proto.SetPresenceSharedRequest.newBuilder()).apply { block() }._build()
public object SetPresenceSharedRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.SetPresenceSharedRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.SetPresenceSharedRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.SetPresenceSharedRequest = _builder.build()

    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public var requestHeader: org.matrix.dma.gchat.proto.RequestHeader
      @JvmName("getRequestHeader")
      get() = _builder.getRequestHeader()
      @JvmName("setRequestHeader")
      set(value) {
        _builder.setRequestHeader(value)
      }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public fun clearRequestHeader() {
      _builder.clearRequestHeader()
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     * @return Whether the requestHeader field is set.
     */
    public fun hasRequestHeader(): kotlin.Boolean {
      return _builder.hasRequestHeader()
    }
    public val SetPresenceSharedRequestKt.Dsl.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
      get() = _builder.requestHeaderOrNull

    /**
     * <code>optional bool presence_shared = 1;</code>
     */
    public var presenceShared: kotlin.Boolean
      @JvmName("getPresenceShared")
      get() = _builder.getPresenceShared()
      @JvmName("setPresenceShared")
      set(value) {
        _builder.setPresenceShared(value)
      }
    /**
     * <code>optional bool presence_shared = 1;</code>
     */
    public fun clearPresenceShared() {
      _builder.clearPresenceShared()
    }
    /**
     * <code>optional bool presence_shared = 1;</code>
     * @return Whether the presenceShared field is set.
     */
    public fun hasPresenceShared(): kotlin.Boolean {
      return _builder.hasPresenceShared()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.SetPresenceSharedRequest.copy(block: org.matrix.dma.gchat.proto.SetPresenceSharedRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SetPresenceSharedRequest =
  org.matrix.dma.gchat.proto.SetPresenceSharedRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.SetPresenceSharedRequestOrBuilder.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
  get() = if (hasRequestHeader()) getRequestHeader() else null

