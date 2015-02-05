
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a shell feature. 
 */
@JSName("adsk.fusion.ShellFeatureInput")
class ShellFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the shell is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the shell) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets and sets the input faces/bodies. If IsTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included. Fails if any faces are input, and the owning bodies of the faces are also input.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets the inside thickness.
  */
  var insideThickness: ValueInput = js.native
  /**
  * Gets and sets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities. It defaults to true.
  */
  var isTangentChain: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the outside thickness.
  */
  var outsideThickness: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a shell feature. 
 */
@JSName("adsk.fusion.ShellFeatureInput")
object ShellFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the shell is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the shell) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets and sets the input faces/bodies. If IsTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included. Fails if any faces are input, and the owning bodies of the faces are also input.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets the inside thickness.
  */
  var insideThickness: ValueInput = js.native
  /**
  * Gets and sets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities. It defaults to true.
  */
  var isTangentChain: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the outside thickness.
  */
  var outsideThickness: ValueInput = js.native
}

  object ShellFeatureInputUtilities {
    // no toSeq

  }
       
