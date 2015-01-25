
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D elliptical arc. A transient elliptical arc is not displayed or saved in a document. Transient 2D elliptical arcs are used as a wrapper to work with raw 2D elliptical arc information. 
 */
@JSName("adsk.core.EllipticalArc2D")
trait EllipticalArc2D extends Curve2D {
  /**
  * Returns a NURBS curve that is geometrically identical to the elliptical arc.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the elliptical arc.
  */
  var center: Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this EllipticalArc2D object.
  */
  def copy(): EllipticalArc2D = js.native
  /**
  * Creates a transient 2D elliptical arc
  */
  def create(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): EllipticalArc2D = js.native

  /**
  * Gets and sets the end angle of the elliptical arc in radians, where 0 is along the major axis.
  */
  var endAngle: double = js.native
  /**
  * Gets the position of the end point of the elliptical arc.
  */
  val endPoint: Point2D = js.native

  /**
  * Gets all of the data defining the elliptical arc.
  */
  def getData(/* out */ center: Point2D, /* out */ majorAxis: Vector2D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native
  /**
  * Indicates if the elliptical arc is the geometric equivalent of a circular arc
  */
  val isCircular: Boolean = js.native
  /**
  * Indicates if the sweep direction of the elliptical arc is clockwise or counterclockwise.
  */
  val isClockwise: Boolean = js.native

  /**
  * Gets and sets the major axis of the elliptical arc.
  */
  var majorAxis: Vector2D = js.native
  /**
  * Gets and sets the major radius of the elliptical arc.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the elliptical arc.
  */
  var minorRadius: double = js.native

  /**
  * Sets all of the data defining the elliptical arc. 
  */
  def set(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Gets and sets the start angle of the elliptical arc in radians, where 0 is along the major axis.
  */
  var startAngle: double = js.native
  /**
  * Gets the position of the start point of the elliptical arc.
  */
  val startPoint: Point2D = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D elliptical arc. A transient elliptical arc is not displayed or saved in a document. Transient 2D elliptical arcs are used as a wrapper to work with raw 2D elliptical arc information. 
 */
@JSName("adsk.core.EllipticalArc2D")
object EllipticalArc2D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the elliptical arc.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the elliptical arc.
  */
  var center: Point2D = js.native
  /**
  * Creates and returns a copy of this EllipticalArc2D object.
  */
  def copy(): EllipticalArc2D = js.native
  /**
  * Creates a transient 2D elliptical arc
  */
  def create(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): EllipticalArc2D = js.native
  /**
  * Gets and sets the end angle of the elliptical arc in radians, where 0 is along the major axis.
  */
  var endAngle: double = js.native
  /**
  * Gets the position of the end point of the elliptical arc.
  */
  val endPoint: Point2D = js.native
  /**
  * Gets all of the data defining the elliptical arc.
  */
  def getData(/* out */ center: Point2D, /* out */ majorAxis: Vector2D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native
  /**
  * Indicates if the elliptical arc is the geometric equivalent of a circular arc
  */
  val isCircular: Boolean = js.native
  /**
  * Indicates if the sweep direction of the elliptical arc is clockwise or counterclockwise.
  */
  val isClockwise: Boolean = js.native
  /**
  * Gets and sets the major axis of the elliptical arc.
  */
  var majorAxis: Vector2D = js.native
  /**
  * Gets and sets the major radius of the elliptical arc.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the elliptical arc.
  */
  var minorRadius: double = js.native
  /**
  * Sets all of the data defining the elliptical arc. 
  */
  def set(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Gets and sets the start angle of the elliptical arc in radians, where 0 is along the major axis.
  */
  var startAngle: double = js.native
  /**
  * Gets the position of the start point of the elliptical arc.
  */
  val startPoint: Point2D = js.native
}
// no utilities
