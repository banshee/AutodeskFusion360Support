
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A DocumentEvent represents a document related event. For example, DocumentOpening or DocumentOpened. 
 */
@JSName("adsk.core.DocumentEvent")
trait DocumentEvent extends Event {
  /**
  * Add a handler to be notified when the file event occurs.
  */
  def add(handler: DocumentEventHandler): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Removes a handler from the event.
  */
  def remove(handler: DocumentEventHandler): Boolean = js.native

}
/** 
  * A DocumentEvent represents a document related event. For example, DocumentOpening or DocumentOpened. 
 */
@JSName("adsk.core.DocumentEvent")
object DocumentEvent extends js.Object {
  /**
  * Add a handler to be notified when the file event occurs.
  */
  def add(handler: DocumentEventHandler): Boolean = js.native
  /**
  * Removes a handler from the event.
  */
  def remove(handler: DocumentEventHandler): Boolean = js.native
}
// no utilities
