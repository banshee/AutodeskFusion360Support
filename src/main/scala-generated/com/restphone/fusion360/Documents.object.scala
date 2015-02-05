
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The Documents object provides access to all of the currently open documents and provides methods to create and open documents. 
 */
@JSName("adsk.core.Documents")
class Documents extends Base {
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes): Document = js.native
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes, /* optional */ visible: Boolean): Document = js.native
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes, /* optional */ visible: Boolean, /* optional */ options: NamedValues): Document = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of currently open files.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified document using an index into the collection.
  */
  def item(index: uinteger): Document = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The Documents object provides access to all of the currently open documents and provides methods to create and open documents. 
 */
@JSName("adsk.core.Documents")
object Documents extends js.Object {
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes): Document = js.native
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes, /* optional */ visible: Boolean): Document = js.native
  /**
  * Creates and opens a new document of the specified type.
  */
  def add(documentType: DocumentTypes, /* optional */ visible: Boolean, /* optional */ options: NamedValues): Document = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of currently open files.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified document using an index into the collection.
  */
  def item(index: uinteger): Document = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DocumentsUtilities {
    
    def toSeq(xs: Documents): IndexedSeq[Document] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
