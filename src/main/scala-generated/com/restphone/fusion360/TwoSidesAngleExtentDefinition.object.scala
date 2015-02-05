
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a TwoSidesAngleExtentDefinition object. This feature extent type defines the extents of the feature using angle extents on two sides. 
 */
@JSName("adsk.fusion.TwoSidesAngleExtentDefinition")
class TwoSidesAngleExtentDefinition extends ExtentDefinition {
  /**
  * Gets the ModelParameter that defines the angle on the first side
  */
  val angleOne: ModelParameter = js.native
  /**
  * Gets the ModelParameter that defines the angle on the second side
  */
  val angleTwo: ModelParameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



}
/** 
  * Defines the inputs for a TwoSidesAngleExtentDefinition object. This feature extent type defines the extents of the feature using angle extents on two sides. 
 */
@JSName("adsk.fusion.TwoSidesAngleExtentDefinition")
object TwoSidesAngleExtentDefinition extends js.Object {
  /**
  * Gets the ModelParameter that defines the angle on the first side
  */
  val angleOne: ModelParameter = js.native
  /**
  * Gets the ModelParameter that defines the angle on the second side
  */
  val angleTwo: ModelParameter = js.native
}

  object TwoSidesAngleExtentDefinitionUtilities {
    // no toSeq

  }
       
