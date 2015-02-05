
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D matrix. This object is a wrapper over 3D matrx data and is used as way to pass matrix data in and out of the API and as a convenience when operating on matrix data. 
 */
@JSName("adsk.core.Matrix3D")
class Matrix3D extends Base {
  /**
  * Returns the contents of the matrix as a 16 element array.
  */
  def asArray(): Double = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an independent copy of this matrix.
  */
  def copy(): Matrix3D = js.native
  /**
  * Creates a transient 3d matrix object. It is initialized as an identity matrix.
  */
  def create(): Matrix3D = js.native
  /**
  * Returns the determinant of the matrix.
  */
  val determinant: double = js.native
  /**
  * Gets the matrix data as the components that define a coorinate system.
  */
  def getAsCoordinateSystem(/* out */ origin: Point3D, /* out */ xAxis: Vector3D, /* out */ yAxis: Vector3D, /* out */ zAxis: Vector3D): Unit = js.native
  /**
  * Gets the value of the specified cell in the matrix.
  */
  def getCell(row: Integer, column: Integer): double = js.native
  /**
  * Inverts this matrix.
  */
  def invert(): Boolean = js.native
  /**
  * Compares this matrix with another matrix and returns True if they're identical.
  */
  def isEqualTo(matrix: Matrix3D): Boolean = js.native
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
  def setToAlignCoordinateSystems(fromOrigin: Point3D, fromXAxis: Vector3D, fromYAxis: Vector3D, fromZAxis: Vector3D, toOrigin: Point3D, toXAxis: Vector3D, toYAxis: Vector3D, toZAxis: Vector3D): Boolean = js.native
  /**
  * Resets this matrix to an identify matrix.
  */
  def setToIdentity(): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector. The optional axis argument may be used when the two vectors are perpendicular and in opposite directions to specify a specific solution, but is otherwise ignored
  */
  def setToRotateTo(from: Vector3D, to: Vector3D): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector. The optional axis argument may be used when the two vectors are perpendicular and in opposite directions to specify a specific solution, but is otherwise ignored
  */
  def setToRotateTo(from: Vector3D, to: Vector3D, /* optional */ axis: Vector3D): Boolean = js.native
  /**
  * Sets this matrix to the matrix of rotation by the specified angle, through the specified origin, around the specified axis
  */
  def setToRotation(angle: double, axis: Vector3D, origin: Point3D): Boolean = js.native
  /**
  * Sets the contents of the array using a 16 element array.
  */
  def setWithArray(cells: Array[Double]): Boolean = js.native
  /**
  * Sets the matrix based on the components of a coordinate system.
  */
  def setWithCoordinateSystem(origin: Point3D, xAxis: Vector3D, yAxis: Vector3D, zAxis: Vector3D): Boolean = js.native
  /**
  * Transforms this matrix using the input matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * Gets and sets the translation component of the matrix.
  */
  var translation: Vector3D = js.native
}
/** 
  * Transient 3D matrix. This object is a wrapper over 3D matrx data and is used as way to pass matrix data in and out of the API and as a convenience when operating on matrix data. 
 */
@JSName("adsk.core.Matrix3D")
object Matrix3D extends js.Object {
  /**
  * Returns the contents of the matrix as a 16 element array.
  */
  def asArray(): Double = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an independent copy of this matrix.
  */
  def copy(): Matrix3D = js.native
  /**
  * Creates a transient 3d matrix object. It is initialized as an identity matrix.
  */
  def create(): Matrix3D = js.native
  /**
  * Returns the determinant of the matrix.
  */
  val determinant: double = js.native
  /**
  * Gets the matrix data as the components that define a coorinate system.
  */
  def getAsCoordinateSystem(/* out */ origin: Point3D, /* out */ xAxis: Vector3D, /* out */ yAxis: Vector3D, /* out */ zAxis: Vector3D): Unit = js.native
  /**
  * Gets the value of the specified cell in the matrix.
  */
  def getCell(row: Integer, column: Integer): double = js.native
  /**
  * Inverts this matrix.
  */
  def invert(): Boolean = js.native
  /**
  * Compares this matrix with another matrix and returns True if they're identical.
  */
  def isEqualTo(matrix: Matrix3D): Boolean = js.native
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
  def setToAlignCoordinateSystems(fromOrigin: Point3D, fromXAxis: Vector3D, fromYAxis: Vector3D, fromZAxis: Vector3D, toOrigin: Point3D, toXAxis: Vector3D, toYAxis: Vector3D, toZAxis: Vector3D): Boolean = js.native
  /**
  * Resets this matrix to an identify matrix.
  */
  def setToIdentity(): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector. The optional axis argument may be used when the two vectors are perpendicular and in opposite directions to specify a specific solution, but is otherwise ignored
  */
  def setToRotateTo(from: Vector3D, to: Vector3D): Boolean = js.native
  /**
  * Sets to the matrix of rotation that would align the 'from' vector with the 'to' vector. The optional axis argument may be used when the two vectors are perpendicular and in opposite directions to specify a specific solution, but is otherwise ignored
  */
  def setToRotateTo(from: Vector3D, to: Vector3D, /* optional */ axis: Vector3D): Boolean = js.native
  /**
  * Sets this matrix to the matrix of rotation by the specified angle, through the specified origin, around the specified axis
  */
  def setToRotation(angle: double, axis: Vector3D, origin: Point3D): Boolean = js.native
  /**
  * Sets the contents of the array using a 16 element array.
  */
  def setWithArray(cells: Array[Double]): Boolean = js.native
  /**
  * Sets the matrix based on the components of a coordinate system.
  */
  def setWithCoordinateSystem(origin: Point3D, xAxis: Vector3D, yAxis: Vector3D, zAxis: Vector3D): Boolean = js.native
  /**
  * Transforms this matrix using the input matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
  /**
  * Gets and sets the translation component of the matrix.
  */
  var translation: Vector3D = js.native
}

  object Matrix3DUtilities {
    // no toSeq
/**
* Gets the matrix data as the components that define a coorinate system.
*
* Out parameters are returned in a tuple.
*/
def getAsCoordinateSystemWithResults(activeObject: Matrix3D): (Unit, Point3D, Vector3D, Vector3D, Vector3D) = {

val origin = js.Dynamic.literal(value = 0)
val xAxis = js.Dynamic.literal(value = 0)
val yAxis = js.Dynamic.literal(value = 0)
val zAxis = js.Dynamic.literal(value = 0)
val result = activeObject.getAsCoordinateSystem(origin.asInstanceOf[Point3D], xAxis.asInstanceOf[Vector3D], yAxis.asInstanceOf[Vector3D], zAxis.asInstanceOf[Vector3D])
(result, origin.value.asInstanceOf[Point3D], xAxis.value.asInstanceOf[Vector3D], yAxis.value.asInstanceOf[Vector3D], zAxis.value.asInstanceOf[Vector3D])
}
  }
       
