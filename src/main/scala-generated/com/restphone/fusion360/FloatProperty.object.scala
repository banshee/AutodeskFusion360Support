
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A float or real value property associated with a material or appearance. 
 */
@JSName("adsk.core.FloatProperty")
class FloatProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the associated texture, if one exists. The HasConnectedTexture property controls if there is an associated texture or not. If it's parent writable you can edit the texture. If no texture exists, this property will return Nothing.
  */
  val connectedTexture: AppearanceTexture = js.native
  /**
  * Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
  */
  def getLimits(/* out */ hasLowLimit: Boolean, /* out */ lowLimit: double, /* out */ hasHighLimit: Boolean, /* out */ highLimit: double): Boolean = js.native
  /**
  * Gets and sets the boolean flag that indicates if the float value has been overridden using a texture. Setting this property to False will remove the texture so that a float value is used. Setting this property to True will connect a texture to this float value.
  */
  var hasConnectedTexture: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if the value of this property has any limits it must be within to be valid. If True, use the GetLimits method to get the limit values.
  */
  val hasLimits: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native

  /**
  * Gets the boolean flag that indicates that this property represents a percentage value so the valid values must be in the range of 0.0 to 1.0 unless they’re further limited by additional limits which can be determined with the HasLimits property.
  */
  val isPercentage: Boolean = js.native





  /**
  * Gets the units that the value of this property is returned in. The String returned is a valid Fusion unit string.
  */
  val units: String = js.native
  /**
  * Gets and sets this property value. The value of this property should be ignored if the HasConnectedTexture property is true. Setting this will remove any associated texture, if there is one.
  */
  var value: double = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Double = js.native
}
/** 
  * A float or real value property associated with a material or appearance. 
 */
@JSName("adsk.core.FloatProperty")
object FloatProperty extends js.Object {
  /**
  * Gets the associated texture, if one exists. The HasConnectedTexture property controls if there is an associated texture or not. If it's parent writable you can edit the texture. If no texture exists, this property will return Nothing.
  */
  val connectedTexture: AppearanceTexture = js.native
  /**
  * Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
  */
  def getLimits(/* out */ hasLowLimit: Boolean, /* out */ lowLimit: double, /* out */ hasHighLimit: Boolean, /* out */ highLimit: double): Boolean = js.native
  /**
  * Gets and sets the boolean flag that indicates if the float value has been overridden using a texture. Setting this property to False will remove the texture so that a float value is used. Setting this property to True will connect a texture to this float value.
  */
  var hasConnectedTexture: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if the value of this property has any limits it must be within to be valid. If True, use the GetLimits method to get the limit values.
  */
  val hasLimits: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native
  /**
  * Gets the boolean flag that indicates that this property represents a percentage value so the valid values must be in the range of 0.0 to 1.0 unless they’re further limited by additional limits which can be determined with the HasLimits property.
  */
  val isPercentage: Boolean = js.native
  /**
  * Gets the units that the value of this property is returned in. The String returned is a valid Fusion unit string.
  */
  val units: String = js.native
  /**
  * Gets and sets this property value. The value of this property should be ignored if the HasConnectedTexture property is true. Setting this will remove any associated texture, if there is one.
  */
  var value: double = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Double = js.native
}

  object FloatPropertyUtilities {
    // no toSeq
/**
* Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
*
* Out parameters are returned in a tuple.
*/
def getLimitsWithResults(activeObject: FloatProperty): (Boolean, boolean, double, boolean, double) = {

val hasLowLimit = js.Dynamic.literal(value = 0)
val lowLimit = js.Dynamic.literal(value = 0)
val hasHighLimit = js.Dynamic.literal(value = 0)
val highLimit = js.Dynamic.literal(value = 0)
val result = activeObject.getLimits(hasLowLimit.asInstanceOf[Boolean], lowLimit.asInstanceOf[double], hasHighLimit.asInstanceOf[Boolean], highLimit.asInstanceOf[double])
(result, hasLowLimit.value.asInstanceOf[boolean], lowLimit.value.asInstanceOf[double], hasHighLimit.value.asInstanceOf[boolean], highLimit.value.asInstanceOf[double])
}
  }
       
