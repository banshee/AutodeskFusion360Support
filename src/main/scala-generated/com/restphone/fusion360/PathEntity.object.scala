
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The PathEntity object represents a curve within a path 
 */
@JSName("adsk.fusion.PathEntity")
class PathEntity extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): PathEntity = js.native
  /**
  * Property that returns the geometry of the entity. This is different from the original path curve if the true start point is not the same as the start point of the original path curve.
  */
  val curve: Curve3D = js.native
  /**
  * Property that returns the type of the curve referenced by the path entity. This property allows you to determine what type of object will be returned by the Curve property.
  */
  val curveType: Curve3DTypes = js.native
  /**
  * Property that gets the sketch curve or edge this entity was derived from.
  */
  val entity: Base = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: PathEntity = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the parent Path of the entity.
  */
  val parentPath: Path = js.native
}
/** 
  * The PathEntity object represents a curve within a path 
 */
@JSName("adsk.fusion.PathEntity")
object PathEntity extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): PathEntity = js.native
  /**
  * Property that returns the geometry of the entity. This is different from the original path curve if the true start point is not the same as the start point of the original path curve.
  */
  val curve: Curve3D = js.native
  /**
  * Property that returns the type of the curve referenced by the path entity. This property allows you to determine what type of object will be returned by the Curve property.
  */
  val curveType: Curve3DTypes = js.native
  /**
  * Property that gets the sketch curve or edge this entity was derived from.
  */
  val entity: Base = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: PathEntity = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the parent Path of the entity.
  */
  val parentPath: Path = js.native
}

  object PathEntityUtilities {
    // no toSeq

  }
       
