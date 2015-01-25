
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a B-Rep (Boundary Representation) body. 
 */
@JSName("adsk.fusion.BRepBody")
trait BRepBody extends Base {
  /**
  * Read-write property that gets and sets the current appearance of the body. Setting this property will result in applying an override appearance to the body and the AppearanceSourceType property will return OverrideAppearanceSource. Setting this property to null will remove any override.
  */
  var appearance: Appearance = js.native
  /**
  * Read-write property that gets the source of the appearance for the body. If this returns OverrideAppearanceSource, an override exists on this body. The override can be removed by setting the Appearance property to null.
  */
  val appearanceSourceType: AppearanceSourceTypes = js.native
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepBody object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the bounding box of this body.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns all of the edges that connect concave faces.
  */
  val concaveEdges: BRepEdges = js.native
  /**
  * Returns all of the edges that connect convex faces.
  */
  val convexEdges: BRepEdges = js.native
  /**
  * Copies the body to the clipboard. This method is only valid if the IsTransient property is false.
  */
  def copy(): Boolean = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepBody = js.native
  /**
  * Cuts the body to the clipboard. This method is only valid if the IsTransient property is false.
  */
  def cut(): Boolean = js.native
  /**
  * Deletes the body. This method is only valid if the IsTransient property is false.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns a collection of all of the edges in the body.
  */
  val edges: BRepEdges = js.native
  /**
  * Returns a collection of all of the faces in the body.
  */
  val faces: BRepFaces = js.native
  /**
  * Gets and sets if this body is selectable. This property is only valid if the IsTransient property is false.
  */
  var isSelectable: Boolean = js.native
  /**
  * Returns whether this body is closed (solid) or not.
  */
  val isSolid: Boolean = js.native
  /**
  * Indicates if this body is represented in the model or is transient.
  */
  val isTransient: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets if this body is visible or not. This property is only valid if the IsTransient property is false.
  */
  var isVisible: Boolean = js.native
  /**
  * Returns a collection of all of the lumps in the body.
  */
  val lumps: BRepLumps = js.native
  /**
  * Gets and sets the material assigned to this body.
  */
  var material: Material = js.native
  /**
  * Returns the mesh manager object for this body.
  */
  val meshManager: MeshManager = js.native
  /**
  * Gets and sets the name of the body.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the component this body is owned by.
  */
  val parentComponent: Component = js.native
  /**
  * Determines the relationship of the input point with respect to this body.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns a collection of all of the shells in the body.
  */
  val shells: BRepShells = js.native
  /**
  * Returns a collection of all of the vertices in the body.
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the body is not solid.
  */
  val volume: double = js.native
}
/** 
  * Represents a B-Rep (Boundary Representation) body. 
 */
@JSName("adsk.fusion.BRepBody")
object BRepBody extends js.Object {
  /**
  * Read-write property that gets and sets the current appearance of the body. Setting this property will result in applying an override appearance to the body and the AppearanceSourceType property will return OverrideAppearanceSource. Setting this property to null will remove any override.
  */
  var appearance: Appearance = js.native
  /**
  * Read-write property that gets the source of the appearance for the body. If this returns OverrideAppearanceSource, an override exists on this body. The override can be removed by setting the Appearance property to null.
  */
  val appearanceSourceType: AppearanceSourceTypes = js.native
  /**
  * Returns the area in cm ^ 2.
  */
  val area: double = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepBody object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the bounding box of this body.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns all of the edges that connect concave faces.
  */
  val concaveEdges: BRepEdges = js.native
  /**
  * Returns all of the edges that connect convex faces.
  */
  val convexEdges: BRepEdges = js.native
  /**
  * Copies the body to the clipboard. This method is only valid if the IsTransient property is false.
  */
  def copy(): Boolean = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepBody = js.native
  /**
  * Cuts the body to the clipboard. This method is only valid if the IsTransient property is false.
  */
  def cut(): Boolean = js.native
  /**
  * Deletes the body. This method is only valid if the IsTransient property is false.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns a collection of all of the edges in the body.
  */
  val edges: BRepEdges = js.native
  /**
  * Returns a collection of all of the faces in the body.
  */
  val faces: BRepFaces = js.native
  /**
  * Gets and sets if this body is selectable. This property is only valid if the IsTransient property is false.
  */
  var isSelectable: Boolean = js.native
  /**
  * Returns whether this body is closed (solid) or not.
  */
  val isSolid: Boolean = js.native
  /**
  * Indicates if this body is represented in the model or is transient.
  */
  val isTransient: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets if this body is visible or not. This property is only valid if the IsTransient property is false.
  */
  var isVisible: Boolean = js.native
  /**
  * Returns a collection of all of the lumps in the body.
  */
  val lumps: BRepLumps = js.native
  /**
  * Gets and sets the material assigned to this body.
  */
  var material: Material = js.native
  /**
  * Returns the mesh manager object for this body.
  */
  val meshManager: MeshManager = js.native
  /**
  * Gets and sets the name of the body.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the component this body is owned by.
  */
  val parentComponent: Component = js.native
  /**
  * Determines the relationship of the input point with respect to this body.
  */
  def pointContainment(point: Point3D): PointContainment = js.native
  /**
  * Returns a collection of all of the shells in the body.
  */
  val shells: BRepShells = js.native
  /**
  * Returns a collection of all of the vertices in the body.
  */
  val vertices: BRepVertices = js.native
  /**
  * Returns the volume in cm ^ 3. Returns 0 in the case the body is not solid.
  */
  val volume: double = js.native
}
// no utilities
