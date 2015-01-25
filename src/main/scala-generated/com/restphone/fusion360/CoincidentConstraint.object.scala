
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A coincident constraint in a sketch. 
 */
@JSName("adsk.fusion.CoincidentConstraint")
trait CoincidentConstraint extends GeometricConstraint {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): CoincidentConstraint = js.native
  /**
  * Deletes this constraint. The IsDeletable property can be used to determine if this constraint can be deleted.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * The sketch curve or point the point is constrained to.
  */
  val entity: SketchEntity = js.native


  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: CoincidentConstraint = js.native


  /**
  * Returns the sketch point that is constrained.
  */
  val point: SketchPoint = js.native
}
/** 
  * A coincident constraint in a sketch. 
 */
@JSName("adsk.fusion.CoincidentConstraint")
object CoincidentConstraint extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): CoincidentConstraint = js.native
  /**
  * The sketch curve or point the point is constrained to.
  */
  val entity: SketchEntity = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: CoincidentConstraint = js.native
  /**
  * Returns the sketch point that is constrained.
  */
  val point: SketchPoint = js.native
}
// no utilities
