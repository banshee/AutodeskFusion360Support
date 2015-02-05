
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneTangentAtPointDefinition defines a ConstructionPlane tangent to a face and aligned to a point. 
 */
@JSName("adsk.fusion.ConstructionPlaneTangentAtPointDefinition")
class ConstructionPlaneTangentAtPointDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the point (sketch point, vertex, construction point) used to align the plane.
  */
  val pointEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(tangentFace: Base, pointEntity: Base): Boolean = js.native
  /**
  * Gets the tangent face.
  */
  val tangentFace: BRepFace = js.native
}
/** 
  * ConstructionPlaneTangentAtPointDefinition defines a ConstructionPlane tangent to a face and aligned to a point. 
 */
@JSName("adsk.fusion.ConstructionPlaneTangentAtPointDefinition")
object ConstructionPlaneTangentAtPointDefinition extends js.Object {
  /**
  * Gets the point (sketch point, vertex, construction point) used to align the plane.
  */
  val pointEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(tangentFace: Base, pointEntity: Base): Boolean = js.native
  /**
  * Gets the tangent face.
  */
  val tangentFace: BRepFace = js.native
}

  object ConstructionPlaneTangentAtPointDefinitionUtilities {
    // no toSeq

  }
       
