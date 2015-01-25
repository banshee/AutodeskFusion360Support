
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D point. A transient point is not displayed or saved in a document. Transient 3D points are used as a wrapper to work with raw 3D point information. 
 */
@JSName("adsk.core.Point3D")
trait Point3D extends Base {
  /**
  * Get coordinate data of the point.
  */
  def asArray(): Double = js.native
  /**
  * Defines a vector using the coordinates of the point.
  */
  def asVector(): Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns a copy of this point object.
  */
  def copy(): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double, /* optional */ z: double): Point3D = js.native
  /**
  * Returns the distance from this point to another point.
  */
  def distanceTo(point: Point3D): double = js.native
  /**
  * Gets the data defining the point.
  */
  def getData(/* out */ x: double, /* out */ y: double, /* out */ z: double): Boolean = js.native
  /**
  * Checks to see if this point and another point are equal (have identical coordinates).
  */
  def isEqualTo(point: Point3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the data defining the point.
  */
  def set(x: double, y: double, z: double): Boolean = js.native
  /**
  * Sets the coordinates of the point using an array as input.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Transforms the point using the provided matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * Translates the point using the provided vector.
  */
  def translateBy(vector: Vector3D): Boolean = js.native
  /**
  * Returns a vector from this point to another point.
  */
  def vectorTo(point: Point3D): Vector3D = js.native
  /**
  * Gets and sets the X coordinate of the point.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the point.
  */
  var y: double = js.native
  /**
  * Gets and sets the Z coordinate of the point.
  */
  var z: double = js.native
}
/** 
  * Transient 3D point. A transient point is not displayed or saved in a document. Transient 3D points are used as a wrapper to work with raw 3D point information. 
 */
@JSName("adsk.core.Point3D")
object Point3D extends js.Object {
  /**
  * Get coordinate data of the point.
  */
  def asArray(): Double = js.native
  /**
  * Defines a vector using the coordinates of the point.
  */
  def asVector(): Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns a copy of this point object.
  */
  def copy(): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Point3D = js.native
  /**
  * Creates a transient 3D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double, /* optional */ z: double): Point3D = js.native
  /**
  * Returns the distance from this point to another point.
  */
  def distanceTo(point: Point3D): double = js.native
  /**
  * Gets the data defining the point.
  */
  def getData(/* out */ x: double, /* out */ y: double, /* out */ z: double): Boolean = js.native
  /**
  * Checks to see if this point and another point are equal (have identical coordinates).
  */
  def isEqualTo(point: Point3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the data defining the point.
  */
  def set(x: double, y: double, z: double): Boolean = js.native
  /**
  * Sets the coordinates of the point using an array as input.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Transforms the point using the provided matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * Translates the point using the provided vector.
  */
  def translateBy(vector: Vector3D): Boolean = js.native
  /**
  * Returns a vector from this point to another point.
  */
  def vectorTo(point: Point3D): Vector3D = js.native
  /**
  * Gets and sets the X coordinate of the point.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the point.
  */
  var y: double = js.native
  /**
  * Gets and sets the Z coordinate of the point.
  */
  var z: double = js.native
}
// no utilities
