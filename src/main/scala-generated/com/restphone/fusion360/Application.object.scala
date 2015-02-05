
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The top-level object that represents the Fusion application (all of Fusion). This provides access to the modeler and files. 
 */
@JSName("adsk.core.Application")
class Application extends Base {
  /**
  * Returns the current active document or null if no document is open.
  */
  val activeDocument: Document = js.native
  /**
  * Returns the current edit target as seen in the user interface. This edit target is defined as the container object that will be added to if something is created. For example, a component can be an edit target so that when new bodies are created they are added to that component. A sketch can also be an edit target.
  */
  val activeEditObject: Base = js.native
  /**
  * Returns the current active product or null if there isn't a product active .
  */
  val activeProduct: Product = js.native
  /**
  * Returns the currently active graphics view.
  */
  val activeViewport: Viewport = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the Data object which provides access the files.
  */
  val data: Data = js.native
  /**
  * The DocumentOpened event fires at the VERY end of a document being opened - e.g. the UI is all displayed. The client can add or remove DocumentEventHandlers from the DocumentEvent
  */
  val documentOpened: DocumentEvent = js.native
  /**
  * The DocumentOpening event fires at the VERY start of a document being opened. There is no promise that the document will be opened, hence a documentOpened event may not follow. The client can add or remove FileEventHandlers from the FileEvent
  */
  val documentOpening: DocumentEvent = js.native
  /**
  * Returns the Documents collection object which supports accessing opened documents, opening existing documents, and creating new documents.
  */
  val documents: Documents = js.native
  /**
  * Returns the set of favorite appearances.
  */
  val favoriteAppearances: FavoriteAppearances = js.native
  /**
  * Returns the set of favorite materials.
  */
  val favoriteMaterials: FavoriteMaterials = js.native
  /**
  * Access to the root Application object.
  */
  def get(): Application = js.native
  /**
  * Returns information about the last error that occurred.
  */
  def getLastError(/* out */ description: String): Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the collection of material libraries currently available.
  */
  val materialLibraries: MaterialLibraries = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The modeling tolerance used internally when comparing two points. The value is in centimeters.
  */
  val pointTolerance: double = js.native
  /**
  * Provides access to all of the application preferences.
  */
  val preferences: Preferences = js.native
  /**
  * Provides access to functionality specific to the user interface.
  */
  val userInterface: UserInterface = js.native
  /**
  * The modeling tolerance used when comparing vector angles. The value is in radians.
  */
  val vectorAngleTolerance: double = js.native
}
/** 
  * The top-level object that represents the Fusion application (all of Fusion). This provides access to the modeler and files. 
 */
@JSName("adsk.core.Application")
object Application extends js.Object {
  /**
  * Returns the current active document or null if no document is open.
  */
  val activeDocument: Document = js.native
  /**
  * Returns the current edit target as seen in the user interface. This edit target is defined as the container object that will be added to if something is created. For example, a component can be an edit target so that when new bodies are created they are added to that component. A sketch can also be an edit target.
  */
  val activeEditObject: Base = js.native
  /**
  * Returns the current active product or null if there isn't a product active .
  */
  val activeProduct: Product = js.native
  /**
  * Returns the currently active graphics view.
  */
  val activeViewport: Viewport = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the Data object which provides access the files.
  */
  val data: Data = js.native
  /**
  * The DocumentOpened event fires at the VERY end of a document being opened - e.g. the UI is all displayed. The client can add or remove DocumentEventHandlers from the DocumentEvent
  */
  val documentOpened: DocumentEvent = js.native
  /**
  * The DocumentOpening event fires at the VERY start of a document being opened. There is no promise that the document will be opened, hence a documentOpened event may not follow. The client can add or remove FileEventHandlers from the FileEvent
  */
  val documentOpening: DocumentEvent = js.native
  /**
  * Returns the Documents collection object which supports accessing opened documents, opening existing documents, and creating new documents.
  */
  val documents: Documents = js.native
  /**
  * Returns the set of favorite appearances.
  */
  val favoriteAppearances: FavoriteAppearances = js.native
  /**
  * Returns the set of favorite materials.
  */
  val favoriteMaterials: FavoriteMaterials = js.native
  /**
  * Access to the root Application object.
  */
  def get(): Application = js.native
  /**
  * Returns information about the last error that occurred.
  */
  def getLastError(/* out */ description: String): Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the collection of material libraries currently available.
  */
  val materialLibraries: MaterialLibraries = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The modeling tolerance used internally when comparing two points. The value is in centimeters.
  */
  val pointTolerance: double = js.native
  /**
  * Provides access to all of the application preferences.
  */
  val preferences: Preferences = js.native
  /**
  * Provides access to functionality specific to the user interface.
  */
  val userInterface: UserInterface = js.native
  /**
  * The modeling tolerance used when comparing vector angles. The value is in radians.
  */
  val vectorAngleTolerance: double = js.native
}

  object ApplicationUtilities {
    // no toSeq
/**
* Returns information about the last error that occurred.
*
* Out parameters are returned in a tuple.
*/
def getLastErrorWithResults(activeObject: Application): (Integer, string) = {

val description = js.Dynamic.literal(value = 0)
val result = activeObject.getLastError(description.asInstanceOf[String])
(result, description.value.asInstanceOf[string])
}
  }
       
