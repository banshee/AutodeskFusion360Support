
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get the choice in a dropdown list from the user. 
 */
@JSName("adsk.core.DropDownCommandInput")
class DropDownCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Returns the style of drop down this was created as.
  */
  val dropDownStyle: DropDownStyles = js.native




  /**
  * Returns the ListItems object associated with this drop-down. You use this object to populate and interact with the items in the drop-down.
  */
  val listItems: ListItems = js.native


  /**
  * Gets the item in the list that is currently selected. This can return null in the case where no item in the list has been selected.
  */
  val selectedItem: ListItem = js.native
}
/** 
  * Provides a command input to get the choice in a dropdown list from the user. 
 */
@JSName("adsk.core.DropDownCommandInput")
object DropDownCommandInput extends js.Object {
  /**
  * Returns the style of drop down this was created as.
  */
  val dropDownStyle: DropDownStyles = js.native
  /**
  * Returns the ListItems object associated with this drop-down. You use this object to populate and interact with the items in the drop-down.
  */
  val listItems: ListItems = js.native
  /**
  * Gets the item in the list that is currently selected. This can return null in the case where no item in the list has been selected.
  */
  val selectedItem: ListItem = js.native
}

  object DropDownCommandInputUtilities {
    // no toSeq

  }
       
