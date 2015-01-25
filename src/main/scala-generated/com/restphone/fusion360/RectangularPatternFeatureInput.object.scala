
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a rectangular pattern feature. 
 */
@JSName("adsk.fusion.RectangularPatternFeatureInput")
trait RectangularPatternFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a Vector3D indicating the positive direction of direction one.
  */
  val directionOne: Vector3D = js.native
  /**
  * Gets and sets the first direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature.
  */
  var directionOneEntity: Base = js.native
  /**
  * Returns a Vector3D indicating the positive direction of direction two.
  */
  val directionTwo: Vector3D = js.native
  /**
  * Gets and sets the second direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature.
  */
  var directionTwoEntity: Base = js.native
  /**
  * Gets and sets the distance in the first direction.
  */
  var distanceOne: ValueInput = js.native
  /**
  * Gets and sets the distance in the second direction.
  */
  var distanceTwo: ValueInput = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets if the pattern in direction one is in one direction or symmetric.
  */
  var isSymmetricInDirectionOne: Boolean = js.native
  /**
  * Gets and sets if the pattern in direction two is in one direction or symmetric.
  */
  var isSymmetricInDirectionTwo: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets how the distance between elements is computed.
  */
  var patternDistanceType: PatternDistanceType = js.native
  /**
  * Gets and sets the number of instances in the first direction.
  */
  var quantityOne: ValueInput = js.native
  /**
  * Gets and sets the number of instances in the second direction.
  */
  var quantityTwo: ValueInput = js.native
  /**
  * Sets all of the input required to define the pattern in the second direction.
  */
  def setDirectionTwo(directionTwoEntity: Base, quantityTwo: ValueInput, distanceTwo: ValueInput): Boolean = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a rectangular pattern feature. 
 */
@JSName("adsk.fusion.RectangularPatternFeatureInput")
object RectangularPatternFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a Vector3D indicating the positive direction of direction one.
  */
  val directionOne: Vector3D = js.native
  /**
  * Gets and sets the first direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature.
  */
  var directionOneEntity: Base = js.native
  /**
  * Returns a Vector3D indicating the positive direction of direction two.
  */
  val directionTwo: Vector3D = js.native
  /**
  * Gets and sets the second direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature.
  */
  var directionTwoEntity: Base = js.native
  /**
  * Gets and sets the distance in the first direction.
  */
  var distanceOne: ValueInput = js.native
  /**
  * Gets and sets the distance in the second direction.
  */
  var distanceTwo: ValueInput = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets if the pattern in direction one is in one direction or symmetric.
  */
  var isSymmetricInDirectionOne: Boolean = js.native
  /**
  * Gets and sets if the pattern in direction two is in one direction or symmetric.
  */
  var isSymmetricInDirectionTwo: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets how the distance between elements is computed.
  */
  var patternDistanceType: PatternDistanceType = js.native
  /**
  * Gets and sets the number of instances in the first direction.
  */
  var quantityOne: ValueInput = js.native
  /**
  * Gets and sets the number of instances in the second direction.
  */
  var quantityTwo: ValueInput = js.native
  /**
  * Sets all of the input required to define the pattern in the second direction.
  */
  def setDirectionTwo(directionTwoEntity: Base, quantityTwo: ValueInput, distanceTwo: ValueInput): Boolean = js.native
}
// no utilities
