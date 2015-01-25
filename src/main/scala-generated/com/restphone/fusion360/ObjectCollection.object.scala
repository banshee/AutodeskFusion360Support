
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Generic collection used to handle lists of any object type. 
 */
@JSName("adsk.core.ObjectCollection")
trait ObjectCollection extends Base {
  /**
  * Adds an object to the end of the collection. Duplicates can be added to the collection.
  */
  def add(item: Base): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Clears the entire contents of the collection.
  */
  def clear(): Boolean = js.native
  /**
  * Returns whether the specified object exists within the collection.
  */
  def contains(item: Base): Boolean = js.native
  /**
  * Returns the number of occurrences in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new ObjectCollection object.
  */
  def create(): ObjectCollection = js.native
  /**
  * Finds the specified component in the collection.
  */
  def find(item: Base): Integer = js.native
  /**
  * Finds the specified component in the collection.
  */
  def find(item: Base, /* optional */ startIndex: uinteger): Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified object using an index into the collection.
  */
  def item(index: uinteger): Base = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Function that removes an item from the list. Will fail if the list is read only.
  */
  def removeByIndex(index: uinteger): Boolean = js.native
  /**
  * Function that removes an item from the collection.
  */
  def removeByItem(item: Base): Boolean = js.native
}
/** 
  * Generic collection used to handle lists of any object type. 
 */
@JSName("adsk.core.ObjectCollection")
object ObjectCollection extends js.Object {
  /**
  * Adds an object to the end of the collection. Duplicates can be added to the collection.
  */
  def add(item: Base): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Clears the entire contents of the collection.
  */
  def clear(): Boolean = js.native
  /**
  * Returns whether the specified object exists within the collection.
  */
  def contains(item: Base): Boolean = js.native
  /**
  * Returns the number of occurrences in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new ObjectCollection object.
  */
  def create(): ObjectCollection = js.native
  /**
  * Finds the specified component in the collection.
  */
  def find(item: Base): Integer = js.native
  /**
  * Finds the specified component in the collection.
  */
  def find(item: Base, /* optional */ startIndex: uinteger): Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified object using an index into the collection.
  */
  def item(index: uinteger): Base = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Function that removes an item from the list. Will fail if the list is read only.
  */
  def removeByIndex(index: uinteger): Boolean = js.native
  /**
  * Function that removes an item from the collection.
  */
  def removeByItem(item: Base): Boolean = js.native
}

  object ObjectCollectionUtilities {
    def toSeq(xs: ObjectCollection): IndexedSeq[Base] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
