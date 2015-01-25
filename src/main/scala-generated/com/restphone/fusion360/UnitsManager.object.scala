
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Utility class used to work with Values and control default units. Internal values are held in SI units (e.g. seconds, radians, kg for time, angle, mass) with the exception that all lengths are in cm rather than meter and this affects derived units (e.g. velocity is cm/s, volume is cm^3). Units are specified flexibility via strings (e.g. "cm", "in", "inch", "cm^3", "cm*cm*cm", "mph", "mps" "m/s"). Units like length can be defaulted based on the design settings if the user does not explicitly specify units - so "3" can be 3 inches, mm or cm depending on what the design settings are. 
 */
@JSName("adsk.core.UnitsManager")
trait UnitsManager extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Converts a value from one unit to another. The input and output unit specifiers must be compatible. For example, "in" (inches) and "cm" (centimeters) will work because they both define length. So Convert(1.5, "in", "ft") -&gt; 0.125 Convert(1.5, "defaultLength", "cm") -&gt; depends on the DistanceUnits, with "mm" it gives 0.15 So Convert(1.5, "in", "kg") -&gt; -1 and GetLastError returns ExpressionError (to denote error) So Convert(1, "in", "internalUnits") -&gt; 2.54 So Convert(1, "internalUnits", "in") -&gt; 0.3937...
  */
  def convert(valueInInputUnits: double, inputUnits: String, outputUnits: String): double = js.native
  /**
  * Returns strings like "DefaultLength" that can be used for a Unit. These strings can be used to set the default and display for units and will vary with the design.
  */
  val defaultLength: String = js.native
  /**
  * Returns the unit strings for "defaultLength" and the like - e.g. "cm" or "in"
  */
  val defaultLengthUnits: String = js.native
  /**
  * Gets the value (in internal units) of the expression.
  */
  def evaluateExpression(expression: String, units: String): double = js.native
  /**
  * Formats the internal value as a string. The output string is formatted using the current unit settings in preferences. The preferences control the number of decimal places, whether units are abbreviated and several other things. FormatInternalValue(1.5, "in") -&gt; "0.591 in" FormatInternalValue(1.5, "in", false) -&gt; "0.591" FormatInternalValue(1.5, "mm", true) -&gt; "15.00 mm" FormatInternalValue(1.5) -&gt; depends on DistanceUnits, might be "15.0 mm"
  */
  def formatInternalValue(internalValue: double, displayUnits: String): String = js.native
  /**
  * Formats the internal value as a string. The output string is formatted using the current unit settings in preferences. The preferences control the number of decimal places, whether units are abbreviated and several other things. FormatInternalValue(1.5, "in") -&gt; "0.591 in" FormatInternalValue(1.5, "in", false) -&gt; "0.591" FormatInternalValue(1.5, "mm", true) -&gt; "15.00 mm" FormatInternalValue(1.5) -&gt; depends on DistanceUnits, might be "15.0 mm"
  */
  def formatInternalValue(internalValue: double, displayUnits: String, /* optional */ showUnits: Boolean): String = js.native
  /**
  * Formats the unit according to the user preferences "centimeter" -&gt; "cm" "inch" -&gt; "in" "cm* cm *cm / s" -&gt; , "cm^3 / s"
  */
  def formatUnits(units: String): String = js.native
  /**
  * Returns a string that represents internal units - i.e. "internalUnits". This can be used when performing conversions via Convert.
  */
  val internalUnits: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Checks to see if the given expression is valid.
  */
  def isValidExpression(expression: String, units: String): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Product.
  */
  val product: Product = js.native
  /**
  * Standardizes the expression in terms of spacing and user preferences. StandardizeExpression("1.5") -&gt; depends on distance units, but with mmight be "1.5 mm" StandardizeExpression("1.5", "in") -&gt; "1.5 in" StandardizeExpression("1.5 cm + 1.50001 centimeter") -&gt; "1.5 cm + 1.50001 cm" StandardizeExpression("1.5", "m * m * m / s") -&gt; "1.5 m^3 /s"
  */
  def standardizeExpression(expression: String, units: String): String = js.native
}
/** 
  * Utility class used to work with Values and control default units. Internal values are held in SI units (e.g. seconds, radians, kg for time, angle, mass) with the exception that all lengths are in cm rather than meter and this affects derived units (e.g. velocity is cm/s, volume is cm^3). Units are specified flexibility via strings (e.g. "cm", "in", "inch", "cm^3", "cm*cm*cm", "mph", "mps" "m/s"). Units like length can be defaulted based on the design settings if the user does not explicitly specify units - so "3" can be 3 inches, mm or cm depending on what the design settings are. 
 */
