
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of profile curves within a profile loop. 
 */
@JSName("adsk.fusion.ProfileCurves")
trait ProfileCurves extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of curves in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile curve using an index into the collection.
  */
  def item(index: uinteger): ProfileCurve = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of profile curves within a profile loop. 
 */
@JSName("adsk.fusion.ProfileCurves")
object ProfileCurves extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of curves in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified profile curve using an index into the collection.
  */
  def item(index: uinteger): ProfileCurve = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ProfileCurvesUtilities {
    def toSeq(xs: ProfileCurves): IndexedSeq[ProfileCurve] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
