
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlaneMidplaneDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneMidplaneDefinition")
class ConstructionPlaneMidplaneDefinition extends ConstructionPlaneDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the first planar face or construction plane that defines this ConstructionPlane.
  */
  val planarEntityOne: Base = js.native
  /**
  * Gets the second planar face or construction plane that defines this ConstructionPlane.
  */
  val planarEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}
/** 
  * ConstructionPlaneMidplaneDefinition defines a ConstructionPlane by... 
 */
@JSName("adsk.fusion.ConstructionPlaneMidplaneDefinition")
object ConstructionPlaneMidplaneDefinition extends js.Object {
  /**
  * Gets the first planar face or construction plane that defines this ConstructionPlane.
  */
  val planarEntityOne: Base = js.native
  /**
  * Gets the second planar face or construction plane that defines this ConstructionPlane.
  */
  val planarEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction plane.
  */
  def redefine(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}

  object ConstructionPlaneMidplaneDefinitionUtilities {
    // no toSeq

  }
       
