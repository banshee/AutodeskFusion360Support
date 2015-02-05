
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the MeshBodies in the parent Component and supports the creation of new mesh bodies. 
 */
@JSName("adsk.fusion.MeshBodies")
class MeshBodies extends Base {
  /**
  * Creates a new mesh body by importing a .stl or .obj file.
  */
  def add(fullFilename: String, units: MeshUnits): MeshBodyList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of mesh bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Provides access to a mesh body within the collection.
  */
  def item(index: uinteger): MeshBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the MeshBodies in the parent Component and supports the creation of new mesh bodies. 
 */
@JSName("adsk.fusion.MeshBodies")
object MeshBodies extends js.Object {
  /**
  * Creates a new mesh body by importing a .stl or .obj file.
  */
  def add(fullFilename: String, units: MeshUnits): MeshBodyList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of mesh bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Provides access to a mesh body within the collection.
  */
  def item(index: uinteger): MeshBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object MeshBodiesUtilities {
    
    def toSeq(xs: MeshBodies): IndexedSeq[MeshBody] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
