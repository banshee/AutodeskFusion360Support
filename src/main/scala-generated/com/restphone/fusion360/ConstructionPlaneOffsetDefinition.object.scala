
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneOffsetDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneOffsetDefinition")
trait ConstructionPlaneOffsetDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native


  /**
  * Returns a Value object that for a transient definition that provides the current assigned value and for a definition associated with a construction plane Provides access to the associated parameter controlling the offset.
  */
  val offset: Parameter = js.native

  /**
  * Gets the planar face or construction plane this construction plane is parametrically dependent on.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(offset: ValueInput, planarEntity: Base): Boolean = js.native
}
/** 
  * ConstructionPlaneOffsetDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneOffsetDefinition")
object ConstructionPlaneOffsetDefinition extends js.Object {
  /**
  * Returns a Value object that for a transient definition that provides the current assigned value and for a definition associated with a construction plane Provides access to the associated parameter controlling the offset.
  */
  val offset: Parameter = js.native
  /**
  * Gets the planar face or construction plane this construction plane is parametrically dependent on.
  */
  val planarEntity: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(offset: ValueInput, planarEntity: Base): Boolean = js.native
}
// no utilities
