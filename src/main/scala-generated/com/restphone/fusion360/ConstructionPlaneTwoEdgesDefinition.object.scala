
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneTwoEdgesDefinition defines a ConstructionPlane by two co-planar linear entities like edges, sketch lines or construction axis. 
 */
@JSName("adsk.fusion.ConstructionPlaneTwoEdgesDefinition")
trait ConstructionPlaneTwoEdgesDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets the first linear edge, construction line, or sketch line that defines the construction plane.
  */
  val linearEntityOne: Base = js.native
  /**
  * Gets the second linear edge, construction line, or sketch line that defines the construction plane.
  */
  val linearEntityTwo: Base = js.native


  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(linearEntityOne: Base, linearEntityTwo: Base): Boolean = js.native
}
/** 
  * ConstructionPlaneTwoEdgesDefinition defines a ConstructionPlane by two co-planar linear entities like edges, sketch lines or construction axis. 
 */
@JSName("adsk.fusion.ConstructionPlaneTwoEdgesDefinition")
object ConstructionPlaneTwoEdgesDefinition extends js.Object {
  /**
  * Gets the first linear edge, construction line, or sketch line that defines the construction plane.
  */
  val linearEntityOne: Base = js.native
  /**
  * Gets the second linear edge, construction line, or sketch line that defines the construction plane.
  */
  val linearEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(linearEntityOne: Base, linearEntityTwo: Base): Boolean = js.native
}
// no utilities
