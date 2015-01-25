
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The definition for a parametric construction point created using the SetbyPoint method All non-parametric constructions points will return this type of definition regardless of the method used to initially create them. 
 */
@JSName("adsk.fusion.ConstructionPointPointDefinition")
trait ConstructionPointPointDefinition extends ConstructionPointDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets and sets the position of the point using a construction point, sketch point or vertex. Non-parametric points will always return a Point3D object
  */
  var pointEntity: Base = js.native
}
/** 
  * The definition for a parametric construction point created using the SetbyPoint method All non-parametric constructions points will return this type of definition regardless of the method used to initially create them. 
 */
@JSName("adsk.fusion.ConstructionPointPointDefinition")
object ConstructionPointPointDefinition extends js.Object {
  /**
  * Gets and sets the position of the point using a construction point, sketch point or vertex. Non-parametric points will always return a Point3D object
  */
  var pointEntity: Base = js.native
}
// no utilities
