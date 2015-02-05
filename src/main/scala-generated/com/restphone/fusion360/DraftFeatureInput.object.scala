
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a draft feature. 
 */
@JSName("adsk.fusion.DraftFeatureInput")
class DraftFeatureInput extends Base {
  /**
  * Gets the first, or the only angle in the case of a single angle definition.
  */
  val angleOne: ValueInput = js.native
  /**
  * Gets the second angle. This can be null in the case where a single angle definition is used.
  */
  val angleTwo: ValueInput = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input faces. If IsTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included.
  */
  var inputFaces: BRepFace = js.native
  /**
  * Gets and sets if the direction of the draft is flipped.
  */
  var isDirectionFlipped: Boolean = js.native
  /**
  * Gets if the draft is symmetric from the draft plane. This only applies in the case where two angles have been specified and should be ignored otherwise.
  */
  val isSymmetric: Boolean = js.native
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
  * Gets and sets the plane that defines the direction in which the draft is applied. This can be a planar BrepFace, or a ConstructionPlane.
  */
  var plane: Base = js.native
  /**
  * Defines the draft to be defined so that a single angle is used for all drafts. If the isSymmetric is true then the faces are split along the parting plane and drafted independently using the same angle.
  */
  def setSingleAngle(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Defines both angles to use when the surfaces are split along the draft plane and the faces on each side of the plane are drafted independently from the other side.
  */
  def setTwoAngles(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a draft feature. 
 */
@JSName("adsk.fusion.DraftFeatureInput")
object DraftFeatureInput extends js.Object {
  /**
  * Gets the first, or the only angle in the case of a single angle definition.
  */
  val angleOne: ValueInput = js.native
  /**
  * Gets the second angle. This can be null in the case where a single angle definition is used.
  */
  val angleTwo: ValueInput = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input faces. If IsTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included.
  */
  var inputFaces: BRepFace = js.native
  /**
  * Gets and sets if the direction of the draft is flipped.
  */
  var isDirectionFlipped: Boolean = js.native
  /**
  * Gets if the draft is symmetric from the draft plane. This only applies in the case where two angles have been specified and should be ignored otherwise.
  */
  val isSymmetric: Boolean = js.native
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
  * Gets and sets the plane that defines the direction in which the draft is applied. This can be a planar BrepFace, or a ConstructionPlane.
  */
  var plane: Base = js.native
  /**
  * Defines the draft to be defined so that a single angle is used for all drafts. If the isSymmetric is true then the faces are split along the parting plane and drafted independently using the same angle.
  */
  def setSingleAngle(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Defines both angles to use when the surfaces are split along the draft plane and the faces on each side of the plane are drafted independently from the other side.
  */
  def setTwoAngles(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
}

  object DraftFeatureInputUtilities {
    // no toSeq

  }
       
