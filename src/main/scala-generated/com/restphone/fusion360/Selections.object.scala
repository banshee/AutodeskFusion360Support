
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to and control over the set of selected entities in the user interface. 
 */
@JSName("adsk.core.Selections")
class Selections extends Base {
  /**
  * Adds the entity to the set of currently selected entities. The user will see the entity become selected in the user interface.
  */
  def add(entity: Base): Boolean = js.native
  /**
  * Gets or sets all entities currently selected.
  */
  var all: ObjectCollection = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Clears the selection set so no entities are currently selected.
  */
  def clear(): Boolean = js.native
  /**
  * Gets the number of entities currently selected.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified selection using an index into the collection.
  */
  def item(index: uinteger): Selection = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Removes the selections that are associated with the specified entity from the set of selected entities.
  */
  def removeByEntity(entity: Base): Boolean = js.native
  /**
  * Removes an item from the set of selected entities.
  */
  def removeByIndex(index: Integer): Boolean = js.native
  /**
  * Removes the specified selection from the set of selected entities.
  */
  def removeBySelection(selection: Selection): Boolean = js.native
}
/** 
  * Provides access to and control over the set of selected entities in the user interface. 
 */
@JSName("adsk.core.Selections")
object Selections extends js.Object {
  /**
  * Adds the entity to the set of currently selected entities. The user will see the entity become selected in the user interface.
  */
  def add(entity: Base): Boolean = js.native
  /**
  * Gets or sets all entities currently selected.
  */
  var all: ObjectCollection = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Clears the selection set so no entities are currently selected.
  */
  def clear(): Boolean = js.native
  /**
  * Gets the number of entities currently selected.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified selection using an index into the collection.
  */
  def item(index: uinteger): Selection = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Removes the selections that are associated with the specified entity from the set of selected entities.
  */
  def removeByEntity(entity: Base): Boolean = js.native
  /**
  * Removes an item from the set of selected entities.
  */
  def removeByIndex(index: Integer): Boolean = js.native
  /**
  * Removes the specified selection from the set of selected entities.
  */
  def removeBySelection(selection: Selection): Boolean = js.native
}

  object SelectionsUtilities {
    
    def toSeq(xs: Selections): IndexedSeq[Selection] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
