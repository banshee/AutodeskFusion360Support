
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides data for the CommandCreated event. 
 */
@JSName("adsk.core.CommandCreatedEventArgs")
trait CommandCreatedEventArgs extends EventArgs {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the newly created Command object that allows you to perform an action in response to the control being clicked.
  */
  val command: Command = js.native



}
/** 
  * Provides data for the CommandCreated event. 
 */
@JSName("adsk.core.CommandCreatedEventArgs")
object CommandCreatedEventArgs extends js.Object {
  /**
  * Gets the newly created Command object that allows you to perform an action in response to the control being clicked.
  */
  val command: Command = js.native
}
// no utilities
