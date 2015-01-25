
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A 0-dimentional topological entity that bounds a BRepEdge. 
 */
@JSName("adsk.fusion.BRepVertex")
trait BRepVertex extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepVertex object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepVertex = js.native
  /**
  * Returns the BRepEdges bounded by this vertex
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces that uses this vertex through BRepEdge
  */
  val faces: BRepFaces = js.native
  /**
  * Returns the underlying geometry point
  */
  val geometry: Point3D = js.native
  /**
  * Returns if the vertex is tolerant. The tolerance used is available from the tolerance property.
  */
  val isTolerant: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepVertex = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent shell.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the tolerance used by a tolerant vertex. This value is only useful when isTolerant is true.
  */
  val tolerance: double = js.native
}
/** 
  * A 0-dimentional topological entity that bounds a BRepEdge. 
 */
@JSName("adsk.fusion.BRepVertex")
object BRepVertex extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepVertex object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepVertex = js.native
  /**
  * Returns the BRepEdges bounded by this vertex
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces that uses this vertex through BRepEdge
  */
  val faces: BRepFaces = js.native
  /**
  * Returns the underlying geometry point
  */
  val geometry: Point3D = js.native
  /**
  * Returns if the vertex is tolerant. The tolerance used is available from the tolerance property.
  */
  val isTolerant: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepVertex = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent shell.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the tolerance used by a tolerant vertex. This value is only useful when isTolerant is true.
  */
  val tolerance: double = js.native
}
// no utilities
