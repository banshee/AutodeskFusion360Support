
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D matrix. This object is a wrapper over 2D matrix data and is used as way to pass matrix data in and out of the API and as a convenience when operating on matrix data. 
 */
@JSName("adsk.core.Matrix2D")
class Matrix2D extends Base {
  /**
  * Returns the contents of the matrix as a 9 element array.
  */
  def asArray(): Double = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an independent copy of this matrix.
  */
  def copy(): Matrix2D = js.native
  /**
  * Creates a transient 2d matrix object. It is initialized as an identity matrix.
  */
  def create(): Matrix2D = js.native
  /**
  * Returns the determinant of the matrix.
  */
  val determinant: double = js.native
  /**
  * Gets the matrix data as the components that define a coordinate system.
  */
  def getAsCoordinateSystem(/* out */ origin: Point2D, /* out */ xAxis: Vector2D, /* out */ yAxis: Vector2D): Unit = js.native
  /**
  * Gets the value of the specified cell in the matrix.
  */
  def getCell(row: Integer, column: Integer): double = js.native
  /**
  * Invert this matrix.
  */
  def invert(): Boolean = js.native
  /**
  * Compares this matrix with another matrix and returns True if they're identical.
  */
  def isEqualTo(matrix: Matrix2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the specified cell in the matrix to the specified value.
  */
  def setCell(row: Integer, column: Integer, value: double): Boolean = js.native
  /**
  * Sets this matrix to be the matrix that maps from the 'from' coordinate system to the 'to' coordinate system.
  */
  def setToAlignCoordinateSystems(fromOrigin: Point2D, fromXAxis: Vector2D, fromYAxis: Vector2D, toOrigin: Point2D, toXAxis: Vector2D, toYAxis: Vector2D): Boolean = js.native
  /**
  * Resets this matrix to be an identity matrix.
  */
  def setToIdentity(): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector.
  */
  def setToRotateTo(from: Vector2D, to: Vector2D): Boolean = js.native
  /**
  * Sets this matrix to the matrix of rotation by the specified angle, through the specified origin.
  */
  def setToRotation(angle: double, origin: Point2D): Boolean = js.native
  /**
  * Sets the contents of the array using a 9 element array.
  */
  def setWithArray(cells: Array[Double]): Boolean = js.native
  /**
  * Reset this matrix to align with a specific coordinate system.
  */
  def setWithCoordinateSystem(origin: Point2D, xAxis: Vector2D, yAxis: Vector2D): Boolean = js.native
  /**
  * Transforms this matrix using the input matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D matrix. This object is a wrapper over 2D matrix data and is used as way to pass matrix data in and out of the API and as a convenience when operating on matrix data. 
 */
@JSName("adsk.core.Matrix2D")
object Matrix2D extends js.Object {
  /**
  * Returns the contents of the matrix as a 9 element array.
  */
  def asArray(): Double = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an independent copy of this matrix.
  */
  def copy(): Matrix2D = js.native
  /**
  * Creates a transient 2d matrix object. It is initialized as an identity matrix.
  */
  def create(): Matrix2D = js.native
  /**
  * Returns the determinant of the matrix.
  */
  val determinant: double = js.native
  /**
  * Gets the matrix data as the components that define a coordinate system.
  */
  def getAsCoordinateSystem(/* out */ origin: Point2D, /* out */ xAxis: Vector2D, /* out */ yAxis: Vector2D): Unit = js.native
  /**
  * Gets the value of the specified cell in the matrix.
  */
  def getCell(row: Integer, column: Integer): double = js.native
  /**
  * Invert this matrix.
  */
  def invert(): Boolean = js.native
  /**
  * Compares this matrix with another matrix and returns True if they're identical.
  */
  def isEqualTo(matrix: Matrix2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Sets the specified cell in the matrix to the specified value.
  */
  def setCell(row: Integer, column: Integer, value: double): Boolean = js.native
  /**
  * Sets this matrix to be the matrix that maps from the 'from' coordinate system to the 'to' coordinate system.
  */
  def setToAlignCoordinateSystems(fromOrigin: Point2D, fromXAxis: Vector2D, fromYAxis: Vector2D, toOrigin: Point2D, toXAxis: Vector2D, toYAxis: Vector2D): Boolean = js.native
  /**
  * Resets this matrix to be an identity matrix.
  */
  def setToIdentity(): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector.
  */
  def setToRotateTo(from: Vector2D, to: Vector2D): Boolean = js.native
  /**
  * Sets this matrix to the matrix of rotation by the specified angle, through the specified origin.
  */
  def setToRotation(angle: double, origin: Point2D): Boolean = js.native
  /**
  * Sets the contents of the array using a 9 element array.
  */
  def setWithArray(cells: Array[Double]): Boolean = js.native
  /**
  * Reset this matrix to align with a specific coordinate system.
  */
  def setWithCoordinateSystem(origin: Point2D, xAxis: Vector2D, yAxis: Vector2D): Boolean = js.native
  /**
  * Transforms this matrix using the input matrix.
  */
  def transformBy(matrix: Matrix2D): Boolean = js.native
}

  object Matrix2DUtilities {
    // no toSeq
/**
* Gets the matrix data as the components that define a coordinate system.
*
* Out parameters are returned in a tuple.
*/
def getAsCoordinateSystemWithResults(activeObject: Matrix2D): (Unit, Point2D, Vector2D, Vector2D) = {

val origin = js.Dynamic.literal(value = 0)
val xAxis = js.Dynamic.literal(value = 0)
val yAxis = js.Dynamic.literal(value = 0)
val result = activeObject.getAsCoordinateSystem(origin.asInstanceOf[Point2D], xAxis.asInstanceOf[Vector2D], yAxis.asInstanceOf[Vector2D])
(result, origin.value.asInstanceOf[Point2D], xAxis.value.asInstanceOf[Vector2D], yAxis.value.asInstanceOf[Vector2D])
}
  }
       
