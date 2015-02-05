
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of ellipses in a sketch. This provides access to the existing ellipses and supports the methods to create new ellipses. 
 */
@JSName("adsk.fusion.SketchEllipses")
class SketchEllipses extends Base {
  /**
  * Creates a sketch ellipse using the center point, a point defining the major axis and a third point anywhere along the ellipse. The created ellipse is parallel to the x-y plane of the sketch.
  */
  def add(centerPoint: Base, majorAxisPoint: Point3D, point: Point3D): SketchEllipse = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of ellipses in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch ellipse using an index into the collection.
  */
  def item(index: uinteger): SketchEllipse = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of ellipses in a sketch. This provides access to the existing ellipses and supports the methods to create new ellipses. 
 */
@JSName("adsk.fusion.SketchEllipses")
object SketchEllipses extends js.Object {
  /**
  * Creates a sketch ellipse using the center point, a point defining the major axis and a third point anywhere along the ellipse. The created ellipse is parallel to the x-y plane of the sketch.
  */
  def add(centerPoint: Base, majorAxisPoint: Point3D, point: Point3D): SketchEllipse = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of ellipses in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch ellipse using an index into the collection.
  */
  def item(index: uinteger): SketchEllipse = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchEllipsesUtilities {
    
    def toSeq(xs: SketchEllipses): IndexedSeq[SketchEllipse] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
