
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a circular pattern feature. 
 */
@JSName("adsk.fusion.CircularPatternFeatureInput")
trait CircularPatternFeatureInput extends Base {
  /**
  * Gets and sets the axis of circular pattern. This can be a sketch line, linear edge, construction axis, an edge/sketch curve that defines an axis (circle, etc.) or a face that defines an axis (cylinder, cone, torus, etc.).
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets if the angle extent is in one direction or symmetric.
  */
  var isSymmetric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets quantity of the elements.
  */
  var quantity: ValueInput = js.native
  /**
  * Gets and sets total angle. A negative angle can be used to reverse the direction. An angle of 360 degrees or 2 pi radians will create a full circular pattern.
  */
  var totalAngle: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a circular pattern feature. 
 */
@JSName("adsk.fusion.CircularPatternFeatureInput")
object CircularPatternFeatureInput extends js.Object {
  /**
  * Gets and sets the axis of circular pattern. This can be a sketch line, linear edge, construction axis, an edge/sketch curve that defines an axis (circle, etc.) or a face that defines an axis (cylinder, cone, torus, etc.).
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets if the angle extent is in one direction or symmetric.
  */
  var isSymmetric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets quantity of the elements.
  */
  var quantity: ValueInput = js.native
  /**
  * Gets and sets total angle. A negative angle can be used to reverse the direction. An angle of 360 degrees or 2 pi radians will create a full circular pattern.
  */
  var totalAngle: ValueInput = js.native
}
// no utilities
