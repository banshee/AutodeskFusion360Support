
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides positioning information for a hole that is positioned on a plane and at a distance from one or two edges. 
 */
@JSName("adsk.fusion.PlaneAndOffsetsHolePositionDefinition")
class PlaneAndOffsetsHolePositionDefinition extends HolePositionDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * The first of 2 edges the hole position is measured from. OffsetOne provides access to the model parameter controlling the offset distance.
  */
  val edgeOne: BRepEdge = js.native
  /**
  * The second of two edges the hole position is measured from. OffsetTwo provides access to the model parameter controlling the offset distance. This property can return null in the case where only one edge is used.
  */
  val edgeTwo: BRepEdge = js.native


  /**
  * Returns the model parameter controlling the distance from the center of the hole to EdgeOne.
  */
  val offsetOne: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the distance from the center of the hole to EdgeTwo. This property returns null in the case where only one edge is used.
  */
  val offsetTwo: ModelParameter = js.native
  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
}
/** 
  * Provides positioning information for a hole that is positioned on a plane and at a distance from one or two edges. 
 */
@JSName("adsk.fusion.PlaneAndOffsetsHolePositionDefinition")
object PlaneAndOffsetsHolePositionDefinition extends js.Object {
  /**
  * The first of 2 edges the hole position is measured from. OffsetOne provides access to the model parameter controlling the offset distance.
  */
  val edgeOne: BRepEdge = js.native
  /**
  * The second of two edges the hole position is measured from. OffsetTwo provides access to the model parameter controlling the offset distance. This property can return null in the case where only one edge is used.
  */
  val edgeTwo: BRepEdge = js.native
  /**
  * Returns the model parameter controlling the distance from the center of the hole to EdgeOne.
  */
  val offsetOne: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the distance from the center of the hole to EdgeTwo. This property returns null in the case where only one edge is used.
  */
  val offsetTwo: ModelParameter = js.native
  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
}

  object PlaneAndOffsetsHolePositionDefinitionUtilities {
    // no toSeq

  }
       
