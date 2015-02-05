
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class Parameter object that can represent model or user parameters. 
 */
@JSName("adsk.fusion.Parameter")
class Parameter extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The comment associated with this parameter
  */
  var comment: String = js.native
  /**
  * Returns a list of parameters that are dependent on this parameter as a result of this parameter being referenced in their equation.
  */
  val dependentParameters: ParameterList = js.native
  /**
  * Gets and sets the expression (ie. "22.064 mm") used to calculate the value of the parameter
  */
  var expression: String = js.native
  /**
  * Gets and sets whether this parameter is included in the Favorites list in the parameters dialog
  */
  var isFavorite: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the parameter. Setting the name can fail if the name is not unique with respect to all other parameters in the design.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The unit type associated with this parameter.
  */
  val unit: String = js.native
  /**
  * Gets and sets the real value (a double) of the parameter in database units. Setting this property will set/reset the expression value for this parameter
  */
  var value: double = js.native
}
/** 
  * The base class Parameter object that can represent model or user parameters. 
 */
@JSName("adsk.fusion.Parameter")
object Parameter extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The comment associated with this parameter
  */
  var comment: String = js.native
  /**
  * Returns a list of parameters that are dependent on this parameter as a result of this parameter being referenced in their equation.
  */
  val dependentParameters: ParameterList = js.native
  /**
  * Gets and sets the expression (ie. "22.064 mm") used to calculate the value of the parameter
  */
  var expression: String = js.native
  /**
  * Gets and sets whether this parameter is included in the Favorites list in the parameters dialog
  */
  var isFavorite: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the name of the parameter. Setting the name can fail if the name is not unique with respect to all other parameters in the design.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * The unit type associated with this parameter.
  */
  val unit: String = js.native
  /**
  * Gets and sets the real value (a double) of the parameter in database units. Setting this property will set/reset the expression value for this parameter
  */
  var value: double = js.native
}

  object ParameterUtilities {
    // no toSeq

  }
       
