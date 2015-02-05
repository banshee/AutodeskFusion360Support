
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a list of MeshBody objects. 
 */
@JSName("adsk.fusion.MeshBodyList")
class MeshBodyList extends Base {
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
  * Provides access to a list of MeshBody objects. 
 */
@JSName("adsk.fusion.MeshBodyList")
object MeshBodyList extends js.Object {
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

  object MeshBodyListUtilities {
    
    def toSeq(xs: MeshBodyList): IndexedSeq[MeshBody] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
