
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The DocumentEventHandler is a client implemented class that can be added as a handler to a DocumentEvent. 
 */
@JSName("DocumentEventHandler")
trait DocumentEventHandler extends EventHandler {
  /**
  * The function called by Fusion when the associated event is fired.
  */
  def notify(eventArgs: DocumentEventArgs): Unit = js.native
}
/** 
  * The DocumentEventHandler is a client implemented class that can be added as a handler to a DocumentEvent. 
 */
@JSName("DocumentEventHandler")
object DocumentEventHandler extends js.Object {
  /**
  * The function called by Fusion when the associated event is fired.
  */
  def notify(eventArgs: DocumentEventArgs): Unit = js.native
}
// no utilities
