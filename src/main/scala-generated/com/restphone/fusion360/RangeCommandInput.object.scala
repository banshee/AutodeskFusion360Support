
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get the value of a slider from the user. 
 */
@JSName("adsk.core.RangeCommandInput")
trait RangeCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets or sets the expression displayed in the first input field. This can contain equations. It is evaluated using the specified unit type.
  */
  var expressionOne: String = js.native
  /**
  * Gets or sets the expression displayed in the second input field. This can contain equations. It is evaluated using the specified unit type. This property is only available when the hasTwoSliders property returns true.
  */
  var expressionTwo: String = js.native
  /**
  * Gets the texts of the slider if there are.
  */
  def getText(isLeft: Boolean): String = js.native
  /**
  * Gets if the command input has two sliders.
  */
  val hasTwoSliders: Boolean = js.native






  /**
  * Sets the texts of the slider, instead of the values. Both of the left and right texts should be not empty when set texts, otherwise get a failure.
  */
  def setText(left: String, right: String): Boolean = js.native
  /**
  * Gets the unit type that is used when evaluating the user's input.
  */
  val unitType: String = js.native
}
/** 
  * Provides a command input to get the value of a slider from the user. 
 */
@JSName("adsk.core.RangeCommandInput")
object RangeCommandInput extends js.Object {
  /**
  * Gets or sets the expression displayed in the first input field. This can contain equations. It is evaluated using the specified unit type.
  */
  var expressionOne: String = js.native
  /**
  * Gets or sets the expression displayed in the second input field. This can contain equations. It is evaluated using the specified unit type. This property is only available when the hasTwoSliders property returns true.
  */
  var expressionTwo: String = js.native
  /**
  * Gets the texts of the slider if there are.
  */
  def getText(isLeft: Boolean): String = js.native
  /**
  * Gets if the command input has two sliders.
  */
  val hasTwoSliders: Boolean = js.native
  /**
  * Sets the texts of the slider, instead of the values. Both of the left and right texts should be not empty when set texts, otherwise get a failure.
  */
  def setText(left: String, right: String): Boolean = js.native
  /**
  * Gets the unit type that is used when evaluating the user's input.
  */
  val unitType: String = js.native
}
// no utilities
