
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An integer value property associated with a material or appearance. 
 */
@JSName("adsk.core.IntegerProperty")
class IntegerProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
  */
  def getLimits(/* out */ hasLowLimit: Boolean, /* out */ lowLimit: Integer, /* out */ hasHighLimit: Boolean, /* out */ highLimit: Integer): Boolean = js.native
  /**
  * Gets the boolean flag that indicates if the value of this property has any limits it must be within to be valid. If True, use the GetLimits method to get the limit values.
  */
  val hasLimits: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native






  /**
  * Gets and sets this property value. The value of this property should be ignored if the HasConnectedTexture property is true. Setting this will remove any associated texture, if there is one.
  */
  var value: Integer = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Int32 = js.native
}
/** 
  * An integer value property associated with a material or appearance. 
 */
@JSName("adsk.core.IntegerProperty")
object IntegerProperty extends js.Object {
  /**
  * Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
  */
  def getLimits(/* out */ hasLowLimit: Boolean, /* out */ lowLimit: Integer, /* out */ hasHighLimit: Boolean, /* out */ highLimit: Integer): Boolean = js.native
  /**
  * Gets the boolean flag that indicates if the value of this property has any limits it must be within to be valid. If True, use the GetLimits method to get the limit values.
  */
  val hasLimits: Boolean = js.native
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native
  /**
  * Gets and sets this property value. The value of this property should be ignored if the HasConnectedTexture property is true. Setting this will remove any associated texture, if there is one.
  */
  var value: Integer = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: Int32 = js.native
}

  object IntegerPropertyUtilities {
    // no toSeq
/**
* Method that returns any limits for the value of this property. The HasLimits property can be used to see if there are any limits or not.
*
* Out parameters are returned in a tuple.
*/
def getLimitsWithResults(activeObject: IntegerProperty): (Boolean, boolean, integer, boolean, integer) = {

val hasLowLimit = js.Dynamic.literal(value = 0)
val lowLimit = js.Dynamic.literal(value = 0)
val hasHighLimit = js.Dynamic.literal(value = 0)
val highLimit = js.Dynamic.literal(value = 0)
val result = activeObject.getLimits(hasLowLimit.asInstanceOf[Boolean], lowLimit.asInstanceOf[Integer], hasHighLimit.asInstanceOf[Boolean], highLimit.asInstanceOf[Integer])
(result, hasLowLimit.value.asInstanceOf[boolean], lowLimit.value.asInstanceOf[integer], hasHighLimit.value.asInstanceOf[boolean], highLimit.value.asInstanceOf[integer])
}
  }
       
