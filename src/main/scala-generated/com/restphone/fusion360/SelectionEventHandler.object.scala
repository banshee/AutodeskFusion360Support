
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event handler base class that a client derives from to handle events triggered by a SelectionEvent. A client implemented instance of this class can be added to a SelectionEvent to receive these event notifications. 
 */
@JSName("SelectionEventHandler")
class SelectionEventHandler extends EventHandler {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: SelectionEventArgs): Unit = js.native
}
/** 
  * An event handler base class that a client derives from to handle events triggered by a SelectionEvent. A client implemented instance of this class can be added to a SelectionEvent to receive these event notifications. 
 */
@JSName("SelectionEventHandler")
object SelectionEventHandler extends js.Object {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: SelectionEventArgs): Unit = js.native
}

  object SelectionEventHandlerUtilities {
    // no toSeq

  }
       
