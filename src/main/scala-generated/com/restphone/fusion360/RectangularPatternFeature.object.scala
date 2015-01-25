
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing rectangular pattern feature in a design. 
 */
@JSName("adsk.fusion.RectangularPatternFeature")
trait RectangularPatternFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): RectangularPatternFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
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
  * Gets and sets the second direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature. This can be null when not entity has been specified to control the second direction. In this case Fusion will compute a default direction which is 90 degrees to the direction one.
  */
  var directionTwoEntity: Base = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Gets the distance in the first direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the distance in the second direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val distanceTwo: ModelParameter = js.native

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
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: RectangularPatternFeature = js.native


  /**
  * Gets and sets how the distance between elements is computed. Is initialized to ExtentPatternDistanceType when a new RectangularPatternFeatureInput has been created.
  */
  var patternDistanceType: PatternDistanceType = js.native
  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Gets the number of instances in the first direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val quantityOne: ModelParameter = js.native
  /**
  * Gets the number of instances in the second direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val quantityTwo: ModelParameter = js.native
  /**
  * Get the features that were created for this pattern. Returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native
  /**
  * Gets and sets the ids of the patterns to suppress.
  */
  var suppressedElementsIds: UInt32 = js.native

}
/** 
  * Object that represents an existing rectangular pattern feature in a design. 
 */
@JSName("adsk.fusion.RectangularPatternFeature")
object RectangularPatternFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): RectangularPatternFeature = js.native
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
  * Gets and sets the second direction entity. This can be a linear edge, construction axis, sketch line or rectangular pattern feature. If a rectangular pattern feature is set, the directionOneEntity and directionTwoEntity properties return the same rectangular pattern feature. This can be null when not entity has been specified to control the second direction. In this case Fusion will compute a default direction which is 90 degrees to the direction one.
  */
  var directionTwoEntity: Base = js.native
  /**
  * Gets the distance in the first direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the distance in the second direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val distanceTwo: ModelParameter = js.native
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
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: RectangularPatternFeature = js.native
  /**
  * Gets and sets how the distance between elements is computed. Is initialized to ExtentPatternDistanceType when a new RectangularPatternFeatureInput has been created.
  */
  var patternDistanceType: PatternDistanceType = js.native
  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Gets the number of instances in the first direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val quantityOne: ModelParameter = js.native
  /**
  * Gets the number of instances in the second direction. Edit the value through ModelParameter. Returns nothing in the case where the feature is non-parametric.
  */
  val quantityTwo: ModelParameter = js.native
  /**
  * Get the features that were created for this pattern. Returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native
  /**
  * Gets and sets the ids of the patterns to suppress.
  */
  var suppressedElementsIds: UInt32 = js.native
}
// no utilities
