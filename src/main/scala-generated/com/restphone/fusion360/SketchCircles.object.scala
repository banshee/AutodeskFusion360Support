
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of circles in a sketch. This provides access to the existing circles and supports the methods to create new circles. 
 */
@JSName("adsk.fusion.SketchCircles")
trait SketchCircles extends Base {
  /**
  * Creates a sketch circle that is always parallel to the x-y plane of the sketch and is centered at the specified point.
  */
  def addByCenterRadius(centerPoint: Base, radius: double): SketchCircle = js.native
  /**
  * Creates a sketch circle that passes through the three points. The three points must lie on the x-y plane of the sketch.
  */
  def addByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle that is tangent to the three input lines. The three lines must lie on the x-y plane of the sketch.
  */
  def addByThreeTangents(tangentOne: SketchLine, tangentTwo: SketchLine, tangentThree: SketchLine, hintPoint: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle where the circle passes through the two points and the distance between the two points is the diameter of the circle.
  */
  def addByTwoPoints(pointOne: Point3D, pointTwo: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle that is tangent to the two input lines. The two lines must lie on the x-y plane of the sketch.
  */
  def addByTwoTangents(tangentOne: SketchLine, tangentTwo: SketchLine, radius: double, hintPoint: Point3D): SketchCircle = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of circles in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch circle using an index into the collection.
  */
  def item(index: uinteger): SketchCircle = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of circles in a sketch. This provides access to the existing circles and supports the methods to create new circles. 
 */
@JSName("adsk.fusion.SketchCircles")
object SketchCircles extends js.Object {
  /**
  * Creates a sketch circle that is always parallel to the x-y plane of the sketch and is centered at the specified point.
  */
  def addByCenterRadius(centerPoint: Base, radius: double): SketchCircle = js.native
  /**
  * Creates a sketch circle that passes through the three points. The three points must lie on the x-y plane of the sketch.
  */
  def addByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle that is tangent to the three input lines. The three lines must lie on the x-y plane of the sketch.
  */
  def addByThreeTangents(tangentOne: SketchLine, tangentTwo: SketchLine, tangentThree: SketchLine, hintPoint: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle where the circle passes through the two points and the distance between the two points is the diameter of the circle.
  */
  def addByTwoPoints(pointOne: Point3D, pointTwo: Point3D): SketchCircle = js.native
  /**
  * Creates a sketch circle that is tangent to the two input lines. The two lines must lie on the x-y plane of the sketch.
  */
  def addByTwoTangents(tangentOne: SketchLine, tangentTwo: SketchLine, radius: double, hintPoint: Point3D): SketchCircle = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of circles in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch circle using an index into the collection.
  */
  def item(index: uinteger): SketchCircle = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchCirclesUtilities {
    def toSeq(xs: SketchCircles): IndexedSeq[SketchCircle] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
