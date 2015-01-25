
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of an extrude feature. This class also provides properties for setting/getting the Profile and Operation of the extrude. The Profile and Operation are defined when the ExtrudeFeatures.CreateInput method is called so they do not exist as properties on this class. 
 */
@JSName("adsk.fusion.ExtrudeFeatureInput")
trait ExtrudeFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Extrusion is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the Extrusion) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the type of operation performed by the extrusion.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the extrude. This property can return or be set with a single profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar.
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
  * Gets and sets the taper angle of the extrusion. This property is initialized with a taper angle of zero. A negative angle will taper the extrusion inward while a positive value will taper the extrusion outward. This property is valid for both parametric and non-parametric extrusions.
  */
  var taperAngle: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of an extrude feature. This class also provides properties for setting/getting the Profile and Operation of the extrude. The Profile and Operation are defined when the ExtrudeFeatures.CreateInput method is called so they do not exist as properties on this class. 
 */
@JSName("adsk.fusion.ExtrudeFeatureInput")
object ExtrudeFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Extrusion is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the Extrusion) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the type of operation performed by the extrusion.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the extrude. This property can return or be set with a single profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar.
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
  * Gets and sets the taper angle of the extrusion. This property is initialized with a taper angle of zero. A negative angle will taper the extrusion inward while a positive value will taper the extrusion outward. This property is valid for both parametric and non-parametric extrusions.
  */
  var taperAngle: ValueInput = js.native
}
// no utilities
