
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a profile in a sketch. Profiles are automatically computed by Fusion and represent closed areas within the sketch. 
 */
@JSName("adsk.fusion.Profile")
trait Profile extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the 3D bounding box of the profile in sketch space.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Returns null if this isn't the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): Profile = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: Profile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch of the profile.
  */
  val parentSketch: Sketch = js.native
  /**
  * Returns the plane the profile is defined in. Profiles are always planar and exist within a single plane.
  */
  val plane: Plane = js.native
  /**
  * The loops or closed areas within this profile. There is always a single outer loop but there can be zero to many inner loops defining voids in the profile.
  */
  val profileLoops: ProfileLoops = js.native
}
/** 
  * Represents a profile in a sketch. Profiles are automatically computed by Fusion and represent closed areas within the sketch. 
 */
@JSName("adsk.fusion.Profile")
object Profile extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the 3D bounding box of the profile in sketch space.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Returns null if this isn't the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): Profile = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: Profile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch of the profile.
  */
  val parentSketch: Sketch = js.native
  /**
  * Returns the plane the profile is defined in. Profiles are always planar and exist within a single plane.
  */
  val plane: Plane = js.native
  /**
  * The loops or closed areas within this profile. There is always a single outer loop but there can be zero to many inner loops defining voids in the profile.
  */
  val profileLoops: ProfileLoops = js.native
}
// no utilities
