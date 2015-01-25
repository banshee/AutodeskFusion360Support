
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A WorkspaceList is a list of Workspaces - e.g. the Workspaces for a given product. 
 */
@JSName("adsk.core.WorkspaceList")
trait WorkspaceList extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of workspaces in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified work space using an index into the collection.
  */
  def item(index: uinteger): Workspace = js.native
  /**
  * Returns the Workspace of the specified ID.
  */
  def itemById(id: String): Workspace = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A WorkspaceList is a list of Workspaces - e.g. the Workspaces for a given product. 
 */
@JSName("adsk.core.WorkspaceList")
object WorkspaceList extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of workspaces in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified work space using an index into the collection.
  */
  def item(index: uinteger): Workspace = js.native
  /**
  * Returns the Workspace of the specified ID.
  */
  def itemById(id: String): Workspace = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object WorkspaceListUtilities {
    def toSeq(xs: WorkspaceList): IndexedSeq[Workspace] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
