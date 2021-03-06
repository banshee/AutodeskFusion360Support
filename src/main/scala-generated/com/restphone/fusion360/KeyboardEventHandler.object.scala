
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event handler base class that a client derives from to handle events triggered by a KeyboardEvent. A client implemented instance of this class can be added to a KeyboardEvent to receive these event notifications. 
 */
@JSName("KeyboardEventHandler")
class KeyboardEventHandler extends EventHandler {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: KeyboardEventArgs): Unit = js.native
}
/** 
  * An event handler base class that a client derives from to handle events triggered by a KeyboardEvent. A client implemented instance of this class can be added to a KeyboardEvent to receive these event notifications. 
 */
@JSName("KeyboardEventHandler")
object KeyboardEventHandler extends js.Object {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: KeyboardEventArgs): Unit = js.native
}

  object KeyboardEventHandlerUtilities {
    // no toSeq

  }
       
