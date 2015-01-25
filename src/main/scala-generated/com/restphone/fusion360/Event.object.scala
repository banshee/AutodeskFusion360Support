
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Objects can have several Event properties that fire when some 'event' occurs. Clients can attach EventHandlers to one or more Events and they get notified when the 'event' occurs. This is a base class - classes like DocumentEvent add type safety (i.e. only allow the correct type of handler to be added to them). 
 */
@JSName("adsk.core.Event")
trait Event extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The name of the event - e.g. "DocumentOpening"
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The object that fires the event.
  */
  val sender: Base = js.native
}
/** 
  * Objects can have several Event properties that fire when some 'event' occurs. Clients can attach EventHandlers to one or more Events and they get notified when the 'event' occurs. This is a base class - classes like DocumentEvent add type safety (i.e. only allow the correct type of handler to be added to them). 
 */
@JSName("adsk.core.Event")
object Event extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The name of the event - e.g. "DocumentOpening"
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The object that fires the event.
  */
  val sender: Base = js.native
}
// no utilities
