//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializewriteRevision")
public inline fun writeRevision(block: org.matrix.dma.gchat.proto.WriteRevisionKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.WriteRevision =
  org.matrix.dma.gchat.proto.WriteRevisionKt.Dsl._create(org.matrix.dma.gchat.proto.WriteRevision.newBuilder()).apply { block() }._build()
public object WriteRevisionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.WriteRevision.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.WriteRevision.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.WriteRevision = _builder.build()

    /**
     * <code>optional int64 timestamp = 1;</code>
     */
    public var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>optional int64 timestamp = 1;</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
    /**
     * <code>optional int64 timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    public fun hasTimestamp(): kotlin.Boolean {
      return _builder.hasTimestamp()
    }

    /**
     * <code>optional int64 prev_timestamp = 2;</code>
     */
    public var prevTimestamp: kotlin.Long
      @JvmName("getPrevTimestamp")
      get() = _builder.getPrevTimestamp()
      @JvmName("setPrevTimestamp")
      set(value) {
        _builder.setPrevTimestamp(value)
      }
    /**
     * <code>optional int64 prev_timestamp = 2;</code>
     */
    public fun clearPrevTimestamp() {
      _builder.clearPrevTimestamp()
    }
    /**
     * <code>optional int64 prev_timestamp = 2;</code>
     * @return Whether the prevTimestamp field is set.
     */
    public fun hasPrevTimestamp(): kotlin.Boolean {
      return _builder.hasPrevTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.WriteRevision.copy(block: org.matrix.dma.gchat.proto.WriteRevisionKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.WriteRevision =
  org.matrix.dma.gchat.proto.WriteRevisionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

