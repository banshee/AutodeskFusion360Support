
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection of the favorite appearances. To add an appearance to the favorites list use the CopyTo method of the Appearance object. 
 */
@JSName("adsk.core.FavoriteAppearances")
trait FavoriteAppearances extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Appearances in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified Appearance using an index into the collection.
  */
  def item(index: Integer): Appearance = js.native
  /**
  * Returns the Appearance by it's internal unique ID.
  */
  def itemById(id: String): Appearance = js.native
  /**
  * Returns the specified appearance using the name as seen in the user interface. This often isn't a reliable way of accessing a specific appearance because appearances are not required to be unique.
  */
  def itemByName(name: String): Appearance = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection of the favorite appearances. To add an appearance to the favorites list use the CopyTo method of the Appearance object. 
 */
@JSName("adsk.core.FavoriteAppearances")
object FavoriteAppearances extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Appearances in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified Appearance using an index into the collection.
  */
  def item(index: Integer): Appearance = js.native
  /**
  * Returns the Appearance by it's internal unique ID.
  */
  def itemById(id: String): Appearance = js.native
  /**
  * Returns the specified appearance using the name as seen in the user interface. This often isn't a reliable way of accessing a specific appearance because appearances are not required to be unique.
  */
  def itemByName(name: String): Appearance = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object FavoriteAppearancesUtilities {
    def toSeq(xs: FavoriteAppearances): IndexedSeq[Appearance] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
