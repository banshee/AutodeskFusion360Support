
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for all command inputs. A CommandInput is used to gather an input value from the user when a command is executed. 
 */
@JSName("adsk.core.CommandInput")
class CommandInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the parent CommandInputs class.
  */
  val commandInputs: CommandInputs = js.native
  /**
  * Gets the unique identifier for this input in the command's CommandInputs.
  */
  val id: String = js.native
  /**
  * Gets or sets if this input is currently enabled or disabled for user interaction.
  */
  var isEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this input will be visible to the user.
  */
  var isVisible: Boolean = js.native
  /**
  * Gets the user visible name of this input.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The base class for all command inputs. A CommandInput is used to gather an input value from the user when a command is executed. 
 */
@JSName("adsk.core.CommandInput")
object CommandInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the parent CommandInputs class.
  */
  val commandInputs: CommandInputs = js.native
  /**
  * Gets the unique identifier for this input in the command's CommandInputs.
  */
  val id: String = js.native
  /**
  * Gets or sets if this input is currently enabled or disabled for user interaction.
  */
  var isEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets or sets if this input will be visible to the user.
  */
  var isVisible: Boolean = js.native
  /**
  * Gets the user visible name of this input.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object CommandInputUtilities {
    // no toSeq

  }
       
