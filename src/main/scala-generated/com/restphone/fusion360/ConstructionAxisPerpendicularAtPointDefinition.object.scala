
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetByPerpendicularAtPoint method 
 */
@JSName("adsk.fusion.ConstructionAxisPerpendicularAtPointDefinition")
class ConstructionAxisPerpendicularAtPointDefinition extends ConstructionAxisDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the face the construction axis is perpendicular to.
  */
  val face: BRepFace = js.native



  /**
  * Returns the point (construction or sketch point) that positions the axis.
  */
  val point: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(face: BRepFace, pointEntity: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction axis created using the SetByPerpendicularAtPoint method 
 */
@JSName("adsk.fusion.ConstructionAxisPerpendicularAtPointDefinition")
object ConstructionAxisPerpendicularAtPointDefinition extends js.Object {
  /**
  * Returns the face the construction axis is perpendicular to.
  */
  val face: BRepFace = js.native
  /**
  * Returns the point (construction or sketch point) that positions the axis.
  */
  val point: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(face: BRepFace, pointEntity: Base): Boolean = js.native
}

  object ConstructionAxisPerpendicularAtPointDefinitionUtilities {
    // no toSeq

  }
       
