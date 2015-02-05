
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction axis created using the SetByTwoPlanes method 
 */
@JSName("adsk.fusion.ConstructionAxisTwoPlaneDefinition")
class ConstructionAxisTwoPlaneDefinition extends ConstructionAxisDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the first planar face or construction plane
  */
  val planarEntityOne: Base = js.native
  /**
  * Gets the second planar face or construction plane
  */
  val planarEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction axis created using the SetByTwoPlanes method 
 */
@JSName("adsk.fusion.ConstructionAxisTwoPlaneDefinition")
object ConstructionAxisTwoPlaneDefinition extends js.Object {
  /**
  * Gets the first planar face or construction plane
  */
  val planarEntityOne: Base = js.native
  /**
  * Gets the second planar face or construction plane
  */
  val planarEntityTwo: Base = js.native
  /**
  * Redefines the input geometry of the construction axis.
  */
  def redefine(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}

  object ConstructionAxisTwoPlaneDefinitionUtilities {
    // no toSeq

  }
       
