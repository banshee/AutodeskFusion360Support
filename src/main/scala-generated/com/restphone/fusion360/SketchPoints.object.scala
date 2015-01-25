
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of sketch points. 
 */
@JSName("adsk.fusion.SketchPoints")
trait SketchPoints extends Base {
  /**
  * Creates a point at the specified location. This is the equivalent of creating a sketch point using the Point command in the user interface and will create a visible point in the graphics window.
  */
  def add(point: Point3D): SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch points in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch using an index into the collection.
  */
  def item(index: uinteger): SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of sketch points. 
 */
@JSName("adsk.fusion.SketchPoints")
object SketchPoints extends js.Object {
  /**
  * Creates a point at the specified location. This is the equivalent of creating a sketch point using the Point command in the user interface and will create a visible point in the graphics window.
  */
  def add(point: Point3D): SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch points in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch using an index into the collection.
  */
  def item(index: uinteger): SketchPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchPointsUtilities {
    def toSeq(xs: SketchPoints): IndexedSeq[SketchPoint] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
