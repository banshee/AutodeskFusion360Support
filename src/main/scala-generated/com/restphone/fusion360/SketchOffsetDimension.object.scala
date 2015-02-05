
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An offset dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchOffsetDimension")
class SketchOffsetDimension extends SketchDimension {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchOffsetDimension = js.native
  /**
  * Deletes this dimension. The IsDeletable property indicates if this dimension can be deleted.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * The second entity being constrained. (a parallel SketchLine or a SketchPoint)
  */
  val entityTwo: SketchEntity = js.native


  /**
  * The first line being constrained.
  */
  val line: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchOffsetDimension = js.native




}
/** 
  * An offset dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchOffsetDimension")
object SketchOffsetDimension extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchOffsetDimension = js.native
  /**
  * The second entity being constrained. (a parallel SketchLine or a SketchPoint)
  */
  val entityTwo: SketchEntity = js.native
  /**
  * The first line being constrained.
  */
  val line: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchOffsetDimension = js.native
}

  object SketchOffsetDimensionUtilities {
    // no toSeq

  }
       
