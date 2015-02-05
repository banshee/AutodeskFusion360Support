
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a distance ExtentDefinition object. This feature extent type defines the distance as well as whether the extent is symmetric or in only one direction. If the extent is not symmetric, a positive or negative distance can be used to control the direction. For a hole, the IsSymmetric property value will always be false. 
 */
@JSName("adsk.fusion.DistanceExtentDefinition")
class DistanceExtentDefinition extends ExtentDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the parameter controlling the distance. You can edit the distance by editing the value of the parameter object.
  */
  val distance: ModelParameter = js.native
  /**
  * Gets and sets if the distance extent is symmetric or not For a hole this property will always return false and setting it is ignored.
  */
  var isSymmetric: Boolean = js.native



}
/** 
  * Defines the inputs for a distance ExtentDefinition object. This feature extent type defines the distance as well as whether the extent is symmetric or in only one direction. If the extent is not symmetric, a positive or negative distance can be used to control the direction. For a hole, the IsSymmetric property value will always be false. 
 */
@JSName("adsk.fusion.DistanceExtentDefinition")
object DistanceExtentDefinition extends js.Object {
  /**
  * Returns the parameter controlling the distance. You can edit the distance by editing the value of the parameter object.
  */
  val distance: ModelParameter = js.native
  /**
  * Gets and sets if the distance extent is symmetric or not For a hole this property will always return false and setting it is ignored.
  */
  var isSymmetric: Boolean = js.native
}

  object DistanceExtentDefinitionUtilities {
    // no toSeq

  }
       
