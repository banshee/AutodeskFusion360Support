
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing fillet feature in a design. 
 */
@JSName("adsk.fusion.FilletFeature")
class FilletFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): FilletFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Returns the edge sets associated with this fillet.
  */
  val edgeSets: FilletEdgeSets = js.native

  /**
  * Gets and sets if the fillet uses the G2 (curvature-continuity) surface quality option .
  */
  var isG2: Boolean = js.native

  /**
  * Gets and sets if a rolling ball solution is to be used in any corners.
  */
  var isRollingBallCorner: Boolean = js.native

  /**
  * Gets and sets whether or not edges that are tangentially connected to the input edges (if any) will also be filleted.
  */
  var isTangentChain: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: FilletFeature = js.native



}
/** 
  * Object that represents an existing fillet feature in a design. 
 */
@JSName("adsk.fusion.FilletFeature")
object FilletFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): FilletFeature = js.native
  /**
  * Returns the edge sets associated with this fillet.
  */
  val edgeSets: FilletEdgeSets = js.native
  /**
  * Gets and sets if the fillet uses the G2 (curvature-continuity) surface quality option .
  */
  var isG2: Boolean = js.native
  /**
  * Gets and sets if a rolling ball solution is to be used in any corners.
  */
  var isRollingBallCorner: Boolean = js.native
  /**
  * Gets and sets whether or not edges that are tangentially connected to the input edges (if any) will also be filleted.
  */
  var isTangentChain: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: FilletFeature = js.native
}

  object FilletFeatureUtilities {
    // no toSeq

  }
       
