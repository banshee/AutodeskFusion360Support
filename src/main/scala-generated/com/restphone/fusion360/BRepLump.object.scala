
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents an entirely connected set of entities. A BRepBody consists of BRepLumps. 
 */
@JSName("adsk.fusion.BRepLump")
class BRepLump extends Base {
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly context that is directly referencing this object in an assembly. This is only valid in the case where this BRepLump object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the immediate owner BRepBody of the lump
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of the lump
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepLump = js.native
  /**
  * Returns the BRepEdges owned by the lump
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces owned by the lump
  */
  val faces: BRepFaces = js.native
  /**
  * Returns true of the lump is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the mesh manager object for this lump.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepLump = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Determines the relationship of the input point with respect to this lump.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns the BRepShells owned by the lump
  */
  val shells: BRepShells = js.native
  /**
  * Returns the BRepVertices owned by the lump
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the lump is not solid.
  */
  val volume: double = js.native
}
/** 
  * Represents an entirely connected set of entities. A BRepBody consists of BRepLumps. 
 */
@JSName("adsk.fusion.BRepLump")
object BRepLump extends js.Object {
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly context that is directly referencing this object in an assembly. This is only valid in the case where this BRepLump object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the immediate owner BRepBody of the lump
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of the lump
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepLump = js.native
  /**
  * Returns the BRepEdges owned by the lump
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the BRepFaces owned by the lump
  */
  val faces: BRepFaces = js.native
  /**
  * Returns true of the lump is closed
  */
  val isClosed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the mesh manager object for this lump.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepLump = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Determines the relationship of the input point with respect to this lump.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns the BRepShells owned by the lump
  */
  val shells: BRepShells = js.native
  /**
  * Returns the BRepVertices owned by the lump
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the lump is not solid.
  */
  val volume: double = js.native
}

  object BRepLumpUtilities {
    // no toSeq

  }
       
