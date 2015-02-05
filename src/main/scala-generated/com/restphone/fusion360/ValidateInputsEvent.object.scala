
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event endpoint that supports the connection to client implemented ValidateInputsEventHandlers. 
 */
@JSName("adsk.core.ValidateInputsEvent")
class ValidateInputsEvent extends Event {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: ValidateInputsEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: ValidateInputsEventHandler): Boolean = js.native

}
/** 
  * An event endpoint that supports the connection to client implemented ValidateInputsEventHandlers. 
 */
@JSName("adsk.core.ValidateInputsEvent")
object ValidateInputsEvent extends js.Object {
  /**
  * Adds an event handler to this event endpoint.
  */
  def add(handler: ValidateInputsEventHandler): Boolean = js.native
  /**
  * Removes a handler from this event endpoint.
  */
  def remove(handler: ValidateInputsEventHandler): Boolean = js.native
}

  object ValidateInputsEventUtilities {
    // no toSeq

  }
       
