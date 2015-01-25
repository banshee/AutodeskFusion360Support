
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A concentric circle dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchConcentricCircleDimension")
trait SketchConcentricCircleDimension extends SketchDimension {

  /**
  * Returns the first concentric circle or arc.
  */
  val circleOne: SketchCurve = js.native
  /**
  * Returns the second concentric circle or arc.
  */
  val circleTwo: SketchCurve = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchConcentricCircleDimension = js.native
  /**
  * Deletes this dimension. The IsDeletable property indicates if this dimension can be deleted.
  */
  override def deleteMe(): Boolean = js.native


  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchConcentricCircleDimension = js.native




}
/** 
  * A concentric circle dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchConcentricCircleDimension")
object SketchConcentricCircleDimension extends js.Object {
  /**
  * Returns the first concentric circle or arc.
  */
  val circleOne: SketchCurve = js.native
  /**
  * Returns the second concentric circle or arc.
  */
  val circleTwo: SketchCurve = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchConcentricCircleDimension = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchConcentricCircleDimension = js.native
}
// no utilities
