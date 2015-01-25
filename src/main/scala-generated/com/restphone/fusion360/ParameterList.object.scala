
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient object used to pass a set of parameters. 
 */
@JSName("adsk.fusion.ParameterList")
trait ParameterList extends Base {
  /**
  * Adds a parameter to the list. This does not create a new parameter, it adds an existing parameter to the list. Note that duplicates can exist in the list.
  */
  def add(parameter: Parameter): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates whether or not ParameterList collection contains a specified parameter
  */
  def contains(parameter: Parameter): Boolean = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a parameter list that the client can use for various purposes. Use ParameterList.Add to add parameters to the list after creating it.
  */
  def create(): ParameterList = js.native
  /**
  * Finds the specified parameter in the list. The search can be started at a specified index rather than from the beginning of the list. If not found, -1 is returned.
  */
  def find(parameter: Parameter): Integer = js.native
  /**
  * Finds the specified parameter in the list. The search can be started at a specified index rather than from the beginning of the list. If not found, -1 is returned.
  */
  def find(parameter: Parameter, /* optional */ startIndex: uinteger): Integer = js.native
  /**
  * Indicates if the list is read-only Some lists returned by API calls (instead of lists created by the user) are read only. Items cannot be added or remove from such a list.
  */
  val isReadOnly: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified parameter using an index into the collection.
  */
  def item(index: uinteger): Parameter = js.native
  /**
  * Returns the specified parameter using the name of the parameter as it is displayed in the parameters dialog
  */
  def itemByName(name: String): Parameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Method that removes a parameter from the list using the index of the item in the list Will fail if the list is read only.
  */
  def removeByIndex(index: uinteger): Boolean = js.native
  /**
  * Method that removes a parameter from the list by specifying the parameter (item) to remove
  */
  def removeByItem(item: Parameter): Boolean = js.native
}
/** 
  * Transient object used to pass a set of parameters. 
 */
@JSName("adsk.fusion.ParameterList")
object ParameterList extends js.Object {
  /**
  * Adds a parameter to the list. This does not create a new parameter, it adds an existing parameter to the list. Note that duplicates can exist in the list.
  */
  def add(parameter: Parameter): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates whether or not ParameterList collection contains a specified parameter
  */
  def contains(parameter: Parameter): Boolean = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a parameter list that the client can use for various purposes. Use ParameterList.Add to add parameters to the list after creating it.
  */
  def create(): ParameterList = js.native
  /**
  * Finds the specified parameter in the list. The search can be started at a specified index rather than from the beginning of the list. If not found, -1 is returned.
  */
  def find(parameter: Parameter): Integer = js.native
  /**
  * Finds the specified parameter in the list. The search can be started at a specified index rather than from the beginning of the list. If not found, -1 is returned.
  */
  def find(parameter: Parameter, /* optional */ startIndex: uinteger): Integer = js.native
  /**
  * Indicates if the list is read-only Some lists returned by API calls (instead of lists created by the user) are read only. Items cannot be added or remove from such a list.
  */
  val isReadOnly: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified parameter using an index into the collection.
  */
  def item(index: uinteger): Parameter = js.native
  /**
  * Returns the specified parameter using the name of the parameter as it is displayed in the parameters dialog
  */
  def itemByName(name: String): Parameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Method that removes a parameter from the list using the index of the item in the list Will fail if the list is read only.
  */
  def removeByIndex(index: uinteger): Boolean = js.native
  /**
  * Method that removes a parameter from the list by specifying the parameter (item) to remove
  */
  def removeByItem(item: Parameter): Boolean = js.native
}

  object ParameterListUtilities {
    def toSeq(xs: ParameterList): IndexedSeq[Parameter] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
