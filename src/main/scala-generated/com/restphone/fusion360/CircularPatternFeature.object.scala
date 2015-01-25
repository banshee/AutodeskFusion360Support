
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing circular pattern feature in a design. 
 */
@JSName("adsk.fusion.CircularPatternFeature")
trait CircularPatternFeature extends Feature {

  /**
  * Gets and sets the axis of circular pattern. This can be a sketch line, linear edge, construction axis, an edge/sketch curve that defines an axis (circle, etc.) or a face that defines an axis (cylinder, cone, torus, etc.).
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): CircularPatternFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native

  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native


  /**
  * Gets and sets if the angle extent is in one direction or symmetric.
  */
  var isSymmetric: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: CircularPatternFeature = js.native


  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Returns the parameter controlling the number of pattern elements, including any suppressed elements. To edit the quantity use properties on the parameter to edit its value. This property returns null in the case where the feature is non-parametric.
  */
  val quantity: ModelParameter = js.native
  /**
  * Returns the features that were created as a result of this pattern. This is only valid for a direct edit model and this returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native
  /**
  * Gets and sets the id's of the elements to suppress.
  */
  var suppressedElementsIds: UInt32 = js.native

  /**
  * Returns the parameter controlling the total angle. To edit the angle use properties on the parameter to edit its value. This property returns null in the case where the feature is non-parametric. A negative value can be used to change the direction of the pattern.
  */
  val totalAngle: ModelParameter = js.native
}
/** 
  * Object that represents an existing circular pattern feature in a design. 
 */
@JSName("adsk.fusion.CircularPatternFeature")
object CircularPatternFeature extends js.Object {
  /**
  * Gets and sets the axis of circular pattern. This can be a sketch line, linear edge, construction axis, an edge/sketch curve that defines an axis (circle, etc.) or a face that defines an axis (cylinder, cone, torus, etc.).
  */
  var axis: Base = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): CircularPatternFeature = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets if the angle extent is in one direction or symmetric.
  */
  var isSymmetric: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: CircularPatternFeature = js.native
  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Returns the parameter controlling the number of pattern elements, including any suppressed elements. To edit the quantity use properties on the parameter to edit its value. This property returns null in the case where the feature is non-parametric.
  */
  val quantity: ModelParameter = js.native
  /**
  * Returns the features that were created as a result of this pattern. This is only valid for a direct edit model and this returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native
  /**
  * Gets and sets the id's of the elements to suppress.
  */
  var suppressedElementsIds: UInt32 = js.native
  /**
  * Returns the parameter controlling the total angle. To edit the angle use properties on the parameter to edit its value. This property returns null in the case where the feature is non-parametric. A negative value can be used to change the direction of the pattern.
  */
  val totalAngle: ModelParameter = js.native
}
// no utilities
