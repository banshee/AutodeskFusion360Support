
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get the multi-selected items from the user. 
 */
@JSName("adsk.core.MultiSelectCommandInput")
trait MultiSelectCommandInput extends CommandInput {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native





  /**
  * Returns the ListItems object associated with this multi-select. You use this object to populate and interact with the items in the multi-select.
  */
  val listItems: ListItems = js.native


}
/** 
  * Provides a command input to get the multi-selected items from the user. 
 */
@JSName("adsk.core.MultiSelectCommandInput")
object MultiSelectCommandInput extends js.Object {
  /**
  * Returns the ListItems object associated with this multi-select. You use this object to populate and interact with the items in the multi-select.
  */
  val listItems: ListItems = js.native
}
// no utilities
