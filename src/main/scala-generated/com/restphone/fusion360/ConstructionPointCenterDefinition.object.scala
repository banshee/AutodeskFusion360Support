
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction point created using the SetbyCenter method 
 */
@JSName("adsk.fusion.ConstructionPointCenterDefinition")
class ConstructionPointCenterDefinition extends ConstructionPointDefinition {
  /**
  * Gets and sets the spherical face (sphere or torus), circular edge or sketch arc/circle whose center defines the location for the construction point.
  */
  var circularEntity: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



}
/** 
  * The definition for a parametric construction point created using the SetbyCenter method 
 */
@JSName("adsk.fusion.ConstructionPointCenterDefinition")
object ConstructionPointCenterDefinition extends js.Object {
  /**
  * Gets and sets the spherical face (sphere or torus), circular edge or sketch arc/circle whose center defines the location for the construction point.
  */
  var circularEntity: Base = js.native
}

  object ConstructionPointCenterDefinitionUtilities {
    // no toSeq

  }
       
