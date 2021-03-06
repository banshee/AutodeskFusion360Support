
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An angular dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchAngularDimension")
class SketchAngularDimension extends SketchDimension {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchAngularDimension = js.native
  /**
  * Deletes this dimension. The IsDeletable property indicates if this dimension can be deleted.
  */
  override def deleteMe(): Boolean = js.native


  /**
  * The first line being constrained.
  */
  val lineOne: SketchLine = js.native
  /**
  * The second line being constrained.
  */
  val lineTwo: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchAngularDimension = js.native




}
/** 
  * An angular dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchAngularDimension")
object SketchAngularDimension extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchAngularDimension = js.native
  /**
  * The first line being constrained.
  */
  val lineOne: SketchLine = js.native
  /**
  * The second line being constrained.
  */
  val lineTwo: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchAngularDimension = js.native
}

  object SketchAngularDimensionUtilities {
    // no toSeq

  }
       
