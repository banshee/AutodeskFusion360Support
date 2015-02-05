
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for the different export types. This class is never directly used in an export because you need the specific export type to specify the type of export to be performed. 
 */
@JSName("adsk.fusion.ExportOptions")
class ExportOptions extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the filename that the exported file will be written to. This can be empty in the case of STL export and sending the result to the mesh editor.
  */
  var filename: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The base class for the different export types. This class is never directly used in an export because you need the specific export type to specify the type of export to be performed. 
 */
@JSName("adsk.fusion.ExportOptions")
object ExportOptions extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the filename that the exported file will be written to. This can be empty in the case of STL export and sending the result to the mesh editor.
  */
  var filename: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ExportOptionsUtilities {
    // no toSeq

  }
       
