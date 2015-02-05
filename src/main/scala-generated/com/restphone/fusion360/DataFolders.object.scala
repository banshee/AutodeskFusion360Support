
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection object the provides a list of data folders. 
 */
@JSName("adsk.core.DataFolders")
class DataFolders extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of folders in this collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified folder.
  */
  def item(index: uinteger): DataFolder = js.native
  /**
  * Returns the folder specified using the name of the folder.
  */
  def itemByName(name: String): DataFolder = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection object the provides a list of data folders. 
 */
@JSName("adsk.core.DataFolders")
object DataFolders extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of folders in this collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified folder.
  */
  def item(index: uinteger): DataFolder = js.native
  /**
  * Returns the folder specified using the name of the folder.
  */
  def itemByName(name: String): DataFolder = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DataFoldersUtilities {
    
    def toSeq(xs: DataFolders): IndexedSeq[DataFolder] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
