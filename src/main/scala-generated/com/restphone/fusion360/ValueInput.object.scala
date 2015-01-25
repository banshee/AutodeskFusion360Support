
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A ValueInput provides a flexible way of specifying a string or a double. No semantics are associated with a ValueInput (e.g. is the string valid, can the string be converted to a double) - it is merely a way of supplying information in either string OR double form as a function parameter. ValueInput objects are typically used to specify things like an extrude depth, or hole dia, etc. 
 */
@JSName("adsk.core.ValueInput")
trait ValueInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new ValueInput object using a double. For example, if you create a value using the double value 2 and use it as input for a length, it will be interpreted as 2 cm because centimeters are the internal unit for length. Values defined by a real are are always interpreted to be in the appropriate internal unit. For example, if the value 2 is used to define the depth of an extrusion (a length value), it will be 2 cm because cm is the internal unit for lengths. If the value 2 is used to define the angle of the extrude, it will be 2 radians because radians are the internal unit for angles.
  */
  def createByReal(realValue: double): ValueInput = js.native
  /**
  * When a string is used to create a value it needs to be evaluated as an expression so its value can be determined using the UnitsManager class. The units of an expression can be explicitly defined or will default to the current default units. For example, if you create an expression with the string "6" and specify it as a length, it will use the current active units. If the current active units are defined as inches the expression will be interpreted as 6 inches. You can specify the units as part of the string (i.e. "6 mm"). You can also use equations in the string (ie. "6 + 5mm") In order for an expression to be valid, its units must be compatible with the value it represents. For example if you specify "5 in + 3 cm" as an expresssion to supply the value of an angle, it will fail because the units of the expression define a length.
  */
  def createByString(stringValue: String): ValueInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the real value (if there is one) in this object. Returns -1 AND GetLastError returns ValueNotOfType if there is no real value in this object.
  */
  val realValue: double = js.native
  /**
  * Gets the string value (if there is one) in this object. Returns an empty string AND GetLastError returns ValueNotOfType if there is no string value in this object.
  */
  val stringValue: String = js.native
}
/** 
  * A ValueInput provides a flexible way of specifying a string or a double. No semantics are associated with a ValueInput (e.g. is the string valid, can the string be converted to a double) - it is merely a way of supplying information in either string OR double form as a function parameter. ValueInput objects are typically used to specify things like an extrude depth, or hole dia, etc. 
 */
@JSName("adsk.core.ValueInput")
object ValueInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new ValueInput object using a double. For example, if you create a value using the double value 2 and use it as input for a length, it will be interpreted as 2 cm because centimeters are the internal unit for length. Values defined by a real are are always interpreted to be in the appropriate internal unit. For example, if the value 2 is used to define the depth of an extrusion (a length value), it will be 2 cm because cm is the internal unit for lengths. If the value 2 is used to define the angle of the extrude, it will be 2 radians because radians are the internal unit for angles.
  */
  def createByReal(realValue: double): ValueInput = js.native
  /**
  * When a string is used to create a value it needs to be evaluated as an expression so its value can be determined using the UnitsManager class. The units of an expression can be explicitly defined or will default to the current default units. For example, if you create an expression with the string "6" and specify it as a length, it will use the current active units. If the current active units are defined as inches the expression will be interpreted as 6 inches. You can specify the units as part of the string (i.e. "6 mm"). You can also use equations in the string (ie. "6 + 5mm") In order for an expression to be valid, its units must be compatible with the value it represents. For example if you specify "5 in + 3 cm" as an expresssion to supply the value of an angle, it will fail because the units of the expression define a length.
  */
  def createByString(stringValue: String): ValueInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the real value (if there is one) in this object. Returns -1 AND GetLastError returns ValueNotOfType if there is no real value in this object.
  */
  val realValue: double = js.native
  /**
  * Gets the string value (if there is one) in this object. Returns an empty string AND GetLastError returns ValueNotOfType if there is no string value in this object.
  */
  val stringValue: String = js.native
}
// no utilities
