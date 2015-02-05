
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an open document. This is the base class for all document types. 
 */
@JSName("adsk.core.Document")
class Document extends Base {
  /**
  * Causes this document to become the active document in the user interface.
  */
  def activate(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Closes this document.
  */
  def close(saveChanges: Boolean): Boolean = js.native
  /**
  * Property that indicates if the document has been modified since it was last saved.
  */
  val isModified: Boolean = js.native
  /**
  * Property that indicates if this document has been saved or not. The initial save of a document requires that the name and location be specified and requires the saveAs method to be used. If the document has been saved then the save method can be used to save changes made.
  */
  val isSaved: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the document.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Application object.
  */
  val parent: Application = js.native
  /**
  * Returns the products associated with this document.
  */
  val products: Products = js.native
  /**
  * Saves a version of the current document. You must use the SaveAs method the first time a document is saved. You can determine if a document has been saved by checking the value of the isSaved property.
  */
  def save(description: String): Boolean = js.native
}
/** 
  * Object that represents an open document. This is the base class for all document types. 
 */
@JSName("adsk.core.Document")
object Document extends js.Object {
  /**
  * Causes this document to become the active document in the user interface.
  */
  def activate(): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Closes this document.
  */
  def close(saveChanges: Boolean): Boolean = js.native
  /**
  * Property that indicates if the document has been modified since it was last saved.
  */
  val isModified: Boolean = js.native
  /**
  * Property that indicates if this document has been saved or not. The initial save of a document requires that the name and location be specified and requires the saveAs method to be used. If the document has been saved then the save method can be used to save changes made.
  */
  val isSaved: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the document.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent Application object.
  */
  val parent: Application = js.native
  /**
  * Returns the products associated with this document.
  */
  val products: Products = js.native
  /**
  * Saves a version of the current document. You must use the SaveAs method the first time a document is saved. You can determine if a document has been saved by checking the value of the isSaved property.
  */
  def save(description: String): Boolean = js.native
}

  object DocumentUtilities {
    // no toSeq

  }
       
