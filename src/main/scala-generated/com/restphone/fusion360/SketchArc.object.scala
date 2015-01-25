
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An arc in a sketch. 
 */
@JSName("adsk.fusion.SketchArc")
trait SketchArc extends SketchCurve {


  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  override def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * The sketch point at the center of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchArc = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * The sketch point at the end of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Returns the transient geometry of the arc which provides geometric information about the arc. The returned geometry is always in sketch space.
  */
  val geometry: Arc3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native







  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchArc = js.native


  /**
  * Gets and sets the radius of the arc. Changing the radius is limited by any constraints that might exist on the circle. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var radius: double = js.native


  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * The sketch point at the start of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns an Arc3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Arc3D = js.native
}
/** 
  * An arc in a sketch. 
 */
@JSName("adsk.fusion.SketchArc")
object SketchArc extends js.Object {
  /**
  * The sketch point at the center of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchArc = js.native
  /**
  * The sketch point at the end of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Returns the transient geometry of the arc which provides geometric information about the arc. The returned geometry is always in sketch space.
  */
  val geometry: Arc3D = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchArc = js.native
  /**
  * Gets and sets the radius of the arc. Changing the radius is limited by any constraints that might exist on the circle. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var radius: double = js.native
  /**
  * The sketch point at the start of the arc. The arc is dependent on this point and moving the point will cause the arc to adjust.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Returns an Arc3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Arc3D = js.native
}
// no utilities
