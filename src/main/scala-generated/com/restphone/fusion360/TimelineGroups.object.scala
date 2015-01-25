
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the time line groups within a design and provides methods to create new groups. 
 */
@JSName("adsk.fusion.TimelineGroups")
trait TimelineGroups extends Base {
  /**
  * Creates a new group within the timeline. The items indicates by the indexes will be included in the group. None of the items being grouped can be a group of this will fail.
  */
  def add(startIndex: Integer, endIndex: Integer): TimelineGroup = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified timeline group using an index into the collection.
  */
  def item(index: uinteger): TimelineGroup = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the time line groups within a design and provides methods to create new groups. 
 */
@JSName("adsk.fusion.TimelineGroups")
object TimelineGroups extends js.Object {
  /**
  * Creates a new group within the timeline. The items indicates by the indexes will be included in the group. None of the items being grouped can be a group of this will fail.
  */
  def add(startIndex: Integer, endIndex: Integer): TimelineGroup = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified timeline group using an index into the collection.
  */
  def item(index: uinteger): TimelineGroup = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object TimelineGroupsUtilities {
    def toSeq(xs: TimelineGroups): IndexedSeq[TimelineGroup] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
