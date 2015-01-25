
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a AllExtentDefinition object. This defines a feature extent where the direction can be positive, negative, or symmetric. Setting the direction to Symmetric specifies that the extrusion is through-all, and goes in both directions. 
 */
@JSName("adsk.fusion.AllExtentDefinition")
trait AllExtentDefinition extends ExtentDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets the direction of the extent.
  */
  var direction: ExtentDirections = js.native



}
/** 
  * Defines the inputs for a AllExtentDefinition object. This defines a feature extent where the direction can be positive, negative, or symmetric. Setting the direction to Symmetric specifies that the extrusion is through-all, and goes in both directions. 
 */
@JSName("adsk.fusion.AllExtentDefinition")
object AllExtentDefinition extends js.Object {
  /**
  * Gets and sets the direction of the extent.
  */
  var direction: ExtentDirections = js.native
}
// no utilities
