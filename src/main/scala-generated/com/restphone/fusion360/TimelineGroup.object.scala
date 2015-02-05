
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a group in the timeline. 
 */
@JSName("adsk.fusion.TimelineGroup")
class TimelineGroup extends TimelineObject {
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  override def canReorder(): Boolean = js.native
  /**
  * Checks to see if this object can be reordered to the specified position. The default value of -1 indicates the end of the timeline. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  override def canReorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * The number of items in the group.
  */
  val count: uinteger = js.native
  /**
  * Deletes the group with the option of deleting or keeping the contents.
  */
  def deleteMe(deleteGroupAndContents: Boolean): Boolean = js.native


  /**
  * Indicates if the group is collapsed or expanded.
  */
  var isCollapsed: Boolean = js.native




  /**
  * Function that returns the specified timeline object within the group using an index into the collection.
  */
  def item(index: uinteger): TimelineObject = js.native


  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  override def reorder(): Boolean = js.native
  /**
  * Reorders this object to the position specified. The default value of -1 indicates the end of the timeline.
  */
  override def reorder(/* optional */ beforeIndex: Integer): Boolean = js.native
  /**
  * Rolls the timeline by repositioning the marker to either before or after this object. This method will fail if this is a timelineGroup object and the group is expanded.
  */
  override def rollTo(rollBefore: Boolean): Boolean = js.native
}
/** 
  * Represents a group in the timeline. 
 */
@JSName("adsk.fusion.TimelineGroup")
object TimelineGroup extends js.Object {
  /**
  * The number of items in the group.
  */
  val count: uinteger = js.native
  /**
  * Deletes the group with the option of deleting or keeping the contents.
  */
  def deleteMe(deleteGroupAndContents: Boolean): Boolean = js.native
  /**
  * Indicates if the group is collapsed or expanded.
  */
  var isCollapsed: Boolean = js.native
  /**
  * Function that returns the specified timeline object within the group using an index into the collection.
  */
  def item(index: uinteger): TimelineObject = js.native
}

  object TimelineGroupUtilities {
    
    def toSeq(xs: TimelineGroup): IndexedSeq[TimelineObject] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
