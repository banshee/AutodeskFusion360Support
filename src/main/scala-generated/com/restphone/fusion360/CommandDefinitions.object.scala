
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to all of the available command definitions. This is all those created via the API but also includes the command definitions defined by Fusion for the native commands. 
 */
@JSName("adsk.core.CommandDefinitions")
trait CommandDefinitions extends Base {
  /**
  * Creates a new command definition that can be used to create a button control and handle the response when the button is clicked.
  */
  def addButtonDefinition(id: String, name: String, tooltip: String): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a button control and handle the response when the button is clicked.
  */
  def addButtonDefinition(id: String, name: String, tooltip: String, /* optional */ resourceFolder: String): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a single check box control and handle the response when the check box is clicked.
  */
  def addCheckBoxDefinition(id: String, name: String, tooltip: String, isChecked: Boolean): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a list of check boxes, radio buttons, or text with an icon within a pop-up. When the list is of check boxes any combinations of items in the list can be checked. The drop-down also remains displayed allowing the user to check and uncheck multiple items however a CommandCreated event is fired for every change. When the list is of radio buttons or a list of text items, only one item in the list can be selected at a time. When an item is selected the drop-down is immediately dismissed. The items in the list and their initial state are defined using functionality on the associated ListControlDefinition, which is accessible through the returned CommandDefinition.
  */
  def addListDefinition(id: String, name: String, listControlDisplayType: ListControlDisplayTypes): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a list of check boxes, radio buttons, or text with an icon within a pop-up. When the list is of check boxes any combinations of items in the list can be checked. The drop-down also remains displayed allowing the user to check and uncheck multiple items however a CommandCreated event is fired for every change. When the list is of radio buttons or a list of text items, only one item in the list can be selected at a time. When an item is selected the drop-down is immediately dismissed. The items in the list and their initial state are defined using functionality on the associated ListControlDefinition, which is accessible through the returned CommandDefinition.
  */
  def addListDefinition(id: String, name: String, listControlDisplayType: ListControlDisplayTypes, /* optional */ resourceFolder: String): CommandDefinition = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of command definitions.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the CommandDefinition at the specified index.
  */
  def item(index: uinteger): CommandDefinition = js.native
  /**
  * Returns the CommandDefinition that has the specified ID.
  */
  def itemById(id: String): CommandDefinition = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to all of the available command definitions. This is all those created via the API but also includes the command definitions defined by Fusion for the native commands. 
 */
@JSName("adsk.core.CommandDefinitions")
object CommandDefinitions extends js.Object {
  /**
  * Creates a new command definition that can be used to create a button control and handle the response when the button is clicked.
  */
  def addButtonDefinition(id: String, name: String, tooltip: String): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a button control and handle the response when the button is clicked.
  */
  def addButtonDefinition(id: String, name: String, tooltip: String, /* optional */ resourceFolder: String): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a single check box control and handle the response when the check box is clicked.
  */
  def addCheckBoxDefinition(id: String, name: String, tooltip: String, isChecked: Boolean): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a list of check boxes, radio buttons, or text with an icon within a pop-up. When the list is of check boxes any combinations of items in the list can be checked. The drop-down also remains displayed allowing the user to check and uncheck multiple items however a CommandCreated event is fired for every change. When the list is of radio buttons or a list of text items, only one item in the list can be selected at a time. When an item is selected the drop-down is immediately dismissed. The items in the list and their initial state are defined using functionality on the associated ListControlDefinition, which is accessible through the returned CommandDefinition.
  */
  def addListDefinition(id: String, name: String, listControlDisplayType: ListControlDisplayTypes): CommandDefinition = js.native
  /**
  * Creates a new command definition that can be used to create a list of check boxes, radio buttons, or text with an icon within a pop-up. When the list is of check boxes any combinations of items in the list can be checked. The drop-down also remains displayed allowing the user to check and uncheck multiple items however a CommandCreated event is fired for every change. When the list is of radio buttons or a list of text items, only one item in the list can be selected at a time. When an item is selected the drop-down is immediately dismissed. The items in the list and their initial state are defined using functionality on the associated ListControlDefinition, which is accessible through the returned CommandDefinition.
  */
  def addListDefinition(id: String, name: String, listControlDisplayType: ListControlDisplayTypes, /* optional */ resourceFolder: String): CommandDefinition = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of command definitions.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the CommandDefinition at the specified index.
  */
  def item(index: uinteger): CommandDefinition = js.native
  /**
  * Returns the CommandDefinition that has the specified ID.
  */
  def itemById(id: String): CommandDefinition = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object CommandDefinitionsUtilities {
    def toSeq(xs: CommandDefinitions): IndexedSeq[CommandDefinition] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
