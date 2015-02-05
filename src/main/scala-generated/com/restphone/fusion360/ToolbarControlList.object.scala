
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a list of toolbar controls. 
 */
@JSName("adsk.core.ToolbarControlList")
class ToolbarControlList extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of toolbar controls.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the ToolbarControl at the specified index. When iterating by index, the controls are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarControl = js.native
  /**
  * Returns the ToolbarControl at the specified ID.
  */
  def itemById(id: String): ToolbarControl = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to a list of toolbar controls. 
 */
@JSName("adsk.core.ToolbarControlList")
object ToolbarControlList extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of toolbar controls.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the ToolbarControl at the specified index. When iterating by index, the controls are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarControl = js.native
  /**
  * Returns the ToolbarControl at the specified ID.
  */
  def itemById(id: String): ToolbarControl = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ToolbarControlListUtilities {
    
    def toSeq(xs: ToolbarControlList): IndexedSeq[ToolbarControl] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
