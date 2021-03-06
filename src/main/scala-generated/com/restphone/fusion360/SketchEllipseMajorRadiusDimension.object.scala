
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An ellipse major radius dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipseMajorRadiusDimension")
class SketchEllipseMajorRadiusDimension extends SketchDimension {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipseMajorRadiusDimension = js.native
  /**
  * Deletes this dimension. The IsDeletable property indicates if this dimension can be deleted.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Returns the ellipse or elliptical arc being constrained.
  */
  val ellipse: SketchCurve = js.native


  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipseMajorRadiusDimension = js.native




}
/** 
  * An ellipse major radius dimension in a sketch. 
 */
@JSName("adsk.fusion.SketchEllipseMajorRadiusDimension")
object SketchEllipseMajorRadiusDimension extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchEllipseMajorRadiusDimension = js.native
  /**
  * Returns the ellipse or elliptical arc being constrained.
  */
  val ellipse: SketchCurve = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchEllipseMajorRadiusDimension = js.native
}

  object SketchEllipseMajorRadiusDimensionUtilities {
    // no toSeq

  }
       
