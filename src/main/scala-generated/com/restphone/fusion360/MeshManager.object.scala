
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to meshes that approximate a B-Rep and T-Spline. 
 */
@JSName("adsk.fusion.MeshManager")
trait MeshManager extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new MeshCalculator which is used to calculate new triangular meshes based on various parameters that control the calculation.
  */
  def createMeshCalculator(): TriangleMeshCalculator = js.native
  /**
  * Returns a collection that provides access to all of the existing display meshes.
  */
  val displayMeshes: TriangleMeshList = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent BRepBody, BRepFace, BRepLump, BRepShell, SculptBody, or SculptFace object.
  */
  val parent: Base = js.native
}
/** 
  * Provides access to meshes that approximate a B-Rep and T-Spline. 
 */
@JSName("adsk.fusion.MeshManager")
object MeshManager extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates a new MeshCalculator which is used to calculate new triangular meshes based on various parameters that control the calculation.
  */
  def createMeshCalculator(): TriangleMeshCalculator = js.native
  /**
  * Returns a collection that provides access to all of the existing display meshes.
  */
  val displayMeshes: TriangleMeshList = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent BRepBody, BRepFace, BRepLump, BRepShell, SculptBody, or SculptFace object.
  */
  val parent: Base = js.native
}
// no utilities
