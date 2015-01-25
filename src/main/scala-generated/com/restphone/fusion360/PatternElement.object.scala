
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the properties that pertain to the pattern element. 
 */
@JSName("adsk.fusion.PatternElement")
trait PatternElement extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the faces generated as a result of the feature.
  */
  val faces: BRepFace = js.native
  /**
  * Gets the id of this element within the pattern.
  */
  val id: uinteger = js.native
  /**
  * Gets and sets whether the element is suppressed or not. A value of True indicates it is suppressed
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Get the name of the pattern element.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the feature pattern this element is a member of.
  */
  val parentFeature: Feature = js.native
  /**
  * Get the transform that describes this elements relative position to the parent object(s). The transform returned for the first element in a pattern will be an identity matrix.
  */
  val transform: Matrix3D = js.native
}
/** 
  * This class defines the properties that pertain to the pattern element. 
 */
@JSName("adsk.fusion.PatternElement")
object PatternElement extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the faces generated as a result of the feature.
  */
  val faces: BRepFace = js.native
  /**
  * Gets the id of this element within the pattern.
  */
  val id: uinteger = js.native
  /**
  * Gets and sets whether the element is suppressed or not. A value of True indicates it is suppressed
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Get the name of the pattern element.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the feature pattern this element is a member of.
  */
  val parentFeature: Feature = js.native
  /**
  * Get the transform that describes this elements relative position to the parent object(s). The transform returned for the first element in a pattern will be an identity matrix.
  */
  val transform: Matrix3D = js.native
}
// no utilities
