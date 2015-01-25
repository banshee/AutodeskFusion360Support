
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient cone. A transient cone is not displayed or saved in a document. A transient cone is used as a wrapper to work with raw cone information. A transient cone has no boundaries. The cone always goes to a point in its narrowing direction, and is infinite in its widening direction. 
 */
@JSName("adsk.core.Cone")
trait Cone extends Surface {
  /**
  * Gets and sets the center axis (along the length) of the cone that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Cone object.
  */
  def copy(): Cone = js.native
  /**
  * Creates a transient cone object.
  */
  def create(origin: Point3D, axis: Vector3D, radius: double, halfAngle: double): Cone = js.native

  /**
  * Gets the data that defines the cone.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ radius: double, /* out */ halfAngle: double): Boolean = js.native
  /**
  * Gets and sets the taper half-angle of the cone in radians. A negative value indicates that the cone is narrowing in the direction of the axis vector, whereas a positive value indicates that it is expanding in the direction of the axis vector.
  */
  var halfAngle: double = js.native


  /**
  * Gets and sets the origin point (center) of the base of the cone.
  */
  var origin: Point3D = js.native
  /**
  * Gets and sets the radius of the cone.
  */
  var radius: double = js.native
  /**
  * Sets the data that defines the cone.
  */
  def set(origin: Point3D, axis: Vector3D, radius: double, halfAngle: double): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient cone. A transient cone is not displayed or saved in a document. A transient cone is used as a wrapper to work with raw cone information. A transient cone has no boundaries. The cone always goes to a point in its narrowing direction, and is infinite in its widening direction. 
 */
@JSName("adsk.core.Cone")
object Cone extends js.Object {
  /**
  * Gets and sets the center axis (along the length) of the cone that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Creates and returns an independent copy of this Cone object.
  */
  def copy(): Cone = js.native
  /**
  * Creates a transient cone object.
  */
  def create(origin: Point3D, axis: Vector3D, radius: double, halfAngle: double): Cone = js.native
  /**
  * Gets the data that defines the cone.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ radius: double, /* out */ halfAngle: double): Boolean = js.native
  /**
  * Gets and sets the taper half-angle of the cone in radians. A negative value indicates that the cone is narrowing in the direction of the axis vector, whereas a positive value indicates that it is expanding in the direction of the axis vector.
  */
  var halfAngle: double = js.native
  /**
  * Gets and sets the origin point (center) of the base of the cone.
  */
  var origin: Point3D = js.native
  /**
  * Gets and sets the radius of the cone.
  */
  var radius: double = js.native
  /**
  * Sets the data that defines the cone.
  */
  def set(origin: Point3D, axis: Vector3D, radius: double, halfAngle: double): Boolean = js.native
}
// no utilities
