
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for all toolbar controls. 
 */
@JSName("adsk.core.ToolbarControl")
trait ToolbarControl extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the ToolbarControl
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets the unique ID of this control. The ID is unique with respect to the other controls within the same panel, toolbar, or drop-down control.
  */
  val id: String = js.native
  /**
  * Gets the position of this control within the list of controls within the panel, toolbar, or drop-down control.
  */
  val index: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this control is currently visible.
  */
  var isVisible: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the Parent object. When associated with a toolbar (right or left QAT or the Nav Bar) this returns the parent Toolbar object. When associated with a panel it returns the parent ToolbarPanel object. When associated with a control (DropDownControl) it returns the parent control.
  */
  val parent: Base = js.native
}
/** 
  * The base class for all toolbar controls. 
 */
@JSName("adsk.core.ToolbarControl")
object ToolbarControl extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the ToolbarControl
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets the unique ID of this control. The ID is unique with respect to the other controls within the same panel, toolbar, or drop-down control.
  */
  val id: String = js.native
  /**
  * Gets the position of this control within the list of controls within the panel, toolbar, or drop-down control.
  */
  val index: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this control is currently visible.
  */
  var isVisible: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the Parent object. When associated with a toolbar (right or left QAT or the Nav Bar) this returns the parent Toolbar object. When associated with a panel it returns the parent ToolbarPanel object. When associated with a control (DropDownControl) it returns the parent control.
  */
  val parent: Base = js.native
}
// no utilities
