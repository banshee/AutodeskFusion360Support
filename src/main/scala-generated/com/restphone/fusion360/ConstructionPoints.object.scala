
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the construction points within a component and provides methods to create new construction points. 
 */
@JSName("adsk.fusion.ConstructionPoints")
class ConstructionPoints extends Base {
  /**
  * Creates a new construction point.
  */
  def add(input: ConstructionPointInput): ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component that owns this collection.
  */
  val component: Component = js.native
  /**
  * The number of construction points in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionPointInput object that is in turn used to create a ConstructionPoint.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionPointInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction point using an index into the collection.
  */
  def item(index: uinteger): ConstructionPoint = js.native
  /**
  * Returns the specified construction point using the name of the construction point as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the construction points within a component and provides methods to create new construction points. 
 */
@JSName("adsk.fusion.ConstructionPoints")
object ConstructionPoints extends js.Object {
  /**
  * Creates a new construction point.
  */
  def add(input: ConstructionPointInput): ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component that owns this collection.
  */
  val component: Component = js.native
  /**
  * The number of construction points in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionPointInput object that is in turn used to create a ConstructionPoint.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionPointInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction point using an index into the collection.
  */
  def item(index: uinteger): ConstructionPoint = js.native
  /**
  * Returns the specified construction point using the name of the construction point as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ConstructionPointsUtilities {
    
    def toSeq(xs: ConstructionPoints): IndexedSeq[ConstructionPoint] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
