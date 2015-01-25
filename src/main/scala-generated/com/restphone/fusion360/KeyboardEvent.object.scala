
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event endpoint that supports the connection to client implemented KeyboardEventHandlers. 
 */
@JSName("adsk.core.KeyboardEvent")
trait KeyboardEvent extends Event {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: KeyboardEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: KeyboardEventHandler): Boolean = js.native

}
/** 
  * An event endpoint that supports the connection to client implemented KeyboardEventHandlers. 
 */
@JSName("adsk.core.KeyboardEvent")
object KeyboardEvent extends js.Object {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: KeyboardEventHandler): Boolean = js.native
  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: KeyboardEventHandler): Boolean = js.native
}
// no utilities
