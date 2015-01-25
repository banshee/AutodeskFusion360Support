
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event endpoint that supports the connection to client implemented CommandEventHandlers. 
 */
@JSName("adsk.core.CommandEvent")
trait CommandEvent extends Event {
  /**
  * Adds an event handler object to this event endpoint.
  */
  def add(handler: CommandEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: CommandEventHandler): Boolean = js.native

}
/** 
  * An event endpoint that supports the connection to client implemented CommandEventHandlers. 
 */
@JSName("adsk.core.CommandEvent")
object CommandEvent extends js.Object {
  /**
  * Adds an event handler object to this event endpoint.
  */
  def add(handler: CommandEventHandler): Boolean = js.native
  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: CommandEventHandler): Boolean = js.native
}
// no utilities
