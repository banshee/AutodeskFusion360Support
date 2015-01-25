
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a mirror feature. 
 */
@JSName("adsk.fusion.MirrorFeatureInput")
trait MirrorFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the mirror plane. This can be either a planar face or construction plane.
  */
  var mirrorPlane: Base = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a mirror feature. 
 */
@JSName("adsk.fusion.MirrorFeatureInput")
object MirrorFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the mirror plane. This can be either a planar face or construction plane.
  */
  var mirrorPlane: Base = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
