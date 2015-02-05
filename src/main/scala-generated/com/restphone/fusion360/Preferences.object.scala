
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The Preferences object provides access to the various preference related objects for getting and setting the various preference values. 
 */
@JSName("adsk.core.Preferences")
class Preferences extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the DefaultUnitsPreferences object.
  */
  val defaultUnitsPreferences: DefaultUnitsPreferencesCollection = js.native
  /**
  * Gets the GeneralPreferences object.
  */
  val generalPreferences: GeneralPreferences = js.native
  /**
  * Gets the GraphicsPreferences object.
  */
  val graphicsPreferences: GraphicsPreferences = js.native
  /**
  * Gets the GridPreferences object.
  */
  val gridPreferences: GridPreferences = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the MaterialPreferences object.
  */
  val materialPreferences: MaterialPreferences = js.native
  /**
  * Gets the NetworkPreferences object.
  */
  val networkPreferences: NetworkPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the ProductPreferences object.
  */
  val productPreferences: ProductPreferencesCollection = js.native
  /**
  * Gets the ProductUsageData object.
  */
  val productUsageData: ProductUsageData = js.native
  /**
  * Gets the UnitAndValuePreferences object.
  */
  val unitAndValuePreferences: UnitAndValuePreferences = js.native
}
/** 
  * The Preferences object provides access to the various preference related objects for getting and setting the various preference values. 
 */
@JSName("adsk.core.Preferences")
object Preferences extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the DefaultUnitsPreferences object.
  */
  val defaultUnitsPreferences: DefaultUnitsPreferencesCollection = js.native
  /**
  * Gets the GeneralPreferences object.
  */
  val generalPreferences: GeneralPreferences = js.native
  /**
  * Gets the GraphicsPreferences object.
  */
  val graphicsPreferences: GraphicsPreferences = js.native
  /**
  * Gets the GridPreferences object.
  */
  val gridPreferences: GridPreferences = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the MaterialPreferences object.
  */
  val materialPreferences: MaterialPreferences = js.native
  /**
  * Gets the NetworkPreferences object.
  */
  val networkPreferences: NetworkPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the ProductPreferences object.
  */
  val productPreferences: ProductPreferencesCollection = js.native
  /**
  * Gets the ProductUsageData object.
  */
  val productUsageData: ProductUsageData = js.native
  /**
  * Gets the UnitAndValuePreferences object.
  */
  val unitAndValuePreferences: UnitAndValuePreferences = js.native
}

  object PreferencesUtilities {
    // no toSeq

  }
       
