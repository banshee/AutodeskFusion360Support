
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of arcs in a sketch. This provides access to the existing arcs and supports the methods to create new arcs. 
 */
@JSName("adsk.fusion.SketchArcs")
trait SketchArcs extends Base {
  /**
  * Creates a sketch arc that is always parallel to the x-y plane of the sketch and is centered at the specified point.
  */
  def addByCenterStartSweep(centerPoint: Base, startPoint: Base, sweepAngle: double): SketchArc = js.native
  /**
  * Creates a sketch arc that passes through the three points.
  */
  def addByThreePoints(startPoint: Base, point: Point3D, endPoint: Base): SketchArc = js.native
  /**
  * Creates a fillet between two sketch entities The side (quadrant) the fillet is created on is determined by the points specified. The point for each entity can be its startSketchPoint or endSketchPoint
  */
  def addFillet(firstEntity: SketchCurve, firstEntityPoint: Point3D, secondEnitity: SketchCurve, secondEntityPoint: Point3D, radius: double): SketchArc = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of arcs in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch arc using an index into the collection.
  */
  def item(index: uinteger): SketchArc = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of arcs in a sketch. This provides access to the existing arcs and supports the methods to create new arcs. 
 */
@JSName("adsk.fusion.SketchArcs")
object SketchArcs extends js.Object {
  /**
  * Creates a sketch arc that is always parallel to the x-y plane of the sketch and is centered at the specified point.
  */
  def addByCenterStartSweep(centerPoint: Base, startPoint: Base, sweepAngle: double): SketchArc = js.native
  /**
  * Creates a sketch arc that passes through the three points.
  */
  def addByThreePoints(startPoint: Base, point: Point3D, endPoint: Base): SketchArc = js.native
  /**
  * Creates a fillet between two sketch entities The side (quadrant) the fillet is
   * created on is determined by the points specified.
   * The point for each entity can be its startSketchPoint or endSketchPoint
  */
  def addFillet(firstEntity: SketchCurve, firstEntityPoint: Point3D, secondEnitity: SketchCurve, secondEntityPoint: Point3D, radius: double): SketchArc = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of arcs in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch arc using an index into the collection.
  */
  def item(index: uinteger): SketchArc = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchArcsUtilities {
    def toSeq(xs: SketchArcs): IndexedSeq[SketchArc] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
