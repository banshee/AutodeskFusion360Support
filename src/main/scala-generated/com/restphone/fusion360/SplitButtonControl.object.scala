
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. 
 */
@JSName("adsk.core.SplitButtonControl")
class SplitButtonControl extends ToolbarControl {
  /**
  * Gets or sets the command definitions used to define the buttons associated with the split button.
  */
  var additionalDefinitions: CommandDefinition = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the command definition that is used as the default command on the main portion of the split button.
  */
  val defaultCommandDefinition: CommandDefinition = js.native
  /**
  * Deletes the ToolbarControl
  */
  override def deleteMe(): Boolean = js.native


  /**
  * Gets if this button behaves where the last executed command becomes the command on the main portion of the split button.
  */
  val isLastUsedShown: Boolean = js.native




}
/** 
  * A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. 
 */
@JSName("adsk.core.SplitButtonControl")
object SplitButtonControl extends js.Object {
  /**
  * Gets or sets the command definitions used to define the buttons associated with the split button.
  */
  var additionalDefinitions: CommandDefinition = js.native
  /**
  * Gets the command definition that is used as the default command on the main portion of the split button.
  */
  val defaultCommandDefinition: CommandDefinition = js.native
  /**
  * Gets if this button behaves where the last executed command becomes the command on the main portion of the split button.
  */
  val isLastUsedShown: Boolean = js.native
}

  object SplitButtonControlUtilities {
    // no toSeq

  }
       
