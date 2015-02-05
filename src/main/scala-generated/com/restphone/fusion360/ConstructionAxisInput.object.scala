
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A ConstructionAxisInput is a throwaway object used to create a ConstructionAxis The usage pattern is: a. create a ConstructionAxisInput (ConstructionAxes.CreateInput) b. call one of the member functions to specify how the ConstructionAxis is created c. create the ConstructionAxis (call ConstructionAxes.Add) d. stop referencing the ConstructionAxisInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionAxisInput")
class ConstructionAxisInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the ConstructionAxis is created based on geometry (e.g. a straight edge) in another component AND (the ConstructionAxis) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * This input method is for creating an axis coincident with the axis of a cylindrical, conical or torus face. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByCircularFace(circularFace: BRepFace): Boolean = js.native
  /**
  * This input method is for creating a construction axis from a specified linear/circular edge or sketch curve. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByEdge(edgeEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a non-parametric construction axis whose position in space is defined by an InfiniteLine3D object.
  */
  def setByLine(line: InfiniteLine3D): Boolean = js.native
  /**
  * This input method if for creating a construction axis normal to a specified face or sketch profile and that passes through a specified point. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByNormalToFaceAtPoint(face: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating an axis that is normal to a face at a specified point.
  */
  def setByPerpendicularAtPoint(face: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction axis coincident with the intersection of two planes or planar faces. This will fail if the the two planes are parallel. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPlanes(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
  /**
  * This input method is for creating a construction axis that passes through the two points (work points, sketch points or vertices). This will fail if the the two points are coincident. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPoints(pointEntityOne: Base, pointEntityTwo: Base): Boolean = js.native
}
/** 
  * A ConstructionAxisInput is a throwaway object used to create a ConstructionAxis The usage pattern is: a. create a ConstructionAxisInput (ConstructionAxes.CreateInput) b. call one of the member functions to specify how the ConstructionAxis is created c. create the ConstructionAxis (call ConstructionAxes.Add) d. stop referencing the ConstructionAxisInput (so it gets deleted). 
 */
@JSName("adsk.fusion.ConstructionAxisInput")
object ConstructionAxisInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the ConstructionAxis is created based on geometry (e.g. a straight edge) in another component AND (the ConstructionAxis) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
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
  * This input method is for creating an axis coincident with the axis of a cylindrical, conical or torus face. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByCircularFace(circularFace: BRepFace): Boolean = js.native
  /**
  * This input method is for creating a construction axis from a specified linear/circular edge or sketch curve. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByEdge(edgeEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a non-parametric construction axis whose position in space is defined by an InfiniteLine3D object.
  */
  def setByLine(line: InfiniteLine3D): Boolean = js.native
  /**
  * This input method if for creating a construction axis normal to a specified face or sketch profile and that passes through a specified point. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByNormalToFaceAtPoint(face: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating an axis that is normal to a face at a specified point.
  */
  def setByPerpendicularAtPoint(face: BRepFace, pointEntity: Base): Boolean = js.native
  /**
  * This input method is for creating a construction axis coincident with the intersection of two planes or planar faces. This will fail if the the two planes are parallel. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPlanes(planarEntityOne: Base, planarEntityTwo: Base): Boolean = js.native
  /**
  * This input method is for creating a construction axis that passes through the two points (work points, sketch points or vertices). This will fail if the the two points are coincident. This can result in a parametric or non-parametric construction axis depending on whether the parent component is parametric or is a direct edit component.
  */
  def setByTwoPoints(pointEntityOne: Base, pointEntityTwo: Base): Boolean = js.native
}

  object ConstructionAxisInputUtilities {
    // no toSeq

  }
       
