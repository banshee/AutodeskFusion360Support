
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a connected portion of a BRepFace boundary. It consists of a chain of BRepCoEdges. 
 */
@JSName("adsk.fusion.BRepLoop")
class BRepLoop extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepLoop object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the loop.
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of this loop
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the BRepCoEdges consisting this loop
  */
  val coEdges: BRepCoEdges = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepLoop = js.native
  /**
  * Returns the BRepEdges used by this loop
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the parent face of the loop.
  */
  val face: BRepFace = js.native
  /**
  * Returns true of this loop is an outer loop of a face
  */
  val isOuter: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Represents a connected portion of a BRepFace boundary. It consists of a chain of BRepCoEdges. 
 */
@JSName("adsk.fusion.BRepLoop")
object BRepLoop extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepLoop object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the loop.
  */
  val body: BRepBody = js.native
  /**
  * Returns the bounding box of this loop
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the BRepCoEdges consisting this loop
  */
  val coEdges: BRepCoEdges = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepLoop = js.native
  /**
  * Returns the BRepEdges used by this loop
  */
  val edges: BRepEdges = js.native
  /**
  * Returns the parent face of the loop.
  */
  val face: BRepFace = js.native
  /**
  * Returns true of this loop is an outer loop of a face
  */
  val isOuter: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BRepLoopUtilities {
    // no toSeq

  }
       
