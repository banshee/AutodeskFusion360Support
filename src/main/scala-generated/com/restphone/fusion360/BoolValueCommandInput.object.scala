
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get a boolean value from the user. 
 */
@JSName("adsk.core.BoolValueCommandInput")
trait BoolValueCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native







  /**
  * Gets or sets the state of this input. If it's being displayed as a checkbox a value of true indicates the input is checked. If it's being displayed as a button, a value of true indicates the button is currently depressed.
  */
  var value: Boolean = js.native
}
/** 
  * Provides a command input to get a boolean value from the user. 
 */
@JSName("adsk.core.BoolValueCommandInput")
object BoolValueCommandInput extends js.Object {
  /**
  * Gets or sets the state of this input. If it's being displayed as a checkbox a value of true indicates the input is checked. If it's being displayed as a button, a value of true indicates the button is currently depressed.
  */
  var value: Boolean = js.native
}
// no utilities
