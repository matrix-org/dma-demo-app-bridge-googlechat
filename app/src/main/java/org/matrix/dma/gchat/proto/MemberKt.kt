//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializemember")
public inline fun member(block: org.matrix.dma.gchat.proto.MemberKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.Member =
  org.matrix.dma.gchat.proto.MemberKt.Dsl._create(org.matrix.dma.gchat.proto.Member.newBuilder()).apply { block() }._build()
public object MemberKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.Member.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.Member.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.Member = _builder.build()

    /**
     * <pre>
     *oneof Profile {
     * </pre>
     *
     * <code>optional .User user = 1;</code>
     */
    public var user: org.matrix.dma.gchat.proto.User
      @JvmName("getUser")
      get() = _builder.getUser()
      @JvmName("setUser")
      set(value) {
        _builder.setUser(value)
      }
    /**
     * <pre>
     *oneof Profile {
     * </pre>
     *
     * <code>optional .User user = 1;</code>
     */
    public fun clearUser() {
      _builder.clearUser()
    }
    /**
     * <pre>
     *oneof Profile {
     * </pre>
     *
     * <code>optional .User user = 1;</code>
     * @return Whether the user field is set.
     */
    public fun hasUser(): kotlin.Boolean {
      return _builder.hasUser()
    }
    public val MemberKt.Dsl.userOrNull: org.matrix.dma.gchat.proto.User?
      get() = _builder.userOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.Member.copy(block: org.matrix.dma.gchat.proto.MemberKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.Member =
  org.matrix.dma.gchat.proto.MemberKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.MemberOrBuilder.userOrNull: org.matrix.dma.gchat.proto.User?
  get() = if (hasUser()) getUser() else null

