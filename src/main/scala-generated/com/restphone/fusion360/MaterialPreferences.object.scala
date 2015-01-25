
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the material related preferences. 
 */
@JSName("adsk.core.MaterialPreferences")
trait MaterialPreferences extends Base {
  /**
  * Gets and sets an appearance override. This property return null indicating that there is no override, or be set to null to remove the current appearance override.
  */
  var appearanceOverride: Appearance = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the default material.
  */
  var defaultMaterial: Material = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the material related preferences. 
 */
@JSName("adsk.core.MaterialPreferences")
object MaterialPreferences extends js.Object {
  /**
  * Gets and sets an appearance override. This property return null indicating that there is no override, or be set to null to remove the current appearance override.
  */
  var appearanceOverride: Appearance = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the default material.
  */
  var defaultMaterial: Material = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
