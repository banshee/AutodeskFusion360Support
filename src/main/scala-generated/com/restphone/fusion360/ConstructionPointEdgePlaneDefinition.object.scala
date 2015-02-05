
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction point created using the SetbyEdgePlane method 
 */
@JSName("adsk.fusion.ConstructionPointEdgePlaneDefinition")
class ConstructionPointEdgePlaneDefinition extends ConstructionPointDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * A linear B-Rep edge, construction axis or sketch line.
  */
  val edge: Base = js.native



  /**
  * A plane, planar B-Rep face or construction plane.
  */
  val plane: Base = js.native
  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(edge: Base, plane: Base): Boolean = js.native
}
/** 
  * The definition for a parametric construction point created using the SetbyEdgePlane method 
 */
@JSName("adsk.fusion.ConstructionPointEdgePlaneDefinition")
object ConstructionPointEdgePlaneDefinition extends js.Object {
  /**
  * A linear B-Rep edge, construction axis or sketch line.
  */
  val edge: Base = js.native
  /**
  * A plane, planar B-Rep face or construction plane.
  */
  val plane: Base = js.native
  /**
  * Redefines the input geometry of the construction point.
  */
  def redefine(edge: Base, plane: Base): Boolean = js.native
}

  object ConstructionPointEdgePlaneDefinitionUtilities {
    // no toSeq

  }
       
