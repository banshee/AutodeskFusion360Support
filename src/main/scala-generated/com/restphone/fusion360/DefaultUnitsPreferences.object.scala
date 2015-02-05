
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for the default units preference. There is a derived class supported by each product where the specific preference values are exposed. 
 */
@JSName("adsk.core.DefaultUnitsPreferences")
class DefaultUnitsPreferences extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this DefaultUnitPreferences object.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The base class for the default units preference. There is a derived class supported by each product where the specific preference values are exposed. 
 */
@JSName("adsk.core.DefaultUnitsPreferences")
object DefaultUnitsPreferences extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this DefaultUnitPreferences object.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DefaultUnitsPreferencesUtilities {
    // no toSeq

  }
       
