
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get the value of a slider from the user, the value type is float. 
 */
@JSName("adsk.core.RangeCommandFloatInput")
class RangeCommandFloatInput extends RangeCommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the texts of the slider if there are.
  */
  override def getText(isLeft: Boolean): String = js.native





  /**
  * Gets and sets maximum value of the slider. Get a failure when set the value if this command input was added by value list.
  */
  var maxValue: double = js.native
  /**
  * Gets and sets minimum value of the slider. Get a failure when set the value if this command input was added by value list.
  */
  var minValue: double = js.native


  /**
  * Sets the texts of the slider, instead of the values. Both of the left and right texts should be not empty when set texts, otherwise get a failure.
  */
  override def setText(left: String, right: String): Boolean = js.native
  /**
  * Gets and sets the spin step. The value should be more than zero.
  */
  var spinStep: double = js.native

  /**
  * Gets the value list of the slider. The list is empty if this command input was not added by value list.
  */
  val valueList: Double = js.native
  /**
  * Gets or sets the first value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned.
  */
  var valueOne: double = js.native
  /**
  * Gets or sets the second value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned. This property is only available when the hasTwoSliders property returns true.
  */
  var valueTwo: double = js.native
}
/** 
  * Provides a command input to get the value of a slider from the user, the value type is float. 
 */
@JSName("adsk.core.RangeCommandFloatInput")
object RangeCommandFloatInput extends js.Object {
  /**
  * Gets and sets maximum value of the slider. Get a failure when set the value if this command input was added by value list.
  */
  var maxValue: double = js.native
  /**
  * Gets and sets minimum value of the slider. Get a failure when set the value if this command input was added by value list.
  */
  var minValue: double = js.native
  /**
  * Gets and sets the spin step. The value should be more than zero.
  */
  var spinStep: double = js.native
  /**
  * Gets the value list of the slider. The list is empty if this command input was not added by value list.
  */
  val valueList: Double = js.native
  /**
  * Gets or sets the first value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned.
  */
  var valueOne: double = js.native
  /**
  * Gets or sets the second value associated with this input. The value is always in the database units of the unit type specified. For example, if the unit type is "inch" this value is in centimeters since centimeters are the database length unit. When setting the value it is converted into a string using the unit type and displayed in the input box. When getting the value, the current expression string is evaluated and the database value for the unit type is returned. This property is only available when the hasTwoSliders property returns true.
  */
  var valueTwo: double = js.native
}

  object RangeCommandFloatInputUtilities {
    // no toSeq

  }
       
