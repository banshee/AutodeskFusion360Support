
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A horizontal constraint in a sketch. 
 */
@JSName("adsk.fusion.HorizontalConstraint")
class HorizontalConstraint extends GeometricConstraint {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): HorizontalConstraint = js.native
  /**
  * Deletes this constraint. The IsDeletable property can be used to determine if this constraint can be deleted.
  */
  override def deleteMe(): Boolean = js.native


  /**
  * Returns the line being constrained.
  */
  val line: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: HorizontalConstraint = js.native


}
/** 
  * A horizontal constraint in a sketch. 
 */
@JSName("adsk.fusion.HorizontalConstraint")
object HorizontalConstraint extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): HorizontalConstraint = js.native
  /**
  * Returns the line being constrained.
  */
  val line: SketchLine = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: HorizontalConstraint = js.native
}

  object HorizontalConstraintUtilities {
    // no toSeq

  }
       
