
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The Command class contains all of the functionality needed by a command to gather various command input from a user, provide previews, and create the final result which is also encapsulated within a transaction so it can be undone. 
 */
@JSName("adsk.core.Command")
class Command extends Base {
  /**
  * Gets an event that is fired when the command is first activated or re-activated after being suspended.
  */
  val activate: CommandEvent = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the associated CommandInputs object which provides the ability to create new command inputs and provides access to any existing inputs that have already been created for this command.
  */
  val commandInputs: CommandInputs = js.native
  /**
  * Gets an event that is fired when the command is deactivated. The command still exists and could still be activated again.
  */
  val deactivate: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command is destroyed. The command is destroyed and can be cleaned up.
  */
  val destroy: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command has completed gathering the required input and now needs to perform whatever action the command does.
  */
  val execute: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command has completed gathering the required input and now needs to perform a preview.
  */
  val executePreview: CommandEvent = js.native
  /**
  * Gets an event that is fired whenever an input value is changed.
  */
  val inputChanged: InputChangedEvent = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Geta an event that is fired when a key on the keyboard is pressed down.
  */
  val keyDown: KeyboardEvent = js.native
  /**
  * Gets an event that is fired when a key on the keyboard goes up.
  */
  val keyUp: KeyboardEvent = js.native
  /**
  * Gets an event that is fired when the mouse is clicked, (a button is pressed and released).
  */
  val mouseClick: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is double-clicked, (clicked twice within the time specified by a system setting.)
  */
  val mouseDoubleClick: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse button is pressed.
  */
  val mouseDown: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is in drag mode, (being moved while a button is pressed).
  */
  val mouseDrag: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse drag starts, (the mouse is pressed and moved).
  */
  val mouseDragBegin: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse button is released after a drag.
  */
  val mouseDragEnd: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is moved.
  */
  val mouseMove: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse button is released.
  */
  val mouseUp: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse wheel is rotated.
  */
  val mouseWheel: MouseEvent = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent CommandDefinition object.
  */
  val parentCommandDefinition: CommandDefinition = js.native
  /**
  * Gets an event that is fired to allow you to check if the current state of the inputs are valid for execution.
  */
  val validateInputs: ValidateInputsEvent = js.native
}
/** 
  * The Command class contains all of the functionality needed by a command to gather various command input from a user, provide previews, and create the final result which is also encapsulated within a transaction so it can be undone. 
 */
@JSName("adsk.core.Command")
object Command extends js.Object {
  /**
  * Gets an event that is fired when the command is first activated or re-activated after being suspended.
  */
  val activate: CommandEvent = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the associated CommandInputs object which provides the ability to create new command inputs and provides access to any existing inputs that have already been created for this command.
  */
  val commandInputs: CommandInputs = js.native
  /**
  * Gets an event that is fired when the command is deactivated. The command still exists and could still be activated again.
  */
  val deactivate: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command is destroyed. The command is destroyed and can be cleaned up.
  */
  val destroy: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command has completed gathering the required input and now needs to perform whatever action the command does.
  */
  val execute: CommandEvent = js.native
  /**
  * Gets an event that is fired when the command has completed gathering the required input and now needs to perform a preview.
  */
  val executePreview: CommandEvent = js.native
  /**
  * Gets an event that is fired whenever an input value is changed.
  */
  val inputChanged: InputChangedEvent = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Geta an event that is fired when a key on the keyboard is pressed down.
  */
  val keyDown: KeyboardEvent = js.native
  /**
  * Gets an event that is fired when a key on the keyboard goes up.
  */
  val keyUp: KeyboardEvent = js.native
  /**
  * Gets an event that is fired when the mouse is clicked, (a button is pressed and released).
  */
  val mouseClick: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is double-clicked, (clicked twice within the time specified by a system setting.)
  */
  val mouseDoubleClick: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse button is pressed.
  */
  val mouseDown: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is in drag mode, (being moved while a button is pressed).
  */
  val mouseDrag: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse drag starts, (the mouse is pressed and moved).
  */
  val mouseDragBegin: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse button is released after a drag.
  */
  val mouseDragEnd: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse is moved.
  */
  val mouseMove: MouseEvent = js.native
  /**
  * Gets an event that is fired when a mouse button is released.
  */
  val mouseUp: MouseEvent = js.native
  /**
  * Gets an event that is fired when the mouse wheel is rotated.
  */
  val mouseWheel: MouseEvent = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the parent CommandDefinition object.
  */
  val parentCommandDefinition: CommandDefinition = js.native
  /**
  * Gets an event that is fired to allow you to check if the current state of the inputs are valid for execution.
  */
  val validateInputs: ValidateInputsEvent = js.native
}

  object CommandUtilities {
    // no toSeq

  }
       
