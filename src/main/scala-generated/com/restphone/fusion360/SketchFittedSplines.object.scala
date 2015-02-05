
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of fitted splines in a sketch. This provides access to the existing fitted splines and supports the methods to create new fitted splines. 
 */
@JSName("adsk.fusion.SketchFittedSplines")
class SketchFittedSplines extends Base {
  /**
  * Creates a new fitted spline through the specified points.
  */
  def add(fitPoints: ObjectCollection): SketchFittedSpline = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of fitted splines in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch fitted spline using an index into the collection.
  */
  def item(index: uinteger): SketchFittedSpline = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of fitted splines in a sketch. This provides access to the existing fitted splines and supports the methods to create new fitted splines. 
 */
@JSName("adsk.fusion.SketchFittedSplines")
object SketchFittedSplines extends js.Object {
  /**
  * Creates a new fitted spline through the specified points.
  */
  def add(fitPoints: ObjectCollection): SketchFittedSpline = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of fitted splines in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch fitted spline using an index into the collection.
  */
  def item(index: uinteger): SketchFittedSpline = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchFittedSplinesUtilities {
    
    def toSeq(xs: SketchFittedSplines): IndexedSeq[SketchFittedSpline] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
