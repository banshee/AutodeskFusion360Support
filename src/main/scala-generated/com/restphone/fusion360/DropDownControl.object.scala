
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a drop-down control. 
 */
@JSName("adsk.core.DropDownControl")
trait DropDownControl extends ToolbarControl {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the associated ToolbarControls collection. Through this you can add additional controls to the drop-down.
  */
  val controls: ToolbarControls = js.native
  /**
  * Deletes the ToolbarControl
  */
  override def deleteMe(): Boolean = js.native




  /**
  * Gets or sets the Name displayed for this drop down. This isn't used when the drop-down is in a toolbar because an icon is used in that case.
  */
  var name: String = js.native


  /**
  * Gets or sets the resource folder containing the image used for the icon when the drop-down is in a toolbar.
  */
  var resourceFolder: String = js.native
}
/** 
  * Represents a drop-down control. 
 */
@JSName("adsk.core.DropDownControl")
object DropDownControl extends js.Object {
  /**
  * Gets the associated ToolbarControls collection. Through this you can add additional controls to the drop-down.
  */
  val controls: ToolbarControls = js.native
  /**
  * Gets or sets the Name displayed for this drop down. This isn't used when the drop-down is in a toolbar because an icon is used in that case.
  */
  var name: String = js.native
  /**
  * Gets or sets the resource folder containing the image used for the icon when the drop-down is in a toolbar.
  */
  var resourceFolder: String = js.native
}
// no utilities
