
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Fusion Default Units for Design Preferences 
 */
@JSName("adsk.fusion.FusionDefaultUnitsPreferences")
trait FusionDefaultUnitsPreferences extends DefaultUnitsPreferences {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets the default units for length when creating a new Fusion file.
  */
  var distanceDisplayUnits: DistanceUnits = js.native



}
/** 
  * Fusion Default Units for Design Preferences 
 */
@JSName("adsk.fusion.FusionDefaultUnitsPreferences")
object FusionDefaultUnitsPreferences extends js.Object {
  /**
  * Gets and sets the default units for length when creating a new Fusion file.
  */
  var distanceDisplayUnits: DistanceUnits = js.native
}
// no utilities
