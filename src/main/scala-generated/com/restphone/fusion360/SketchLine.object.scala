
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A line in a sketch. 
 */
@JSName("adsk.fusion.SketchLine")
trait SketchLine extends SketchCurve {


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
  def createForAssemblyContext(occurrence: Occurrence): SketchLine = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * The sketch point at the end of the line. The line is dependent on this point and moving the point will cause the line to adjust.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Returns the transient geometry of the line which provides geometry information about the line. The returned geometry is always in sketch space.
  */
  val geometry: Line3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native







  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchLine = js.native




  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * The sketch point at the start of the line. The line is dependent on this point and moving the point will cause the line to adjust.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns a Line3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Line3D = js.native
}
/** 
  * A line in a sketch. 
 */
@JSName("adsk.fusion.SketchLine")
object SketchLine extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchLine = js.native
  /**
  * The sketch point at the end of the line. The line is dependent on this point and moving the point will cause the line to adjust.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Returns the transient geometry of the line which provides geometry information about the line. The returned geometry is always in sketch space.
  */
  val geometry: Line3D = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchLine = js.native
  /**
  * The sketch point at the start of the line. The line is dependent on this point and moving the point will cause the line to adjust.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Returns a Line3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Line3D = js.native
}
// no utilities
