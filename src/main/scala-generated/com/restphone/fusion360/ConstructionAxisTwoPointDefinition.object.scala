
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetbyTwoPoints method 
 */
@JSName("adsk.fusion.ConstructionAxisTwoPointDefinition")
trait ConstructionAxisTwoPointDefinition extends ConstructionAxisDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the first point.
  */
  val pointEntityOne: Base = js.native
  /**
  * Gets the second point.
  */
  val pointEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(pointEntityOne: Base, pointEntityTwo: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction axis created using the SetbyTwoPoints method 
 */
@JSName("adsk.fusion.ConstructionAxisTwoPointDefinition")
object ConstructionAxisTwoPointDefinition extends js.Object {
  /**
  * Gets the first point.
  */
  val pointEntityOne: Base = js.native
  /**
  * Gets the second point.
  */
  val pointEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(pointEntityOne: Base, pointEntityTwo: Base): Boolean = js.native
}
// no utilities
