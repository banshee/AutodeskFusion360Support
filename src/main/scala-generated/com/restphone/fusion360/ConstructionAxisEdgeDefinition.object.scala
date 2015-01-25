
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetbyEdge method 
 */
@JSName("adsk.fusion.ConstructionAxisEdgeDefinition")
trait ConstructionAxisEdgeDefinition extends ConstructionAxisDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets the linear edge, construction line, or sketch line that defines the construction axis.
  */
  var edgeEntity: Base = js.native



}
/** 
  * The definition for a parametric construction axis created using the SetbyEdge method 
 */
@JSName("adsk.fusion.ConstructionAxisEdgeDefinition")
object ConstructionAxisEdgeDefinition extends js.Object {
  /**
  * Gets and sets the linear edge, construction line, or sketch line that defines the construction axis.
  */
  var edgeEntity: Base = js.native
}
// no utilities
