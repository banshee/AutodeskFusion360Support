
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetByNormalToFaceAtPoint method 
 */
@JSName("adsk.fusion.ConstructionAxisNormalToFaceAtPointDefinition")
trait ConstructionAxisNormalToFaceAtPointDefinition extends ConstructionAxisDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the face the axis is normal to
  */
  val face: Base = js.native



  /**
  * Gets the point that positions the axis
  */
  val pointEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(face: Base, pointEntity: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction axis created using the SetByNormalToFaceAtPoint method 
 */
@JSName("adsk.fusion.ConstructionAxisNormalToFaceAtPointDefinition")
object ConstructionAxisNormalToFaceAtPointDefinition extends js.Object {
  /**
  * Gets the face the axis is normal to
  */
  val face: Base = js.native
  /**
  * Gets the point that positions the axis
  */
  val pointEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(face: Base, pointEntity: Base): Boolean = js.native
}
// no utilities
