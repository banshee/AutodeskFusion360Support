
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D vector. This object is a wrapper for 2D vector data and is used to pass vector data in and out of the API. 
 */
@JSName("adsk.core.Vector2D")
class Vector2D extends Base {
  /**
  * Add a vector to this vector.
  */
  def add(vector: Vector2D): Boolean = js.native
  /**
  * Gets the angle between this vector and another vector.
  */
  def angleTo(vector: Vector2D): double = js.native
  /**
  * Returns the vector values as an array [x, y].
  */
  def asArray(): Double = js.native
  /**
  * Return a point with the same x and y values as this vector.
  */
  def asPoint(): Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Vector2D object.
  */
  def copy(): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(/* optional */ x: double): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Vector2D = js.native
  /**
  * Calculates the Dot Product of this vector and an input vector.
  */
  def dotProduct(vector: Vector2D): double = js.native
  /**
  * Compare this vector with another to check for equality.
  */
  def isEqualTo(vector: Vector2D): Boolean = js.native
  /**
  * Compare this vector with another to check for parallelism.
  */
  def isParallelTo(vector: Vector2D): Boolean = js.native
  /**
  * Compare this vector with another to check for perpendicularity.
  */
  def isPerpendicularTo(vector: Vector2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the length of the vector.
  */
  val length: double = js.native
  /**
  * Normalizes the vector. Normalization makes the vector length equal to one. The vector should not be zero length.
  */
  def normalize(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Scales the vector by specifying a scaling factor.
  */
  def scaleBy(scale: double): Boolean = js.native
  /**
  * Sets the definition of the vector by specifying an array containing the x and y coordinates.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Subtract a vector from this vector.
  */
  def subtract(vector: Vector2D): Boolean = js.native
  /**
  * Transforms the vector by specifying a 2D transformation matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
  /**
  * Gets and sets the X coordinate of the vector.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the vector.
  */
  var y: double = js.native
}
/** 
  * Transient 2D vector. This object is a wrapper for 2D vector data and is used to pass vector data in and out of the API. 
 */
@JSName("adsk.core.Vector2D")
object Vector2D extends js.Object {
  /**
  * Add a vector to this vector.
  */
  def add(vector: Vector2D): Boolean = js.native
  /**
  * Gets the angle between this vector and another vector.
  */
  def angleTo(vector: Vector2D): double = js.native
  /**
  * Returns the vector values as an array [x, y].
  */
  def asArray(): Double = js.native
  /**
  * Return a point with the same x and y values as this vector.
  */
  def asPoint(): Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Vector2D object.
  */
  def copy(): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(/* optional */ x: double): Vector2D = js.native
  /**
  * Creates a 2D vector object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Vector2D = js.native
  /**
  * Calculates the Dot Product of this vector and an input vector.
  */
  def dotProduct(vector: Vector2D): double = js.native
  /**
  * Compare this vector with another to check for equality.
  */
  def isEqualTo(vector: Vector2D): Boolean = js.native
  /**
  * Compare this vector with another to check for parallelism.
  */
  def isParallelTo(vector: Vector2D): Boolean = js.native
  /**
  * Compare this vector with another to check for perpendicularity.
  */
  def isPerpendicularTo(vector: Vector2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the length of the vector.
  */
  val length: double = js.native
  /**
  * Normalizes the vector. Normalization makes the vector length equal to one. The vector should not be zero length.
  */
  def normalize(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Scales the vector by specifying a scaling factor.
  */
  def scaleBy(scale: double): Boolean = js.native
  /**
  * Sets the definition of the vector by specifying an array containing the x and y coordinates.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Subtract a vector from this vector.
  */
  def subtract(vector: Vector2D): Boolean = js.native
  /**
  * Transforms the vector by specifying a 2D transformation matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
  /**
  * Gets and sets the X coordinate of the vector.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the vector.
  */
  var y: double = js.native
}

  object Vector2DUtilities {
    // no toSeq

  }
       
