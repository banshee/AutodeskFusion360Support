
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A Workspace provides access to a set of panels, which contain commands that are relevant for that particular workspace. The user can switch from one workspace to another in a product (e.g. switch from Model to Sculpt in Fusion). 
 */
@JSName("adsk.core.Workspace")
trait Workspace extends Base {
  /**
  * Activate the workspace (assuming it is valid to do so - a SIM workspace can't be activated if Fusion is the active product).
  */
  def activate(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this workspace. Only a workspace added by the API can be deleted, (IsNative is false).
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets the unique Id of the workspace that can be used programmatically to find a specific workspace. It is not affected by the current language.
  */
  val id: String = js.native
  /**
  * Gets if the workspace is currently active - i.e. displayed
  */
  val isActive: Boolean = js.native
  /**
  * Gets if this workspace is native to Fusion or was created via the API.
  */
  val isNative: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the visible name of the workspace as seen in the user interface. This is the localized name.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets or sets the resource folder.
  */
  var resourceFolder: String = js.native
  /**
  * Gets the collection containing the panels associated with this workspace.
  */
  val toolbarPanels: ToolbarPanels = js.native
}
/** 
  * A Workspace provides access to a set of panels, which contain commands that are relevant for that particular workspace. The user can switch from one workspace to another in a product (e.g. switch from Model to Sculpt in Fusion). 
 */
@JSName("adsk.core.Workspace")
object Workspace extends js.Object {
  /**
  * Activate the workspace (assuming it is valid to do so - a SIM workspace can't be activated if Fusion is the active product).
  */
  def activate(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this workspace. Only a workspace added by the API can be deleted, (IsNative is false).
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets the unique Id of the workspace that can be used programmatically to find a specific workspace. It is not affected by the current language.
  */
  val id: String = js.native
  /**
  * Gets if the workspace is currently active - i.e. displayed
  */
  val isActive: Boolean = js.native
  /**
  * Gets if this workspace is native to Fusion or was created via the API.
  */
  val isNative: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the visible name of the workspace as seen in the user interface. This is the localized name.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets or sets the resource folder.
  */
  var resourceFolder: String = js.native
  /**
  * Gets the collection containing the panels associated with this workspace.
  */
  val toolbarPanels: ToolbarPanels = js.native
}
// no utilities
