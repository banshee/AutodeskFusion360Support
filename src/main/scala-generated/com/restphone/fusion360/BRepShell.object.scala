
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents an entirely connected set of BRepFaces. A BRepLump may contain multiple BRepShells. 
 */
@JSName("adsk.fusion.BRepShell")
trait BRepShell extends Base {
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepShell object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the shell.
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of this shell
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepShell = js.native
  /**
  * returns the BRepEdges owned by this shell
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces directly owned by this shell
  */
  val faces: BRepFaces = js.native
  /**
  * Returns true if this shell is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns true if the faces of this shell bound a void or an empty space within an outer shell.
  */
  val isVoid: Boolean = js.native
  /**
  * Returns the parent lump of this shell.
  */
  val lump: BRepLump = js.native
  /**
  * Returns the mesh manager object for this shell.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepShell = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Determines the relationship of the input point with respect to this shell.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns the BRepVertices owned by this shell
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the shell is not solid.
  */
  val volume: double = js.native
}
/** 
  * Represents an entirely connected set of BRepFaces. A BRepLump may contain multiple BRepShells. 
 */
@JSName("adsk.fusion.BRepShell")
object BRepShell extends js.Object {
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepShell object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the shell.
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of this shell
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepShell = js.native
  /**
  * returns the BRepEdges owned by this shell
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces directly owned by this shell
  */
  val faces: BRepFaces = js.native
  /**
  * Returns true if this shell is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns true if the faces of this shell bound a void or an empty space within an outer shell.
  */
  val isVoid: Boolean = js.native
  /**
  * Returns the parent lump of this shell.
  */
  val lump: BRepLump = js.native
  /**
  * Returns the mesh manager object for this shell.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepShell = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Determines the relationship of the input point with respect to this shell.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns the BRepVertices owned by this shell
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the shell is not solid.
  */
  val volume: double = js.native
}
// no utilities
