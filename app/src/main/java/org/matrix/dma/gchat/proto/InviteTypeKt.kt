//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializeinviteType")
public inline fun inviteType(block: org.matrix.dma.gchat.proto.InviteTypeKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.InviteType =
  org.matrix.dma.gchat.proto.InviteTypeKt.Dsl._create(org.matrix.dma.gchat.proto.InviteType.newBuilder()).apply { block() }._build()
public object InviteTypeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.InviteType.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.InviteType.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.InviteType = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.InviteType.copy(block: org.matrix.dma.gchat.proto.InviteTypeKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.InviteType =
  org.matrix.dma.gchat.proto.InviteTypeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

