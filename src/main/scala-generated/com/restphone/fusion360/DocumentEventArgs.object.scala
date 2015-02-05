
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The DocumentEventArgs provides information associated with a document event. Note that some properties are not available on every event - for example, the Document is not available on the DocumentOpening event because the Document is not yet available. 
 */
@JSName("adsk.core.DocumentEventArgs")
class DocumentEventArgs extends EventArgs {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Provides access to the document that is open. Can be null in the case where the event is fired before the document has been opened or after it has been closed.
  */
  val document: Document = js.native

  /**
  * The full path to the file.
  */
  val fullPath: String = js.native


}
/** 
  * The DocumentEventArgs provides information associated with a document event. Note that some properties are not available on every event - for example, the Document is not available on the DocumentOpening event because the Document is not yet available. 
 */
@JSName("adsk.core.DocumentEventArgs")
object DocumentEventArgs extends js.Object {
  /**
  * Provides access to the document that is open. Can be null in the case where the event is fired before the document has been opened or after it has been closed.
  */
  val document: Document = js.native
  /**
  * The full path to the file.
  */
  val fullPath: String = js.native
}

  object DocumentEventArgsUtilities {
    // no toSeq

  }
       
