
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A single sketch curve. This is the base class for the specific curve types. 
 */
@JSName("adsk.fusion.SketchCurve")
trait SketchCurve extends SketchEntity {


  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native

  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native

  /**
  * Gets and sets whether this curve is construction geometry.
  */
  var isConstruction: Boolean = js.native




  /**
  * Returns the length of the curve in centimeters.
  */
  val length: double = js.native




  /**
  * Split a curve at a position specified along the curve
  */
  def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
}
/** 
  * A single sketch curve. This is the base class for the specific curve types. 
 */
@JSName("adsk.fusion.SketchCurve")
object SketchCurve extends js.Object {
  /**
  * Break a curve by specifying a point that determines the segment of the curve to break
  */
  def breakCurve(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Extend a curve by specifying a point that determines the end of the curve to extend
  */
  def extend(endPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Get the curves that intersect this curve along with the intersection points (Point2D)
  */
  def intersections(sketchCurves: ObjectCollection, /* out */ intersectingCurves: ObjectCollection, /* out */ intersectionPoints: ObjectCollection): Boolean = js.native
  /**
  * Gets and sets whether this curve is construction geometry.
  */
  var isConstruction: Boolean = js.native
  /**
  * Returns the length of the curve in centimeters.
  */
  val length: double = js.native
  /**
  * Split a curve at a position specified along the curve
  */
  def split(splitPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
  /**
  * Trim a curve by specifying a point that determines the segment of the curve to trim away
  */
  def trim(segmentPoint: Point3D, createConstraints: Boolean): ObjectCollection = js.native
}
// no utilities
