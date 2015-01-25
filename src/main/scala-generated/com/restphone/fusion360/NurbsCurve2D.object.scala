
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D NURBS curve. A transient NURBS curve is not displayed or saved in a document. Tranient 2D NURBS curves are used as a wrapper to work with raw 2D NURBS curve information. 
 */
@JSName("adsk.core.NurbsCurve2D")
trait NurbsCurve2D extends Curve2D {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the number of control points that define the curve
  */
  val controlPointCount: Integer = js.native
  /**
  * Returns an array of Point2D objects that define the control points of the curve.
  */
  val controlPoints: Point2D = js.native
  /**
  * Creates and returns an independent copy of this NurbsCurve2D object.
  */
  def copy(): NurbsCurve2D = js.native
  /**
  * Creates a transient 2D NURBS non-rational b-spline object.
  */
  def createNonRational(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], isPeriodic: Boolean): NurbsCurve2D = js.native
  /**
  * Creates a transient 2D NURBS rational b-spline object.
  */
  def createRational(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], weights: Array[Double], isPeriodic: Boolean): NurbsCurve2D = js.native

  /**
  * Returns the degree of the curve
  */
  val degree: Integer = js.native

  /**
  * Defines a new nurbs curve that is the subset of this nurbs curve in the parameter range of [startParam, endParam]
  */
  def extract(startParam: double, endParam: double): NurbsCurve2D = js.native
  /**
  * Gets the data that defines a transient 2D NURBS rational b-spline object.
  */
  def getData(/* out */ controlPoints: Array[Point2D], /* out */ degree: Integer, /* out */ knots: Array[Double], /* out */ isRational: Boolean, /* out */ weights: Array[Double], /* out */ isPeriodic: Boolean): Boolean = js.native
  /**
  * Indicates if the curve is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if the curve is periodic.
  */
  val isPeriodic: Boolean = js.native
  /**
  * Indicates if the curve is rational or non-rational type
  */
  val isRational: Boolean = js.native

  /**
  * Returns the knot count of the curve
  */
  val knotCount: Integer = js.native
  /**
  * Returns an array of numbers that define the Knots of the curve.
  */
  val knots: Double = js.native
  /**
  * Define a new nurbs curve that is the result of combining this nurbs curve with another nurbs curve.
  */
  def merge(nurbsCurve: NurbsCurve2D): NurbsCurve2D = js.native

  /**
  * Sets the data that defines a transient 2D NURBS rational b-spline object.
  */
  def set(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], isRational: Boolean, weights: Array[Double], isPeriodic: Boolean): Boolean = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D NURBS curve. A transient NURBS curve is not displayed or saved in a document. Tranient 2D NURBS curves are used as a wrapper to work with raw 2D NURBS curve information. 
 */
@JSName("adsk.core.NurbsCurve2D")
object NurbsCurve2D extends js.Object {
  /**
  * Gets the number of control points that define the curve
  */
  val controlPointCount: Integer = js.native
  /**
  * Returns an array of Point2D objects that define the control points of the curve.
  */
  val controlPoints: Point2D = js.native
  /**
  * Creates and returns an independent copy of this NurbsCurve2D object.
  */
  def copy(): NurbsCurve2D = js.native
  /**
  * Creates a transient 2D NURBS non-rational b-spline object.
  */
  def createNonRational(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], isPeriodic: Boolean): NurbsCurve2D = js.native
  /**
  * Creates a transient 2D NURBS rational b-spline object.
  */
  def createRational(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], weights: Array[Double], isPeriodic: Boolean): NurbsCurve2D = js.native
  /**
  * Returns the degree of the curve
  */
  val degree: Integer = js.native
  /**
  * Defines a new nurbs curve that is the subset of this nurbs curve in the parameter range of [startParam, endParam]
  */
  def extract(startParam: double, endParam: double): NurbsCurve2D = js.native
  /**
  * Gets the data that defines a transient 2D NURBS rational b-spline object.
  */
  def getData(/* out */ controlPoints: Array[Point2D], /* out */ degree: Integer, /* out */ knots: Array[Double], /* out */ isRational: Boolean, /* out */ weights: Array[Double], /* out */ isPeriodic: Boolean): Boolean = js.native
  /**
  * Indicates if the curve is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if the curve is periodic.
  */
  val isPeriodic: Boolean = js.native
  /**
  * Indicates if the curve is rational or non-rational type
  */
  val isRational: Boolean = js.native
  /**
  * Returns the knot count of the curve
  */
  val knotCount: Integer = js.native
  /**
  * Returns an array of numbers that define the Knots of the curve.
  */
  val knots: Double = js.native
  /**
  * Define a new nurbs curve that is the result of combining this nurbs curve with another nurbs curve.
  */
  def merge(nurbsCurve: NurbsCurve2D): NurbsCurve2D = js.native
  /**
  * Sets the data that defines a transient 2D NURBS rational b-spline object.
  */
  def set(controlPoints: Array[Point2D], degree: Integer, knots: Array[Double], isRational: Boolean, weights: Array[Double], isPeriodic: Boolean): Boolean = js.native
}
// no utilities
