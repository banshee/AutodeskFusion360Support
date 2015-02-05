
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents the information used to define a check box. This isn't the visible check box control but is the information needed to create a check box control and fully defines a check box except for it's position within the user interface. 
 */
@JSName("adsk.core.CheckBoxControlDefinition")
class CheckBoxControlDefinition extends ControlDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets or sets whether the check box is checked. Changing this will result in changing any associated controls and will execute the associated command.
  */
  var isChecked: Boolean = js.native





}
/** 
  * Represents the information used to define a check box. This isn't the visible check box control but is the information needed to create a check box control and fully defines a check box except for it's position within the user interface. 
 */
@JSName("adsk.core.CheckBoxControlDefinition")
object CheckBoxControlDefinition extends js.Object {
  /**
  * Gets or sets whether the check box is checked. Changing this will result in changing any associated controls and will execute the associated command.
  */
  var isChecked: Boolean = js.native
}

  object CheckBoxControlDefinitionUtilities {
    // no toSeq

  }
       
