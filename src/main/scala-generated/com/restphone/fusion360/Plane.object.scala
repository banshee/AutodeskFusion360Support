
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient plane. A transient plane is not displayed or saved in a document. Transient plaes are used as a wrapper to work with raw plane information. A transient plane has no boundaries or size, but is infinite and is represented by a position, a normal, and an orientation in space. 
 */
@JSName("adsk.core.Plane")
trait Plane extends Surface {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Plane object.
  */
  def copy(): Plane = js.native
  /**
  * Creates a transient plane object by specifying an origin and a normal direction.
  */
  def create(origin: Point3D, normal: Vector3D): Plane = js.native
  /**
  * Creates a transient plane object by specifying an origin along with U and V directions.
  */
  def createUsingDirections(origin: Point3D, uDirection: Vector3D, vDirection: Vector3D): Plane = js.native

  /**
  * Intersect this plane with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Creates a 3D point at the intersection of this plane and a line.
  */
  def intersectWithLine(line: InfiniteLine3D): Point3D = js.native
  /**
  * Creates an infinite line at the intersection of this plane with another plane.
  */
  def intersectWithPlane(plane: Plane): InfiniteLine3D = js.native
  /**
  * Intersect this plane with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Checks if this plane is coplanar with another plane.
  */
  def isCoPlanarTo(plane: Plane): Boolean = js.native
  /**
  * Checks if this plane is parallel to a line.
  */
  def isParallelToLine(line: Line3D): Boolean = js.native
  /**
  * Checks if this plane is parallel to another plane.
  */
  def isParallelToPlane(plane: Plane): Boolean = js.native
  /**
  * Checks if this plane is perpendicular to a line.
  */
  def isPerpendicularToLine(line: Line3D): Boolean = js.native
  /**
  * Checks if this plane is perpendicular to another plane.
  */
  def isPerpendicularToPlane(plane: Plane): Boolean = js.native

  /**
  * Gets and sets the normal of the plane.
  */
  var normal: Vector3D = js.native

  /**
  * Gets and sets the origin point of the plane.
  */
  var origin: Point3D = js.native
  /**
  * Sets the U and V directions of the plane.
  */
  def setUVDirections(uDirection: Vector3D, vDirection: Vector3D): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * Gets the U Direction of the plane.
  */
  val uDirection: Vector3D = js.native
  /**
  * Gets the V Direction of the plane.
  */
  val vDirection: Vector3D = js.native
}
/** 
  * Transient plane. A transient plane is not displayed or saved in a document. Transient plaes are used as a wrapper to work with raw plane information. A transient plane has no boundaries or size, but is infinite and is represented by a position, a normal, and an orientation in space. 
 */
@JSName("adsk.core.Plane")
object Plane extends js.Object {
  /**
  * Creates and returns an independent copy of this Plane object.
  */
  def copy(): Plane = js.native
  /**
  * Creates a transient plane object by specifying an origin and a normal direction.
  */
  def create(origin: Point3D, normal: Vector3D): Plane = js.native
  /**
  * Creates a transient plane object by specifying an origin along with U and V directions.
  */
  def createUsingDirections(origin: Point3D, uDirection: Vector3D, vDirection: Vector3D): Plane = js.native
  /**
  * Intersect this plane with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Creates a 3D point at the intersection of this plane and a line.
  */
  def intersectWithLine(line: InfiniteLine3D): Point3D = js.native
  /**
  * Creates an infinite line at the intersection of this plane with another plane.
  */
  def intersectWithPlane(plane: Plane): InfiniteLine3D = js.native
  /**
  * Intersect this plane with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Checks if this plane is coplanar with another plane.
  */
  def isCoPlanarTo(plane: Plane): Boolean = js.native
  /**
  * Checks if this plane is parallel to a line.
  */
  def isParallelToLine(line: Line3D): Boolean = js.native
  /**
  * Checks if this plane is parallel to another plane.
  */
  def isParallelToPlane(plane: Plane): Boolean = js.native
  /**
  * Checks if this plane is perpendicular to a line.
  */
  def isPerpendicularToLine(line: Line3D): Boolean = js.native
  /**
  * Checks if this plane is perpendicular to another plane.
  */
  def isPerpendicularToPlane(plane: Plane): Boolean = js.native
  /**
  * Gets and sets the normal of the plane.
  */
  var normal: Vector3D = js.native
  /**
  * Gets and sets the origin point of the plane.
  */
  var origin: Point3D = js.native
  /**
  * Sets the U and V directions of the plane.
  */
  def setUVDirections(uDirection: Vector3D, vDirection: Vector3D): Boolean = js.native
  /**
  * Gets the U Direction of the plane.
  */
  val uDirection: Vector3D = js.native
  /**
  * Gets the V Direction of the plane.
  */
  val vDirection: Vector3D = js.native
}
// no utilities
