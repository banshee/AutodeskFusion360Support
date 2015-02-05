
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing KeyboardEvent to a KeyboardEventHandler's notify callback method. 
 */
@JSName("adsk.core.KeyboardEventArgs")
class KeyboardEventArgs extends EventArgs {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native


  /**
  * Gets the keyboard key.
  */
  val keyCode: KeyCodes = js.native
  /**
  * Gets the set of keyboard modifiers that were active. The value is the Boolean combination of KeyboardModifiers values.
  */
  val modifierMask: Integer = js.native

}
/** 
  * Provides a set of arguments from a firing KeyboardEvent to a KeyboardEventHandler's notify callback method. 
 */
@JSName("adsk.core.KeyboardEventArgs")
object KeyboardEventArgs extends js.Object {
  /**
  * Gets the keyboard key.
  */
  val keyCode: KeyCodes = js.native
  /**
  * Gets the set of keyboard modifiers that were active. The value is the Boolean combination of KeyboardModifiers values.
  */
  val modifierMask: Integer = js.native
}

  object KeyboardEventArgsUtilities {
    // no toSeq

  }
       
