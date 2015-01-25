
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of TimelineObjects in a parametric design. 
 */
@JSName("adsk.fusion.Timeline")
trait Timeline extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified item in the timeline using an index into the collection. The items are returned in the order they appear in the timeline.
  */
  def item(index: uinteger): TimelineObject = js.native
  /**
  * Gets and sets the current position of the marker where 0 is at the beginning of the timeline and the value of Timeline.count is the end of the timeline.
  */
  var markerPosition: Integer = js.native
  /**
  * Moves the marker to the beginning of the timeline.
  */
  def moveToBeginning(): Boolean = js.native
  /**
  * Moves the marker to the end of the timeline.
  */
  def moveToEnd(): Boolean = js.native
  /**
  * Moves the marker to the next step in the timeline.
  */
  def movetoNextStep(): Boolean = js.native
  /**
  * Moves the marker to the previous step in the timeline.
  */
  def moveToPreviousStep(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Plays the timeline beginning at the current position of the marker.
  */
  def play(): Boolean = js.native
  /**
  * Returns the collection of groups within the timeline.
  */
  val timelineGroups: TimelineGroups = js.native
}
/** 
  * A collection of TimelineObjects in a parametric design. 
 */
@JSName("adsk.fusion.Timeline")
object Timeline extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified item in the timeline using an index into the collection. The items are returned in the order they appear in the timeline.
  */
  def item(index: uinteger): TimelineObject = js.native
  /**
  * Gets and sets the current position of the marker where 0 is at the beginning of the timeline and the value of Timeline.count is the end of the timeline.
  */
  var markerPosition: Integer = js.native
  /**
  * Moves the marker to the beginning of the timeline.
  */
  def moveToBeginning(): Boolean = js.native
  /**
  * Moves the marker to the end of the timeline.
  */
  def moveToEnd(): Boolean = js.native
  /**
  * Moves the marker to the next step in the timeline.
  */
  def movetoNextStep(): Boolean = js.native
  /**
  * Moves the marker to the previous step in the timeline.
  */
  def moveToPreviousStep(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Plays the timeline beginning at the current position of the marker.
  */
  def play(): Boolean = js.native
  /**
  * Returns the collection of groups within the timeline.
  */
  val timelineGroups: TimelineGroups = js.native
}

  object TimelineUtilities {
    def toSeq(xs: Timeline): IndexedSeq[TimelineObject] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
