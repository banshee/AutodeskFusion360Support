
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a User Parameter. 
 */
@JSName("adsk.fusion.UserParameter")
class UserParameter extends Parameter {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Deletes the user parameter A parameter can only be deleted if it is a UserParameter and it is not referenced by other parameters.
  */
  def deleteMe(): Boolean = js.native

  /**
  * Returns the Design containing the UserParameter.
  */
  val design: Design = js.native






  /**
  * Returns the Collection containing the UserParameter.
  */
  val userParameters: UserParameters = js.native

}
/** 
  * Represents a User Parameter. 
 */
@JSName("adsk.fusion.UserParameter")
object UserParameter extends js.Object {
  /**
  * Deletes the user parameter A parameter can only be deleted if it is a UserParameter and it is not referenced by other parameters.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the Design containing the UserParameter.
  */
  val design: Design = js.native
  /**
  * Returns the Collection containing the UserParameter.
  */
  val userParameters: UserParameters = js.native
}

  object UserParameterUtilities {
    // no toSeq

  }
       
