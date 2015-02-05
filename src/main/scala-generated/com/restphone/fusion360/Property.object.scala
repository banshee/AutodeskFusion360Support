
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for the specific property types used by materials and appearances. 
 */
@JSName("adsk.core.Property")
class Property extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the unique ID of this property.
  */
  val id: String = js.native
  /**
  * Indicates if this property is read-only. If True any attempted edits will fail.
  */
  val isReadOnly: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this property as seen in the user interface. This name is localized and can change based on the current language
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent of this property.
  */
  val parent: Base = js.native
}
/** 
  * The base class for the specific property types used by materials and appearances. 
 */
@JSName("adsk.core.Property")
object Property extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the unique ID of this property.
  */
  val id: String = js.native
  /**
  * Indicates if this property is read-only. If True any attempted edits will fail.
  */
  val isReadOnly: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this property as seen in the user interface. This name is localized and can change based on the current language
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent of this property.
  */
  val parent: Base = js.native
}

  object PropertyUtilities {
    // no toSeq

  }
       
