
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The Color class wraps all of the information that defines a simple color. 
 */
@JSName("adsk.core.Color")
trait Color extends Base {
  /**
  * Gets and sets the blue component of the color. The value can be 0 to 255.
  */
  var blue: short = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new color.
  */
  def create(red: short, green: short, blue: short, opacity: short): Color = js.native
  /**
  * Gets all of the information defining this color.
  */
  def getColor(/* out */ red: short, /* out */ green: short, /* out */ blue: short, /* out */ opacity: short): Boolean = js.native
  /**
  * Gets and sets the green component of the color. The value can be 0 to 255.
  */
  var green: short = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the opacity of the color. The value can be 0 to 255.
  */
  var opacity: short = js.native
  /**
  * Gets and sets the red component of the color. The value can be 0 to 255.
  */
  var red: short = js.native
  /**
  * Sets all of the color information.
  */
  def setColor(red: short, green: short, blue: short, opacity: short): Boolean = js.native
}
/** 
  * The Color class wraps all of the information that defines a simple color. 
 */
@JSName("adsk.core.Color")
object Color extends js.Object {
  /**
  * Gets and sets the blue component of the color. The value can be 0 to 255.
  */
  var blue: short = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new color.
  */
  def create(red: short, green: short, blue: short, opacity: short): Color = js.native
  /**
  * Gets all of the information defining this color.
  */
  def getColor(/* out */ red: short, /* out */ green: short, /* out */ blue: short, /* out */ opacity: short): Boolean = js.native
  /**
  * Gets and sets the green component of the color. The value can be 0 to 255.
  */
  var green: short = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the opacity of the color. The value can be 0 to 255.
  */
  var opacity: short = js.native
  /**
  * Gets and sets the red component of the color. The value can be 0 to 255.
  */
  var red: short = js.native
  /**
  * Sets all of the color information.
  */
  def setColor(red: short, green: short, blue: short, opacity: short): Boolean = js.native
}
// no utilities
