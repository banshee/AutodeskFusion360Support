
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A loop within a profile. 
 */
@JSName("adsk.fusion.ProfileLoop")
trait ProfileLoop extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Returns null if this isn't the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): ProfileLoop = js.native
  /**
  * Indicates if this is an outer or inner loop. Profiles always have one outer loop and have an zero to many inner loops defining voids.
  */
  val isOuter: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ProfileLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Profile object.
  */
  val parentProfile: Profile = js.native
  /**
  * Returns a collection of the curves making up this loop.
  */
  val profileCurves: ProfileCurves = js.native
}
/** 
  * A loop within a profile. 
 */
@JSName("adsk.fusion.ProfileLoop")
object ProfileLoop extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Returns null if this isn't the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): ProfileLoop = js.native
  /**
  * Indicates if this is an outer or inner loop. Profiles always have one outer loop and have an zero to many inner loops defining voids.
  */
  val isOuter: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ProfileLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Profile object.
  */
  val parentProfile: Profile = js.native
  /**
  * Returns a collection of the curves making up this loop.
  */
  val profileCurves: ProfileCurves = js.native
}
// no utilities
