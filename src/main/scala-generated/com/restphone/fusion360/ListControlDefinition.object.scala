
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents the information used to define a list of check boxes, radio buttons, or text with icons. This class isn't the visible list control but is the information needed to create a list control and fully defines a list except for it's position within the user interface. 
 */
@JSName("adsk.core.ListControlDefinition")
class ListControlDefinition extends ControlDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Gets the item in the list that was last selected. This can return null in the case where this control is displayed as a list of check boxes and there hasn't been any interaction by the end-user. In the case of a list of check boxes, this returns the item that was last clicked by the user, whether it was to check or uncheck the item. In the case of a list of radio buttons, this always returns the item that is currently selected.
  */
  val lastSelected: ListItem = js.native
  /**
  * Gets how this list control will be displayed; as a standard list, a list of check boxes, or a list of radio buttons.
  */
  val listControlDisplayType: ListControlDisplayTypes = js.native
  /**
  * Gets the associated ListControlItems collection through which you can add and modify items in the list.
  */
  val listItems: ListItems = js.native


}
/** 
  * Represents the information used to define a list of check boxes, radio buttons, or text with icons. This class isn't the visible list control but is the information needed to create a list control and fully defines a list except for it's position within the user interface. 
 */
@JSName("adsk.core.ListControlDefinition")
object ListControlDefinition extends js.Object {
  /**
  * Gets the item in the list that was last selected. This can return null in the case where this control is displayed as a list of check boxes and there hasn't been any interaction by the end-user. In the case of a list of check boxes, this returns the item that was last clicked by the user, whether it was to check or uncheck the item. In the case of a list of radio buttons, this always returns the item that is currently selected.
  */
  val lastSelected: ListItem = js.native
  /**
  * Gets how this list control will be displayed; as a standard list, a list of check boxes, or a list of radio buttons.
  */
  val listControlDisplayType: ListControlDisplayTypes = js.native
  /**
  * Gets the associated ListControlItems collection through which you can add and modify items in the list.
  */
  val listItems: ListItems = js.native
}

  object ListControlDefinitionUtilities {
    // no toSeq

  }
       
