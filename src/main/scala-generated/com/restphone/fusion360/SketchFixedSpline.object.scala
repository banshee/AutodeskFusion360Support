
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._

/**
 * The SketchFixedSpline class represents splines in a sketch that are uneditable.
 * These can result from including splines from other sketches or the spline edges.
 * They can also be created by intersections and projecting splines onto a sketch.
 */
@JSName("adsk.fusion.SketchFixedSpline")
trait SketchFixedSpline extends SketchCurve {


  /**
   * Break a curve by specifying a point that determines the segment of the curve to break
   */
  override def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
   * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
   */
  override def classType(): String = js.native

  /**
   * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
   */
  def createForAssemblyContext(occurrence: Occurrence): SketchFixedSpline = js.native

  /**
   * Deletes the entity from the sketch.
   */
  override def deleteMe(): Boolean = js.native

  /**
   * The sketch point at the end of the spline.
   */
  val endSketchPoint: SketchPoint = js.native
  /**
   * Returns an evaluator object that lets you perform evaluations on the precise geometry of the curve.
   */
  val evaluator: CurveEvaluator3D = js.native

  /**
   * Extend a curve by specifying a point that determines the end of the curve to extend
   */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
   * Returns the transient geometry of the curve which provides geometric information about the curve. The returned geometry is always in sketch space. Because the fixed spline can be analytically defined, for example it can be the precise intersection of a surface and the sketch plane, returning a NURBS curve that represents the spline may be an approximation of the actual curve. You can use the Evaluator property of the SketchFixedSpline object to perform evaluations on the precise curve.
   */
  val geometry: NurbsCurve3D = js.native

  /**
   * Get the curves that intersect this curve along with the intersection points (Point2D)
   */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native


  /**
   * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
   */
  val nativeObject: SketchFixedSpline = js.native


  /**
   * Split a curve at a position specified along the curve
   */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
   * The sketch point at the start of the spline.
   */
  val startSketchPoint: SketchPoint = js.native

  /**
   * Trim a curve by specifying a point that determines the segment of the curve to trim away
   */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
   * Returns a NurbsCurve3D object that is the equivalent of this sketch curve but is in the space of the parent component rather than in sketch space.
   */
  val worldGeometry: NurbsCurve3D = js.native
}

/**
 * The SketchFixedSpline class represents splines in a sketch that are uneditable. These can result from including splines from other sketches or the spline edges. They can also be created by intersections and projecting splines onto a sketch.
 */
@JSName("adsk.fusion.SketchFixedSpline")
object SketchFixedSpline extends js.Object {
  /**
   * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
   */
  def createForAssemblyContext(occurrence: Occurrence): SketchFixedSpline = js.native

  /**
   * The sketch point at the end of the spline.
   */
  val endSketchPoint: SketchPoint = js.native
  /**
   * Returns an evaluator object that lets you perform evaluations on the precise geometry of the curve.
   */
  val evaluator: CurveEvaluator3D = js.native
  /**
   * Returns the transient geometry of the curve which provides geometric information about the curve. The returned geometry is always in sketch space. Because the fixed spline can be analytically defined, for example it can be the precise intersection of a surface and the sketch plane, returning a NURBS curve that represents the spline may be an approximation of the actual curve. You can use the Evaluator property of the SketchFixedSpline object to perform evaluations on the precise curve.
   */
  val geometry: NurbsCurve3D = js.native
  /**
   * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
   */
  val nativeObject: SketchFixedSpline = js.native
  /**
   * The sketch point at the start of the spline.
   */
  val startSketchPoint: SketchPoint = js.native
  /**
   * Returns a NurbsCurve3D object that is the equivalent of this sketch curve but is in the space of the parent component rather than in sketch space.
   */
  val worldGeometry: NurbsCurve3D = js.native
}

// no utilities
