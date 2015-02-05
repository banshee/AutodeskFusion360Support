
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a button, check box, or radio control list in a panel, toolbar, or drop-down. 
 */
@JSName("adsk.core.CommandControl")
class CommandControl extends ToolbarControl {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the command definition associated with this button. The command definition defines all of the resource information used to display this button and receives the event when the button is clicked.
  */
  val commandDefinition: CommandDefinition = js.native
  /**
  * Deletes the ToolbarControl
  */
  override def deleteMe(): Boolean = js.native


  /**
  * Gets or sets if this command has been promoted to the parent panel. This property is ignored in the case where this control isn't in a panel.
  */
  var isPromoted: Boolean = js.native
  /**
  * Gets or sets if this command is a default command in the panel. This defines the default state of the panel if the UI is reset. This property is ignored in the case where this control isn't in a panel.
  */
  var isPromotedByDefault: Boolean = js.native




}
/** 
  * Represents a button, check box, or radio control list in a panel, toolbar, or drop-down. 
 */
@JSName("adsk.core.CommandControl")
object CommandControl extends js.Object {
  /**
  * Gets the command definition associated with this button. The command definition defines all of the resource information used to display this button and receives the event when the button is clicked.
  */
  val commandDefinition: CommandDefinition = js.native
  /**
  * Gets or sets if this command has been promoted to the parent panel. This property is ignored in the case where this control isn't in a panel.
  */
  var isPromoted: Boolean = js.native
  /**
  * Gets or sets if this command is a default command in the panel. This defines the default state of the panel if the UI is reset. This property is ignored in the case where this control isn't in a panel.
  */
  var isPromotedByDefault: Boolean = js.native
}

  object CommandControlUtilities {
    // no toSeq

  }
       
