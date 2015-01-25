
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for the various product specific containers. For Fusion this is the Design object. For CAM this is Toolpath object. 
 */
@JSName("adsk.core.Product")
trait Product extends Base {
  /**
  * Returns the appearances contained in this document.
  */
  val appearances: Appearances = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the materials contained in this document.
  */
  val materials: Materials = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Document object.
  */
  val parentDocument: Document = js.native
  /**
  * Returns the UnitsManager object associated with this product.
  */
  val unitsManager: UnitsManager = js.native
  /**
  * Returns the workspaces associated with this product.
  */
  val workspaces: WorkspaceList = js.native
}
/** 
  * The base class for the various product specific containers. For Fusion this is the Design object. For CAM this is Toolpath object. 
 */
@JSName("adsk.core.Product")
object Product extends js.Object {
  /**
  * Returns the appearances contained in this document.
  */
  val appearances: Appearances = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the materials contained in this document.
  */
  val materials: Materials = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Document object.
  */
  val parentDocument: Document = js.native
  /**
  * Returns the UnitsManager object associated with this product.
  */
  val unitsManager: UnitsManager = js.native
  /**
  * Returns the workspaces associated with this product.
  */
  val workspaces: WorkspaceList = js.native
}
// no utilities
