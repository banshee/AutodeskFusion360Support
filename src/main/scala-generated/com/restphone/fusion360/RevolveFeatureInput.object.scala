
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a revolve feature. 
 */
@JSName("adsk.fusion.RevolveFeatureInput")
class RevolveFeatureInput extends Base {
  /**
  * Gets and sets the entity used to define the axis of revolution. The axis can be a sketch line, construction axis, or linear edge. If it is not in the same plane as the profile, it is projected onto the profile plane.
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Revolve is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the Revolve) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * Gets and sets the type of operation performed by the revolve.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the revolve. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Defines the extent of the revolution to be at a specified angle. An angle and whether the extent is symmetric or only in one direction is specified. If it's not symmetric a positive or negative angle can be used to control the direction. If symmetric, the angle is the angle on one side so the entire angle of the revolution will be twice the specified angle. Use an angle of 360 deg or 2 pi radians to create a full revolve.
  */
  def setAngleExtent(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Defines the extent of the revolve to be from the sketch or profile plane to the specified "To" face.
  */
  def setOneSideToExtent(toEntity: Base, directionHint: Vector3D): Boolean = js.native
  /**
  * Defines the angle of the revolve to be to applied to both sides of the profile at the specified angles.
  */
  def setTwoSideAngleExtent(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
  /**
  * Defines the extents of the revolve to be from the sketch plane to specified faces in both directions. If the matchShape argument is true, the faces to revolve to are extended to fully intersect the revolve.
  */
  def setTwoSideToExtent(toEntityOne: Base, toEntityTwo: Base): Boolean = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a revolve feature. 
 */
@JSName("adsk.fusion.RevolveFeatureInput")
object RevolveFeatureInput extends js.Object {
  /**
  * Gets and sets the entity used to define the axis of revolution. The axis can be a sketch line, construction axis, or linear edge. If it is not in the same plane as the profile, it is projected onto the profile plane.
  */
  var axis: Base = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Revolve is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the Revolve) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * Gets and sets the type of operation performed by the revolve.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the revolve. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns null in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Defines the extent of the revolution to be at a specified angle. An angle and whether the extent is symmetric or only in one direction is specified. If it's not symmetric a positive or negative angle can be used to control the direction. If symmetric, the angle is the angle on one side so the entire angle of the revolution will be twice the specified angle. Use an angle of 360 deg or 2 pi radians to create a full revolve.
  */
  def setAngleExtent(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Defines the extent of the revolve to be from the sketch or profile plane to the specified "To" face.
  */
  def setOneSideToExtent(toEntity: Base, directionHint: Vector3D): Boolean = js.native
  /**
  * Defines the angle of the revolve to be to applied to both sides of the profile at the specified angles.
  */
  def setTwoSideAngleExtent(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
  /**
  * Defines the extents of the revolve to be from the sketch plane to specified faces in both directions. If the matchShape argument is true, the faces to revolve to are extended to fully intersect the revolve.
  */
  def setTwoSideToExtent(toEntityOne: Base, toEntityTwo: Base): Boolean = js.native
}

  object RevolveFeatureInputUtilities {
    // no toSeq

  }
       
