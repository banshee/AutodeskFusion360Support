
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a toolbar in the user interface. A toolbar is a collection of toolbar controls. 
 */
@JSName("adsk.core.Toolbar")
class Toolbar extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the controls in this toolbar.
  */
  val controls: ToolbarControls = js.native
  /**
  * Gets the unique ID of the toolbar that can be used programmatically to find a specific toolbar.
  */
  val id: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the owning UserInterface object.
  */
  val parentUserInterface: UserInterface = js.native
}
/** 
  * Provides access to a toolbar in the user interface. A toolbar is a collection of toolbar controls. 
 */
@JSName("adsk.core.Toolbar")
object Toolbar extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the controls in this toolbar.
  */
  val controls: ToolbarControls = js.native
  /**
  * Gets the unique ID of the toolbar that can be used programmatically to find a specific toolbar.
  */
  val id: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets the owning UserInterface object.
  */
  val parentUserInterface: UserInterface = js.native
}

  object ToolbarUtilities {
    // no toSeq

  }
       
