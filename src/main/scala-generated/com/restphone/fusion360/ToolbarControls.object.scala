
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ToolbarControls is a collection of ToolbarControl objects displayed in a toolbar or menu. 
 */
@JSName("adsk.core.ToolbarControls")
class ToolbarControls extends Base {
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition): CommandControl = js.native
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition, /* optional */ id: String): CommandControl = js.native
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition, /* optional */ id: String, /* optional */ beforeIndex: Integer): CommandControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String): DropDownControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String, /* optional */ id: String): DropDownControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String, /* optional */ id: String, /* optional */ beforeIndex: Integer): DropDownControl = js.native
  /**
  * Adds a separator to the controls in the toolbar, panel, or drop-down.
  */
  def addSeparator(): SeparatorControl = js.native
  /**
  * Adds a separator to the controls in the toolbar, panel, or drop-down.
  */
  def addSeparator(/* optional */ beforeIndex: Integer): SeparatorControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean): SplitButtonControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean, /* optional */ id: String): SplitButtonControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean, /* optional */ id: String, /* optional */ beforeIndex: Integer): SplitButtonControl = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of controls in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the ToolbarControl at the specified index. When iterating by index, the controls are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarControl = js.native
  /**
  * Returns the ToolbarControl at the specified ID.
  */
  def itemById(id: String): ToolbarControl = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * ToolbarControls is a collection of ToolbarControl objects displayed in a toolbar or menu. 
 */
@JSName("adsk.core.ToolbarControls")
object ToolbarControls extends js.Object {
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition): CommandControl = js.native
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition, /* optional */ id: String): CommandControl = js.native
  /**
  * Adds a button to the controls in the toolbar, panel, or drop-down.
  */
  def addCommand(commandDefinition: CommandDefinition, /* optional */ id: String, /* optional */ beforeIndex: Integer): CommandControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String): DropDownControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String, /* optional */ id: String): DropDownControl = js.native
  /**
  * Adds a drop-down to the controls in the toolbar, panel, or drop-down. When the drop-down is initially created it will be empty. you can get the associated ToolbarControls object from the DropDownControl to add additional controls to the drop-down.
  */
  def addDropDown(text: String, resourceFolder: String, /* optional */ id: String, /* optional */ beforeIndex: Integer): DropDownControl = js.native
  /**
  * Adds a separator to the controls in the toolbar, panel, or drop-down.
  */
  def addSeparator(): SeparatorControl = js.native
  /**
  * Adds a separator to the controls in the toolbar, panel, or drop-down.
  */
  def addSeparator(/* optional */ beforeIndex: Integer): SeparatorControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean): SplitButtonControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean, /* optional */ id: String): SplitButtonControl = js.native
  /**
  * Adds a split button to the controls in a toolbar. A split button has two active areas that the user can click; the main button portion and the drop-down arrow. Clicking the main button, executes the displayed command. Clicking the drop-down displays the drop-down with additional commands. The split button itself does not fire any events, but the buttons within it will fire events to their associated command definitions.
  */
  def addSplitButton(defaultDefinition: CommandDefinition, additionalDefinitions: Array[CommandDefinition], showLastUsed: Boolean, /* optional */ id: String, /* optional */ beforeIndex: Integer): SplitButtonControl = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of controls in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the ToolbarControl at the specified index. When iterating by index, the controls are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarControl = js.native
  /**
  * Returns the ToolbarControl at the specified ID.
  */
  def itemById(id: String): ToolbarControl = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ToolbarControlsUtilities {
    
    def toSeq(xs: ToolbarControls): IndexedSeq[ToolbarControl] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
