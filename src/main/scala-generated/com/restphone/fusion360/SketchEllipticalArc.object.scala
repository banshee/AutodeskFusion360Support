
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An elliptical arc in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipticalArc")
class SketchEllipticalArc extends SketchCurve {


  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  override def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Gets the sketch point that defines the center of the elliptical arc. You can reposition the elliptical arc by moving the sketch point, assuming any existing constraints allow the desired change.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipticalArc = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Gets the sketch point that defines the end of the elliptical arc. You can reposition the sketch point, assuming any existing constraints allow the desired change.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Returns the transient geometry of the elliptical arc which provides geometric information about the elliptical arc. The returned geometry is always in sketch space.
  */
  val geometry: EllipticalArc3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native







  /**
  * Gets and sets the major axis direction of the elliptical arc. Changing the axis is limited by any constraints that might exist on the elliptical arc. Setting the axis can fail in cases where the direction is fully defined through constraints.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major axis radius of the elliptical arc. Changing the radius is limited by any constraints that might exist on the elliptical arc. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var majorAxisRadius: double = js.native
  /**
  * Gets and sets the minor axis radius of the elliptical arc. Changing the radius is limited by any constraints that might exist on the elliptical arc. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var minorAxisRadius: double = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipticalArc = js.native




  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Gets the sketch point that defines the start of the elliptical arc. You can reposition the sketch point, assuming any existing constraints allow the desired change.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns an EllipticalArc3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: EllipticalArc3D = js.native
}
/** 
  * An elliptical arc in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipticalArc")
object SketchEllipticalArc extends js.Object {
  /**
  * Gets the sketch point that defines the center of the elliptical arc. You can reposition the elliptical arc by moving the sketch point, assuming any existing constraints allow the desired change.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipticalArc = js.native
  /**
  * Gets the sketch point that defines the end of the elliptical arc. You can reposition the sketch point, assuming any existing constraints allow the desired change.
  */
  val endSketchPoint: SketchPoint = js.native
  /**
  * Returns the transient geometry of the elliptical arc which provides geometric information about the elliptical arc. The returned geometry is always in sketch space.
  */
  val geometry: EllipticalArc3D = js.native
  /**
  * Gets and sets the major axis direction of the elliptical arc. Changing the axis is limited by any constraints that might exist on the elliptical arc. Setting the axis can fail in cases where the direction is fully defined through constraints.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major axis radius of the elliptical arc. Changing the radius is limited by any constraints that might exist on the elliptical arc. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var majorAxisRadius: double = js.native
  /**
  * Gets and sets the minor axis radius of the elliptical arc. Changing the radius is limited by any constraints that might exist on the elliptical arc. Setting the radius can fail in cases where the radius is fully defined through constraints.
  */
  var minorAxisRadius: double = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipticalArc = js.native
  /**
  * Gets the sketch point that defines the start of the elliptical arc. You can reposition the sketch point, assuming any existing constraints allow the desired change.
  */
  val startSketchPoint: SketchPoint = js.native
  /**
  * Returns an EllipticalArc3D object which provides geometric information in world space. The returned geometry takes into account the assembly context and the position of the sketch in it's parent component, which means the geometry will be returned in the root component space.
  */
  val worldGeometry: EllipticalArc3D = js.native
}

  object SketchEllipticalArcUtilities {
    // no toSeq
/**
* Get the curves that intersect this curve along with the intersection points (Point2D)
*
* Out parameters are returned in a tuple.
*/
def intersectionsWithResults(activeObject: SketchEllipticalArc, sketchCurves: ObjectCollection): (Boolean, ObjectCollection, ObjectCollection) = {

val intersectingCurves = js.Dynamic.literal(value = 0)
val intersectionPoints = js.Dynamic.literal(value = 0)
val result = activeObject.intersections(sketchCurves.asInstanceOf[ObjectCollection], intersectingCurves.asInstanceOf[ObjectCollection], intersectionPoints.asInstanceOf[ObjectCollection])
(result, intersectingCurves.value.asInstanceOf[ObjectCollection], intersectionPoints.value.asInstanceOf[ObjectCollection])
}
  }
       
