
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D vector. This object is a wrapper over 3D vector data and is used as way to pass vector data in and out of the API and as a convenience when operating on vector data. 
 */
@JSName("adsk.core.Vector3D")
class Vector3D extends Base {
  /**
  * Adds a vector to this vector.
  */
  def add(vector: Vector3D): Boolean = js.native
  /**
  * Determines the angle between this vector and the specified vector.
  */
  def angleTo(vector: Vector3D): double = js.native
  /**
  * Returns the vector coordinates as an array [x, y, z].
  */
  def asArray(): Double = js.native
  /**
  * Returns a new point with the same coordinate values as this vector.
  */
  def asPoint(): Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a copy of this vector.
  */
  def copy(): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double, /* optional */ z: double): Vector3D = js.native
  /**
  * Returns the cross product between this vector and the specified vector.
  */
  def crossProduct(vector: Vector3D): Vector3D = js.native
  /**
  * Returns the dot product between this vector and the specified vector.
  */
  def dotProduct(vector: Vector3D): double = js.native
  /**
  * Determines if this vector is equal to the specified vector.
  */
  def isEqualTo(vector: Vector3D): Boolean = js.native
  /**
  * Determines if the input vector is parallel with this vector.
  */
  def isParallelTo(vector: Vector3D): Boolean = js.native
  /**
  * Determines if the input vector is perpendicular to this vector.
  */
  def isPerpendicularTo(vector: Vector3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Get the length of this vector.
  */
  val length: double = js.native
  /**
  * Makes this vector of unit length. This vector should not be zero length.
  */
  def normalize(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Scale this vector by the specified product.
  */
  def scaleBy(scale: double): Boolean = js.native
  /**
  * Reset this vector with the coordinate values in an array [x, y, z].
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Subtract a vector from this vector.
  */
  def subtract(vector: Vector3D): Boolean = js.native
  /**
  * Transform this vector by the specified matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * The x value.
  */
  var x: double = js.native
  /**
  * The y value.
  */
  var y: double = js.native
  /**
  * The z value.
  */
  var z: double = js.native
}
/** 
  * Transient 3D vector. This object is a wrapper over 3D vector data and is used as way to pass vector data in and out of the API and as a convenience when operating on vector data. 
 */
@JSName("adsk.core.Vector3D")
object Vector3D extends js.Object {
  /**
  * Adds a vector to this vector.
  */
  def add(vector: Vector3D): Boolean = js.native
  /**
  * Determines the angle between this vector and the specified vector.
  */
  def angleTo(vector: Vector3D): double = js.native
  /**
  * Returns the vector coordinates as an array [x, y, z].
  */
  def asArray(): Double = js.native
  /**
  * Returns a new point with the same coordinate values as this vector.
  */
  def asPoint(): Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a copy of this vector.
  */
  def copy(): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Vector3D = js.native
  /**
  * Creates a 3D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double, /* optional */ z: double): Vector3D = js.native
  /**
  * Returns the cross product between this vector and the specified vector.
  */
  def crossProduct(vector: Vector3D): Vector3D = js.native
  /**
  * Returns the dot product between this vector and the specified vector.
  */
  def dotProduct(vector: Vector3D): double = js.native
  /**
  * Determines if this vector is equal to the specified vector.
  */
  def isEqualTo(vector: Vector3D): Boolean = js.native
  /**
  * Determines if the input vector is parallel with this vector.
  */
  def isParallelTo(vector: Vector3D): Boolean = js.native
  /**
  * Determines if the input vector is perpendicular to this vector.
  */
  def isPerpendicularTo(vector: Vector3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Get the length of this vector.
  */
  val length: double = js.native
  /**
  * Makes this vector of unit length. This vector should not be zero length.
  */
  def normalize(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Scale this vector by the specified product.
  */
  def scaleBy(scale: double): Boolean = js.native
  /**
  * Reset this vector with the coordinate values in an array [x, y, z].
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Subtract a vector from this vector.
  */
  def subtract(vector: Vector3D): Boolean = js.native
  /**
  * Transform this vector by the specified matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * The x value.
  */
  var x: double = js.native
  /**
  * The y value.
  */
  var y: double = js.native
  /**
  * The z value.
  */
  var z: double = js.native
}

  object Vector3DUtilities {
    // no toSeq

  }
       
