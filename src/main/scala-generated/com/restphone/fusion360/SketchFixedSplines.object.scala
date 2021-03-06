
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of fixed splines in a sketch. Fixed splines are splines that were created as the result of some operation (i.e. intersection) and is not directly editable. 
 */
@JSName("adsk.fusion.SketchFixedSplines")
class SketchFixedSplines extends Base {
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
  * Function that returns the specified sketch fixed spline using an index into the collection.
  */
  def item(index: uinteger): SketchFixedSpline = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of fixed splines in a sketch. Fixed splines are splines that were created as the result of some operation (i.e. intersection) and is not directly editable. 
 */
@JSName("adsk.fusion.SketchFixedSplines")
object SketchFixedSplines extends js.Object {
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
  * Function that returns the specified sketch fixed spline using an index into the collection.
  */
  def item(index: uinteger): SketchFixedSpline = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchFixedSplinesUtilities {
    
    def toSeq(xs: SketchFixedSplines): IndexedSeq[SketchFixedSpline] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
