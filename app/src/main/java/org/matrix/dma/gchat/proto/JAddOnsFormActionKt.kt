//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializejAddOnsFormAction")
public inline fun jAddOnsFormAction(block: org.matrix.dma.gchat.proto.JAddOnsFormActionKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsFormAction =
  org.matrix.dma.gchat.proto.JAddOnsFormActionKt.Dsl._create(org.matrix.dma.gchat.proto.JAddOnsFormAction.newBuilder()).apply { block() }._build()
public object JAddOnsFormActionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.JAddOnsFormAction.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.JAddOnsFormAction.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.JAddOnsFormAction = _builder.build()

    /**
     * <code>optional string action_method_name = 1;</code>
     */
    public var actionMethodName: kotlin.String
      @JvmName("getActionMethodName")
      get() = _builder.getActionMethodName()
      @JvmName("setActionMethodName")
      set(value) {
        _builder.setActionMethodName(value)
      }
    /**
     * <code>optional string action_method_name = 1;</code>
     */
    public fun clearActionMethodName() {
      _builder.clearActionMethodName()
    }
    /**
     * <code>optional string action_method_name = 1;</code>
     * @return Whether the actionMethodName field is set.
     */
    public fun hasActionMethodName(): kotlin.Boolean {
      return _builder.hasActionMethodName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ParametersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     */
     public val parameters: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getParametersList()
      )
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     * @param value The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addParameters")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.add(value: org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter) {
      _builder.addParameters(value)
    }
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     * @param value The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignParameters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.plusAssign(value: org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter) {
      add(value)
    }
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     * @param values The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllParameters")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter>) {
      _builder.addAllParameters(values)
    }
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     * @param values The parameters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllParameters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter>) {
      addAll(values)
    }
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     * @param index The index to set the value at.
     * @param value The parameters to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setParameters")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter) {
      _builder.setParameters(index, value)
    }
    /**
     * <code>repeated .JAddOnsFormAction.ActionParameter parameters = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearParameters")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter, ParametersProxy>.clear() {
      _builder.clearParameters()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ParametersDeprecatedProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @return A list containing the parametersDeprecated.
     */
    public val parametersDeprecated: com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getParametersDeprecatedList()
      )
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @param value The parametersDeprecated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addParametersDeprecated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.add(value: kotlin.String) {
      _builder.addParametersDeprecated(value)
    }
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @param value The parametersDeprecated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignParametersDeprecated")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @param values The parametersDeprecated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllParametersDeprecated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllParametersDeprecated(values)
    }
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @param values The parametersDeprecated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllParametersDeprecated")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string parameters_deprecated = 3;</code>
     * @param index The index to set the value at.
     * @param value The parametersDeprecated to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setParametersDeprecated")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setParametersDeprecated(index, value)
    }/**
     * <code>repeated string parameters_deprecated = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearParametersDeprecated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ParametersDeprecatedProxy>.clear() {
      _builder.clearParametersDeprecated()
    }
    /**
     * <code>optional string encrypted_action = 7;</code>
     */
    public var encryptedAction: kotlin.String
      @JvmName("getEncryptedAction")
      get() = _builder.getEncryptedAction()
      @JvmName("setEncryptedAction")
      set(value) {
        _builder.setEncryptedAction(value)
      }
    /**
     * <code>optional string encrypted_action = 7;</code>
     */
    public fun clearEncryptedAction() {
      _builder.clearEncryptedAction()
    }
    /**
     * <code>optional string encrypted_action = 7;</code>
     * @return Whether the encryptedAction field is set.
     */
    public fun hasEncryptedAction(): kotlin.Boolean {
      return _builder.hasEncryptedAction()
    }

    /**
     * <code>optional .JAddOnsFormAction.LoadIndicator load_indicator = 5;</code>
     */
    public var loadIndicator: org.matrix.dma.gchat.proto.JAddOnsFormAction.LoadIndicator
      @JvmName("getLoadIndicator")
      get() = _builder.getLoadIndicator()
      @JvmName("setLoadIndicator")
      set(value) {
        _builder.setLoadIndicator(value)
      }
    /**
     * <code>optional .JAddOnsFormAction.LoadIndicator load_indicator = 5;</code>
     */
    public fun clearLoadIndicator() {
      _builder.clearLoadIndicator()
    }
    /**
     * <code>optional .JAddOnsFormAction.LoadIndicator load_indicator = 5;</code>
     * @return Whether the loadIndicator field is set.
     */
    public fun hasLoadIndicator(): kotlin.Boolean {
      return _builder.hasLoadIndicator()
    }

    /**
     * <code>optional bool persist_values = 6;</code>
     */
    public var persistValues: kotlin.Boolean
      @JvmName("getPersistValues")
      get() = _builder.getPersistValues()
      @JvmName("setPersistValues")
      set(value) {
        _builder.setPersistValues(value)
      }
    /**
     * <code>optional bool persist_values = 6;</code>
     */
    public fun clearPersistValues() {
      _builder.clearPersistValues()
    }
    /**
     * <code>optional bool persist_values = 6;</code>
     * @return Whether the persistValues field is set.
     */
    public fun hasPersistValues(): kotlin.Boolean {
      return _builder.hasPersistValues()
    }
  }
  @kotlin.jvm.JvmName("-initializeactionParameter")
  public inline fun actionParameter(block: org.matrix.dma.gchat.proto.JAddOnsFormActionKt.ActionParameterKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter =
    org.matrix.dma.gchat.proto.JAddOnsFormActionKt.ActionParameterKt.Dsl._create(org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter.newBuilder()).apply { block() }._build()
  public object ActionParameterKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter = _builder.build()

      /**
       * <code>optional string key = 1;</code>
       */
      public var key: kotlin.String
        @JvmName("getKey")
        get() = _builder.getKey()
        @JvmName("setKey")
        set(value) {
          _builder.setKey(value)
        }
      /**
       * <code>optional string key = 1;</code>
       */
      public fun clearKey() {
        _builder.clearKey()
      }
      /**
       * <code>optional string key = 1;</code>
       * @return Whether the key field is set.
       */
      public fun hasKey(): kotlin.Boolean {
        return _builder.hasKey()
      }

      /**
       * <code>optional string value = 2;</code>
       */
      public var value: kotlin.String
        @JvmName("getValue")
        get() = _builder.getValue()
        @JvmName("setValue")
        set(value) {
          _builder.setValue(value)
        }
      /**
       * <code>optional string value = 2;</code>
       */
      public fun clearValue() {
        _builder.clearValue()
      }
      /**
       * <code>optional string value = 2;</code>
       * @return Whether the value field is set.
       */
      public fun hasValue(): kotlin.Boolean {
        return _builder.hasValue()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.JAddOnsFormAction.copy(block: org.matrix.dma.gchat.proto.JAddOnsFormActionKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsFormAction =
  org.matrix.dma.gchat.proto.JAddOnsFormActionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter.copy(block: org.matrix.dma.gchat.proto.JAddOnsFormActionKt.ActionParameterKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsFormAction.ActionParameter =
  org.matrix.dma.gchat.proto.JAddOnsFormActionKt.ActionParameterKt.Dsl._create(this.toBuilder()).apply { block() }._build()

