
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a set of triangle meshes. 
 */
@JSName("adsk.fusion.TriangleMeshList")
class TriangleMeshList extends Base {
  /**
  * Returns the mesh with the tightest surface tolerance. This can return null in the case the list is empty, ie. Count is 0.
  */
  val bestMesh: TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of meshes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified triangle meshes.
  */
  def item(index: uinteger): TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to a set of triangle meshes. 
 */
@JSName("adsk.fusion.TriangleMeshList")
object TriangleMeshList extends js.Object {
  /**
  * Returns the mesh with the tightest surface tolerance. This can return null in the case the list is empty, ie. Count is 0.
  */
  val bestMesh: TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of meshes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified triangle meshes.
  */
  def item(index: uinteger): TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object TriangleMeshListUtilities {
    
    def toSeq(xs: TriangleMeshList): IndexedSeq[TriangleMesh] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
