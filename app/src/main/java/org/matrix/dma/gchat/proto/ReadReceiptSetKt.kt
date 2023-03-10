//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializereadReceiptSet")
public inline fun readReceiptSet(block: org.matrix.dma.gchat.proto.ReadReceiptSetKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.ReadReceiptSet =
  org.matrix.dma.gchat.proto.ReadReceiptSetKt.Dsl._create(org.matrix.dma.gchat.proto.ReadReceiptSet.newBuilder()).apply { block() }._build()
public object ReadReceiptSetKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.ReadReceiptSet.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.ReadReceiptSet.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.ReadReceiptSet = _builder.build()

    /**
     * <code>optional bool enabled = 1;</code>
     */
    public var enabled: kotlin.Boolean
      @JvmName("getEnabled")
      get() = _builder.getEnabled()
      @JvmName("setEnabled")
      set(value) {
        _builder.setEnabled(value)
      }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public fun clearEnabled() {
      _builder.clearEnabled()
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return Whether the enabled field is set.
     */
    public fun hasEnabled(): kotlin.Boolean {
      return _builder.hasEnabled()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ReadReceiptsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
     public val readReceipts: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getReadReceiptsList()
      )
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     * @param value The readReceipts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addReadReceipts")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.add(value: org.matrix.dma.gchat.proto.ReadReceipt) {
      _builder.addReadReceipts(value)
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     * @param value The readReceipts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignReadReceipts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.ReadReceipt) {
      add(value)
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     * @param values The readReceipts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllReadReceipts")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.ReadReceipt>) {
      _builder.addAllReadReceipts(values)
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     * @param values The readReceipts to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllReadReceipts")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.ReadReceipt>) {
      addAll(values)
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     * @param index The index to set the value at.
     * @param value The readReceipts to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setReadReceipts")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.ReadReceipt) {
      _builder.setReadReceipts(index, value)
    }
    /**
     * <code>repeated .ReadReceipt read_receipts = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearReadReceipts")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.ReadReceipt, ReadReceiptsProxy>.clear() {
      _builder.clearReadReceipts()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.ReadReceiptSet.copy(block: org.matrix.dma.gchat.proto.ReadReceiptSetKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.ReadReceiptSet =
  org.matrix.dma.gchat.proto.ReadReceiptSetKt.Dsl._create(this.toBuilder()).apply { block() }._build()

