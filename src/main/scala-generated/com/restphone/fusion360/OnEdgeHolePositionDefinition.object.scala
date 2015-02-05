
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides positioning information for a hole that is positioned on the start, end or center of an edge. 
 */
@JSName("adsk.fusion.OnEdgeHolePositionDefinition")
class OnEdgeHolePositionDefinition extends HolePositionDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the edge the hole is positioned on.
  */
  val edge: BRepEdge = js.native


  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
  /**
  * Returns the position of the hole on the edge. The hole can be at the start, midpoint, or end of the edge.
  */
  val position: HoleEdgePositions = js.native
}
/** 
  * Provides positioning information for a hole that is positioned on the start, end or center of an edge. 
 */
@JSName("adsk.fusion.OnEdgeHolePositionDefinition")
object OnEdgeHolePositionDefinition extends js.Object {
  /**
  * Returns the edge the hole is positioned on.
  */
  val edge: BRepEdge = js.native
  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
  /**
  * Returns the position of the hole on the edge. The hole can be at the start, midpoint, or end of the edge.
  */
  val position: HoleEdgePositions = js.native
}

  object OnEdgeHolePositionDefinitionUtilities {
    // no toSeq

  }
       
