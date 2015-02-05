
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A material. 
 */
@JSName("adsk.core.Material")
class Material extends Base {
  /**
  * Gets the Appearance of this material.
  */
  val appearance: Appearance = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies this material to the specified target.
  */
  def copyTo(target: Base): Material = js.native
  /**
  * Deletes the material from the document. This method only applies to materials in a document that are unused
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the unique internal ID of this material.
  */
  val id: String = js.native
  /**
  * Returns true if this material is used in the document
  */
  val isUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the collection of material properties associated with this material.
  */
  val materialProperties: Properties = js.native
  /**
  * Returns the name of this Material. This is the name of the material as seen in the user interface. The name can only be edited if the material is in a document or a favorite.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the Parent object (a library or a document).
  */
  val parent: Base = js.native
}
/** 
  * A material. 
 */
@JSName("adsk.core.Material")
object Material extends js.Object {
  /**
  * Gets the Appearance of this material.
  */
  val appearance: Appearance = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies this material to the specified target.
  */
  def copyTo(target: Base): Material = js.native
  /**
  * Deletes the material from the document. This method only applies to materials in a document that are unused
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the unique internal ID of this material.
  */
  val id: String = js.native
  /**
  * Returns true if this material is used in the document
  */
  val isUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the collection of material properties associated with this material.
  */
  val materialProperties: Properties = js.native
  /**
  * Returns the name of this Material. This is the name of the material as seen in the user interface. The name can only be edited if the material is in a document or a favorite.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the Parent object (a library or a document).
  */
  val parent: Base = js.native
}

  object MaterialUtilities {
    // no toSeq

  }
       
