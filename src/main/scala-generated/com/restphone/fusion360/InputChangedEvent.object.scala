
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event endpoint that supports the connection to client implemented InputChangedEventHandlers. 
 */
@JSName("adsk.core.InputChangedEvent")
trait InputChangedEvent extends Event {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: InputChangedEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: InputChangedEventHandler): Boolean = js.native

}
/** 
  * An event endpoint that supports the connection to client implemented InputChangedEventHandlers. 
 */
@JSName("adsk.core.InputChangedEvent")
object InputChangedEvent extends js.Object {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: InputChangedEventHandler): Boolean = js.native
  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: InputChangedEventHandler): Boolean = js.native
}
// no utilities
