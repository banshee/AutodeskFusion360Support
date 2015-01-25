
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The UnitAndValuePreferences object provides access to unit and value precision related preferences. 
 */
@JSName("adsk.core.UnitAndValuePreferences")
trait UnitAndValuePreferences extends Base {
  /**
  * Gets and sets the angular precision.
  */
  var angularPrecision: Integer = js.native
  /**
  * Gets and sets if abbreviations are used for units display.
  */
  var areAbbreviationsForUnitDisplayed: Boolean = js.native
  /**
  * Gets and sets if symbols are used for units display.
  */
  var areSymbolsForUnitDisplayed: Boolean = js.native
  /**
  * Gets and sets if trailing zeros are hidden when displaying numbers.
  */
  var areTrailingZerosHidden: Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the degree display format.
  */
  var degreeDisplayFormat: DegreeDisplayFormats = js.native
  /**
  * Gets and sets the foot and inch display format.
  */
  var footAndInchDisplayFormat: FootAndInchDisplayFormats = js.native
  /**
  * Gets and sets the general precision for distance values.
  */
  var generalPrecision: Integer = js.native
  /**
  * Gets and sets if the decimal is a period or comma.
  */
  var isPeriodDecimalPoint: Boolean = js.native
  /**
  * Gets and sets if scientific notation is used when displaying numbers.
  */
  var isScientificNotationUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the units types to use when displaying values.
  */
  var materialDisplayUnit: MaterialDisplayUnits = js.native
  /**
  * Gets and sets the minimum number of digits to right of the decimal to display then hiding trailing zeros.
  */
  var minimumPrecisionWhenHidingZeros: Integer = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the number scientific notation precision.
  */
  var scientificNotationPrecision: Integer = js.native
  /**
  * Gets and sets the maximum value a number can be before it will be shown using scientific notation.
  */
  var useScientficNotationAbove: Integer = js.native
  /**
  * Gets and sets the minimum value a number can be before it will be shown using scientific notation.
  */
  var useScientficNotationBelow: Integer = js.native
}
/** 
  * The UnitAndValuePreferences object provides access to unit and value precision related preferences. 
 */
@JSName("adsk.core.UnitAndValuePreferences")
object UnitAndValuePreferences extends js.Object {
  /**
  * Gets and sets the angular precision.
  */
  var angularPrecision: Integer = js.native
  /**
  * Gets and sets if abbreviations are used for units display.
  */
  var areAbbreviationsForUnitDisplayed: Boolean = js.native
  /**
  * Gets and sets if symbols are used for units display.
  */
  var areSymbolsForUnitDisplayed: Boolean = js.native
  /**
  * Gets and sets if trailing zeros are hidden when displaying numbers.
  */
  var areTrailingZerosHidden: Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the degree display format.
  */
  var degreeDisplayFormat: DegreeDisplayFormats = js.native
  /**
  * Gets and sets the foot and inch display format.
  */
  var footAndInchDisplayFormat: FootAndInchDisplayFormats = js.native
  /**
  * Gets and sets the general precision for distance values.
  */
  var generalPrecision: Integer = js.native
  /**
  * Gets and sets if the decimal is a period or comma.
  */
  var isPeriodDecimalPoint: Boolean = js.native
  /**
  * Gets and sets if scientific notation is used when displaying numbers.
  */
  var isScientificNotationUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the units types to use when displaying values.
  */
  var materialDisplayUnit: MaterialDisplayUnits = js.native
  /**
  * Gets and sets the minimum number of digits to right of the decimal to display then hiding trailing zeros.
  */
  var minimumPrecisionWhenHidingZeros: Integer = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the number scientific notation precision.
  */
  var scientificNotationPrecision: Integer = js.native
  /**
  * Gets and sets the maximum value a number can be before it will be shown using scientific notation.
  */
  var useScientficNotationAbove: Integer = js.native
  /**
  * Gets and sets the minimum value a number can be before it will be shown using scientific notation.
  */
  var useScientficNotationBelow: Integer = js.native
}
// no utilities
