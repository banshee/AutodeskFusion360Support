
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The CommandDefinition is the base class of the various types of commands. Command types are based on the type of control used to execute them in the user-interface. For example, most commands will use a ButtonDefinition since they're executed using a button in the user-interface. A command definition contains the information that defines the user-interface. For example, the name and icon. The command definition and also gets the notification when the user interacts with the associated control. 
 */
@JSName("adsk.core.CommandDefinition")
class CommandDefinition extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * This event is fired when the associated control is manipulated by the user. A new Command object is created and passed back through this event which you can then use to interact with the user to get any input the command requires.
  */
  val commandCreated: CommandCreatedEvent = js.native
  /**
  * Gets the ControlDefinition associated with this command. The control definition defines the type of control that can exist in the user interface to execute this command. You can use properties on the control definition to define the look and behavior of the control.
  */
  val controlDefinition: ControlDefinition = js.native
  /**
  * Deletes this command definition. This is only valid for API created command definitions and will fail if the IsNative property is true.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Executes this command definition. This is the same as the user clicking a button that is associated with this command definition.
  */
  def execute(): Boolean = js.native
  /**
  * Executes this command definition. This is the same as the user clicking a button that is associated with this command definition.
  */
  def execute(/* optional */ input: NamedValues): Boolean = js.native
  /**
  * Gets the unique id for this command definition. This is guaranteed to be unique with respect to all other command definitions.
  */
  val id: String = js.native
  /**
  * Gets if this is a native command definition. If True then there are limitations to edits that can be done on the command definition. For example a native command definition cannot be deleted.
  */
  val isNative: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets or sets the directory that contains any additional files associated with this command. These are typically the image files that will be used for a button and the html files for a tool clip or helps and tips.
  */
  var resourceFolder: String = js.native
  /**
  * Gets or sets the full filename of the file used for the tool clip. The file can be an image (png), a video (mp4 or mov), or an html file. The size of video should be width:300 and height:200. The tooltip is always shown but as the user hovers over the control it will progressively display the tool clip and description text.
  */
  var toolClipFilename: String = js.native
  /**
  * Gets or sets the base tooltip string. This is always shown for commands. If the tooltip description and/or tool clip are also specified then the tooltip will progressively display more information as the user hovers the mouse over the control.
  */
  var tooltip: String = js.native
  /**
  * Gets or sets additional text to display progressively along with the tooltip. The text for the description can contain some basic html formatting tags to format the tags. For example the br tag can be used to create multiple paragraphs. The tooltip is always shown but as the user hovers over the control it will progressively display the tool clip and description text.
  */
  var tooltipDescription: String = js.native
}
/** 
  * The CommandDefinition is the base class of the various types of commands. Command types are based on the type of control used to execute them in the user-interface. For example, most commands will use a ButtonDefinition since they're executed using a button in the user-interface. A command definition contains the information that defines the user-interface. For example, the name and icon. The command definition and also gets the notification when the user interacts with the associated control. 
 */
@JSName("adsk.core.CommandDefinition")
object CommandDefinition extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * This event is fired when the associated control is manipulated by the user. A new Command object is created and passed back through this event which you can then use to interact with the user to get any input the command requires.
  */
  val commandCreated: CommandCreatedEvent = js.native
  /**
  * Gets the ControlDefinition associated with this command. The control definition defines the type of control that can exist in the user interface to execute this command. You can use properties on the control definition to define the look and behavior of the control.
  */
  val controlDefinition: ControlDefinition = js.native
  /**
  * Deletes this command definition. This is only valid for API created command definitions and will fail if the IsNative property is true.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Executes this command definition. This is the same as the user clicking a button that is associated with this command definition.
  */
  def execute(): Boolean = js.native
  /**
  * Executes this command definition. This is the same as the user clicking a button that is associated with this command definition.
  */
  def execute(/* optional */ input: NamedValues): Boolean = js.native
  /**
  * Gets the unique id for this command definition. This is guaranteed to be unique with respect to all other command definitions.
  */
  val id: String = js.native
  /**
  * Gets if this is a native command definition. If True then there are limitations to edits that can be done on the command definition. For example a native command definition cannot be deleted.
  */
  val isNative: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets or sets the directory that contains any additional files associated with this command. These are typically the image files that will be used for a button and the html files for a tool clip or helps and tips.
  */
  var resourceFolder: String = js.native
  /**
  * Gets or sets the full filename of the file used for the tool clip. The file can be an image (png), a video (mp4 or mov), or an html file. The size of video should be width:300 and height:200. The tooltip is always shown but as the user hovers over the control it will progressively display the tool clip and description text.
  */
  var toolClipFilename: String = js.native
  /**
  * Gets or sets the base tooltip string. This is always shown for commands. If the tooltip description and/or tool clip are also specified then the tooltip will progressively display more information as the user hovers the mouse over the control.
  */
  var tooltip: String = js.native
  /**
  * Gets or sets additional text to display progressively along with the tooltip. The text for the description can contain some basic html formatting tags to format the tags. For example the br tag can be used to create multiple paragraphs. The tooltip is always shown but as the user hovers over the control it will progressively display the tool clip and description text.
  */
  var tooltipDescription: String = js.native
}

  object CommandDefinitionUtilities {
    // no toSeq

  }
       
