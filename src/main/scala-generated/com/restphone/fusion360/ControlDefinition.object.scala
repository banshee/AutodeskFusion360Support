
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The ControlDefinition is the base class for the various types of control definitions. You can use properties on the control definition to define the look and behavior of the control. 
 */
@JSName("adsk.core.ControlDefinition")
class ControlDefinition extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets or sets if this definition is enabled or not. This has the effect of enabling and disabling any associated controls.
  */
  var isEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this definition is visible or not. This has the effect of making any associated controls visible or invisible in the user interface.
  */
  var isVisible: Boolean = js.native
  /**
  * Gets or sets the name for this control. This is the visible name displayed in the user interface.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The ControlDefinition is the base class for the various types of control definitions. You can use properties on the control definition to define the look and behavior of the control. 
 */
@JSName("adsk.core.ControlDefinition")
object ControlDefinition extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets or sets if this definition is enabled or not. This has the effect of enabling and disabling any associated controls.
  */
  var isEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this definition is visible or not. This has the effect of making any associated controls visible or invisible in the user interface.
  */
  var isVisible: Boolean = js.native
  /**
  * Gets or sets the name for this control. This is the visible name displayed in the user interface.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ControlDefinitionUtilities {
    // no toSeq

  }
       
