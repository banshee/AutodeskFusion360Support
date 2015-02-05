
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionDistanceOnPathDefinition defines a ConstructionPlane normal to an edge or sketch profile at a specified position along the path defined by the edge or sketch profile. 
 */
@JSName("adsk.fusion.ConstructionPlaneDistanceOnPathDefinition")
class ConstructionPlaneDistanceOnPathDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the sketch curve, edge, or a profile object.
  */
  val pathEntity: Base = js.native
  /**
  * Redefines the input defining the construction plane.
  */
  def redefine(pathEntity: Base, distance: ValueInput): Boolean = js.native
}
/** 
  * ConstructionDistanceOnPathDefinition defines a ConstructionPlane normal to an edge or sketch profile at a specified position along the path defined by the edge or sketch profile. 
 */
@JSName("adsk.fusion.ConstructionPlaneDistanceOnPathDefinition")
object ConstructionPlaneDistanceOnPathDefinition extends js.Object {
  /**
  * Gets the sketch curve, edge, or a profile object.
  */
  val pathEntity: Base = js.native
  /**
  * Redefines the input defining the construction plane.
  */
  def redefine(pathEntity: Base, distance: ValueInput): Boolean = js.native
}

  object ConstructionPlaneDistanceOnPathDefinitionUtilities {
    // no toSeq

  }
       
