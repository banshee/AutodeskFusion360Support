
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetbyCircularFace method 
 */
@JSName("adsk.fusion.ConstructionAxisCircularFaceDefinition")
trait ConstructionAxisCircularFaceDefinition extends ConstructionAxisDefinition {
  /**
  * Gets and sets the cylinder, cone, or torus this work axis is parametrically dependent on.
  */
  var circularFace: BRepFace = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



}
/** 
  * The definition for a parametric construction axis created using the SetbyCircularFace method 
 */
@JSName("adsk.fusion.ConstructionAxisCircularFaceDefinition")
object ConstructionAxisCircularFaceDefinition extends js.Object {
  /**
  * Gets and sets the cylinder, cone, or torus this work axis is parametrically dependent on.
  */
  var circularFace: BRepFace = js.native
}
// no utilities
