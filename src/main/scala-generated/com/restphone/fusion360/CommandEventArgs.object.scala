
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing CommandEvent to a CommandEventHandler's notify callback method. 
 */
@JSName("adsk.core.CommandEventArgs")
class CommandEventArgs extends EventArgs {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the Command object.
  */
  val command: Command = js.native
  /**
  * Used during the Execute event to get or set that the execute operations failed and the commands transaction should be aborted. This property should be ignored for all events besides the Execute event.
  */
  var executeFailed: Boolean = js.native
  /**
  * Used during the Execute event to get or set a description of an execute failure. This property should be ignored for all events besides the Execute event.
  */
  var executeFailedMessage: String = js.native


  /**
  * Used during the ExecutePreview event to get or set that the result of preview is valid and the command can reuse the result when Ok is hit. This property should be ignored for all events besides the ExecutePreview event.
  */
  var isValidResult: Boolean = js.native

}
/** 
  * Provides a set of arguments from a firing CommandEvent to a CommandEventHandler's notify callback method. 
 */
@JSName("adsk.core.CommandEventArgs")
object CommandEventArgs extends js.Object {
  /**
  * Gets the Command object.
  */
  val command: Command = js.native
  /**
  * Used during the Execute event to get or set that the execute operations failed and the commands transaction should be aborted. This property should be ignored for all events besides the Execute event.
  */
  var executeFailed: Boolean = js.native
  /**
  * Used during the Execute event to get or set a description of an execute failure. This property should be ignored for all events besides the Execute event.
  */
  var executeFailedMessage: String = js.native
  /**
  * Used during the ExecutePreview event to get or set that the result of preview is valid and the command can reuse the result when Ok is hit. This property should be ignored for all events besides the ExecutePreview event.
  */
  var isValidResult: Boolean = js.native
}

  object CommandEventArgsUtilities {
    // no toSeq

  }
       
