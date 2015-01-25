
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D NURBS curve. A transient NURBS curve is not displayed or saved in a document. Transient 3D NURBS curves are used as a wrapper to work with raw 3D NURBS curve information. 
 */
@JSName("adsk.core.NurbsCurve3D")
trait NurbsCurve3D extends Curve3D {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the number of control points that define the curve.
  */
  val controlPointCount: Integer = js.native
  /**
  * Returns an array of Point3D objects that define the control points of the curve.
  */
  val controlPoints: Point3D = js.native
  /**
  * Creates and returns an independent copy of this NurbsCurve3D object.
  */
  def copy(): NurbsCurve3D = js.native
  /**
  * Creates a transient 3D NURBS non-rational b-spline object.
  */
  def createNonRational(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], isPeriodic: Boolean): NurbsCurve3D = js.native
  /**
  * Creates a transient 3D NURBS rational b-spline object.
  */
  def createRational(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], weights: Array[Double], isPeriodic: Boolean): NurbsCurve3D = js.native

  /**
  * Returns the degree of the curve.
  */
  val degree: Integer = js.native

  /**
  * Defines a new nurbs curve that is the subset of this nurbs curve in the parameter range of [startParam, endParam]
  */
  def extract(startParam: double, endParam: double): NurbsCurve3D = js.native
  /**
  * Gets the data that defines a transient 3D NURBS rational b-spline object.
  */
  def getData(/* out */ controlPoints: Array[Point3D], /* out */ degree: Integer, /* out */ knots: Array[Double], /* out */ isRational: Boolean, /* out */ weights: Array[Double], /* out */ isPeriodic: Boolean): Boolean = js.native
  /**
  * Indicates if the curve is closed.
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if the curve is periodic.
  */
  val isPeriodic: Boolean = js.native
  /**
  * Indicates if the curve is rational or non-rational type.
  */
  val isRational: Boolean = js.native

  /**
  * Returns the knot count of the curve.
  */
  val knotCount: Integer = js.native
  /**
  * Returns an array of numbers that define the knot vector of the curve.
  */
  val knots: Double = js.native
  /**
  * Define a new nurbs curve that is the result of combining this nurbs curve with another nurbs curve.
  */
  def merge(nurbsCurve: NurbsCurve3D): NurbsCurve3D = js.native

  /**
  * Sets the data that defines a transient 3D NURBS rational b-spline object.
  */
  def set(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], isRational: Boolean, weights: Array[Double], isPeriodic: Boolean): Boolean = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D NURBS curve. A transient NURBS curve is not displayed or saved in a document. Transient 3D NURBS curves are used as a wrapper to work with raw 3D NURBS curve information. 
 */
@JSName("adsk.core.NurbsCurve3D")
object NurbsCurve3D extends js.Object {
  /**
  * Gets the number of control points that define the curve.
  */
  val controlPointCount: Integer = js.native
  /**
  * Returns an array of Point3D objects that define the control points of the curve.
  */
  val controlPoints: Point3D = js.native
  /**
  * Creates and returns an independent copy of this NurbsCurve3D object.
  */
  def copy(): NurbsCurve3D = js.native
  /**
  * Creates a transient 3D NURBS non-rational b-spline object.
  */
  def createNonRational(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], isPeriodic: Boolean): NurbsCurve3D = js.native
  /**
  * Creates a transient 3D NURBS rational b-spline object.
  */
  def createRational(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], weights: Array[Double], isPeriodic: Boolean): NurbsCurve3D = js.native
  /**
  * Returns the degree of the curve.
  */
  val degree: Integer = js.native
  /**
  * Defines a new nurbs curve that is the subset of this nurbs curve in the parameter range of [startParam, endParam]
  */
  def extract(startParam: double, endParam: double): NurbsCurve3D = js.native
  /**
  * Gets the data that defines a transient 3D NURBS rational b-spline object.
  */
  def getData(/* out */ controlPoints: Array[Point3D], /* out */ degree: Integer, /* out */ knots: Array[Double], /* out */ isRational: Boolean, /* out */ weights: Array[Double], /* out */ isPeriodic: Boolean): Boolean = js.native
  /**
  * Indicates if the curve is closed.
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if the curve is periodic.
  */
  val isPeriodic: Boolean = js.native
  /**
  * Indicates if the curve is rational or non-rational type.
  */
  val isRational: Boolean = js.native
  /**
  * Returns the knot count of the curve.
  */
  val knotCount: Integer = js.native
  /**
  * Returns an array of numbers that define the knot vector of the curve.
  */
  val knots: Double = js.native
  /**
  * Define a new nurbs curve that is the result of combining this nurbs curve with another nurbs curve.
  */
  def merge(nurbsCurve: NurbsCurve3D): NurbsCurve3D = js.native
  /**
  * Sets the data that defines a transient 3D NURBS rational b-spline object.
  */
  def set(controlPoints: Array[Point3D], degree: Integer, knots: Array[Double], isRational: Boolean, weights: Array[Double], isPeriodic: Boolean): Boolean = js.native
}
// no utilities
