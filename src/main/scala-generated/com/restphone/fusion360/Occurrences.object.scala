
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to occurrences within a component and provides methods to create new occurrences. 
 */
@JSName("adsk.fusion.Occurrences")
trait Occurrences extends Base {
  /**
  * Method that creates a new occurrence using an existing component. This is the equivalent of copying and pasting an occurrence in the user interface.
  */
  def addExistingComponent(component: Component, transform: Matrix3D): Occurrence = js.native
  /**
  * Method that creates a new component and an occurrence that references it.
  */
  def addNewComponent(transform: Matrix3D): Occurrence = js.native
  /**
  * Returns the contents of this collection as an OccurrencesList object. This is useful when writing a function that traverses an assembly.
  */
  val asList: OccurrenceList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of occurrences in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified occurrence using an index into the collection.
  */
  def item(index: uinteger): Occurrence = js.native
  /**
  * Returns the specified occurrence using the name of the occurrence.
  */
  def itemByName(name: String): Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to occurrences within a component and provides methods to create new occurrences. 
 */
@JSName("adsk.fusion.Occurrences")
object Occurrences extends js.Object {
  /**
  * Method that creates a new occurrence using an existing component. This is the equivalent of copying and pasting an occurrence in the user interface.
  */
  def addExistingComponent(component: Component, transform: Matrix3D): Occurrence = js.native
  /**
  * Method that creates a new component and an occurrence that references it.
  */
  def addNewComponent(transform: Matrix3D): Occurrence = js.native
  /**
  * Returns the contents of this collection as an OccurrencesList object. This is useful when writing a function that traverses an assembly.
  */
  val asList: OccurrenceList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of occurrences in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified occurrence using an index into the collection.
  */
  def item(index: uinteger): Occurrence = js.native
  /**
  * Returns the specified occurrence using the name of the occurrence.
  */
  def itemByName(name: String): Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object OccurrencesUtilities {
    def toSeq(xs: Occurrences): IndexedSeq[Occurrence] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
