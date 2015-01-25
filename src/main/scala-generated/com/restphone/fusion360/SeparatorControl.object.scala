
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a separator within a panel, toolbar, or drop-down control. 
 */
@JSName("adsk.core.SeparatorControl")
trait SeparatorControl extends ToolbarControl {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Deletes the ToolbarControl
  */
  override def deleteMe(): Boolean = js.native






}
/** 
  * Represents a separator within a panel, toolbar, or drop-down control. 
 */
@JSName("adsk.core.SeparatorControl")
object SeparatorControl extends js.Object {

}
// no utilities
