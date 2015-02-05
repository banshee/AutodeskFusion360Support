
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing InputChangedEvent to a InputEventChangedEventHandler's notify callback method. 
 */
@JSName("adsk.core.InputChangedEventArgs")
class InputChangedEventArgs extends EventArgs {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets the parent CommandInput object.
  */
  val input: CommandInput = js.native


}
/** 
  * Provides a set of arguments from a firing InputChangedEvent to a InputEventChangedEventHandler's notify callback method. 
 */
@JSName("adsk.core.InputChangedEventArgs")
object InputChangedEventArgs extends js.Object {
  /**
  * Gets the parent CommandInput object.
  */
  val input: CommandInput = js.native
}

  object InputChangedEventArgsUtilities {
    // no toSeq

  }
       
