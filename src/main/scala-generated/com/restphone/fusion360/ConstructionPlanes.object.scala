
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the construction planes within a component and provides methods to create new construction planes. 
 */
@JSName("adsk.fusion.ConstructionPlanes")
trait ConstructionPlanes extends Base {
  /**
  * Creates and adds a new ConstructionPlane using the creation parameters in the ConstructionPlaneInput.
  */
  def add(input: ConstructionPlaneInput): ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component that owns this collection.
  */
  val component: Component = js.native
  /**
  * Returns the number of construction planes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionPlaneInput object that is in turn used to create a ConstructionPlane.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionPlaneInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction plane using an index into the collection.
  */
  def item(index: uinteger): ConstructionPlane = js.native
  /**
  * Returns the specified construction plane using the name of the construction plane as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the construction planes within a component and provides methods to create new construction planes. 
 */
@JSName("adsk.fusion.ConstructionPlanes")
object ConstructionPlanes extends js.Object {
  /**
  * Creates and adds a new ConstructionPlane using the creation parameters in the ConstructionPlaneInput.
  */
  def add(input: ConstructionPlaneInput): ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component that owns this collection.
  */
  val component: Component = js.native
  /**
  * Returns the number of construction planes in the collection.
  */
  val count: uinteger = js.native
  /**
  * Create a ConstructionPlaneInput object that is in turn used to create a ConstructionPlane.
  */
  def createInput(occurrenceForCreation: Occurrence): ConstructionPlaneInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified construction plane using an index into the collection.
  */
  def item(index: uinteger): ConstructionPlane = js.native
  /**
  * Returns the specified construction plane using the name of the construction plane as it is displayed in the browser.
  */
  def itemByName(name: String): ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ConstructionPlanesUtilities {
    def toSeq(xs: ConstructionPlanes): IndexedSeq[ConstructionPlane] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
