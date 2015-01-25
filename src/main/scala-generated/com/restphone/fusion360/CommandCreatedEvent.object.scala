
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Class that needs to be implemented in order to respond to the CommandCreatedEvent event. 
 */
@JSName("adsk.core.CommandCreatedEvent")
trait CommandCreatedEvent extends Event {
  /**
  * Adds an event handler object to this event endpoint.
  */
  def add(handler: CommandCreatedEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: CommandCreatedEventHandler): Boolean = js.native

}
/** 
  * Class that needs to be implemented in order to respond to the CommandCreatedEvent event. 
 */
@JSName("adsk.core.CommandCreatedEvent")
object CommandCreatedEvent extends js.Object {
  /**
  * Adds an event handler object to this event endpoint.
  */
  def add(handler: CommandCreatedEventHandler): Boolean = js.native
  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: CommandCreatedEventHandler): Boolean = js.native
}
// no utilities
