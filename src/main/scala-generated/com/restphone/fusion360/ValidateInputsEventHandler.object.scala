
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An event handler base class that a client derives from to handle events triggered by a ValidateInputsEvent. A client implemented instance of this class can be added to a ValidateInputsEvent to receive these event notifications. 
 */
@JSName("ValidateInputsEventHandler")
class ValidateInputsEventHandler extends EventHandler {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: ValidateInputsEventArgs): Unit = js.native
}
/** 
  * An event handler base class that a client derives from to handle events triggered by a ValidateInputsEvent. A client implemented instance of this class can be added to a ValidateInputsEvent to receive these event notifications. 
 */
@JSName("ValidateInputsEventHandler")
object ValidateInputsEventHandler extends js.Object {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: ValidateInputsEventArgs): Unit = js.native
}

  object ValidateInputsEventHandlerUtilities {
    // no toSeq

  }
       
