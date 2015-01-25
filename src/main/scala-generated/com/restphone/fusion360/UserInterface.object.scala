
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the user-interface related objects and functionality. 
 */
@JSName("adsk.core.UserInterface")
trait UserInterface extends Base {
  /**
  * Gets the current set of selected objects.
  */
  val activeSelections: Selections = js.native
  /**
  * Gets the active workspace. The active workspace is the one currently active in the user interface. This can be null if there is no active product.
  */
  val activeWorkspace: Workspace = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets all of the command definitions currently defined. This is all command definitions both internal and those defined through the API.
  */
  val commandDefinitions: CommandDefinitions = js.native
  /**
  * Creates a new FileDialog object which provides the ability to show a standard file selection dialog to the user.
  */
  def createFileDialog(): FileDialog = js.native
  /**
  * Displays a modal dialog to get string input from the user.
  */
  def inputBox(prompt: String, /* out */ cancelled: Boolean, title: String, defaultValue: String): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String): DialogResults = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String, /* optional */ buttons: MessageBoxButtonTypes): DialogResults = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String, /* optional */ buttons: MessageBoxButtonTypes, /* optional */ icon: MessageBoxIconTypes): DialogResults = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Supports the selection of a single entity. This provides a simple way to prompt the user for a selection in a script. If you need more control over the selection a command should be created and a SelectionCommandInput used.
  */
  def selectEntity(prompt: String, filter: String): Base = js.native
  /**
  * Gets all of the toolbar panels. This returns all of the panels available, regardless of which workspace they're associated with. They're returned in the same order as they exist in the user interface.
  */
  val toolbarPanels: ToolbarPanels = js.native
  /**
  * Gets a collection that provides access to the toolbars. This includes the left and right QAT, and the Navbar.
  */
  val toolbars: Toolbars = js.native
  /**
  * Gets all of the workspaces currently available.
  */
  val workspaces: Workspaces = js.native
  /**
  * Returns all of the workspaces associated with the specified product.
  */
  def workspacesByProduct(product: Product): WorkspaceList = js.native
}
/** 
  * Provides access to the user-interface related objects and functionality. 
 */
@JSName("adsk.core.UserInterface")
object UserInterface extends js.Object {
  /**
  * Gets the current set of selected objects.
  */
  val activeSelections: Selections = js.native
  /**
  * Gets the active workspace. The active workspace is the one currently active in the user interface. This can be null if there is no active product.
  */
  val activeWorkspace: Workspace = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets all of the command definitions currently defined. This is all command definitions both internal and those defined through the API.
  */
  val commandDefinitions: CommandDefinitions = js.native
  /**
  * Creates a new FileDialog object which provides the ability to show a standard file selection dialog to the user.
  */
  def createFileDialog(): FileDialog = js.native
  /**
  * Displays a modal dialog to get string input from the user.
  */
  def inputBox(prompt: String, /* out */ cancelled: Boolean, title: String, defaultValue: String): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String): DialogResults = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String, /* optional */ buttons: MessageBoxButtonTypes): DialogResults = js.native
  /**
  * Display a modal message box with the provided text.
  */
  def messageBox(text: String, title: String, /* optional */ buttons: MessageBoxButtonTypes, /* optional */ icon: MessageBoxIconTypes): DialogResults = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Supports the selection of a single entity. This provides a simple way to prompt the user for a selection in a script. If you need more control over the selection a command should be created and a SelectionCommandInput used.
  */
  def selectEntity(prompt: String, filter: String): Base = js.native
  /**
  * Gets all of the toolbar panels. This returns all of the panels available, regardless of which workspace they're associated with. They're returned in the same order as they exist in the user interface.
  */
  val toolbarPanels: ToolbarPanels = js.native
  /**
  * Gets a collection that provides access to the toolbars. This includes the left and right QAT, and the Navbar.
  */
  val toolbars: Toolbars = js.native
  /**
  * Gets all of the workspaces currently available.
  */
  val workspaces: Workspaces = js.native
  /**
  * Returns all of the workspaces associated with the specified product.
  */
  def workspacesByProduct(product: Product): WorkspaceList = js.native
}
// no utilities
