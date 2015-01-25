
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents a Fusion specific document. 
 */
@JSName("adsk.fusion.FusionDocument")
trait FusionDocument extends Document {
  /**
  * Causes this document to become the active document in the user interface.
  */
  override def activate(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Closes this document.
  */
  override def close(saveChanges: Boolean): Boolean = js.native
  /**
  * Returns the current active design
  */
  val design: Design = js.native







  /**
  * Saves a version of the current document. You must use the SaveAs method the first time a document is saved. You can determine if a document has been saved by checking the value of the isSaved property.
  */
  override def save(description: String): Boolean = js.native
}
/** 
  * Object that represents a Fusion specific document. 
 */
@JSName("adsk.fusion.FusionDocument")
object FusionDocument extends js.Object {
  /**
  * Returns the current active design
  */
  val design: Design = js.native
}
// no utilities
