
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing shell feature in a design. 
 */
@JSName("adsk.fusion.ShellFeature")
class ShellFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ShellFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native

  /**
  * Gets the input faces/bodies.
  */
  val inputEntities: ObjectCollection = js.native
  /**
  * Gets the inside thickness. Edit the thickness through ModelParameter. This property returns nothing in the case where the feature is non-parametric.
  */
  val insideThickness: ModelParameter = js.native


  /**
  * Gets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities.
  */
  val isTangentChain: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ShellFeature = js.native

  /**
  * Gets the outside thickness. Edit the thickness through ModelParameter. This property returns nothing in the case where the feature is non-parametric.
  */
  val outsideThickness: ModelParameter = js.native

  /**
  * Method that sets faces to remove and bodies to preform shell. Return false if any faces are input, and the owning bodies of the faces are also input.
  */
  def setInputEntities(inputEntities: ObjectCollection): Boolean = js.native
  /**
  * Method that sets faces to remove and bodies to preform shell. Return false if any faces are input, and the owning bodies of the faces are also input.
  */
  def setInputEntities(inputEntities: ObjectCollection, /* optional */ isTangentChain: Boolean): Boolean = js.native
  /**
  * Method that sets inside and outside thicknesses of the shell.
  */
  def setThicknesses(insideThickness: ValueInput, outsideThickness: ValueInput): Boolean = js.native

}
/** 
  * Object that represents an existing shell feature in a design. 
 */
@JSName("adsk.fusion.ShellFeature")
object ShellFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ShellFeature = js.native
  /**
  * Gets the input faces/bodies.
  */
  val inputEntities: ObjectCollection = js.native
  /**
  * Gets the inside thickness. Edit the thickness through ModelParameter. This property returns nothing in the case where the feature is non-parametric.
  */
  val insideThickness: ModelParameter = js.native
  /**
  * Gets if any faces that are tangentially connected to any of the input faces will also be included in setting InputEntities.
  */
  val isTangentChain: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ShellFeature = js.native
  /**
  * Gets the outside thickness. Edit the thickness through ModelParameter. This property returns nothing in the case where the feature is non-parametric.
  */
  val outsideThickness: ModelParameter = js.native
  /**
  * Method that sets faces to remove and bodies to preform shell. Return false if any faces are input, and the owning bodies of the faces are also input.
  */
  def setInputEntities(inputEntities: ObjectCollection): Boolean = js.native
  /**
  * Method that sets faces to remove and bodies to preform shell. Return false if any faces are input, and the owning bodies of the faces are also input.
  */
  def setInputEntities(inputEntities: ObjectCollection, /* optional */ isTangentChain: Boolean): Boolean = js.native
  /**
  * Method that sets inside and outside thicknesses of the shell.
  */
  def setThicknesses(insideThickness: ValueInput, outsideThickness: ValueInput): Boolean = js.native
}

  object ShellFeatureUtilities {
    // no toSeq

  }
       
