
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The NetworkPreferences object provides access to network related preferences. 
 */
@JSName("adsk.core.NetworkPreferences")
class NetworkPreferences extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the network proxy setting.
  */
  var networkProxySetting: NetworkProxySettings = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the proxy host.
  */
  var proxyHost: String = js.native
  /**
  * Gets and sets the proxy host.
  */
  var proxyPort: Integer = js.native
}
/** 
  * The NetworkPreferences object provides access to network related preferences. 
 */
@JSName("adsk.core.NetworkPreferences")
object NetworkPreferences extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the network proxy setting.
  */
  var networkProxySetting: NetworkProxySettings = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the proxy host.
  */
  var proxyHost: String = js.native
  /**
  * Gets and sets the proxy host.
  */
  var proxyPort: Integer = js.native
}

  object NetworkPreferencesUtilities {
    // no toSeq

  }
       
