
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the Model Parameters within a component. 
 */
@JSName("adsk.fusion.ModelParameters")
class ModelParameters extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component that owns the Model Parameters collection
  */
  val component: Component = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified Model Parameter using an index into the collection.
  */
  def item(index: uinteger): ModelParameter = js.native
  /**
  * Function that returns the specified Model Parameter using the name of the parameter as it is displayed in the parameters dialog.
  */
  def itemByName(name: String): ModelParameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the Model Parameters within a component. 
 */
@JSName("adsk.fusion.ModelParameters")
object ModelParameters extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component that owns the Model Parameters collection
  */
  val component: Component = js.native
  /**
  * Returns the number of parameters in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified Model Parameter using an index into the collection.
  */
  def item(index: uinteger): ModelParameter = js.native
  /**
  * Function that returns the specified Model Parameter using the name of the parameter as it is displayed in the parameters dialog.
  */
  def itemByName(name: String): ModelParameter = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ModelParametersUtilities {
    
    def toSeq(xs: ModelParameters): IndexedSeq[ModelParameter] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
