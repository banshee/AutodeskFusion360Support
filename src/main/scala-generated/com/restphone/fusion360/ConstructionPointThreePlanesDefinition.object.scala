
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction point created using the SetbyThreePlanes method 
 */
@JSName("adsk.fusion.ConstructionPointThreePlanesDefinition")
trait ConstructionPointThreePlanesDefinition extends ConstructionPointDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * The first plane or planar face
  */
  val planeOne: Base = js.native
  /**
  * The third plane or planar face
  */
  val planeThree: Base = js.native
  /**
  * The second plane or planar face
  */
  val planeTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(planeOne: Base, planeTwo: Base, planeThree: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction point created using the SetbyThreePlanes method 
 */
@JSName("adsk.fusion.ConstructionPointThreePlanesDefinition")
object ConstructionPointThreePlanesDefinition extends js.Object {
  /**
  * The first plane or planar face
  */
  val planeOne: Base = js.native
  /**
  * The third plane or planar face
  */
  val planeThree: Base = js.native
  /**
  * The second plane or planar face
  */
  val planeTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(planeOne: Base, planeTwo: Base, planeThree: Base): Boolean = js.native
}
// no utilities
