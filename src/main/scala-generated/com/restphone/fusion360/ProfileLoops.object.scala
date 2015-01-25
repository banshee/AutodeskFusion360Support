
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of loops within a Profile. 
 */
@JSName("adsk.fusion.ProfileLoops")
trait ProfileLoops extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of loops within this profile.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile loop using an index into the collection.
  */
  def item(index: uinteger): ProfileLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of loops within a Profile. 
 */
@JSName("adsk.fusion.ProfileLoops")
object ProfileLoops extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of loops within this profile.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile loop using an index into the collection.
  */
  def item(index: uinteger): ProfileLoop = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ProfileLoopsUtilities {
    def toSeq(xs: ProfileLoops): IndexedSeq[ProfileLoop] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
