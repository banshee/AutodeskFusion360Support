
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._

/**
 * A collection of all of the geometric constraints in a sketch.
 * This object also supports the methods to create new geometric constraints.
 */
@JSName("adsk.fusion.GeometricConstraints")
trait GeometricConstraints extends Base {
  /**
   * Creates a new coincident constraint between two entities.
   * The first argument is a sketch point. The second argument
   * is a sketch curve or point.
   */
  def addCoincident(point: SketchPoint, entity: SketchEntity): CoincidentConstraint = js.native

  /**
   * Creates a new collinear constraint between two lines.
   */
  def addCollinear(lineOne: SketchLine, lineTwo: SketchLine): CollinearConstraint = js.native

  /**
   * Creates a new concentric constraint between two circles, arcs, ellipses, or elliptical arcs.
   */
  def addConcentric(entityOne: SketchCurve, entityTwo: SketchCurve): ConcentricConstraint = js.native

  /**
   * Creates a new equal constraint between two lines, or between arcs and circles.
   */
  def addEqual(curveOne: SketchCurve, curveTwo: SketchCurve): EqualConstraint = js.native

  /**
   * Creates a new horizontal constraint on a line.
   */
  def addHorizontal(line: SketchLine): HorizontalConstraint = js.native

  /**
   * Creates a new horizontal constraint between two points.
   */
  def addHorizontalPoints(pointOne: SketchPoint, pointTwo: SketchPoint): HorizontalPointsConstraint = js.native

  /**
   * Creates a new midpoint constraint between a point and a curve.
   */
  def addMidPoint(point: SketchPoint, midPointCurve: SketchCurve): MidPointConstraint = js.native

  /**
   * Creates a new parallel constraint between two lines.
   */
  def addParallel(lineOne: SketchLine, lineTwo: SketchLine): ParallelConstraint = js.native

  /**
   * Creates a new perpendicular constraint between two lines.
   */
  def addPerpendicular(lineOne: SketchLine, lineTwo: SketchLine): PerpendicularConstraint = js.native

  /**
   * Creates a new smooth constraint between two curves. One of the curves must be a spline. The other curve can be a spline or an arc.
   */
  def addSmooth(curveOne: SketchCurve, curveTwo: SketchCurve): SmoothConstraint = js.native

  /**
   * Creates a new symmetry constraint.
   */
  def addSymmetry(entityOne: SketchEntity, entityTwo: SketchEntity, symmetryLine: SketchLine): SymmetryConstraint = js.native

  /**
   * Creates a new tangent constraint between two curves.
   */
  def addTangent(curveOne: SketchCurve, curveTwo: SketchCurve): TangentConstraint = js.native

  /**
   * Creates a new vertical constraint on a line.
   */
  def addVertical(line: SketchLine): VerticalConstraint = js.native

  /**
   * Creates a new vertical constraint between two points.
   */
  def addVerticalPoints(pointOne: SketchPoint, pointTwo: SketchPoint): VerticalPointsConstraint = js.native

  /**
   * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
   */
  def classType(): String = js.native

  /**
   * Returns the number of constraints in the sketch.
   */
  val count: uinteger = js.native
  /**
   * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
   */
  val isValid: Boolean = js.native

  /**
   * Function that returns the specified sketch constraint using an index into the collection.
   */
  def item(index: uinteger): GeometricConstraint = js.native

  /**
   * Returns a string indicating the type of the object.
   */
  val objectType: String = js.native
}

/**
 * A collection of all of the geometric constraints in a sketch. This object also supports the methods to create new geometric constraints.
 */
@JSName("adsk.fusion.GeometricConstraints")
object GeometricConstraints extends js.Object {
  /**
   * Creates a new coincident constraint between two entities. The first argument is a sketch point. The second argument is a sketch curve or point.
   */
  def addCoincident(point: SketchPoint, entity: SketchEntity): CoincidentConstraint = js.native

  /**
   * Creates a new collinear constraint between two lines.
   */
  def addCollinear(lineOne: SketchLine, lineTwo: SketchLine): CollinearConstraint = js.native

  /**
   * Creates a new concentric constraint between two circles, arcs, ellipses, or elliptical arcs.
   */
  def addConcentric(entityOne: SketchCurve, entityTwo: SketchCurve): ConcentricConstraint = js.native

  /**
   * Creates a new equal constraint between two lines, or between arcs and circles.
   */
  def addEqual(curveOne: SketchCurve, curveTwo: SketchCurve): EqualConstraint = js.native

  /**
   * Creates a new horizontal constraint on a line.
   */
  def addHorizontal(line: SketchLine): HorizontalConstraint = js.native

  /**
   * Creates a new horizontal constraint between two points.
   */
  def addHorizontalPoints(pointOne: SketchPoint, pointTwo: SketchPoint): HorizontalPointsConstraint = js.native

  /**
   * Creates a new midpoint constraint between a point and a curve.
   */
  def addMidPoint(point: SketchPoint, midPointCurve: SketchCurve): MidPointConstraint = js.native

  /**
   * Creates a new parallel constraint between two lines.
   */
  def addParallel(lineOne: SketchLine, lineTwo: SketchLine): ParallelConstraint = js.native

  /**
   * Creates a new perpendicular constraint between two lines.
   */
  def addPerpendicular(lineOne: SketchLine, lineTwo: SketchLine): PerpendicularConstraint = js.native

  /**
   * Creates a new smooth constraint between two curves. One of the curves must be a spline. The other curve can be a spline or an arc.
   */
  def addSmooth(curveOne: SketchCurve, curveTwo: SketchCurve): SmoothConstraint = js.native

  /**
   * Creates a new symmetry constraint.
   */
  def addSymmetry(entityOne: SketchEntity, entityTwo: SketchEntity, symmetryLine: SketchLine): SymmetryConstraint = js.native

  /**
   * Creates a new tangent constraint between two curves.
   */
  def addTangent(curveOne: SketchCurve, curveTwo: SketchCurve): TangentConstraint = js.native

  /**
   * Creates a new vertical constraint on a line.
   */
  def addVertical(line: SketchLine): VerticalConstraint = js.native

  /**
   * Creates a new vertical constraint between two points.
   */
  def addVerticalPoints(pointOne: SketchPoint, pointTwo: SketchPoint): VerticalPointsConstraint = js.native

  /**
   * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
   */
  def classType(): String = js.native

  /**
   * Returns the number of constraints in the sketch.
   */
  val count: uinteger = js.native
  /**
   * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
   */
  val isValid: Boolean = js.native

  /**
   * Function that returns the specified sketch constraint using an index into the collection.
   */
  def item(index: uinteger): GeometricConstraint = js.native

  /**
   * Returns a string indicating the type of the object.
   */
  val objectType: String = js.native
}

object GeometricConstraintsUtilities {
  def toSeq(xs: GeometricConstraints): IndexedSeq[GeometricConstraint] = {
    val n = xs.count - 1
    (0 to n) map {xs.item(_)}
  }
}
           
