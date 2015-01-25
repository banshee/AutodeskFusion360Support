
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a command input to get a selection from the user. 
 */
@JSName("adsk.core.SelectionCommandInput")
trait SelectionCommandInput extends CommandInput {
  /**
  * Adds the selection to the list of selections associated with this input.
  */
  def addSelection(selection: Base): Boolean = js.native
  /**
  * Adds an additional filter to the existing filter list.
  */
  def addSelectionFilter(filter: String): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Clears the list of selection filters.
  */
  def clearSelectionFilter(): Boolean = js.native

  /**
  * Gets or sets the tooltip shown next to the cursor.
  */
  var commandPrompt: String = js.native
  /**
  * Get the limits currently defined for this input.
  */
  def getSelectionLimits(/* out */ minimum: uinteger, /* out */ maximum: uinteger): Boolean = js.native






  /**
  * Returns the selection at the specified index.
  */
  def selection(index: uinteger): Selection = js.native
  /**
  * Gets the current number of selections the user has made for this input.
  */
  val selectionCount: uinteger = js.native
  /**
  * Gets or sets the list of selection filters.
  */
  var selectionFilters: String = js.native
  /**
  * Defines the limits for the number of selections associated with this input. A maximum value of 0 indicates that there is no maximum.
  */
  def setSelectionLimits(minimum: uinteger): Boolean = js.native
  /**
  * Defines the limits for the number of selections associated with this input. A maximum value of 0 indicates that there is no maximum.
  */
  def setSelectionLimits(minimum: uinteger, /* optional */ maximum: uinteger): Boolean = js.native
}
/** 
  * Provides a command input to get a selection from the user. 
 */
@JSName("adsk.core.SelectionCommandInput")
object SelectionCommandInput extends js.Object {
  /**
  * Adds the selection to the list of selections associated with this input.
  */
  def addSelection(selection: Base): Boolean = js.native
  /**
  * Adds an additional filter to the existing filter list.
  */
  def addSelectionFilter(filter: String): Boolean = js.native
  /**
  * Clears the list of selection filters.
  */
  def clearSelectionFilter(): Boolean = js.native
  /**
  * Gets or sets the tooltip shown next to the cursor.
  */
  var commandPrompt: String = js.native
  /**
  * Get the limits currently defined for this input.
  */
  def getSelectionLimits(/* out */ minimum: uinteger, /* out */ maximum: uinteger): Boolean = js.native
  /**
  * Returns the selection at the specified index.
  */
  def selection(index: uinteger): Selection = js.native
  /**
  * Gets the current number of selections the user has made for this input.
  */
  val selectionCount: uinteger = js.native
  /**
  * Gets or sets the list of selection filters.
  */
  var selectionFilters: String = js.native
  /**
  * Defines the limits for the number of selections associated with this input. A maximum value of 0 indicates that there is no maximum.
  */
  def setSelectionLimits(minimum: uinteger): Boolean = js.native
  /**
  * Defines the limits for the number of selections associated with this input. A maximum value of 0 indicates that there is no maximum.
  */
  def setSelectionLimits(minimum: uinteger, /* optional */ maximum: uinteger): Boolean = js.native
}
// no utilities
