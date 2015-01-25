
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get a string value from the user. 
 */
@JSName("adsk.core.StringValueCommandInput")
trait StringValueCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native







  /**
  * Gets or set the value of this input.
  */
  var value: String = js.native
}
/** 
  * Provides a command input to get a string value from the user. 
 */
@JSName("adsk.core.StringValueCommandInput")
object StringValueCommandInput extends js.Object {
  /**
  * Gets or set the value of this input.
  */
  var value: String = js.native
}
// no utilities
