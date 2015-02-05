
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the product usage data settings. 
 */
@JSName("adsk.core.ProductUsageData")
class ProductUsageData extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if tracking to improve communication is enabled.
  */
  var isTrackingToImproveCommunicationEnabled: Boolean = js.native
  /**
  * Gets and sets if tracking to improve the software is enabled.
  */
  var isTrackingToImproveSoftwareEnabled: Boolean = js.native
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
  * Provides access to the product usage data settings. 
 */
@JSName("adsk.core.ProductUsageData")
object ProductUsageData extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if tracking to improve communication is enabled.
  */
  var isTrackingToImproveCommunicationEnabled: Boolean = js.native
  /**
  * Gets and sets if tracking to improve the software is enabled.
  */
  var isTrackingToImproveSoftwareEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ProductUsageDataUtilities {
    // no toSeq

  }
       
