
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents a Snapshot in the timeline 
 */
@JSName("adsk.fusion.Snapshot")
trait Snapshot extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this snapshot.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the snapshot as seen in the timeline.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the timeline object associated with this snapshot.
  */
  val timelineObject: TimelineObject = js.native
}
/** 
  * Object that represents a Snapshot in the timeline 
 */
@JSName("adsk.fusion.Snapshot")
object Snapshot extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this snapshot.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the snapshot as seen in the timeline.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the timeline object associated with this snapshot.
  */
  val timelineObject: TimelineObject = js.native
}
// no utilities
