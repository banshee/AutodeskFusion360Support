
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a mesh body. 
 */
@JSName("adsk.fusion.MeshBody")
trait MeshBody extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Fails if this object is not the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): MeshBody = js.native
  /**
  * Deletes the mesh body.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the associated mesh that is used for the display. This will always be triangles and includes any textures.
  */
  val displayMesh: TriangleMesh = js.native
  /**
  * Is the light bulb (as displayed in the browser) on. A mesh body will only be visible if the light bulb is switched on. However, the light bulb can be on and the mesh body is still invisible if the light bulb for all bodies or the owning component is off.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Gets and sets if the mesh body is selectable in the graphics window.
  */
  var isSelectable: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the mesh body point is visible.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns the original mesh data that was imported. This can include triangles, quads, and polygons.
  */
  val mesh: PolygonMesh = js.native
  /**
  * Gets and sets the name of the mesh body as displayed in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: MeshBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Component.
  */
  val parentComponent: Component = js.native
}
/** 
  * Provides access to a mesh body. 
 */
@JSName("adsk.fusion.MeshBody")
object MeshBody extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Fails if this object is not the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): MeshBody = js.native
  /**
  * Deletes the mesh body.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the associated mesh that is used for the display. This will always be triangles and includes any textures.
  */
  val displayMesh: TriangleMesh = js.native
  /**
  * Is the light bulb (as displayed in the browser) on. A mesh body will only be visible if the light bulb is switched on. However, the light bulb can be on and the mesh body is still invisible if the light bulb for all bodies or the owning component is off.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Gets and sets if the mesh body is selectable in the graphics window.
  */
  var isSelectable: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the mesh body point is visible.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns the original mesh data that was imported. This can include triangles, quads, and polygons.
  */
  val mesh: PolygonMesh = js.native
  /**
  * Gets and sets the name of the mesh body as displayed in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: MeshBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Component.
  */
  val parentComponent: Component = js.native
}
// no utilities
