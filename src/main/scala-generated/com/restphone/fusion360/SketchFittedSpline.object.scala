
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A fitted spline in a sketch. 
 */
@JSName("adsk.fusion.SketchFittedSpline")
trait SketchFittedSpline extends SketchCurve {


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
  def createForAssemblyContext(occurrence: Occurrence): SketchFittedSpline = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Returns the sketch point that defines the ending position of the spline. Editing the position of this sketch point will result in editing the spline.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns the set of sketch points that the spline fits through. This does not include the start or end points, which are obtained using the StartSketchPoint and EndSketchPoint properties. Editing the position of these sketch points will result in editing the spline.
  */
  val fitPoints: SketchPointList = js.native

  /**
  * Returns the transient geometry of the curve which provides geometric information about the curve. The returned geometry is always in sketch space.
  */
  val geometry: NurbsCurve3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native

  /**
  * Gets and sets if this spline is closed. A closed spline is also periodic. This property can return false even in the case where the spline is physically closed. It's possible that the start and end points of a spline can be the same point but the curve is still not considered closed. This can happen when the start and end points of an open curve are merged. The curve is physically closed but is not periodic and can have a discontinuity at the joint. Setting it to closed will cause it to be periodic and to always remain closed even as fit points are deleted.
  */
  var isClosed: Boolean = js.native






  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchFittedSpline = js.native




  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns the sketch point that defines the starting position of the spline. Editing the position of this sketch point will result in editing the spline.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns an NurbsCurve3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: NurbsCurve3D = js.native
}
/** 
  * A fitted spline in a sketch. 
 */
@JSName("adsk.fusion.SketchFittedSpline")
object SketchFittedSpline extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchFittedSpline = js.native
  /**
  * Returns the sketch point that defines the ending position of the spline. Editing the position of this sketch point will result in editing the spline.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Returns the set of sketch points that the spline fits through. This does not include the start or end points, which are obtained using the StartSketchPoint and EndSketchPoint properties. Editing the position of these sketch points will result in editing the spline.
  */
  val fitPoints: SketchPointList = js.native
  /**
  * Returns the transient geometry of the curve which provides geometric information about the curve. The returned geometry is always in sketch space.
  */
  val geometry: NurbsCurve3D = js.native
  /**
  * Gets and sets if this spline is closed. A closed spline is also periodic. This property can return false even in the case where the spline is physically closed. It's possible that the start and end points of a spline can be the same point but the curve is still not considered closed. This can happen when the start and end points of an open curve are merged. The curve is physically closed but is not periodic and can have a discontinuity at the joint. Setting it to closed will cause it to be periodic and to always remain closed even as fit points are deleted.
  */
  var isClosed: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchFittedSpline = js.native
  /**
  * Returns the sketch point that defines the starting position of the spline. Editing the position of this sketch point will result in editing the spline.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Returns an NurbsCurve3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: NurbsCurve3D = js.native
}
// no utilities
