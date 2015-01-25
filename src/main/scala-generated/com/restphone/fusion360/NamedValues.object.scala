
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Wraps a list of named values. 
 */
@JSName("adsk.core.NamedValues")
trait NamedValues extends Base {
  /**
  * Adds a name value pair to the NamedValues object
  */
  def add(name: String, value: ValueInput): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of name value pairs in this object. ///
  */
  val count: uinteger = js.native
  /**
  * Creates a transient NamedValues object.
  */
  def create(): NamedValues = js.native
  /**
  * Function that returns the name and ValueInput object of a name value pair by specifying an index number
  */
  def getByIndex(index: Integer, /* out */ name: String, /* out */ value: ValueInput): Boolean = js.native
  /**
  * Function that returns the ValueInput object of a name value pair by specifying its name
  */
  def getValueByName(name: String, /* out */ value: ValueInput): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Wraps a list of named values. 
 */
@JSName("adsk.core.NamedValues")
object NamedValues extends js.Object {
  /**
  * Adds a name value pair to the NamedValues object
  */
  def add(name: String, value: ValueInput): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of name value pairs in this object. ///
  */
  val count: uinteger = js.native
  /**
  * Creates a transient NamedValues object.
  */
  def create(): NamedValues = js.native
  /**
  * Function that returns the name and ValueInput object of a name value pair by specifying an index number
  */
  def getByIndex(index: Integer, /* out */ name: String, /* out */ value: ValueInput): Boolean = js.native
  /**
  * Function that returns the ValueInput object of a name value pair by specifying its name
  */
  def getValueByName(name: String, /* out */ value: ValueInput): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
