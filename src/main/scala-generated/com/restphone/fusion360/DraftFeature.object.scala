
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing draft feature in a design. 
 */
@JSName("adsk.fusion.DraftFeature")
class DraftFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): DraftFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Gets the definition object that specifies how the draft is defined. Modifying the definition object will cause the draft to recompute. This can return either an AngleExtentDefinition or TwoSidesAngleExtentDefinition object. This property returns nothing in the case where the feature is non-parametric. Use this property to access the parameters controlling the draft and whether the draft is symmetric or not.
  */
  val draftDefinition: ExtentDefinition = js.native

  /**
  * Gets and sets the input faces. If isTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included.
  */
  var inputFaces: BRepFace = js.native
  /**
  * Gets and sets if the direction of the draft is flipped.
  */
  var isDirectionFlipped: Boolean = js.native


  /**
  * Gets and sets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities. It defaults to true.
  */
  var isTangentChain: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: DraftFeature = js.native


  /**
  * Gets and sets the plane that defines the direction in which the draft is applied. This can be a planar BrepFace, or a ConstructionPlane.
  */
  var plane: Base = js.native
  /**
  * Changes the definition of the feature so that a single angle is used for all drafts. If the isSymmetric is true then the faces are split along the parting plane and drafted independently using the same angle.
  */
  def setSingleAngle(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Changes the definition of the feature so that the surfaces are split along the draft plane and the faces on each side of the plane are drafted independently from the other side.
  */
  def setTwoAngles(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native

}
/** 
  * Object that represents an existing draft feature in a design. 
 */
@JSName("adsk.fusion.DraftFeature")
object DraftFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): DraftFeature = js.native
  /**
  * Gets the definition object that specifies how the draft is defined. Modifying the definition object will cause the draft to recompute. This can return either an AngleExtentDefinition or TwoSidesAngleExtentDefinition object. This property returns nothing in the case where the feature is non-parametric. Use this property to access the parameters controlling the draft and whether the draft is symmetric or not.
  */
  val draftDefinition: ExtentDefinition = js.native
  /**
  * Gets and sets the input faces. If isTangentChain is true, all the faces that are tangentially connected to the input faces (if any) will also be included.
  */
  var inputFaces: BRepFace = js.native
  /**
  * Gets and sets if the direction of the draft is flipped.
  */
  var isDirectionFlipped: Boolean = js.native
  /**
  * Gets and sets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities. It defaults to true.
  */
  var isTangentChain: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: DraftFeature = js.native
  /**
  * Gets and sets the plane that defines the direction in which the draft is applied. This can be a planar BrepFace, or a ConstructionPlane.
  */
  var plane: Base = js.native
  /**
  * Changes the definition of the feature so that a single angle is used for all drafts. If the isSymmetric is true then the faces are split along the parting plane and drafted independently using the same angle.
  */
  def setSingleAngle(isSymmetric: Boolean, angle: ValueInput): Boolean = js.native
  /**
  * Changes the definition of the feature so that the surfaces are split along the draft plane and the faces on each side of the plane are drafted independently from the other side.
  */
  def setTwoAngles(angleOne: ValueInput, angleTwo: ValueInput): Boolean = js.native
}

  object DraftFeatureUtilities {
    // no toSeq

  }
       
