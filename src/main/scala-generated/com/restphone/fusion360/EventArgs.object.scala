
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * When an event handler is called, it is passed an EventArgs object that describes the 'event'. This is a base class - classes like DocumentEventArgs add more information on the 'event'. 
 */
@JSName("adsk.core.EventArgs")
class EventArgs extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The event that the firing is in response to.
  */
  val firingEvent: Event = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * When an event handler is called, it is passed an EventArgs object that describes the 'event'. This is a base class - classes like DocumentEventArgs add more information on the 'event'. 
 */
@JSName("adsk.core.EventArgs")
object EventArgs extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The event that the firing is in response to.
  */
  val firingEvent: Event = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object EventArgsUtilities {
    // no toSeq

  }
       
