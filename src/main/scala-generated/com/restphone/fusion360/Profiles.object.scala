
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of all of the profiles currently calculated for this sketch. Profiles are automatically computed by Fusion and represent closed areas within the sketch. 
 */
@JSName("adsk.fusion.Profiles")
trait Profiles extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of profiles in the sketch..
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile using an index into the collection.
  */
  def item(index: uinteger): Profile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of all of the profiles currently calculated for this sketch. Profiles are automatically computed by Fusion and represent closed areas within the sketch. 
 */
@JSName("adsk.fusion.Profiles")
object Profiles extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of profiles in the sketch..
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile using an index into the collection.
  */
  def item(index: uinteger): Profile = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ProfilesUtilities {
    def toSeq(xs: Profiles): IndexedSeq[Profile] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
