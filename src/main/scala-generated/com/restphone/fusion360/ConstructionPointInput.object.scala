
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A ConstructionPointInput is a throwaway object used to create a ConstructionPoint The usage pattern is a. create a ConstructionPointInput (ConstructionPoints.CreateInput) b. call one of the member functions to specify how the ConstructionPoint is created c. create the ConstructionPoint (call ConstructionPoints.Add) d. stop referencing the ConstructionPointInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionPointInput")
class ConstructionPointInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an occurrence for creation needs to be specified when the ConstructionPoint is created based on geometry (e.g. a sketch point) in another component AND (the ConstructionPoint) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * This input method is for creating a construction point at the center of a spherical face (sphere or torus), circular edge or sketch arc/circle This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByCenter(circularEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of a construction plane, planar face or sketch profile and a linear edge, construction axis or sketch line. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByEdgePlane(edge: Base, plane: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point on the specified point or vertex. The point be either a B-Rep vertex, SketchPoint, or a Point object. Providing a Point object will always result in the creation of a non-parametric construction point. Even when providing a B-Rep vertex, SketchPoint, or Point object, this can result in a parametric or non-parametric construction point depending on if the parent component is a parametric or direct edit component.
  */
  def setByPoint(point: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of the three planes or planar faces. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByThreePlanes(planeOne: Base, planeTwo: Base, planeThree: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of the two linear edges or sketch lines. The edges can be B-Rep edges or sketch lines. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoEdges(edgeOne: Base, edgeTwo: Base): Boolean = js.native
}
/** 
  * A ConstructionPointInput is a throwaway object used to create a ConstructionPoint The usage pattern is a. create a ConstructionPointInput (ConstructionPoints.CreateInput) b. call one of the member functions to specify how the ConstructionPoint is created c. create the ConstructionPoint (call ConstructionPoints.Add) d. stop referencing the ConstructionPointInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionPointInput")
object ConstructionPointInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an occurrence for creation needs to be specified when the ConstructionPoint is created based on geometry (e.g. a sketch point) in another component AND (the ConstructionPoint) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * This input method is for creating a construction point at the center of a spherical face (sphere or torus), circular edge or sketch arc/circle This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByCenter(circularEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of a construction plane, planar face or sketch profile and a linear edge, construction axis or sketch line. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByEdgePlane(edge: Base, plane: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point on the specified point or vertex. The point be either a B-Rep vertex, SketchPoint, or a Point object. Providing a Point object will always result in the creation of a non-parametric construction point. Even when providing a B-Rep vertex, SketchPoint, or Point object, this can result in a parametric or non-parametric construction point depending on if the parent component is a parametric or direct edit component.
  */
  def setByPoint(point: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of the three planes or planar faces. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByThreePlanes(planeOne: Base, planeTwo: Base, planeThree: Base): Boolean = js.native
  /**
  * This input method is for creating a construction point at the intersection of the two linear edges or sketch lines. The edges can be B-Rep edges or sketch lines. This can result in a parametric or non-parametric construction point depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoEdges(edgeOne: Base, edgeTwo: Base): Boolean = js.native
}

  object ConstructionPointInputUtilities {
    // no toSeq

  }
       
