
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A circle in a sketch. 
 */
@JSName("adsk.fusion.SketchCircle")
trait SketchCircle extends SketchCurve {
  /**
  * Returns the area of the circle in square centimeters.
  */
  val area: double = js.native


  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  override def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns the sketch point at the center of the circle.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchCircle = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  override def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Returns the transient geometry of the circle which provides geometric information about the circle. The returned geometry is always in sketch space.
  */
  val geometry: Circle3D = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  override def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native







  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchCircle = js.native


  /**
  * Gets and sets the radius of the circle. Changing the radius is limited by any constraints that might exist on the circle.
  */
  var radius: double = js.native


  /**
  * Split a curve at a position specified along the curve
  */
  override def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  override def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns a Point3D object which provides the position of the sketch point in world space. The returned coordinate takes into account the assembly context and the position of the sketch in it's parent component, which means the coordinate will be returned in the root component space.
  */
  val worldGeometry: Circle3D = js.native
}
/** 
  * A circle in a sketch. 
 */
@JSName("adsk.fusion.SketchCircle")
object SketchCircle extends js.Object {
  /**
  * Returns the area of the circle in square centimeters.
  */
  val area: double = js.native
  /**
  * Returns the sketch point at the center of the circle.
  */
  val centerSketchPoint: SketchPoint = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchCircle = js.native
  /**
  * Returns the transient geometry of the circle which provides geometric information about the circle. The returned geometry is always in sketch space.
  */
  val geometry: Circle3D = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchCircle = js.native
  /**
  * Gets and sets the radius of the circle. Changing the radius is limited by any constraints that might exist on the circle.
  */
  var radius: double = js.native
  /**
  * Returns a Point3D object which provides the position of the sketch point in world space. The returned coordinate takes into account the assembly context and the position of the sketch in it's parent component, which means the coordinate will be returned in the root component space.
  */
  val worldGeometry: Circle3D = js.native
}
// no utilities
