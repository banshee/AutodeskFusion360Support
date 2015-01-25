
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the thread data of a thread feature. If the ThreadInfo object is returned from a thread feature, setting this ThreadInfo will cause the thread feature to be edited. 
 */
@JSName("adsk.fusion.ThreadInfo")
trait ThreadInfo extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if the thread is an internal or external thread. A value of true indicates an internal thread. It defaults to true.
  */
  var isInternal: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the value that defines the major diameter.
  */
  val majorDiameter: double = js.native
  /**
  * Gets the value that defines the minor diameter.
  */
  val minorDiameter: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the value that defines the pitch diameter.
  */
  val pitchDiameter: double = js.native
  /**
  * Gets the value that defines the thread angle.
  */
  val threadAngle: double = js.native
  /**
  * Gets and sets the string that defines the thread class.
  */
  var threadClass: String = js.native
  /**
  * Gets and sets the string that defines the thread designation.
  */
  var threadDesignation: String = js.native
  /**
  * Gets the value that defines the thread pitch.
  */
  val threadPitch: double = js.native
  /**
  * Gets the string that defines the thread size.
  */
  val threadSize: String = js.native
  /**
  * Gets and sets the string that defines the thread type.
  */
  var threadType: String = js.native
}
/** 
  * This class defines the methods and properties that pertain to the thread data of a thread feature. If the ThreadInfo object is returned from a thread feature, setting this ThreadInfo will cause the thread feature to be edited. 
 */
@JSName("adsk.fusion.ThreadInfo")
object ThreadInfo extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if the thread is an internal or external thread. A value of true indicates an internal thread. It defaults to true.
  */
  var isInternal: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the value that defines the major diameter.
  */
  val majorDiameter: double = js.native
  /**
  * Gets the value that defines the minor diameter.
  */
  val minorDiameter: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the value that defines the pitch diameter.
  */
  val pitchDiameter: double = js.native
  /**
  * Gets the value that defines the thread angle.
  */
  val threadAngle: double = js.native
  /**
  * Gets and sets the string that defines the thread class.
  */
  var threadClass: String = js.native
  /**
  * Gets and sets the string that defines the thread designation.
  */
  var threadDesignation: String = js.native
  /**
  * Gets the value that defines the thread pitch.
  */
  val threadPitch: double = js.native
  /**
  * Gets the string that defines the thread size.
  */
  val threadSize: String = js.native
  /**
  * Gets and sets the string that defines the thread type.
  */
  var threadType: String = js.native
}
// no utilities
