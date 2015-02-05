
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a AngleExtentDefinition object. This feature extent is defined by an angle as well as whether the extent is symmetric or only in one direction. If the extent is not symmetric, a positive or negative angle can be used to control the direction. 
 */
@JSName("adsk.fusion.AngleExtentDefinition")
class AngleExtentDefinition extends ExtentDefinition {
  /**
  * Gets the ModelParameter that defines the angle
  */
  val angle: ModelParameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets if the angle extent is in one direction or symmetric. For a hole this property will always return false and setting it is ignored.
  */
  var isSymmetric: Boolean = js.native



}
/** 
  * Defines the inputs for a AngleExtentDefinition object. This feature extent is defined by an angle as well as whether the extent is symmetric or only in one direction. If the extent is not symmetric, a positive or negative angle can be used to control the direction. 
 */
@JSName("adsk.fusion.AngleExtentDefinition")
object AngleExtentDefinition extends js.Object {
  /**
  * Gets the ModelParameter that defines the angle
  */
  val angle: ModelParameter = js.native
  /**
  * Gets and sets if the angle extent is in one direction or symmetric. For a hole this property will always return false and setting it is ignored.
  */
  var isSymmetric: Boolean = js.native
}

  object AngleExtentDefinitionUtilities {
    // no toSeq

  }
       
