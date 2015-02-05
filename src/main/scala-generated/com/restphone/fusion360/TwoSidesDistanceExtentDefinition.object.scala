
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a TwoSidesDistanceExtentDefinition object. This defines a feature extent where the distance in each direction can be a different value. 
 */
@JSName("adsk.fusion.TwoSidesDistanceExtentDefinition")
class TwoSidesDistanceExtentDefinition extends ExtentDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the ModelParameter that defines the first distance
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the ModelParameter that defines the second distance
  */
  val distanceTwo: ModelParameter = js.native



}
/** 
  * Defines the inputs for a TwoSidesDistanceExtentDefinition object. This defines a feature extent where the distance in each direction can be a different value. 
 */
@JSName("adsk.fusion.TwoSidesDistanceExtentDefinition")
object TwoSidesDistanceExtentDefinition extends js.Object {
  /**
  * Gets the ModelParameter that defines the first distance
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the ModelParameter that defines the second distance
  */
  val distanceTwo: ModelParameter = js.native
}

  object TwoSidesDistanceExtentDefinitionUtilities {
    // no toSeq

  }
       
