
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Returns the items within a folder. This includes everything in a folder except for other folders. 
 */
@JSName("adsk.core.DataFiles")
class DataFiles extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of data items in this collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified data file.
  */
  def item(index: uinteger): DataFile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Returns the items within a folder. This includes everything in a folder except for other folders. 
 */
@JSName("adsk.core.DataFiles")
object DataFiles extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of data items in this collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified data file.
  */
  def item(index: uinteger): DataFile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DataFilesUtilities {
    
    def toSeq(xs: DataFiles): IndexedSeq[DataFile] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
