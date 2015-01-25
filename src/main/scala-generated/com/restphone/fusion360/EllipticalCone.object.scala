
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient elliptical cone. A transient elliptical cone is not displayed or saved in a document. A transient elliptical cone is used as a wrapper to work with raw elliptical cone information. A transient elliptical cone has no boundaries. The cone always goes to a point in its narrowing direction, and is infinite in its widening direction. 
 */
@JSName("adsk.core.EllipticalCone")
trait EllipticalCone extends Surface {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this EllipticalCone object.
  */
  def copy(): EllipticalCone = js.native
  /**
  * Creates a transient elliptical cone object.
  */
  def create(origin: Point3D, axis: Vector3D, majorAxisDirection: Vector3D, majorRadius: double, minorRadius: double, halfAngle: double): EllipticalCone = js.native

  /**
  * Gets the center axis of the cone that defines its normal direction and the major axis direction of the ellipse that defines it.
  */
  def getAxes(/* out */ axis: Vector3D, /* out */ majorAxisDirection: Vector3D): Unit = js.native
  /**
  * Gets the data that defines the Elliptical Cone.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorAxisDirection: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ halfAngle: double): Boolean = js.native
  /**
  * Gets and sets the taper half-angle of the elliptical cone. A negative value indicates that the cone is narrowing in the direction of the axis vector, whereas a positive values indicates that it is expanding in the direction of the axis vector.
  */
  var halfAngle: double = js.native

  /**
  * Gets and sets the major radius of the ellipse that defines the cone.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse that defines the cone.
  */
  var minorRadius: double = js.native

  /**
  * Gets and sets the origin point (center) of the base of the cone.
  */
  var origin: Point3D = js.native
  /**
  * Sets the data that defines the Elliptical Cone.
  */
  def set(origin: Point3D, axis: Vector3D, majorAxisDirection: Vector3D, majorRadius: double, minorRadius: double, halfAngle: double): Boolean = js.native
  /**
  * Sets the center axis of the cone and the major axis direction of the ellipse that defines it.
  */
  def setAxes(axis: Vector3D, majorAxisDirection: Vector3D): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient elliptical cone. A transient elliptical cone is not displayed or saved in a document. A transient elliptical cone is used as a wrapper to work with raw elliptical cone information. A transient elliptical cone has no boundaries. The cone always goes to a point in its narrowing direction, and is infinite in its widening direction. 
 */
@JSName("adsk.core.EllipticalCone")
object EllipticalCone extends js.Object {
  /**
  * Creates and returns an independent copy of this EllipticalCone object.
  */
  def copy(): EllipticalCone = js.native
  /**
  * Creates a transient elliptical cone object.
  */
  def create(origin: Point3D, axis: Vector3D, majorAxisDirection: Vector3D, majorRadius: double, minorRadius: double, halfAngle: double): EllipticalCone = js.native
  /**
  * Gets the center axis of the cone that defines its normal direction and the major axis direction of the ellipse that defines it.
  */
  def getAxes(/* out */ axis: Vector3D, /* out */ majorAxisDirection: Vector3D): Unit = js.native
  /**
  * Gets the data that defines the Elliptical Cone.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorAxisDirection: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ halfAngle: double): Boolean = js.native
  /**
  * Gets and sets the taper half-angle of the elliptical cone. A negative value indicates that the cone is narrowing in the direction of the axis vector, whereas a positive values indicates that it is expanding in the direction of the axis vector.
  */
  var halfAngle: double = js.native
  /**
  * Gets and sets the major radius of the ellipse that defines the cone.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse that defines the cone.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the origin point (center) of the base of the cone.
  */
  var origin: Point3D = js.native
  /**
  * Sets the data that defines the Elliptical Cone.
  */
  def set(origin: Point3D, axis: Vector3D, majorAxisDirection: Vector3D, majorRadius: double, minorRadius: double, halfAngle: double): Boolean = js.native
  /**
  * Sets the center axis of the cone and the major axis direction of the ellipse that defines it.
  */
  def setAxes(axis: Vector3D, majorAxisDirection: Vector3D): Boolean = js.native
}
// no utilities
