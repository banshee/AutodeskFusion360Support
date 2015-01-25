
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing MouseEvent to a MouseEventHandler's notify callback method. 
 */
@JSName("adsk.core.MouseEventArgs")
trait MouseEventArgs extends EventArgs {
  /**
  * Gets which mouse button(s) are pressed. The returned value is bitwise and can indicate that more than one button is pressed.
  */
  val button: MouseButtons = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the number of times the button was pressed and released.
  */
  val clicks: uinteger = js.native


  /**
  * Gets which modifier keys are currently pressed. The returned value is bitwise and can indicate that more than one button is pressed.
  */
  val keyboardModifiers: KeyboardModifiers = js.native

  /**
  * Gets the coordinate of the mouse in screen space.
  */
  val position: Point2D = js.native
  /**
  * Gets a signed count of the number of detents the mouse wheel has rotated.
  */
  val wheelDelta: Integer = js.native
}
/** 
  * Provides a set of arguments from a firing MouseEvent to a MouseEventHandler's notify callback method. 
 */
@JSName("adsk.core.MouseEventArgs")
object MouseEventArgs extends js.Object {
  /**
  * Gets which mouse button(s) are pressed. The returned value is bitwise and can indicate that more than one button is pressed.
  */
  val button: MouseButtons = js.native
  /**
  * Gets the number of times the button was pressed and released.
  */
  val clicks: uinteger = js.native
  /**
  * Gets which modifier keys are currently pressed. The returned value is bitwise and can indicate that more than one button is pressed.
  */
  val keyboardModifiers: KeyboardModifiers = js.native
  /**
  * Gets the coordinate of the mouse in screen space.
  */
  val position: Point2D = js.native
  /**
  * Gets a signed count of the number of detents the mouse wheel has rotated.
  */
  val wheelDelta: Integer = js.native
}
// no utilities
