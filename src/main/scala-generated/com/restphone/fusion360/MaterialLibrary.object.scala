
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A material library. 
 */
@JSName("adsk.core.MaterialLibrary")
trait MaterialLibrary extends Base {
  /**
  * Returns the appearances defined within this library.
  */
  val appearances: Appearances = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The unique internal ID of this Library.
  */
  val id: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the materials defined within this library.
  */
  val materials: Materials = js.native
  /**
  * Property that gets the name of this Library. This is the localized name shown in the user interface.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A material library. 
 */
@JSName("adsk.core.MaterialLibrary")
object MaterialLibrary extends js.Object {
  /**
  * Returns the appearances defined within this library.
  */
  val appearances: Appearances = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The unique internal ID of this Library.
  */
  val id: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the materials defined within this library.
  */
  val materials: Materials = js.native
  /**
  * Property that gets the name of this Library. This is the localized name shown in the user interface.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
