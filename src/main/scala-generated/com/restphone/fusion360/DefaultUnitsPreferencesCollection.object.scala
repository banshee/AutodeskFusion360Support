
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection that provides access to product specific unit preference objects. 
 */
@JSName("adsk.core.DefaultUnitsPreferencesCollection")
trait DefaultUnitsPreferencesCollection extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of DefaultUnitsPreference objects.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified DefaultUnitPreferences object using an index into the collection.
  */
  def item(index: uinteger): DefaultUnitsPreferences = js.native
  /**
  * Returns the DefaultUnitsPreference object with the specified name.
  */
  def itemByName(name: String): DefaultUnitsPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection that provides access to product specific unit preference objects. 
 */
@JSName("adsk.core.DefaultUnitsPreferencesCollection")
object DefaultUnitsPreferencesCollection extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of DefaultUnitsPreference objects.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified DefaultUnitPreferences object using an index into the collection.
  */
  def item(index: uinteger): DefaultUnitsPreferences = js.native
  /**
  * Returns the DefaultUnitsPreference object with the specified name.
  */
  def itemByName(name: String): DefaultUnitsPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DefaultUnitsPreferencesCollectionUtilities {
    def toSeq(xs: DefaultUnitsPreferencesCollection): IndexedSeq[DefaultUnitsPreferences] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
