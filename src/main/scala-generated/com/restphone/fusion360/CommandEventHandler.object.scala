
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An command event handler base class that a client derives from to handle events triggered by a CommandEvent. A client implemented instance of this class can be added to a CommandEvent to receive these event notifications. 
 */
@JSName("CommandEventHandler")
class CommandEventHandler extends EventHandler {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: CommandEventArgs): Unit = js.native
}
/** 
  * An command event handler base class that a client derives from to handle events triggered by a CommandEvent. A client implemented instance of this class can be added to a CommandEvent to receive these event notifications. 
 */
@JSName("CommandEventHandler")
object CommandEventHandler extends js.Object {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: CommandEventArgs): Unit = js.native
}

  object CommandEventHandlerUtilities {
    // no toSeq

  }
       
