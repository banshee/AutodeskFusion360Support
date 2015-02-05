
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing revolve feature in a design. 
 */
@JSName("adsk.fusion.RevolveFeature")
class RevolveFeature extends Feature {

  /**
  * Gets and sets the entity used to define the axis of revolution. The axis can be a sketch line, construction axis, or linear edge. If it is not in the same plane as the profile, it is projected onto the profile plane.
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): RevolveFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Property that returns the set of faces that cap the end of the revolve opposite the start faces. In the case where there aren't any start faces, this property will return null.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the definition object that is defining the extent of the revolve. Modifying the definition object will cause the revolve to recompute. Various types of objects can be returned depending on the type of extent currently defined for the revolve. This property returns nothing in the case where the feature is non-parametric.
  */
  val extentDefinition: ExtentDefinition = js.native






  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: RevolveFeature = js.native

  /**
  * Gets and sets the type of operation performed by the revolve.
  */
  var operation: FeatureOperations = js.native

  /**
  * Gets and sets the profiles or planar faces used to define the shape of the revolve. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Defines the extent of the revolution to be at a defined angle.
  */
  def setAngleExtent(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Changes the extent of the revolve to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, directionHint: Vector3D): Boolean = js.native
  /**
  * Changes the extent of the revolve to be defined as a two sided angle extent.
  */
  def setTwoSideAngleExtent(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
  /**
  * Changes the extent of the revolve to be defined as a two sided to extent.
  */
  def setTwoSidesToExtent(toEntityOne: Base, toEntityTwo: Base): Boolean = js.native
  /**
  * Property that returns all of the faces created around the perimeter of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of faces that cap one end of the revolve and are coincident with the sketch plane. In the case of a symmetric revolve these faces are the ones on the positive normal side of the sketch plane. In the case where there aren't any start faces, this property will return null.
  */
  val startFaces: BRepFaces = js.native

}
/** 
  * Object that represents an existing revolve feature in a design. 
 */
@JSName("adsk.fusion.RevolveFeature")
object RevolveFeature extends js.Object {
  /**
  * Gets and sets the entity used to define the axis of revolution. The axis can be a sketch line, construction axis, or linear edge. If it is not in the same plane as the profile, it is projected onto the profile plane.
  */
  var axis: Base = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): RevolveFeature = js.native
  /**
  * Property that returns the set of faces that cap the end of the revolve opposite the start faces. In the case where there aren't any start faces, this property will return null.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the definition object that is defining the extent of the revolve. Modifying the definition object will cause the revolve to recompute. Various types of objects can be returned depending on the type of extent currently defined for the revolve. This property returns nothing in the case where the feature is non-parametric.
  */
  val extentDefinition: ExtentDefinition = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: RevolveFeature = js.native
  /**
  * Gets and sets the type of operation performed by the revolve.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the revolve. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Defines the extent of the revolution to be at a defined angle.
  */
  def setAngleExtent(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Changes the extent of the revolve to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, directionHint: Vector3D): Boolean = js.native
  /**
  * Changes the extent of the revolve to be defined as a two sided angle extent.
  */
  def setTwoSideAngleExtent(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
  /**
  * Changes the extent of the revolve to be defined as a two sided to extent.
  */
  def setTwoSidesToExtent(toEntityOne: Base, toEntityTwo: Base): Boolean = js.native
  /**
  * Property that returns all of the faces created around the perimeter of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of faces that cap one end of the revolve and are coincident with the sketch plane. In the case of a symmetric revolve these faces are the ones on the positive normal side of the sketch plane. In the case where there aren't any start faces, this property will return null.
  */
  val startFaces: BRepFaces = js.native
}

  object RevolveFeatureUtilities {
    // no toSeq

  }
       
