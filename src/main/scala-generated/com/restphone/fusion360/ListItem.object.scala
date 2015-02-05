
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a single item in a check box list or a drop-down command input. 
 */
@JSName("adsk.core.ListItem")
class ListItem extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this item from the list.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets or sets the location for the icon file used for this item in the list. This is the path to a directory that contains the image files associated with this item. This is only valid when this is a standard list and is ignored for check box and radio control lists.
  */
  var icon: String = js.native
  /**
  * Gets the index position within the list of this item.
  */
  val index: Integer = js.native
  /**
  * Gets or sets whether this item is selected. If the item is being displayed as a check box, this controls whether it is checked or not. If it's a radio control or a drop-down list it controls whether this is the single selected item. Setting a radio control or drop-down list item to be selected will unselect the currently selected item. For a standard list, this will get or set the single item currently selected. For a separator, setting this property is ignored and it will always return false.
  */
  var isSelected: Boolean = js.native
  /**
  * Gets if this control is a separator.
  */
  val isSeperator: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets the name of this item as displayed in the list. If this control is a separator, (IsSeperator is true), setting this property is ignored and getting it will return an empty string.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent CheckBoxListControlDefinition or object.
  */
  val parentList: Base = js.native
}
/** 
  * Represents a single item in a check box list or a drop-down command input. 
 */
@JSName("adsk.core.ListItem")
object ListItem extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes this item from the list.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets or sets the location for the icon file used for this item in the list. This is the path to a directory that contains the image files associated with this item. This is only valid when this is a standard list and is ignored for check box and radio control lists.
  */
  var icon: String = js.native
  /**
  * Gets the index position within the list of this item.
  */
  val index: Integer = js.native
  /**
  * Gets or sets whether this item is selected. If the item is being displayed as a check box, this controls whether it is checked or not. If it's a radio control or a drop-down list it controls whether this is the single selected item. Setting a radio control or drop-down list item to be selected will unselect the currently selected item. For a standard list, this will get or set the single item currently selected. For a separator, setting this property is ignored and it will always return false.
  */
  var isSelected: Boolean = js.native
  /**
  * Gets if this control is a separator.
  */
  val isSeperator: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets the name of this item as displayed in the list. If this control is a separator, (IsSeperator is true), setting this property is ignored and getting it will return an empty string.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent CheckBoxListControlDefinition or object.
  */
  val parentList: Base = js.native
}

  object ListItemUtilities {
    // no toSeq

  }
       
