
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of properties that are associated with a material or appearance. 
 */
@JSName("adsk.core.Properties")
class Properties extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of properties within the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified property from the collection using an index into the collection.
  */
  def item(index: Integer): Property = js.native
  /**
  * Returns the specified property from the collection using the unique ID of the property.
  */
  def itemById(id: String): Property = js.native
  /**
  * Returns the specified Property using the name of the property.
  */
  def itemByName(name: String): Property = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of properties that are associated with a material or appearance. 
 */
@JSName("adsk.core.Properties")
object Properties extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of properties within the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified property from the collection using an index into the collection.
  */
  def item(index: Integer): Property = js.native
  /**
  * Returns the specified property from the collection using the unique ID of the property.
  */
  def itemById(id: String): Property = js.native
  /**
  * Returns the specified Property using the name of the property.
  */
  def itemByName(name: String): Property = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object PropertiesUtilities {
    
    def toSeq(xs: Properties): IndexedSeq[Property] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
