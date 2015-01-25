
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A material or appearance property that is a pre-defined list of choices. 
 */
@JSName("adsk.core.ChoiceProperty")
trait ChoiceProperty extends Property {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Method that returns the list of available choices.
  */
  def getChoices(/* out */ names: Array[String], /* out */ choices: Array[String]): Boolean = js.native






  /**
  * Gets and sets the which choice is selected from the set of choices. The value is a string that matches one of the pre-defined choices. The names of the available choices can be obtained using GetChoices method.
  */
  var value: String = js.native
}
/** 
  * A material or appearance property that is a pre-defined list of choices. 
 */
@JSName("adsk.core.ChoiceProperty")
object ChoiceProperty extends js.Object {
  /**
  * Method that returns the list of available choices.
  */
  def getChoices(/* out */ names: Array[String], /* out */ choices: Array[String]): Boolean = js.native
  /**
  * Gets and sets the which choice is selected from the set of choices. The value is a string that matches one of the pre-defined choices. The names of the available choices can be obtained using GetChoices method.
  */
  var value: String = js.native
}
// no utilities
