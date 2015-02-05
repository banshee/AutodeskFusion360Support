
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the User Parameters within a design and provides methods to create new user parameters. 
 */
@JSName("adsk.fusion.UserParameters")
class UserParameters extends Base {
  /**
  * Adds a new user parameter to the collection.
  */
  def add(name: String, value: ValueInput, units: String, comment: String): UserParameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Returns the design that owns the user parameters collection.
  */
  val design: Design = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified User Parameter using an index into the collection.
  */
  def item(index: uinteger): UserParameter = js.native
  /**
  * Function that returns the specified User Parameter using the name of the parameter as it is displayed in the parameters dialog.
  */
  def itemByName(name: String): UserParameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the User Parameters within a design and provides methods to create new user parameters. 
 */
@JSName("adsk.fusion.UserParameters")
object UserParameters extends js.Object {
  /**
  * Adds a new user parameter to the collection.
  */
  def add(name: String, value: ValueInput, units: String, comment: String): UserParameter = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Returns the design that owns the user parameters collection.
  */
  val design: Design = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified User Parameter using an index into the collection.
  */
  def item(index: uinteger): UserParameter = js.native
  /**
  * Function that returns the specified User Parameter using the name of the parameter as it is displayed in the parameters dialog.
  */
  def itemByName(name: String): UserParameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object UserParametersUtilities {
    
    def toSeq(xs: UserParameters): IndexedSeq[UserParameter] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
