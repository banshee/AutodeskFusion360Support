
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides a list of occurrences. 
 */
@JSName("adsk.fusion.OccurrenceList")
trait OccurrenceList extends Base {
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
  * Returns the specified occurrence using an index into the collection.
  */
  def item(index: uinteger): Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides a list of occurrences. 
 */
@JSName("adsk.fusion.OccurrenceList")
object OccurrenceList extends js.Object {
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
  * Returns the specified occurrence using an index into the collection.
  */
  def item(index: uinteger): Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object OccurrenceListUtilities {
    def toSeq(xs: OccurrenceList): IndexedSeq[Occurrence] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