@JSName("adsk.core.UnitsManager")
object UnitsManager extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Converts a value from one unit to another. The input and output unit specifiers must be compatible. For example, "in" (inches) and "cm" (centimeters) will work because they both define length. So Convert(1.5, "in", "ft") -&gt; 0.125 Convert(1.5, "defaultLength", "cm") -&gt; depends on the DistanceUnits, with "mm" it gives 0.15 So Convert(1.5, "in", "kg") -&gt; -1 and GetLastError returns ExpressionError (to denote error) So Convert(1, "in", "internalUnits") -&gt; 2.54 So Convert(1, "internalUnits", "in") -&gt; 0.3937...
  */
  def convert(valueInInputUnits: double, inputUnits: String, outputUnits: String): double = js.native
  /**
  * Returns strings like "DefaultLength" that can be used for a Unit. These strings can be used to set the default and display for units and will vary with the design.
  */
  val defaultLength: String = js.native
  /**
  * Returns the unit strings for "defaultLength" and the like - e.g. "cm" or "in"
  */
  val defaultLengthUnits: String = js.native
  /**
  * Gets the value (in internal units) of the expression.
  */
  def evaluateExpression(expression: String, units: String): double = js.native
  /**
  * Formats the internal value as a string. The output string is formatted using the current unit settings in preferences. The preferences control the number of decimal places, whether units are abbreviated and several other things. FormatInternalValue(1.5, "in") -&gt; "0.591 in" FormatInternalValue(1.5, "in", false) -&gt; "0.591" FormatInternalValue(1.5, "mm", true) -&gt; "15.00 mm" FormatInternalValue(1.5) -&gt; depends on DistanceUnits, might be "15.0 mm"
  */
  def formatInternalValue(internalValue: double, displayUnits: String): String = js.native
  /**
  * Formats the internal value as a string. The output string is formatted using the current unit settings in preferences. The preferences control the number of decimal places, whether units are abbreviated and several other things. FormatInternalValue(1.5, "in") -&gt; "0.591 in" FormatInternalValue(1.5, "in", false) -&gt; "0.591" FormatInternalValue(1.5, "mm", true) -&gt; "15.00 mm" FormatInternalValue(1.5) -&gt; depends on DistanceUnits, might be "15.0 mm"
  */
  def formatInternalValue(internalValue: double, displayUnits: String, /* optional */ showUnits: Boolean): String = js.native
  /**
  * Formats the unit according to the user preferences "centimeter" -&gt; "cm" "inch" -&gt; "in" "cm* cm *cm / s" -&gt; , "cm^3 / s"
  */
  def formatUnits(units: String): String = js.native
  /**
  * Returns a string that represents internal units - i.e. "internalUnits". This can be used when performing conversions via Convert.
  */
  val internalUnits: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Checks to see if the given expression is valid.
  */
  def isValidExpression(expression: String, units: String): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Product.
  */
  val product: Product = js.native
  /**
  * Standardizes the expression in terms of spacing and user preferences. StandardizeExpression("1.5") -&gt; depends on distance units, but with mmight be "1.5 mm" StandardizeExpression("1.5", "in") -&gt; "1.5 in" StandardizeExpression("1.5 cm + 1.50001 centimeter") -&gt; "1.5 cm + 1.50001 cm" StandardizeExpression("1.5", "m * m * m / s") -&gt; "1.5 m^3 /s"
  */
  def standardizeExpression(expression: String, units: String): String = js.native
}
// no utilities
