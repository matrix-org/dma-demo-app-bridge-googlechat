//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializespaceCreationInfo")
public inline fun spaceCreationInfo(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo =
  org.matrix.dma.gchat.proto.SpaceCreationInfoKt.Dsl._create(org.matrix.dma.gchat.proto.SpaceCreationInfo.newBuilder()).apply { block() }._build()
public object SpaceCreationInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.SpaceCreationInfo = _builder.build()

    /**
     * <code>optional string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>optional string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * <code>optional string name = 1;</code>
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * <pre>
     * optional GroupGuestAccessSettings group_guest_access_settings = 3;
     * </pre>
     *
     * <code>optional .GroupVisibility visibility = 4;</code>
     */
    public var visibility: org.matrix.dma.gchat.proto.GroupVisibility
      @JvmName("getVisibility")
      get() = _builder.getVisibility()
      @JvmName("setVisibility")
      set(value) {
        _builder.setVisibility(value)
      }
    /**
     * <pre>
     * optional GroupGuestAccessSettings group_guest_access_settings = 3;
     * </pre>
     *
     * <code>optional .GroupVisibility visibility = 4;</code>
     */
    public fun clearVisibility() {
      _builder.clearVisibility()
    }
    /**
     * <pre>
     * optional GroupGuestAccessSettings group_guest_access_settings = 3;
     * </pre>
     *
     * <code>optional .GroupVisibility visibility = 4;</code>
     * @return Whether the visibility field is set.
     */
    public fun hasVisibility(): kotlin.Boolean {
      return _builder.hasVisibility()
    }
    public val SpaceCreationInfoKt.Dsl.visibilityOrNull: org.matrix.dma.gchat.proto.GroupVisibility?
      get() = _builder.visibilityOrNull

    /**
     * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
     */
    public var flatGroup: org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup
      @JvmName("getFlatGroup")
      get() = _builder.getFlatGroup()
      @JvmName("setFlatGroup")
      set(value) {
        _builder.setFlatGroup(value)
      }
    /**
     * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
     */
    public fun clearFlatGroup() {
      _builder.clearFlatGroup()
    }
    /**
     * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
     * @return Whether the flatGroup field is set.
     */
    public fun hasFlatGroup(): kotlin.Boolean {
      return _builder.hasFlatGroup()
    }
    public val SpaceCreationInfoKt.Dsl.flatGroupOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup?
      get() = _builder.flatGroupOrNull

    /**
     * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
     */
    public var threadedGroup: org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup
      @JvmName("getThreadedGroup")
      get() = _builder.getThreadedGroup()
      @JvmName("setThreadedGroup")
      set(value) {
        _builder.setThreadedGroup(value)
      }
    /**
     * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
     */
    public fun clearThreadedGroup() {
      _builder.clearThreadedGroup()
    }
    /**
     * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
     * @return Whether the threadedGroup field is set.
     */
    public fun hasThreadedGroup(): kotlin.Boolean {
      return _builder.hasThreadedGroup()
    }
    public val SpaceCreationInfoKt.Dsl.threadedGroupOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup?
      get() = _builder.threadedGroupOrNull

    /**
     * <code>optional bool has_server_generated_name = 7;</code>
     */
    public var hasServerGeneratedName: kotlin.Boolean
      @JvmName("getHasServerGeneratedName")
      get() = _builder.getHasServerGeneratedName()
      @JvmName("setHasServerGeneratedName")
      set(value) {
        _builder.setHasServerGeneratedName(value)
      }
    /**
     * <code>optional bool has_server_generated_name = 7;</code>
     */
    public fun clearHasServerGeneratedName() {
      _builder.clearHasServerGeneratedName()
    }
    /**
     * <code>optional bool has_server_generated_name = 7;</code>
     * @return Whether the hasServerGeneratedName field is set.
     */
    public fun hasHasServerGeneratedName(): kotlin.Boolean {
      return _builder.hasHasServerGeneratedName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InviteeMemberInfosProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     */
     public val inviteeMemberInfos: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInviteeMemberInfosList()
      )
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     * @param value The inviteeMemberInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInviteeMemberInfos")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.add(value: org.matrix.dma.gchat.proto.InviteeMemberInfo) {
      _builder.addInviteeMemberInfos(value)
    }
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     * @param value The inviteeMemberInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInviteeMemberInfos")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.plusAssign(value: org.matrix.dma.gchat.proto.InviteeMemberInfo) {
      add(value)
    }
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     * @param values The inviteeMemberInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInviteeMemberInfos")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.InviteeMemberInfo>) {
      _builder.addAllInviteeMemberInfos(values)
    }
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     * @param values The inviteeMemberInfos to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInviteeMemberInfos")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.InviteeMemberInfo>) {
      addAll(values)
    }
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     * @param index The index to set the value at.
     * @param value The inviteeMemberInfos to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInviteeMemberInfos")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.InviteeMemberInfo) {
      _builder.setInviteeMemberInfos(index, value)
    }
    /**
     * <pre>
     * optional RoomInviteNotificationSettings notification_settings = 9;
     * optional AvatarInfo avatar_info = 10;
     * </pre>
     *
     * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInviteeMemberInfos")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeMemberInfo, InviteeMemberInfosProxy>.clear() {
      _builder.clearInviteeMemberInfos()
    }


    /**
     * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
     */
    public var spaceType: org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType
      @JvmName("getSpaceType")
      get() = _builder.getSpaceType()
      @JvmName("setSpaceType")
      set(value) {
        _builder.setSpaceType(value)
      }
    /**
     * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
     */
    public fun clearSpaceType() {
      _builder.clearSpaceType()
    }
    /**
     * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
     * @return Whether the spaceType field is set.
     */
    public fun hasSpaceType(): kotlin.Boolean {
      return _builder.hasSpaceType()
    }
    public val SpaceCreationInfoKt.Dsl.spaceTypeOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType?
      get() = _builder.spaceTypeOrNull

    /**
     * <pre>
     * optional ?? space_details = 12;
     * </pre>
     *
     * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 13;</code>
     */
    public var attributeCheckerGroupType: org.matrix.dma.gchat.proto.SharedAttributeCheckerGroupType
      @JvmName("getAttributeCheckerGroupType")
      get() = _builder.getAttributeCheckerGroupType()
      @JvmName("setAttributeCheckerGroupType")
      set(value) {
        _builder.setAttributeCheckerGroupType(value)
      }
    /**
     * <pre>
     * optional ?? space_details = 12;
     * </pre>
     *
     * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 13;</code>
     */
    public fun clearAttributeCheckerGroupType() {
      _builder.clearAttributeCheckerGroupType()
    }
    /**
     * <pre>
     * optional ?? space_details = 12;
     * </pre>
     *
     * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 13;</code>
     * @return Whether the attributeCheckerGroupType field is set.
     */
    public fun hasAttributeCheckerGroupType(): kotlin.Boolean {
      return _builder.hasAttributeCheckerGroupType()
    }

    /**
     * <code>optional string shared_drive_name = 14;</code>
     */
    public var sharedDriveName: kotlin.String
      @JvmName("getSharedDriveName")
      get() = _builder.getSharedDriveName()
      @JvmName("setSharedDriveName")
      set(value) {
        _builder.setSharedDriveName(value)
      }
    /**
     * <code>optional string shared_drive_name = 14;</code>
     */
    public fun clearSharedDriveName() {
      _builder.clearSharedDriveName()
    }
    /**
     * <code>optional string shared_drive_name = 14;</code>
     * @return Whether the sharedDriveName field is set.
     */
    public fun hasSharedDriveName(): kotlin.Boolean {
      return _builder.hasSharedDriveName()
    }
  }
  @kotlin.jvm.JvmName("-initializeflatGroup")
  public inline fun flatGroup(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.FlatGroupKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup =
    org.matrix.dma.gchat.proto.SpaceCreationInfoKt.FlatGroupKt.Dsl._create(org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup.newBuilder()).apply { block() }._build()
  public object FlatGroupKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup = _builder.build()
    }
  }
  @kotlin.jvm.JvmName("-initializethreadedGroup")
  public inline fun threadedGroup(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.ThreadedGroupKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup =
    org.matrix.dma.gchat.proto.SpaceCreationInfoKt.ThreadedGroupKt.Dsl._create(org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup.newBuilder()).apply { block() }._build()
  public object ThreadedGroupKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup = _builder.build()
    }
  }
  @kotlin.jvm.JvmName("-initializespaceType")
  public inline fun spaceType(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.SpaceTypeKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType =
    org.matrix.dma.gchat.proto.SpaceCreationInfoKt.SpaceTypeKt.Dsl._create(org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType.newBuilder()).apply { block() }._build()
  public object SpaceTypeKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType = _builder.build()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.SpaceCreationInfo.copy(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo =
  org.matrix.dma.gchat.proto.SpaceCreationInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup.copy(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.FlatGroupKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup =
  org.matrix.dma.gchat.proto.SpaceCreationInfoKt.FlatGroupKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup.copy(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.ThreadedGroupKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup =
  org.matrix.dma.gchat.proto.SpaceCreationInfoKt.ThreadedGroupKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType.copy(block: org.matrix.dma.gchat.proto.SpaceCreationInfoKt.SpaceTypeKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType =
  org.matrix.dma.gchat.proto.SpaceCreationInfoKt.SpaceTypeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.SpaceCreationInfoOrBuilder.visibilityOrNull: org.matrix.dma.gchat.proto.GroupVisibility?
  get() = if (hasVisibility()) getVisibility() else null

public val org.matrix.dma.gchat.proto.SpaceCreationInfoOrBuilder.flatGroupOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup?
  get() = if (hasFlatGroup()) getFlatGroup() else null

public val org.matrix.dma.gchat.proto.SpaceCreationInfoOrBuilder.threadedGroupOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup?
  get() = if (hasThreadedGroup()) getThreadedGroup() else null

public val org.matrix.dma.gchat.proto.SpaceCreationInfoOrBuilder.spaceTypeOrNull: org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType?
  get() = if (hasSpaceType()) getSpaceType() else null

