
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A ConstructionPlaneInput is a throwaway object used to create a ConstructionPlane The usage pattern is: a. create a ConstructionPlaneInput (ConstructionPlanes.CreateInput) b. call one of the member functions to specify how the ConstructionPlane is created c. create the ConstructionPlane (call ConstructionPlanes.Add) d. stop referencing the ConstructionPlaneInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionPlaneInput")
trait ConstructionPlaneInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the ConstructionPlane is created based on geometry (e.g. a planarEntity) in another component AND (the ConstructionPlane) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * This input method is for creating a construction plane through an edge, axis or line at a specified angle. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByAngle(linearEntity: Base, angle: ValueInput, planarEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane normal to, and at specified distance along, a path defined by an edge or sketch profile. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByDistanceOnPath(pathEntity: Base, distance: ValueInput): Boolean = js.native
  /**
  * This input method is for creating a construction plane that is offset from a planar face or construction plane at a specified distance. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByOffset(planarEntity: Base, offset: ValueInput): Boolean = js.native
  /**
  * This input method is for creating a non-parametric construction plane positioned in space as defined by the input Plane object.
  */
  def setByPlane(plane: Plane): Boolean = js.native
  /**
  * This input method is for creating a construction plane tangent to a cylindrical or conical face at a specified point. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTangent(tangentFace: BRepFace, angle: ValueInput, planarEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane tangent to a face and aligned to a point. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTangentAtPoint(tangentFace: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane through three points that define a triangle. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByThreePoints(pointEntityOne: Base, pointEntityTwo: Base, pointEntityThree: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane that passes through two coplanar linear entities or axes. Defines a plane by specifying two coplanar linear entities. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoEdges(linearEntityOne: Base, linearEntityTwo: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane at the midpoint between two planar faces or construction planes. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPlanes(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}
/** 
  * A ConstructionPlaneInput is a throwaway object used to create a ConstructionPlane The usage pattern is: a. create a ConstructionPlaneInput (ConstructionPlanes.CreateInput) b. call one of the member functions to specify how the ConstructionPlane is created c. create the ConstructionPlane (call ConstructionPlanes.Add) d. stop referencing the ConstructionPlaneInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionPlaneInput")
object ConstructionPlaneInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the ConstructionPlane is created based on geometry (e.g. a planarEntity) in another component AND (the ConstructionPlane) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * This input method is for creating a construction plane through an edge, axis or line at a specified angle. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByAngle(linearEntity: Base, angle: ValueInput, planarEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane normal to, and at specified distance along, a path defined by an edge or sketch profile. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByDistanceOnPath(pathEntity: Base, distance: ValueInput): Boolean = js.native
  /**
  * This input method is for creating a construction plane that is offset from a planar face or construction plane at a specified distance. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByOffset(planarEntity: Base, offset: ValueInput): Boolean = js.native
  /**
  * This input method is for creating a non-parametric construction plane positioned in space as defined by the input Plane object.
  */
  def setByPlane(plane: Plane): Boolean = js.native
  /**
  * This input method is for creating a construction plane tangent to a cylindrical or conical face at a specified point. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTangent(tangentFace: BRepFace, angle: ValueInput, planarEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane tangent to a face and aligned to a point. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTangentAtPoint(tangentFace: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane through three points that define a triangle. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByThreePoints(pointEntityOne: Base, pointEntityTwo: Base, pointEntityThree: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane that passes through two coplanar linear entities or axes. Defines a plane by specifying two coplanar linear entities. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoEdges(linearEntityOne: Base, linearEntityTwo: Base): Boolean = js.native
  /**
  * This input method is for creating a construction plane at the midpoint between two planar faces or construction planes. This can result in a parametric or non-parametric construction plane depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPlanes(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
}
// no utilities
