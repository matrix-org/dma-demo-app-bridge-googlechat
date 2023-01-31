//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializemarkGroupReadstateResponse")
public inline fun markGroupReadstateResponse(block: org.matrix.dma.gchat.proto.MarkGroupReadstateResponseKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.MarkGroupReadstateResponse =
  org.matrix.dma.gchat.proto.MarkGroupReadstateResponseKt.Dsl._create(org.matrix.dma.gchat.proto.MarkGroupReadstateResponse.newBuilder()).apply { block() }._build()
public object MarkGroupReadstateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.MarkGroupReadstateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.MarkGroupReadstateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.MarkGroupReadstateResponse = _builder.build()

    /**
     * <code>optional .GroupReadState read_state = 1;</code>
     */
    public var readState: org.matrix.dma.gchat.proto.GroupReadState
      @JvmName("getReadState")
      get() = _builder.getReadState()
      @JvmName("setReadState")
      set(value) {
        _builder.setReadState(value)
      }
    /**
     * <code>optional .GroupReadState read_state = 1;</code>
     */
    public fun clearReadState() {
      _builder.clearReadState()
    }
    /**
     * <code>optional .GroupReadState read_state = 1;</code>
     * @return Whether the readState field is set.
     */
    public fun hasReadState(): kotlin.Boolean {
      return _builder.hasReadState()
    }
    public val MarkGroupReadstateResponseKt.Dsl.readStateOrNull: org.matrix.dma.gchat.proto.GroupReadState?
      get() = _builder.readStateOrNull

    /**
     * <code>optional .WriteRevision user_revision = 2;</code>
     */
    public var userRevision: org.matrix.dma.gchat.proto.WriteRevision
      @JvmName("getUserRevision")
      get() = _builder.getUserRevision()
      @JvmName("setUserRevision")
      set(value) {
        _builder.setUserRevision(value)
      }
    /**
     * <code>optional .WriteRevision user_revision = 2;</code>
     */
    public fun clearUserRevision() {
      _builder.clearUserRevision()
    }
    /**
     * <code>optional .WriteRevision user_revision = 2;</code>
     * @return Whether the userRevision field is set.
     */
    public fun hasUserRevision(): kotlin.Boolean {
      return _builder.hasUserRevision()
    }
    public val MarkGroupReadstateResponseKt.Dsl.userRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
      get() = _builder.userRevisionOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.MarkGroupReadstateResponse.copy(block: org.matrix.dma.gchat.proto.MarkGroupReadstateResponseKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.MarkGroupReadstateResponse =
  org.matrix.dma.gchat.proto.MarkGroupReadstateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.MarkGroupReadstateResponseOrBuilder.readStateOrNull: org.matrix.dma.gchat.proto.GroupReadState?
  get() = if (hasReadState()) getReadState() else null

public val org.matrix.dma.gchat.proto.MarkGroupReadstateResponseOrBuilder.userRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
  get() = if (hasUserRevision()) getUserRevision() else null

