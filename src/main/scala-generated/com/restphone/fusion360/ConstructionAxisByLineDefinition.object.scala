
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a non-parametric construction axis. In a non-parametric design all construction planes will return this type of definition regardless of how they were initially created. 
 */
@JSName("adsk.fusion.ConstructionAxisByLineDefinition")
trait ConstructionAxisByLineDefinition extends ConstructionAxisDefinition {
  /**
  * Gets and sets the infinite line that defines the position and direction of the axis
  */
  var axis: InfiniteLine3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



}
/** 
  * The definition for a non-parametric construction axis. In a non-parametric design all construction planes will return this type of definition regardless of how they were initially created. 
 */
@JSName("adsk.fusion.ConstructionAxisByLineDefinition")
object ConstructionAxisByLineDefinition extends js.Object {
  /**
  * Gets and sets the infinite line that defines the position and direction of the axis
  */
  var axis: InfiniteLine3D = js.native
}
// no utilities
