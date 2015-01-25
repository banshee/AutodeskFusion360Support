
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A texture value property associated with a material or appearance. 
 */
@JSName("adsk.core.AppearanceTextureProperty")
trait AppearanceTextureProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native






  /**
  * Gets and sets this property value.
  */
  var value: AppearanceTexture = js.native
}
/** 
  * A texture value property associated with a material or appearance. 
 */
@JSName("adsk.core.AppearanceTextureProperty")
object AppearanceTextureProperty extends js.Object {
  /**
  * Gets and sets this property value.
  */
  var value: AppearanceTexture = js.native
}
// no utilities
