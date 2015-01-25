
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a list of properties that define a texture. 
 */
@JSName("adsk.core.AppearanceTexture")
trait AppearanceTexture extends Base {
  /**
  * Changes the image of this texture.
  */
  def changeTextureImage(imageFilename: String): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a collection of the properties associated with this texture.
  */
  val properties: Properties = js.native
  /**
  * Gets the type of texture this appearance currently is.
  */
  val textureType: TextureTypes = js.native
}
/** 
  * Provides access to a list of properties that define a texture. 
 */
@JSName("adsk.core.AppearanceTexture")
object AppearanceTexture extends js.Object {
  /**
  * Changes the image of this texture.
  */
  def changeTextureImage(imageFilename: String): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a collection of the properties associated with this texture.
  */
  val properties: Properties = js.native
  /**
  * Gets the type of texture this appearance currently is.
  */
  val textureType: TextureTypes = js.native
}
// no utilities
