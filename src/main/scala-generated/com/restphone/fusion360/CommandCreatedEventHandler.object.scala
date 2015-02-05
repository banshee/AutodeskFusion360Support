
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Class that contains the call back function that is called when the CommandCreated event is fired. 
 */
@JSName("CommandCreatedEventHandler")
class CommandCreatedEventHandler extends EventHandler {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: CommandCreatedEventArgs): Unit = js.native
}
/** 
  * Class that contains the call back function that is called when the CommandCreated event is fired. 
 */
@JSName("CommandCreatedEventHandler")
object CommandCreatedEventHandler extends js.Object {
  /**
  * This notify member is called when an event is triggered from any event that this handler has been added to.
  */
  def notify(eventArgs: CommandCreatedEventArgs): Unit = js.native
}

  object CommandCreatedEventHandlerUtilities {
    // no toSeq

  }
       
