
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The MaterialLibraries collection object provides access to currently loaded Material and Appearance libraries 
 */
@JSName("adsk.core.MaterialLibraries")
class MaterialLibraries extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Material Libraries in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Method that returns the specified Material Library using an index into the collection.
  */
  def item(index: Integer): MaterialLibrary = js.native
  /**
  * Returns the Material Library at the specified ID.
  */
  def itemById(id: String): MaterialLibrary = js.native
  /**
  * Returns the specified Material Library using the name as seen in the user interface.
  */
  def itemByName(name: String): MaterialLibrary = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The MaterialLibraries collection object provides access to currently loaded Material and Appearance libraries 
 */
@JSName("adsk.core.MaterialLibraries")
object MaterialLibraries extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Material Libraries in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Method that returns the specified Material Library using an index into the collection.
  */
  def item(index: Integer): MaterialLibrary = js.native
  /**
  * Returns the Material Library at the specified ID.
  */
  def itemById(id: String): MaterialLibrary = js.native
  /**
  * Returns the specified Material Library using the name as seen in the user interface.
  */
  def itemByName(name: String): MaterialLibrary = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object MaterialLibrariesUtilities {
    
    def toSeq(xs: MaterialLibraries): IndexedSeq[MaterialLibrary] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
