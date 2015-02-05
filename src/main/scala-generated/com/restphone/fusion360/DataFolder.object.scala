
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A data folder that contains a collection of data items. 
 */
@JSName("adsk.core.DataFolder")
class DataFolder extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a collection containing all of the items within this folder.
  */
  val dataFiles: DataFiles = js.native
  /**
  * Returns a collection containing all of the folders within this folder.
  */
  val dataFolders: DataFolders = js.native
  /**
  * Indicates if this folder is the root folder within the parent project.
  */
  val isRoot: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the displayed name of this folder.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent folder this folder is contained within. Returns null if this is the projects root folder.
  */
  val parentFolder: DataFolder = js.native
  /**
  * Returns the parent project that this folder is in.
  */
  val parentProject: DataProject = js.native
}
/** 
  * A data folder that contains a collection of data items. 
 */
@JSName("adsk.core.DataFolder")
object DataFolder extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a collection containing all of the items within this folder.
  */
  val dataFiles: DataFiles = js.native
  /**
  * Returns a collection containing all of the folders within this folder.
  */
  val dataFolders: DataFolders = js.native
  /**
  * Indicates if this folder is the root folder within the parent project.
  */
  val isRoot: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets the displayed name of this folder.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent folder this folder is contained within. Returns null if this is the projects root folder.
  */
  val parentFolder: DataFolder = js.native
  /**
  * Returns the parent project that this folder is in.
  */
  val parentProject: DataProject = js.native
}

  object DataFolderUtilities {
    // no toSeq

  }
       
