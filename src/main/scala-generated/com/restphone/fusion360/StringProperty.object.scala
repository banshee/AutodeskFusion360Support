
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A string value property associated with a material or appearance. 
 */
@JSName("adsk.core.StringProperty")
trait StringProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native






  /**
  * Gets and sets the property value.
  */
  var value: String = js.native
}
/** 
  * A string value property associated with a material or appearance. 
 */
@JSName("adsk.core.StringProperty")
object StringProperty extends js.Object {
  /**
  * Gets and sets the property value.
  */
  var value: String = js.native
}
// no utilities
