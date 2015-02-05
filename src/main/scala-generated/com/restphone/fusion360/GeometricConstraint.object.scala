
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for all geometric constraints. 
 */
@JSName("adsk.fusion.GeometricConstraint")
class GeometricConstraint extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this constraint. The IsDeletable property can be used to determine if this constraint can be deleted.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Indicates if this constraint is deletable.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch object.
  */
  val parentSketch: Sketch = js.native
}
/** 
  * The base class for all geometric constraints. 
 */
@JSName("adsk.fusion.GeometricConstraint")
object GeometricConstraint extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this constraint. The IsDeletable property can be used to determine if this constraint can be deleted.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Indicates if this constraint is deletable.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch object.
  */
  val parentSketch: Sketch = js.native
}

  object GeometricConstraintUtilities {
    // no toSeq

  }
       
