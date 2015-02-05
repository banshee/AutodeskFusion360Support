
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D point. A transient point is not displayed or saved in a document. Transient 2D points are used as a wrapper to work with raw 2D point information. 
 */
@JSName("adsk.core.Point2D")
class Point2D extends Base {
  /**
  * Get coordinate data of the point
  */
  def asArray(): Double = js.native
  /**
  * Defines a vector using the coordinates of the point.
  */
  def asVector(): Vector2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns a copy of this point object.
  */
  def copy(): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(/* optional */ x: double): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Point2D = js.native
  /**
  * Returns the distance from this point to another point.
  */
  def distanceTo(point: Point2D): double = js.native
  /**
  * Gets the data defining the point.
  */
  def getData(/* out */ x: double, /* out */ y: double): Boolean = js.native
  /**
  * Checks to see if this point and another point are equal. (have identical coordinates)
  */
  def isEqualTo(point: Point2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the coordinates of the point by specifying the x, y coordinates.
  */
  def set(x: double, y: double): Boolean = js.native
  /**
  * Sets the coordinates of the point using an array as input.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Transforms the point using the provided matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
  /**
  * Translates the point using the provided vector.
  */
  def translateBy(vector: Vector2D): Boolean = js.native
  /**
  * Returns a vector from this point to another point.
  */
  def vectorTo(point: Point2D): Vector2D = js.native
  /**
  * Gets and sets the X coordinate of the point.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the point.
  */
  var y: double = js.native
}
/** 
  * Transient 2D point. A transient point is not displayed or saved in a document. Transient 2D points are used as a wrapper to work with raw 2D point information. 
 */
@JSName("adsk.core.Point2D")
object Point2D extends js.Object {
  /**
  * Get coordinate data of the point
  */
  def asArray(): Double = js.native
  /**
  * Defines a vector using the coordinates of the point.
  */
  def asVector(): Vector2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates and returns a copy of this point object.
  */
  def copy(): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(/* optional */ x: double): Point2D = js.native
  /**
  * Creates a transient 2D point object.
  */
  def create(/* optional */ x: double, /* optional */ y: double): Point2D = js.native
  /**
  * Returns the distance from this point to another point.
  */
  def distanceTo(point: Point2D): double = js.native
  /**
  * Gets the data defining the point.
  */
  def getData(/* out */ x: double, /* out */ y: double): Boolean = js.native
  /**
  * Checks to see if this point and another point are equal. (have identical coordinates)
  */
  def isEqualTo(point: Point2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the coordinates of the point by specifying the x, y coordinates.
  */
  def set(x: double, y: double): Boolean = js.native
  /**
  * Sets the coordinates of the point using an array as input.
  */
  def setWithArray(coordinates: Array[Double]): Boolean = js.native
  /**
  * Transforms the point using the provided matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
  /**
  * Translates the point using the provided vector.
  */
  def translateBy(vector: Vector2D): Boolean = js.native
  /**
  * Returns a vector from this point to another point.
  */
  def vectorTo(point: Point2D): Vector2D = js.native
  /**
  * Gets and sets the X coordinate of the point.
  */
  var x: double = js.native
  /**
  * Gets and sets the Y coordinate of the point.
  */
  var y: double = js.native
}

  object Point2DUtilities {
    // no toSeq
/**
* Gets the data defining the point.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Point2D): (Boolean, double, double) = {

val x = js.Dynamic.literal(value = 0)
val y = js.Dynamic.literal(value = 0)
val result = activeObject.getData(x.asInstanceOf[double], y.asInstanceOf[double])
(result, x.value.asInstanceOf[double], y.value.asInstanceOf[double])
}
  }
       
