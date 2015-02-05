
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get a unit based value from the user. 
 */
@JSName("adsk.core.ValueCommandInput")
class ValueCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets or sets the expression displayed in the input field. This can contain equations and references to parameters. It is evaluated using the specified unit type.
  */
  var expression: String = js.native






  /**
  * Gets the unit type that is used when evaluating the user's input.
  */
  val unitType: String = js.native
  /**
  * Gets or sets the value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned.
  */
  var value: double = js.native
}
/** 
  * Provides a command input to get a unit based value from the user. 
 */
@JSName("adsk.core.ValueCommandInput")
object ValueCommandInput extends js.Object {
  /**
  * Gets or sets the expression displayed in the input field. This can contain equations and references to parameters. It is evaluated using the specified unit type.
  */
  var expression: String = js.native
  /**
  * Gets the unit type that is used when evaluating the user's input.
  */
  val unitType: String = js.native
  /**
  * Gets or sets the value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned.
  */
  var value: double = js.native
}

  object ValueCommandInputUtilities {
    // no toSeq

  }
       
