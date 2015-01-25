
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * An appearance. 
 */
@JSName("adsk.core.Appearance")
trait Appearance extends Base {
  /**
  * returns the collection of Properties that define this appearance
  */
  val appearanceProperties: Properties = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies this appearance to the specified target.
  */
  def copyTo(target: Base): Boolean = js.native
  /**
  * Deletes the Appearance from the document. This method is only valid for appearances that are in a document and are unused.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Property that indicates if this appearance has a texture associated with it.
  */
  val hasTexture: Boolean = js.native
  /**
  * The unique internal ID of this Appearance.
  */
  val id: String = js.native
  /**
  * Returns true if this Appearance is used in the document.
  */
  val isUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this Appearance. This is the localized name shown in the UI.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the Parent object of this Appearance (a MaterialLibrary, Document, or AppearanceFavorites collection).
  */
  val parent: Base = js.native
  /**
  * Returns a collection of the entities currently using this appearance. This property is only valid for an appearance in a document and where the IsUsed property returns true. The collection returned can contain
  */
  val usedBy: ObjectCollection = js.native
}
/** 
  * An appearance. 
 */
@JSName("adsk.core.Appearance")
object Appearance extends js.Object {
  /**
  * returns the collection of Properties that define this appearance
  */
  val appearanceProperties: Properties = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies this appearance to the specified target.
  */
  def copyTo(target: Base): Boolean = js.native
  /**
  * Deletes the Appearance from the document. This method is only valid for appearances that are in a document and are unused.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Property that indicates if this appearance has a texture associated with it.
  */
  val hasTexture: Boolean = js.native
  /**
  * The unique internal ID of this Appearance.
  */
  val id: String = js.native
  /**
  * Returns true if this Appearance is used in the document.
  */
  val isUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the name of this Appearance. This is the localized name shown in the UI.
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the Parent object of this Appearance (a MaterialLibrary, Document, or AppearanceFavorites collection).
  */
  val parent: Base = js.native
  /**
  * Returns a collection of the entities currently using this appearance. This property is only valid for an appearance in a document and where the IsUsed property returns true. The collection returned can contain
  */
  val usedBy: ObjectCollection = js.native
}
// no utilities
