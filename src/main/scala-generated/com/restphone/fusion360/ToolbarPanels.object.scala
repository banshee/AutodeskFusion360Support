
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a set of toolbar panels. There exist many toolbar panels and their visibility is determined by the active workspace. A panel can be associated with one or more workspaces and when the associated workspace is active, the panel is made visible. 
 */
@JSName("adsk.core.ToolbarPanels")
trait ToolbarPanels extends Base {
  /**
  * Creates a new ToolbarPanel. The panel is initially empty. Use the associated ToolbarControls collection to add buttons.
  */
  def add(id: String, name: String): ToolbarPanel = js.native
  /**
  * Creates a new ToolbarPanel. The panel is initially empty. Use the associated ToolbarControls collection to add buttons.
  */
  def add(id: String, name: String, /* optional */ beforeIndex: Integer): ToolbarPanel = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of ToolbarPanels.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified toolbar panel using an index into the collection. When iterating by index, the panels are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarPanel = js.native
  /**
  * Returns the ToolbarPanel at the specified ID.
  */
  def itemById(id: String): ToolbarPanel = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to a set of toolbar panels. There exist many toolbar panels and their visibility is determined by the active workspace. A panel can be associated with one or more workspaces and when the associated workspace is active, the panel is made visible. 
 */
@JSName("adsk.core.ToolbarPanels")
object ToolbarPanels extends js.Object {
  /**
  * Creates a new ToolbarPanel. The panel is initially empty. Use the associated ToolbarControls collection to add buttons.
  */
  def add(id: String, name: String): ToolbarPanel = js.native
  /**
  * Creates a new ToolbarPanel. The panel is initially empty. Use the associated ToolbarControls collection to add buttons.
  */
  def add(id: String, name: String, /* optional */ beforeIndex: Integer): ToolbarPanel = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the number of ToolbarPanels.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified toolbar panel using an index into the collection. When iterating by index, the panels are returned in the same order as they are shown in the user interface.
  */
  def item(index: uinteger): ToolbarPanel = js.native
  /**
  * Returns the ToolbarPanel at the specified ID.
  */
  def itemById(id: String): ToolbarPanel = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ToolbarPanelsUtilities {
    def toSeq(xs: ToolbarPanels): IndexedSeq[ToolbarPanel] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
