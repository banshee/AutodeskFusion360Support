
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a Model Parameter. 
 */
@JSName("adsk.fusion.ModelParameter")
trait ModelParameter extends Parameter {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Returns the Component containing the ModelParameter.
  */
  val component: Component = js.native
  /**
  * Returns the object that created this parameter. For example, a feature, a sketch dimension, or a construction plane.
  */
  val createdBy: Base = js.native




  /**
  * Returns the Collection containing the ModelParameter.
  */
  val modelParameters: ModelParameters = js.native


  /**
  * This property identifies what the parameter is used for. For an extrude, it could be "Depth", for a Workplane it could be "Offset".
  */
  val role: String = js.native


}
/** 
  * Represents a Model Parameter. 
 */
@JSName("adsk.fusion.ModelParameter")
object ModelParameter extends js.Object {
  /**
  * Returns the Component containing the ModelParameter.
  */
  val component: Component = js.native
  /**
  * Returns the object that created this parameter. For example, a feature, a sketch dimension, or a construction plane.
  */
  val createdBy: Base = js.native
  /**
  * Returns the Collection containing the ModelParameter.
  */
  val modelParameters: ModelParameters = js.native
  /**
  * This property identifies what the parameter is used for. For an extrude, it could be "Depth", for a Workplane it could be "Offset".
  */
  val role: String = js.native
}
// no utilities
