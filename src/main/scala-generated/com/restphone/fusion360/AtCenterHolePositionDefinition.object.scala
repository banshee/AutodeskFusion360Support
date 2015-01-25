
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides positioning information for a hole that is positioned at the center of a circular or elliptical edge. 
 */
@JSName("adsk.fusion.AtCenterHolePositionDefinition")
trait AtCenterHolePositionDefinition extends HolePositionDefinition {
  /**
  * Returns the circular or elliptical edge the hole is centered at.
  */
  val centerEdge: BRepEdge = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native


  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
}
/** 
  * Provides positioning information for a hole that is positioned at the center of a circular or elliptical edge. 
 */
@JSName("adsk.fusion.AtCenterHolePositionDefinition")
object AtCenterHolePositionDefinition extends js.Object {
  /**
  * Returns the circular or elliptical edge the hole is centered at.
  */
  val centerEdge: BRepEdge = js.native
  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
}
// no utilities
