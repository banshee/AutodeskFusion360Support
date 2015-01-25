
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing chamfer feature in a design. 
 */
@JSName("adsk.fusion.ChamferFeature")
trait ChamferFeature extends Feature {

  /**
  * Gets an enum indicating how the chamfer was defined. The valid return values are EqualDistanceType, TwoDistancesType and DistanceAndAngleType. This property returns nothing in the case where the feature is non-parametric.
  */
  val chamferType: ChamferTypes = js.native
  /**
  * Gets the definition object that is defining the type of chamfer. Modifying the definition object will cause the chamfer to recompute. Various types of definition objects can be returned depending on how the chamfer is defined. The ChamferType property can be used to determine which type of definition will be returned. This property returns nothing in the case where the feature is non-parametric.
  */
  val chamferTypeDefinition: ChamferTypeDefinition = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ChamferFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Gets and sets the edges being chamfered. In order to access the input edges of a chamfer you must roll back to the timeline to just before the feature was created. When setting the edges, if the IsTangentChain property is true then all edges that are tangent to the input edges will be include in the chamfer. This property returns nothing in the case where the feature is non-parametric.
  */
  var edges: ObjectCollection = js.native



  /**
  * Gets and sets whether or not edges that are tangentially connected to the input edges (if any) will also be chamfered.
  */
  var isTangentChain: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ChamferFeature = js.native


  /**
  * Changes the type of chamfer to be a distance and angle chamfer.
  */
  def setDistanceAndAngle(distance: ValueInput, angle: ValueInput): Boolean = js.native
  /**
  * Changes the type of chamfer to be an equal distance chamfer.
  */
  def setEqualDistance(distance: ValueInput): Boolean = js.native
  /**
  * Changes the type of chamfer to be a two distances chamfer.
  */
  def setTwoDistances(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native

}
/** 
  * Object that represents an existing chamfer feature in a design. 
 */
@JSName("adsk.fusion.ChamferFeature")
object ChamferFeature extends js.Object {
  /**
  * Gets an enum indicating how the chamfer was defined. The valid return values are EqualDistanceType, TwoDistancesType and DistanceAndAngleType. This property returns nothing in the case where the feature is non-parametric.
  */
  val chamferType: ChamferTypes = js.native
  /**
  * Gets the definition object that is defining the type of chamfer. Modifying the definition object will cause the chamfer to recompute. Various types of definition objects can be returned depending on how the chamfer is defined. The ChamferType property can be used to determine which type of definition will be returned. This property returns nothing in the case where the feature is non-parametric.
  */
  val chamferTypeDefinition: ChamferTypeDefinition = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ChamferFeature = js.native
  /**
  * Gets and sets the edges being chamfered. In order to access the input edges of a chamfer you must roll back to the timeline to just before the feature was created. When setting the edges, if the IsTangentChain property is true then all edges that are tangent to the input edges will be include in the chamfer. This property returns nothing in the case where the feature is non-parametric.
  */
  var edges: ObjectCollection = js.native
  /**
  * Gets and sets whether or not edges that are tangentially connected to the input edges (if any) will also be chamfered.
  */
  var isTangentChain: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ChamferFeature = js.native
  /**
  * Changes the type of chamfer to be a distance and angle chamfer.
  */
  def setDistanceAndAngle(distance: ValueInput, angle: ValueInput): Boolean = js.native
  /**
  * Changes the type of chamfer to be an equal distance chamfer.
  */
  def setEqualDistance(distance: ValueInput): Boolean = js.native
  /**
  * Changes the type of chamfer to be a two distances chamfer.
  */
  def setTwoDistances(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native
}
// no utilities
