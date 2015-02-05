
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A linear dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchLinearDimension")
class SketchLinearDimension extends SketchDimension {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchLinearDimension = js.native
  /**
  * Deletes this dimension. The IsDeletable property indicates if this dimension can be deleted.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * The first entity being constrained.
  */
  val entityOne: SketchEntity = js.native
  /**
  * The second entity being constrained.
  */
  val entityTwo: SketchEntity = js.native


  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchLinearDimension = js.native

  /**
  * The orientation of this dimension.
  */
  val orientation: DimensionOrientations = js.native



}
/** 
  * A linear dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchLinearDimension")
object SketchLinearDimension extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchLinearDimension = js.native
  /**
  * The first entity being constrained.
  */
  val entityOne: SketchEntity = js.native
  /**
  * The second entity being constrained.
  */
  val entityTwo: SketchEntity = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchLinearDimension = js.native
  /**
  * The orientation of this dimension.
  */
  val orientation: DimensionOrientations = js.native
}

  object SketchLinearDimensionUtilities {
    // no toSeq

  }
       
