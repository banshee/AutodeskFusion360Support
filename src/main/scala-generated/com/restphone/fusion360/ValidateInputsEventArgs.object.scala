
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing ValidateInputsEvent to a ValidateInputsEventHandler's notify callback method. 
 */
@JSName("adsk.core.ValidateInputsEventArgs")
class ValidateInputsEventArgs extends EventArgs {
  /**
  * Used during the AreInputsValid event to get or set if all inputs are valid and the OK button should be enabled.
  */
  var areInputsValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



}
/** 
  * Provides a set of arguments from a firing ValidateInputsEvent to a ValidateInputsEventHandler's notify callback method. 
 */
@JSName("adsk.core.ValidateInputsEventArgs")
object ValidateInputsEventArgs extends js.Object {
  /**
  * Used during the AreInputsValid event to get or set if all inputs are valid and the OK button should be enabled.
  */
  var areInputsValid: Boolean = js.native
}

  object ValidateInputsEventArgsUtilities {
    // no toSeq

  }
       
