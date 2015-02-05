
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a hole feature. 
 */
@JSName("adsk.fusion.HoleFeatureInput")
class HoleFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Hole is created based on geometry (e.g. a face or point) in another component AND (the Hole) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI A value of null indicates that everything is in the context of a single component.
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets or sets if the hole goes in the default direction or is reversed.
  */
  var isDefaultDirection: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Defines the extent of the hole to be through-all. The direction can be either positive, negative.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Defines the depth of the hole using a specified distance.
  */
  def setDistanceExtent(distance: ValueInput): Boolean = js.native
  /**
  * Sets the extent of the hole to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Defines the position of the hole at the center of a circular or elliptical edge of the face.
  */
  def setPositionAtCenter(planarEntity: Base, centerEdge: BRepEdge): Boolean = js.native
  /**
  * Defines the orientation of the hole using a planar face or construction plane. The position of the hole is defined by the distance from one or two edges.
  */
  def setPositionByPlaneAndOffsets(planarEntity: Base, point: Point3D, edgeOne: BRepEdge, offsetOne: ValueInput, edgeTwo: BRepEdge, offsetTwo: ValueInput): Boolean = js.native
  /**
  * Defines the position of a the hole using a point. The point can be a vertex on the face or it can be a Point3D object to define any location on the face. If a Point3D object is provided it will be projected onto the plane along the planes normal. The orientation of the hole is defined by the planar face or construction plane. If a vertex is used, the position of the hole is associative to that vertex. If a Point3D object is used the position of the hole is not associative.
  */
  def setPositionByPoint(planarEntity: Base, point: Base): Boolean = js.native
  /**
  * Defines the position and orientation of the hole using a sketch point.
  */
  def setPositionBySketchPoint(sketchPoint: SketchPoint): Boolean = js.native
  /**
  * Defines the position and orientation of the hole to be on the start, end or center of an edge.
  */
  def setPositionOnEdge(planarEntity: Base, edge: BRepEdge, position: HoleEdgePositions): Boolean = js.native
  /**
  * Gets the ValueInput object that defines the angle of the tip of the hole. The default is "118.0 deg" but can be modified by setting it using another Value object.
  */
  var tipAngle: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a hole feature. 
 */
@JSName("adsk.fusion.HoleFeatureInput")
object HoleFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the Hole is created based on geometry (e.g. a face or point) in another component AND (the Hole) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI A value of null indicates that everything is in the context of a single component.
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets or sets if the hole goes in the default direction or is reversed.
  */
  var isDefaultDirection: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Defines the extent of the hole to be through-all. The direction can be either positive, negative.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Defines the depth of the hole using a specified distance.
  */
  def setDistanceExtent(distance: ValueInput): Boolean = js.native
  /**
  * Sets the extent of the hole to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Defines the position of the hole at the center of a circular or elliptical edge of the face.
  */
  def setPositionAtCenter(planarEntity: Base, centerEdge: BRepEdge): Boolean = js.native
  /**
  * Defines the orientation of the hole using a planar face or construction plane. The position of the hole is defined by the distance from one or two edges.
  */
  def setPositionByPlaneAndOffsets(planarEntity: Base, point: Point3D, edgeOne: BRepEdge, offsetOne: ValueInput, edgeTwo: BRepEdge, offsetTwo: ValueInput): Boolean = js.native
  /**
  * Defines the position of a the hole using a point. The point can be a vertex on the face or it can be a Point3D object to define any location on the face. If a Point3D object is provided it will be projected onto the plane along the planes normal. The orientation of the hole is defined by the planar face or construction plane. If a vertex is used, the position of the hole is associative to that vertex. If a Point3D object is used the position of the hole is not associative.
  */
  def setPositionByPoint(planarEntity: Base, point: Base): Boolean = js.native
  /**
  * Defines the position and orientation of the hole using a sketch point.
  */
  def setPositionBySketchPoint(sketchPoint: SketchPoint): Boolean = js.native
  /**
  * Defines the position and orientation of the hole to be on the start, end or center of an edge.
  */
  def setPositionOnEdge(planarEntity: Base, edge: BRepEdge, position: HoleEdgePositions): Boolean = js.native
  /**
  * Gets the ValueInput object that defines the angle of the tip of the hole. The default is "118.0 deg" but can be modified by setting it using another Value object.
  */
  var tipAngle: ValueInput = js.native
}

  object HoleFeatureInputUtilities {
    // no toSeq

  }
       
