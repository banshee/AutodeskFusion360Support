
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneTangentDefinition defines a ConstructionPlane tangent to a cylindrical or conical face at a point. 
 */
@JSName("adsk.fusion.ConstructionPlaneTangentDefinition")
trait ConstructionPlaneTangentDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a Value object that for a transient definition provides the current assigned value. For a definition associated with a construction plane, it provides access to the associated parameter controlling the angle.
  */
  val angle: Parameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the planar face or construction plane the angle for this construction plane is measured from and is parametrically dependent on. TODO - This doesn't currently exist in Fusion and needs to exist to have a unambiguous solution.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(angle: ValueInput, tangentFace: Base, planarEntity: Base): Boolean = js.native
  /**
  * Gets the cylindrical or conical face that the construction plane is tangent to.
  */
  val tangentFace: Base = js.native
}
/** 
  * ConstructionPlaneTangentDefinition defines a ConstructionPlane tangent to a cylindrical or conical face at a point. 
 */
@JSName("adsk.fusion.ConstructionPlaneTangentDefinition")
object ConstructionPlaneTangentDefinition extends js.Object {
  /**
  * Returns a Value object that for a transient definition provides the current assigned value. For a definition associated with a construction plane, it provides access to the associated parameter controlling the angle.
  */
  val angle: Parameter = js.native
  /**
  * Gets the planar face or construction plane the angle for this construction plane is measured from and is parametrically dependent on. TODO - This doesn't currently exist in Fusion and needs to exist to have a unambiguous solution.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(angle: ValueInput, tangentFace: Base, planarEntity: Base): Boolean = js.native
  /**
  * Gets the cylindrical or conical face that the construction plane is tangent to.
  */
  val tangentFace: Base = js.native
}
// no utilities
