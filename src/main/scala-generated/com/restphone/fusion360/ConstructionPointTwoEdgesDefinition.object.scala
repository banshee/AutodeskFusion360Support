
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction point created using the SetbyTwoEdges method 
 */
@JSName("adsk.fusion.ConstructionPointTwoEdgesDefinition")
trait ConstructionPointTwoEdgesDefinition extends ConstructionPointDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns a B-Rep edge or sketch line
  */
  val edgeOne: Base = js.native
  /**
  * Returns a B-Rep edge or sketch line
  */
  val edgeTwo: Base = js.native



  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(edgeOne: Base, edgeTwo: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction point created using the SetbyTwoEdges method 
 */
@JSName("adsk.fusion.ConstructionPointTwoEdgesDefinition")
object ConstructionPointTwoEdgesDefinition extends js.Object {
  /**
  * Returns a B-Rep edge or sketch line
  */
  val edgeOne: Base = js.native
  /**
  * Returns a B-Rep edge or sketch line
  */
  val edgeTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(edgeOne: Base, edgeTwo: Base): Boolean = js.native
}
// no utilities
