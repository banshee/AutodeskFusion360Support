
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A color property associated with an appearance. 
 */
@JSName("adsk.core.ColorProperty")
class ColorProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the associated texture, if one exists. The HasConnectedTexture property controls if there is an associated texture or not. If the parent is writable you can edit the texture. If no texture exists, this property will return null.
  */
  val connectedTexture: AppearanceTexture = js.native
  /**
  * Specifies if this color is specified using a simple color or a texture. If this returns true the color is defined using a texture. If the parent is writable, this property can be set to true to change the definition from a simple color to a texture. You can then use the ConnectedTexture property to get the associated texture and modify it.
  */
  var hasConnectedTexture: Boolean = js.native
  /**
  * Indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native






  /**
  * Gets and sets this property value if there is a color and not a texture defining this color . If a texture is used, this property returns null. Setting this property when a texture is used removes the texture and changes the color definition to a simple color.
  */
  var value: Color = js.native
  /**
  * Gets and sets the values associated with this property. The HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Color = js.native
}
/** 
  * A color property associated with an appearance. 
 */
@JSName("adsk.core.ColorProperty")
object ColorProperty extends js.Object {
  /**
  * Gets the associated texture, if one exists. The HasConnectedTexture property controls if there is an associated texture or not. If the parent is writable you can edit the texture. If no texture exists, this property will return null.
  */
  val connectedTexture: AppearanceTexture = js.native
  /**
  * Specifies if this color is specified using a simple color or a texture. If this returns true the color is defined using a texture. If the parent is writable, this property can be set to true to change the definition from a simple color to a texture. You can then use the ConnectedTexture property to get the associated texture and modify it.
  */
  var hasConnectedTexture: Boolean = js.native
  /**
  * Indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native
  /**
  * Gets and sets this property value if there is a color and not a texture defining this color . If a texture is used, this property returns null. Setting this property when a texture is used removes the texture and changes the color definition to a simple color.
  */
  var value: Color = js.native
  /**
  * Gets and sets the values associated with this property. The HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Color = js.native
}

  object ColorPropertyUtilities {
    // no toSeq

  }
       
