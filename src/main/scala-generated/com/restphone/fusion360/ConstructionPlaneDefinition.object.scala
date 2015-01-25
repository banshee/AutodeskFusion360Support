
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A Base class to return the information, possibly parametric, used to define the ConstructionPlane. 
 */
@JSName("adsk.fusion.ConstructionPlaneDefinition")
trait ConstructionPlaneDefinition extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the ConstructionPlane object
  */
  val parentConstructionPlane: ConstructionPlane = js.native
}
/** 
  * A Base class to return the information, possibly parametric, used to define the ConstructionPlane. 
 */
@JSName("adsk.fusion.ConstructionPlaneDefinition")
object ConstructionPlaneDefinition extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the ConstructionPlane object
  */
  val parentConstructionPlane: ConstructionPlane = js.native
}
// no utilities
