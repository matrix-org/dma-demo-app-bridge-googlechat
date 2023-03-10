//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializecreateGroupResponse")
public inline fun createGroupResponse(block: org.matrix.dma.gchat.proto.CreateGroupResponseKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.CreateGroupResponse =
  org.matrix.dma.gchat.proto.CreateGroupResponseKt.Dsl._create(org.matrix.dma.gchat.proto.CreateGroupResponse.newBuilder()).apply { block() }._build()
public object CreateGroupResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.CreateGroupResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.CreateGroupResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.CreateGroupResponse = _builder.build()

    /**
     * <code>optional .Group group = 1;</code>
     */
    public var group: org.matrix.dma.gchat.proto.Group
      @JvmName("getGroup")
      get() = _builder.getGroup()
      @JvmName("setGroup")
      set(value) {
        _builder.setGroup(value)
      }
    /**
     * <code>optional .Group group = 1;</code>
     */
    public fun clearGroup() {
      _builder.clearGroup()
    }
    /**
     * <code>optional .Group group = 1;</code>
     * @return Whether the group field is set.
     */
    public fun hasGroup(): kotlin.Boolean {
      return _builder.hasGroup()
    }
    public val CreateGroupResponseKt.Dsl.groupOrNull: org.matrix.dma.gchat.proto.Group?
      get() = _builder.groupOrNull

    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public var groupRevision: org.matrix.dma.gchat.proto.WriteRevision
      @JvmName("getGroupRevision")
      get() = _builder.getGroupRevision()
      @JvmName("setGroupRevision")
      set(value) {
        _builder.setGroupRevision(value)
      }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     */
    public fun clearGroupRevision() {
      _builder.clearGroupRevision()
    }
    /**
     * <code>optional .WriteRevision group_revision = 2;</code>
     * @return Whether the groupRevision field is set.
     */
    public fun hasGroupRevision(): kotlin.Boolean {
      return _builder.hasGroupRevision()
    }
    public val CreateGroupResponseKt.Dsl.groupRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
      get() = _builder.groupRevisionOrNull

    /**
     * <code>optional .WriteRevision user_revision = 3;</code>
     */
    public var userRevision: org.matrix.dma.gchat.proto.WriteRevision
      @JvmName("getUserRevision")
      get() = _builder.getUserRevision()
      @JvmName("setUserRevision")
      set(value) {
        _builder.setUserRevision(value)
      }
    /**
     * <code>optional .WriteRevision user_revision = 3;</code>
     */
    public fun clearUserRevision() {
      _builder.clearUserRevision()
    }
    /**
     * <code>optional .WriteRevision user_revision = 3;</code>
     * @return Whether the userRevision field is set.
     */
    public fun hasUserRevision(): kotlin.Boolean {
      return _builder.hasUserRevision()
    }
    public val CreateGroupResponseKt.Dsl.userRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
      get() = _builder.userRevisionOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ResultsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     */
     public val results: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getResultsList()
      )
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     * @param value The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addResults")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.add(value: org.matrix.dma.gchat.proto.CreateMembershipResult) {
      _builder.addResults(value)
    }
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     * @param value The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignResults")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.CreateMembershipResult) {
      add(value)
    }
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     * @param values The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllResults")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.CreateMembershipResult>) {
      _builder.addAllResults(values)
    }
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     * @param values The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllResults")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.CreateMembershipResult>) {
      addAll(values)
    }
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     * @param index The index to set the value at.
     * @param value The results to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setResults")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.CreateMembershipResult) {
      _builder.setResults(index, value)
    }
    /**
     * <pre>
     * optional Failure creator_membership_failure = 5;
     * </pre>
     *
     * <code>repeated .CreateMembershipResult results = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearResults")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateMembershipResult, ResultsProxy>.clear() {
      _builder.clearResults()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.CreateGroupResponse.copy(block: org.matrix.dma.gchat.proto.CreateGroupResponseKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.CreateGroupResponse =
  org.matrix.dma.gchat.proto.CreateGroupResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.CreateGroupResponseOrBuilder.groupOrNull: org.matrix.dma.gchat.proto.Group?
  get() = if (hasGroup()) getGroup() else null

public val org.matrix.dma.gchat.proto.CreateGroupResponseOrBuilder.groupRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
  get() = if (hasGroupRevision()) getGroupRevision() else null

public val org.matrix.dma.gchat.proto.CreateGroupResponseOrBuilder.userRevisionOrNull: org.matrix.dma.gchat.proto.WriteRevision?
  get() = if (hasUserRevision()) getUserRevision() else null

