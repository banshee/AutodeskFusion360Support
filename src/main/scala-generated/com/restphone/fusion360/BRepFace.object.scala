
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represent a connected region on a single geometric surface. 
 */
@JSName("adsk.fusion.BRepFace")
class BRepFace extends Base {
  /**
  * Read-write property that gets and sets the current appearance of the face. Setting this property will result in applying an override appearance to the face and the AppearanceSourceType property will return OverrideAppearanceSource. Setting this property to null will remove any override.
  */
  var appearance: Appearance = js.native
  /**
  * Read-write property that gets the source of the appearance for the face. If this returns OverrideAppearanceSource, an override exists on this face. The override can be removed by setting the Appearance property to null.
  */
  val appearanceSourceType: AppearanceSourceTypes = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepFace object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the face.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepFace = js.native
  /**
  * Returns the BRepEdges used by this face
  */
  val edges: BRepEdges = js.native
  /**
  * Returns a SurfaceEvaluator to allow geometric evaluations across the face's surface. This evaluator differs from the evaluator available from the Surface obtained from the geometry property by being bounded by the topological boundaries of this face.
  */
  val evaluator: SurfaceEvaluator = js.native
  /**
  * Returns the underlying surface geometry of this face
  */
  val geometry: Surface = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the BRepLoops owned by this face
  */
  val loops: BRepLoops = js.native
  /**
  * Returns a MeshManager object that allows access to existing and new meshes of this face.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepFace = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a sample point guaranteed to lie on the face's surface, within the face's boundaries, and not on a boundary edge.
  */
  val pointOnFace: Point3D = js.native
  /**
  * Returns the parent shell of the face.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the set of faces that are tengentially adjacent to this face. In other words, it is the set of faces that are adjacent to this face's edges and have a smooth transition across those edges.
  */
  val tangentiallyConnectedFaces: BRepFaces = js.native
  /**
  * Returns the BRepVertices used by this face
  */
  val vertices: BRepVertices = js.native
}
/** 
  * Represent a connected region on a single geometric surface. 
 */
@JSName("adsk.fusion.BRepFace")
object BRepFace extends js.Object {
  /**
  * Read-write property that gets and sets the current appearance of the face. Setting this property will result in applying an override appearance to the face and the AppearanceSourceType property will return OverrideAppearanceSource. Setting this property to null will remove any override.
  */
  var appearance: Appearance = js.native
  /**
  * Read-write property that gets the source of the appearance for the face. If this returns OverrideAppearanceSource, an override exists on this face. The override can be removed by setting the Appearance property to null.
  */
  val appearanceSourceType: AppearanceSourceTypes = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepFace object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the face.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepFace = js.native
  /**
  * Returns the BRepEdges used by this face
  */
  val edges: BRepEdges = js.native
  /**
  * Returns a SurfaceEvaluator to allow geometric evaluations across the face's surface. This evaluator differs from the evaluator available from the Surface obtained from the geometry property by being bounded by the topological boundaries of this face.
  */
  val evaluator: SurfaceEvaluator = js.native
  /**
  * Returns the underlying surface geometry of this face
  */
  val geometry: Surface = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the BRepLoops owned by this face
  */
  val loops: BRepLoops = js.native
  /**
  * Returns a MeshManager object that allows access to existing and new meshes of this face.
  */
  val meshManager: MeshManager = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepFace = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a sample point guaranteed to lie on the face's surface, within the face's boundaries, and not on a boundary edge.
  */
  val pointOnFace: Point3D = js.native
  /**
  * Returns the parent shell of the face.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the set of faces that are tengentially adjacent to this face. In other words, it is the set of faces that are adjacent to this face's edges and have a smooth transition across those edges.
  */
  val tangentiallyConnectedFaces: BRepFaces = js.native
  /**
  * Returns the BRepVertices used by this face
  */
  val vertices: BRepVertices = js.native
}

  object BRepFaceUtilities {
    // no toSeq

  }
       
