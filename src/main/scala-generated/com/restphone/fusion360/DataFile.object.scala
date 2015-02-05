
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A data file in a data folder. 
 */
@JSName("adsk.core.DataFile")
class DataFile extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the description information associated with this item.
  */
  var description: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the displayed name of this item.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent folder this item is contained within.
  */
  val parentFolder: DataFolder = js.native
  /**
  * Returns the parent project that this item is in.
  */
  val parentProject: DataProject = js.native
}
/** 
  * A data file in a data folder. 
 */
@JSName("adsk.core.DataFile")
object DataFile extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the description information associated with this item.
  */
  var description: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the displayed name of this item.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent folder this item is contained within.
  */
  val parentFolder: DataFolder = js.native
  /**
  * Returns the parent project that this item is in.
  */
  val parentProject: DataProject = js.native
}

  object DataFileUtilities {
    // no toSeq

  }
       
