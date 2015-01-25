
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneThreePointDefinition defines a ConstructionPlane by 3 point entities (e.g. (sketch points, vectrices or construction points) that form a triangle (i.e. no two points the same and they aren't collinear). 
 */
@JSName("adsk.fusion.ConstructionPlaneThreePointsDefinition")
trait ConstructionPlaneThreePointsDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the first construction point, sketch point or vertex.
  */
  val pointEntityOne: Base = js.native
  /**
  * Gets the third construction point, sketch point or vertex.
  */
  val pointEntityThree: Base = js.native
  /**
  * Gets the second construction point, sketch point or vertex.
  */
  val pointEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(pointEntityOne: Base, pointEntityTwo: Base, pointEntityThree: Base): Boolean = js.native
}
/** 
  * ConstructionPlaneThreePointDefinition defines a ConstructionPlane by 3 point entities (e.g. (sketch points, vectrices or construction points) that form a triangle (i.e. no two points the same and they aren't collinear). 
 */
@JSName("adsk.fusion.ConstructionPlaneThreePointsDefinition")
object ConstructionPlaneThreePointsDefinition extends js.Object {
  /**
  * Gets the first construction point, sketch point or vertex.
  */
  val pointEntityOne: Base = js.native
  /**
  * Gets the third construction point, sketch point or vertex.
  */
  val pointEntityThree: Base = js.native
  /**
  * Gets the second construction point, sketch point or vertex.
  */
  val pointEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(pointEntityOne: Base, pointEntityTwo: Base, pointEntityThree: Base): Boolean = js.native
}
// no utilities
