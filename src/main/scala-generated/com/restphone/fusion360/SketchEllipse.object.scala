
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An ellipse in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipse")
trait SketchEllipse extends SketchCurve {


  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  override def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns the sketch point that defines the center of the ellipse. You can reposition the ellipse by moving the sketch point, assuming any existing constraints allow the desired change.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipse = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Returns the transient geometry of the ellipse which provides geometric information about the ellipse. The returned geometry is always in sketch space.
  */
  val geometry: Ellipse3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native







  /**
  * Gets and sets the major axis direction of the ellipse. Changing the axis is limited by any constraints that might exist on the ellipse. Setting the axis can fail in cases where the direction is fully defined through constraints.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major axis radius of the ellipse. Changing the radius is limited by any constraints that might exist on the ellipse. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var majorAxisRadius: double = js.native
  /**
  * Gets and sets the minor axis radius of the ellipse. Changing the radius is limited by any constraints that might exist on the ellipse. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var minorAxisRadius: double = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipse = js.native




  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns an Ellipse3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Ellipse3D = js.native
}
/** 
  * An ellipse in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipse")
object SketchEllipse extends js.Object {
  /**
  * Returns the sketch point that defines the center of the ellipse. You can reposition the ellipse by moving the sketch point, assuming any existing constraints allow the desired change.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipse = js.native
  /**
  * Returns the transient geometry of the ellipse which provides geometric information about the ellipse. The returned geometry is always in sketch space.
  */
  val geometry: Ellipse3D = js.native
  /**
  * Gets and sets the major axis direction of the ellipse. Changing the axis is limited by any constraints that might exist on the ellipse. Setting the axis can fail in cases where the direction is fully defined through constraints.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major axis radius of the ellipse. Changing the radius is limited by any constraints that might exist on the ellipse. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var majorAxisRadius: double = js.native
  /**
  * Gets and sets the minor axis radius of the ellipse. Changing the radius is limited by any constraints that might exist on the ellipse. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var minorAxisRadius: double = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipse = js.native
  /**
  * Returns an Ellipse3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: Ellipse3D = js.native
}
// no utilities
