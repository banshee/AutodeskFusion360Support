
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a non-parametric construction plane. All constructions planes will return this type of definition regardless of method used to initially create them. 
 */
@JSName("adsk.fusion.ConstructionPlaneByPlaneDefinition")
class ConstructionPlaneByPlaneDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets and sets the position of the construction plane.
  */
  var plane: Plane = js.native
}
/** 
  * The definition for a non-parametric construction plane. All constructions planes will return this type of definition regardless of method used to initially create them. 
 */
@JSName("adsk.fusion.ConstructionPlaneByPlaneDefinition")
object ConstructionPlaneByPlaneDefinition extends js.Object {
  /**
  * Gets and sets the position of the construction plane.
  */
  var plane: Plane = js.native
}

  object ConstructionPlaneByPlaneDefinitionUtilities {
    // no toSeq

  }
       
