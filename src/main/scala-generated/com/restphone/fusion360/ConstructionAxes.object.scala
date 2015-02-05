
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the construction axes within a component and provides methods to create new construction axes. 
 */
@JSName("adsk.fusion.ConstructionAxes")
class ConstructionAxes extends Base {
  /**
  * Creates and adds a new ConstructionAxis using the creation parameters in the ConstructionAxisInput.
  */
  def add(input: ConstructionAxisInput): ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component that owns this collection.
  */
  val component: Component = js.native
  /**
  * The number of construction axes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionAxisInput object that is in turn used to create a ConstructionAxis.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionAxisInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction axis using an index into the collection.
  */
  def item(index: uinteger): ConstructionAxis = js.native
  /**
  * Returns the specified construction axis using the name of the construction axis as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the construction axes within a component and provides methods to create new construction axes. 
 */
@JSName("adsk.fusion.ConstructionAxes")
object ConstructionAxes extends js.Object {
  /**
  * Creates and adds a new ConstructionAxis using the creation parameters in the ConstructionAxisInput.
  */
  def add(input: ConstructionAxisInput): ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component that owns this collection.
  */
  val component: Component = js.native
  /**
  * The number of construction axes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionAxisInput object that is in turn used to create a ConstructionAxis.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionAxisInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction axis using an index into the collection.
  */
  def item(index: uinteger): ConstructionAxis = js.native
  /**
  * Returns the specified construction axis using the name of the construction axis as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ConstructionAxesUtilities {
    
    def toSeq(xs: ConstructionAxes): IndexedSeq[ConstructionAxis] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
