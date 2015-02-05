
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A material or appearance property that is a Boolean value. 
 */
@JSName("adsk.core.BooleanProperty")
class BooleanProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native






  /**
  * Gets and sets the value of this property.
  */
  var value: Boolean = js.native
}
/** 
  * A material or appearance property that is a Boolean value. 
 */
@JSName("adsk.core.BooleanProperty")
object BooleanProperty extends js.Object {
  /**
  * Gets and sets the value of this property.
  */
  var value: Boolean = js.native
}

  object BooleanPropertyUtilities {
    // no toSeq

  }
       
