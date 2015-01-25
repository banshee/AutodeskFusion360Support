
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of lines in a sketch. This provides access to the existing lines and supports the methods to create new lines. 
 */
@JSName("adsk.fusion.SketchLines")
trait SketchLines extends Base {
  /**
  * Creates a sketch line between the two input points.
   * The input points can be either existing SketchPoints or Point3D objects. If a SketchPoint is used the new line will be based on that sketch point and update if the sketch point is modified.
  */
  def addByTwoPoints(startPoint: Base, endPoint: Base): SketchLine = js.native
  /**
  * Creates four sketch lines representing a rectangle where the first point represents the center of the rectangle. The second point is the corner of the rectangle and can be either an existing SketchPoint or Point3D object. The four sketch lines are returned.
  */
  def addCenterPointRectangle(centerPoint: Point3D, cornerPoint: Base): SketchLineList = js.native
  /**
  * Creates four sketch lines representing
   * a rectangle where the first two points are
   * the base corners of the rectangle and the third point defines the height.
  */
  def addThreePointRectangle(pointOne: Base, pointTwo: Base, pointThree: Point3D): SketchLineList = js.native
  /**
  * Creates four sketch lines representing a rectangle where the two points are the opposing corners of the rectangle. The input points can be either existing SketchPoints or Point3D objects. If a SketchPoint is used the new lines will be based on that sketch point and update if the sketch point is modified.
  */
  def addTwoPointRectangle(pointOne: Base, pointTwo: Base): SketchLineList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of lines in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch line using an index into the collection.
  */
  def item(index: uinteger): SketchLine = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of lines in a sketch. This provides access to the existing lines and supports the methods to create new lines. 
 */
@JSName("adsk.fusion.SketchLines")
object SketchLines extends js.Object {
  /**
  * Creates a sketch line between the two input points. The input points can be either existing SketchPoints or Point3D objects. If a SketchPoint is used the new line will be based on that sketch point and update if the sketch point is modified.
  */
  def addByTwoPoints(startPoint: Base, endPoint: Base): SketchLine = js.native
  /**
  * Creates four sketch lines representing a rectangle where the first point represents the center of the rectangle. The second point is the corner of the rectangle and can be either an existing SketchPoint or Point3D object. The four sketch lines are returned.
  */
  def addCenterPointRectangle(centerPoint: Point3D, cornerPoint: Base): SketchLineList = js.native
  /**
  * Creates four sketch lines representing a rectangle where the first two points are the base corners of the rectangle and the third point defines the height.
  */
  def addThreePointRectangle(pointOne: Base, pointTwo: Base, pointThree: Point3D): SketchLineList = js.native
  /**
  * Creates four sketch lines representing a rectangle where the two points are the opposing corners of the rectangle. The input points can be either existing SketchPoints or Point3D objects. If a SketchPoint is used the new lines will be based on that sketch point and update if the sketch point is modified.
  */
  def addTwoPointRectangle(pointOne: Base, pointTwo: Base): SketchLineList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of lines in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch line using an index into the collection.
  */
  def item(index: uinteger): SketchLine = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchLinesUtilities {
    def toSeq(xs: SketchLines): IndexedSeq[SketchLine] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
