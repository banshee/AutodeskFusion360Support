
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneAtAngleDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneAtAngleDefinition")
trait ConstructionPlaneAtAngleDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a Value object that for a transient definition provides the current assigned value. For a definition associated with a construction plane, this provides access to the associated parameter controlling the angle.
  */
  val angle: Parameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets the linear edge, construction line, or sketch line that defines the axis of rotation for the construction plane.
  */
  val linearEntity: Base = js.native


  /**
  * Gets the planar face or construction plane the angle for this construction plane is measured from and is parametrically dependent on. TODO - This doesn't currently exist in Fusion and needs to exist to have a unambiguous solution.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(angle: ValueInput, linearEntity: Base, planarEntity: Base): Boolean = js.native
}
/** 
  * ConstructionPlaneAtAngleDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneAtAngleDefinition")
object ConstructionPlaneAtAngleDefinition extends js.Object {
  /**
  * Returns a Value object that for a transient definition provides the current assigned value. For a definition associated with a construction plane, this provides access to the associated parameter controlling the angle.
  */
  val angle: Parameter = js.native
  /**
  * Gets the linear edge, construction line, or sketch line that defines the axis of rotation for the construction plane.
  */
  val linearEntity: Base = js.native
  /**
  * Gets the planar face or construction plane the angle for this construction plane is measured from and is parametrically dependent on. TODO - This doesn't currently exist in Fusion and needs to exist to have a unambiguous solution.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(angle: ValueInput, linearEntity: Base, planarEntity: Base): Boolean = js.native
}
// no utilities
