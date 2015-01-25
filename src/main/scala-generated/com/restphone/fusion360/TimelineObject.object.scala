
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents an object in the timeline. 
 */
@JSName("adsk.fusion.TimelineObject")
trait TimelineObject extends Base {
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def canReorder(): Boolean = js.native
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def canReorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the entity associated with this timeline object. Edit operations can be performed by getting the object representing the associated entity and using the methods and properties on that entity to make changes. Returns null if this is a TimelineGroup object
  */
  val entity: Base = js.native
  /**
  * Returns the position of this item within the timeline where the first item has an index of 0. This property can return -1 in the two cases where this object is not currently represented in the timeline. The two cases are: 1. When this is a TimelineGroup object and the group is expanded. 2. When this object is part of a group and the group is collapsed.
  */
  val index: Integer = js.native
  /**
  * Indicates if this TimelineObject represents a group. If True you can operate on this object as a TimelineGroup object.
  */
  val isGroup: Boolean = js.native
  /**
  * Indicates if this item is currently not being computed because it has been rolled back. If this is a timelineGroup object and the group is expanded the value of this property should be ignored.
  */
  val isRolledBack: Boolean = js.native
  /**
  * Gets and sets if this object is suppressed.
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent group, if this object is part of a group Returns null if this object is not part of a group.
  */
  val parentGroup: TimelineGroup = js.native
  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  def reorder(): Boolean = js.native
  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  def reorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Rolls the timeline by repositioning the marker to either before or after this object. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def rollTo(rollBefore: Boolean): Boolean = js.native
}
/** 
  * Represents an object in the timeline. 
 */
@JSName("adsk.fusion.TimelineObject")
object TimelineObject extends js.Object {
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def canReorder(): Boolean = js.native
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def canReorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the entity associated with this timeline object. Edit operations can be performed by getting the object representing the associated entity and using the methods and properties on that entity to make changes. Returns null if this is a TimelineGroup object
  */
  val entity: Base = js.native
  /**
  * Returns the position of this item within the timeline where the first item has an index of 0. This property can return -1 in the two cases where this object is not currently represented in the timeline. The two cases are: 1. When this is a TimelineGroup object and the group is expanded. 2. When this object is part of a group and the group is collapsed.
  */
  val index: Integer = js.native
  /**
  * Indicates if this TimelineObject represents a group. If True you can operate on this object as a TimelineGroup object.
  */
  val isGroup: Boolean = js.native
  /**
  * Indicates if this item is currently not being computed because it has been rolled back. If this is a timelineGroup object and the group is expanded the value of this property should be ignored.
  */
  val isRolledBack: Boolean = js.native
  /**
  * Gets and sets if this object is suppressed.
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent group, if this object is part of a group Returns null if this object is not part of a group.
  */
  val parentGroup: TimelineGroup = js.native
  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  def reorder(): Boolean = js.native
  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  def reorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Rolls the timeline by repositioning the marker to either before or after this object. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  def rollTo(rollBefore: Boolean): Boolean = js.native
}
// no utilities
