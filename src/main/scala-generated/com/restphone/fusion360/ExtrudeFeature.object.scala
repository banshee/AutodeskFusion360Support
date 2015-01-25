
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing extrude feature in a design. 
 */
@JSName("adsk.fusion.ExtrudeFeature")
trait ExtrudeFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ExtrudeFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Property that returns the set of faces that cap the end of the extrusion, opposite the start faces. In the case where there are no end faces, this property will return null.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the ExtentDefinition object that defines the extent of the extrude. Modifying the definition object will cause the extrude to recompute. Various types of objects can be returned depending on the type of extent currently defined for the extrusion. This property returns nothing in the case where the feature is non-parametric.
  */
  val extentDefinition: ExtentDefinition = js.native






  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ExtrudeFeature = js.native

  /**
  * Gets and sets the type of operation performed by the extrusion.
  */
  var operation: FeatureOperations = js.native

  /**
  * Gets and sets the profiles or planar faces used to define the shape of the extrude. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Sets the extrusion extents option to 'All' (i.e. the extrusion is through-all, in both directions.) This method will fail in the case of a non-parametric extrusion.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Sets the extrusion extents option to 'Distance'.
  */
  def setDistanceExtent(isSymmetric: Boolean, distance: ValueInput): Boolean = js.native
  /**
  * Sets the extrusion Direction option to 'One Side' and the Extents option to 'To' (a specified face)
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Sets the extrusion extents option to 'Two Side'. This method will fail in the case of a non-parametric extrusion.
  */
  def setTwoSidesDistanceExtent(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native
  /**
  * Set the extrusion Direction option to 'Two Side' This method will fail in the case of a non-parametric extrusion.
  */
  def setTwoSidesToExtent(toEntityOne: Base, toEntityTwo: Base, matchShape: Boolean): Boolean = js.native
  /**
  * Property that returns all of the side faces (i.e. those running perpendicular to the extrude direction) of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of faces that cap the end of the extrusion and are coincident with the sketch plane. In the case of a symmetric extrusion, these faces are the ones on the positive normal side of the sketch plane. In the case where there are no start faces, this property will return null.
  */
  val startFaces: BRepFaces = js.native
  /**
  * Returns the parameter controlling the taper angle of the extrusion. To edit the taper angle use properties on the parameter to edit its value. This property returns nothing in the case where the feature is non-parametric.
  */
  val taperAngle: ModelParameter = js.native

}
/** 
  * Object that represents an existing extrude feature in a design. 
 */
@JSName("adsk.fusion.ExtrudeFeature")
object ExtrudeFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ExtrudeFeature = js.native
  /**
  * Property that returns the set of faces that cap the end of the extrusion, opposite the start faces. In the case where there are no end faces, this property will return null.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the ExtentDefinition object that defines the extent of the extrude. Modifying the definition object will cause the extrude to recompute. Various types of objects can be returned depending on the type of extent currently defined for the extrusion. This property returns nothing in the case where the feature is non-parametric.
  */
  val extentDefinition: ExtentDefinition = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ExtrudeFeature = js.native
  /**
  * Gets and sets the type of operation performed by the extrusion.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the extrude. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Sets the extrusion extents option to 'All' (i.e. the extrusion is through-all, in both directions.) This method will fail in the case of a non-parametric extrusion.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Sets the extrusion extents option to 'Distance'.
  */
  def setDistanceExtent(isSymmetric: Boolean, distance: ValueInput): Boolean = js.native
  /**
  * Sets the extrusion Direction option to 'One Side' and the Extents option to 'To' (a specified face)
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Sets the extrusion extents option to 'Two Side'. This method will fail in the case of a non-parametric extrusion.
  */
  def setTwoSidesDistanceExtent(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native
  /**
  * Set the extrusion Direction option to 'Two Side' This method will fail in the case of a non-parametric extrusion.
  */
  def setTwoSidesToExtent(toEntityOne: Base, toEntityTwo: Base, matchShape: Boolean): Boolean = js.native
  /**
  * Property that returns all of the side faces (i.e. those running perpendicular to the extrude direction) of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of faces that cap the end of the extrusion and are coincident with the sketch plane. In the case of a symmetric extrusion, these faces are the ones on the positive normal side of the sketch plane. In the case where there are no start faces, this property will return null.
  */
  val startFaces: BRepFaces = js.native
  /**
  * Returns the parameter controlling the taper angle of the extrusion. To edit the taper angle use properties on the parameter to edit its value. This property returns nothing in the case where the feature is non-parametric.
  */
  val taperAngle: ModelParameter = js.native
}
// no utilities
