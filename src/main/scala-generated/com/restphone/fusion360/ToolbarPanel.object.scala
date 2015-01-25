
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Toolbar panels are the panels shown in the command toolbar. 
 */
@JSName("adsk.core.ToolbarPanel")
trait ToolbarPanel extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the controls associated with this panel. These are all in the panel's drop-down (assuming their visible property is true) and are selectively shown within the panel.
  */
  val controls: ToolbarControls = js.native
  /**
  * Deletes this toolbar panel.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets The unique, language independent, ID of this panel.
  */
  val id: String = js.native
  /**
  * Gets the position this panel is in within the toolbar. The first panel is at position 0. This value is with respect to the complete list of panels so this value could be outside of the expected range if you have a collection of panels associated with a workspace, which is a subset of the entire list of panels.
  */
  val index: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets whether this panel is currently being displayed in the user interface. Visibility of a panel is controlled by it being associated with the currently active workspace.
  */
  val isVisible: Boolean = js.native
  /**
  * Gets the name of the panel as seen in the user interface.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent UserInterface object.
  */
  val parentUserInterface: UserInterface = js.native
  /**
  * Gets the controls in the panel that have been promoted. Promoted controls are the controls that are displayed within the panel.
  */
  val promotedControls: ToolbarControlList = js.native
  /**
  * Gets or sets the set of workspaces that this panel is displayed for.
  */
  var relatedWorkspaces: ObjectCollection = js.native
}
/** 
  * Toolbar panels are the panels shown in the command toolbar. 
 */
@JSName("adsk.core.ToolbarPanel")
object ToolbarPanel extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the controls associated with this panel. These are all in the panel's drop-down (assuming their visible property is true) and are selectively shown within the panel.
  */
  val controls: ToolbarControls = js.native
  /**
  * Deletes this toolbar panel.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets The unique, language independent, ID of this panel.
  */
  val id: String = js.native
  /**
  * Gets the position this panel is in within the toolbar. The first panel is at position 0. This value is with respect to the complete list of panels so this value could be outside of the expected range if you have a collection of panels associated with a workspace, which is a subset of the entire list of panels.
  */
  val index: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets whether this panel is currently being displayed in the user interface. Visibility of a panel is controlled by it being associated with the currently active workspace.
  */
  val isVisible: Boolean = js.native
  /**
  * Gets the name of the panel as seen in the user interface.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent UserInterface object.
  */
  val parentUserInterface: UserInterface = js.native
  /**
  * Gets the controls in the panel that have been promoted. Promoted controls are the controls that are displayed within the panel.
  */
  val promotedControls: ToolbarControlList = js.native
  /**
  * Gets or sets the set of workspaces that this panel is displayed for.
  */
  var relatedWorkspaces: ObjectCollection = js.native
}
// no utilities
