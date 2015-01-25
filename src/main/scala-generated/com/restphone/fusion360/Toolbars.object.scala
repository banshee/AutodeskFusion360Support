
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the toolbars. These are currently the right and left QAT's and the NavBar. 
 */
@JSName("adsk.core.Toolbars")
trait Toolbars extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of Toolbar objects in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified toolbar using an index into the collection.
  */
  def item(index: uinteger): Toolbar = js.native
  /**
  * Returns the Toolbar of the specified ID.
  */
  def itemById(id: String): Toolbar = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the toolbars. These are currently the right and left QAT's and the NavBar. 
 */
@JSName("adsk.core.Toolbars")
object Toolbars extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of Toolbar objects in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified toolbar using an index into the collection.
  */
  def item(index: uinteger): Toolbar = js.native
  /**
  * Returns the Toolbar of the specified ID.
  */
  def itemById(id: String): Toolbar = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ToolbarsUtilities {
    def toSeq(xs: Toolbars): IndexedSeq[Toolbar] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
