
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the set of inputs for a command. Command inputs are used to gather inputs from the user when a command is executed. The set of inputs used by a command are created and added to the command with the methods in this class. 
 */
@JSName("adsk.core.CommandInputs")
trait CommandInputs extends Base {
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean): BoolValueCommandInput = js.native
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean, /* optional */ resourceFolder: String): BoolValueCommandInput = js.native
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean, /* optional */ resourceFolder: String, /* optional */ initialValue: Boolean): BoolValueCommandInput = js.native
  /**
  * Adds a new empty dropdown input to the command. Get and set the list items using the returned DropDownCommandInput object. If the icon of the list item is set to null and dropDownStyle is LabeledIconDropDownStyle, this item will be present in radio style.
  */
  def addDropDownCommandInput(id: String, name: String, dropDownStyle: DropDownStyles): DropDownCommandInput = js.native
  /**
  * Adds a new MultiSelect input to the command. Get and set the list items using the returned MultiSelectCommandInput object.
  */
  def addMultiSelectCommandInput(id: String, name: String): MultiSelectCommandInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInput(id: String, name: String, unitType: String, min: double, max: double): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInput(id: String, name: String, unitType: String, min: double, max: double, /* optional */ hasTwoSliders: Boolean): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInputByValueList(id: String, name: String, unitType: String, valueList: Array[Double]): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInputByValueList(id: String, name: String, unitType: String, valueList: Array[Double], /* optional */ hasTwoSliders: Boolean): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInput(id: String, name: String, unitType: String, min: Integer, max: Integer): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInput(id: String, name: String, unitType: String, min: Integer, max: Integer, /* optional */ hasTwoSliders: Boolean): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInputByValueList(id: String, name: String, unitType: String, valueList: Array[Int32]): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInputByValueList(id: String, name: String, unitType: String, valueList: Array[Int32], /* optional */ hasTwoSliders: Boolean): RangeCommandIntegerInput = js.native
  /**
  * Adds a new selection input to the command.
  */
  def addSelectionInput(id: String, name: String, commandPrompt: String): SelectionCommandInput = js.native
  /**
  * Adds a new string input to the command.
  */
  def addStringValueInput(id: String, name: String): StringValueCommandInput = js.native
  /**
  * Adds a new string input to the command.
  */
  def addStringValueInput(id: String, name: String, /* optional */ initialValue: String): StringValueCommandInput = js.native
  /**
  * Adds a new value input to the command.
  */
  def addValueInput(id: String, name: String, unitType: String, initialValue: ValueInput): ValueCommandInput = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the parent Command object.
  */
  val command: Command = js.native
  /**
  * Gets the number of inputs.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified command input using an index into the collection.
  */
  def item(index: uinteger): CommandInput = js.native
  /**
  * Returns the command input that has the specified ID.
  */
  def itemById(id: String): CommandInput = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the set of inputs for a command. Command inputs are used to gather inputs from the user when a command is executed. The set of inputs used by a command are created and added to the command with the methods in this class. 
 */
@JSName("adsk.core.CommandInputs")
object CommandInputs extends js.Object {
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean): BoolValueCommandInput = js.native
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean, /* optional */ resourceFolder: String): BoolValueCommandInput = js.native
  /**
  * Adds a new boolean input to the command. The input can be shown as a check box or a button. If it's a button you will also want to
  */
  def addBoolValueInput(id: String, name: String, isCheckBox: Boolean, /* optional */ resourceFolder: String, /* optional */ initialValue: Boolean): BoolValueCommandInput = js.native
  /**
  * Adds a new empty dropdown input to the command. Get and set the list items using the returned DropDownCommandInput object. If the icon of the list item is set to null and dropDownStyle is LabeledIconDropDownStyle, this item will be present in radio style.
  */
  def addDropDownCommandInput(id: String, name: String, dropDownStyle: DropDownStyles): DropDownCommandInput = js.native
  /**
  * Adds a new MultiSelect input to the command. Get and set the list items using the returned MultiSelectCommandInput object.
  */
  def addMultiSelectCommandInput(id: String, name: String): MultiSelectCommandInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInput(id: String, name: String, unitType: String, min: double, max: double): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInput(id: String, name: String, unitType: String, min: double, max: double, /* optional */ hasTwoSliders: Boolean): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInputByValueList(id: String, name: String, unitType: String, valueList: Array[Double]): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is double.
  */
  def addRangeCommandFloatInputByValueList(id: String, name: String, unitType: String, valueList: Array[Double], /* optional */ hasTwoSliders: Boolean): RangeCommandFloatInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInput(id: String, name: String, unitType: String, min: Integer, max: Integer): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInput(id: String, name: String, unitType: String, min: Integer, max: Integer, /* optional */ hasTwoSliders: Boolean): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInputByValueList(id: String, name: String, unitType: String, valueList: Array[Int32]): RangeCommandIntegerInput = js.native
  /**
  * Adds a new range input to the command. The value type is integer.
  */
  def addRangeCommandIntegerInputByValueList(id: String, name: String, unitType: String, valueList: Array[Int32], /* optional */ hasTwoSliders: Boolean): RangeCommandIntegerInput = js.native
  /**
  * Adds a new selection input to the command.
  */
  def addSelectionInput(id: String, name: String, commandPrompt: String): SelectionCommandInput = js.native
  /**
  * Adds a new string input to the command.
  */
  def addStringValueInput(id: String, name: String): StringValueCommandInput = js.native
  /**
  * Adds a new string input to the command.
  */
  def addStringValueInput(id: String, name: String, /* optional */ initialValue: String): StringValueCommandInput = js.native
  /**
  * Adds a new value input to the command.
  */
  def addValueInput(id: String, name: String, unitType: String, initialValue: ValueInput): ValueCommandInput = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the parent Command object.
  */
  val command: Command = js.native
  /**
  * Gets the number of inputs.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified command input using an index into the collection.
  */
  def item(index: uinteger): CommandInput = js.native
  /**
  * Returns the command input that has the specified ID.
  */
  def itemById(id: String): CommandInput = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object CommandInputsUtilities {
    def toSeq(xs: CommandInputs): IndexedSeq[CommandInput] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
