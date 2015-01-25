
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a set of arguments from a firing SelectionEvent to a SelectionEventHandler's notify callback method. 
 */
@JSName("adsk.core.SelectionEventArgs")
trait SelectionEventArgs extends EventArgs {
  /**
  * Gets or sets any additional entities that should be pre-highlighted and selected if this entity is selected. An example of use is that the mouse passes over an edge of a body and all tangentially connected edges are highlighted with that edge so they can be selected as a set. The additional entities should all be valid based on the current selection filter.
  */
  var additionalEntities: ObjectCollection = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets or sets whether this entity should be made available to be selected. The value is initialized to true, so doing nothing will result in the entity being selectable.
  */
  var isSelectable: Boolean = js.native


  /**
  * Gets the entity that is valid for selection.
  */
  val selection: Selection = js.native
}
/** 
  * Provides a set of arguments from a firing SelectionEvent to a SelectionEventHandler's notify callback method. 
 */
@JSName("adsk.core.SelectionEventArgs")
object SelectionEventArgs extends js.Object {
  /**
  * Gets or sets any additional entities that should be pre-highlighted and selected if this entity is selected. An example of use is that the mouse passes over an edge of a body and all tangentially connected edges are highlighted with that edge so they can be selected as a set. The additional entities should all be valid based on the current selection filter.
  */
  var additionalEntities: ObjectCollection = js.native
  /**
  * Gets or sets whether this entity should be made available to be selected. The value is initialized to true, so doing nothing will result in the entity being selectable.
  */
  var isSelectable: Boolean = js.native
  /**
  * Gets the entity that is valid for selection.
  */
  val selection: Selection = js.native
}
// no utilities
