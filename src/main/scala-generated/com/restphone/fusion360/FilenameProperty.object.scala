
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A file name property associated with an appearance. 
 */
@JSName("adsk.core.FilenameProperty")
trait FilenameProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native






  /**
  * Gets and sets the value of this property.
  */
  var value: String = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: String = js.native
}
/** 
  * A file name property associated with an appearance. 
 */
@JSName("adsk.core.FilenameProperty")
object FilenameProperty extends js.Object {
  /**
  * Gets the boolean flag that indicates if this property has multiple values or not.
  */
  val hasMultipleValues: Boolean = js.native
  /**
  * Gets and sets the value of this property.
  */
  var value: String = js.native
  /**
  * Gets and sets the values associated with this property. HasMultipleValues property indicates if this property will be returning more than one value.
  */
  var values: String = js.native
}
// no utilities
