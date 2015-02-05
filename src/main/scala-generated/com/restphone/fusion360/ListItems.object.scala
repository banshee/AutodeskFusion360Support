
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the list of items in a check box list. This object supports the ability to add items to the list and iterate through the existing items. 
 */
@JSName("adsk.core.ListItems")
class ListItems extends Base {
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean): ListItem = js.native
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean, /* optional */ icon: String): ListItem = js.native
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean, /* optional */ icon: String, /* optional */ beforeIndex: Integer): ListItem = js.native
  /**
  * Adds a separator to the list.
  */
  def addSeperator(beforeIndex: Integer): ListItem = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of CheckBoxListItem objects in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified check box list item using an index into the collection.
  */
  def item(index: uinteger): ListItem = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the list of items in a check box list. This object supports the ability to add items to the list and iterate through the existing items. 
 */
@JSName("adsk.core.ListItems")
object ListItems extends js.Object {
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean): ListItem = js.native
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean, /* optional */ icon: String): ListItem = js.native
  /**
  * Adds a new item to the list.
  */
  def add(name: String, isSelected: Boolean, /* optional */ icon: String, /* optional */ beforeIndex: Integer): ListItem = js.native
  /**
  * Adds a separator to the list.
  */
  def addSeperator(beforeIndex: Integer): ListItem = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of CheckBoxListItem objects in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified check box list item using an index into the collection.
  */
  def item(index: uinteger): ListItem = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ListItemsUtilities {
    
    def toSeq(xs: ListItems): IndexedSeq[ListItem] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
