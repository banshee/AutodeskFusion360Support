
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing hole feature in a design. 
 */
@JSName("adsk.fusion.HoleFeature")
class HoleFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the model parameter controlling the counterbore depth. This will return null in the case the hole type is not a counterbore. The depth of the counterbore can be edited through the returned parameter.
  */
  val counterboreDepth: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the counterbore diameter. This will return null in the case the hole type is not a counterbore. The diameter of the counterbore can be edited through the returned parameter.
  */
  val counterboreDiameter: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the countersink angle. This will return null in the case the hole type is not a countersink. The angle of the countersink can be edited through the returned parameter.
  */
  val countersinkAngle: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the countersink diameter. This will return null in the case the hole type is not a countersink. The diameter of the countersink can be edited through the returned parameter.
  */
  val countersinkDiameter: ModelParameter = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): HoleFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Returns the direction of the hole.
  */
  val direction: Vector3D = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Property that returns the faces at the bottom of the hole. This will typically be a single face but could return more than one face in the case where the bottom of the hole is uneven.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the definition object that is defining the extent of the hole. Modifying the definition object will cause the hole to recompute. The extent type of a hole is currently limited to a distance extent.
  */
  val extentDefinition: ExtentDefinition = js.native

  /**
  * Returns the model parameter controlling the hole diameter. The diameter of the hole can be edited through the returned parameter object.
  */
  val holeDiameter: ModelParameter = js.native
  /**
  * Returns a HolePositionDefinition object that provides access to the information used to define the position of the hole. This returns null in the case where IsParametric is false.
  */
  val holePositionDefinition: HolePositionDefinition = js.native
  /**
  * Returns the current type of hole this feature represents.
  */
  val holeType: HoleTypes = js.native
  /**
  * Gets and sets if the hole is in the default direction or not.
  */
  var isDefaultDirection: Boolean = js.native





  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: HoleFeature = js.native


  /**
  * Returns the position of the hole.
  */
  val position: Point3D = js.native
  /**
  * Defines the extent of the hole to be through-all. The direction can be either positive, negative.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Defines the depth of the hole using a specific distance.
  */
  def setDistanceExtent(distance: ValueInput): Boolean = js.native
  /**
  * Sets the extent of the hole to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Redefines the position of the hole at the center of a circular or elliptical edge of the face.
  */
  def setPositionAtCenter(planarEntity: Base, centerEdge: BRepEdge): Boolean = js.native
  /**
  * Redefines the orientation of the hole using a planar face or construction plane. The position of the hole is defined by the distance from one or two edges.
  */
  def setPositionByPlaneAndOffsets(planarEntity: Base, point: Point3D, edgeOne: BRepEdge, offsetOne: ValueInput, edgeTwo: BRepEdge, offsetTwo: ValueInput): Boolean = js.native
  /**
  * Redefines the position of a the hole using a point. The point can be a vertex on the face or it can be a Point3D object to define any location on the face. If a Point3D object is provided it will be projected onto the plane along the planes normal. The orientation of the hole is defined by the planar face or construction plane. If a vertex is used, the position of the hole is associative to that vertex. If a Point3D object is used the position of the hole is not associative.
  */
  def setPositionByPoint(planarEntity: Base, point: Base): Boolean = js.native
  /**
  * Redefines the position and orienation of the hole using a sketch point.
  */
  def setPositionBySketchPoint(sketchPoint: SketchPoint): Boolean = js.native
  /**
  * Redefines the position and orientation of the hole to be on the start, end or center of an edge.
  */
  def setPositionOnEdge(planarEntity: Base, edge: BRepEdge, position: HoleEdgePositions): Boolean = js.native
  /**
  * Calling this method will change the hole to a counterbore hole.
  */
  def setToCounterbore(counterboreDiameter: ValueInput, counterboreDepth: ValueInput): Boolean = js.native
  /**
  * Calling this method will change the hole to a countersink hole.
  */
  def setToCountersink(countersinkDiameter: ValueInput, countersinkAngle: ValueInput): Boolean = js.native
  /**
  * Calling this method will change the hole to a simple hole.
  */
  def setToSimple(): Boolean = js.native
  /**
  * Property that returns all of the side faces of the hole.
  */
  val sideFaces: BRepFaces = js.native

  /**
  * Returns the model parameter controlling the angle of the tip of the hole. The tip angle of the hole can be edited through the returned parameter object.
  */
  val tipAngle: ModelParameter = js.native
}
/** 
  * Object that represents an existing hole feature in a design. 
 */
@JSName("adsk.fusion.HoleFeature")
object HoleFeature extends js.Object {
  /**
  * Returns the model parameter controlling the counterbore depth. This will return null in the case the hole type is not a counterbore. The depth of the counterbore can be edited through the returned parameter.
  */
  val counterboreDepth: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the counterbore diameter. This will return null in the case the hole type is not a counterbore. The diameter of the counterbore can be edited through the returned parameter.
  */
  val counterboreDiameter: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the countersink angle. This will return null in the case the hole type is not a countersink. The angle of the countersink can be edited through the returned parameter.
  */
  val countersinkAngle: ModelParameter = js.native
  /**
  * Returns the model parameter controlling the countersink diameter. This will return null in the case the hole type is not a countersink. The diameter of the countersink can be edited through the returned parameter.
  */
  val countersinkDiameter: ModelParameter = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): HoleFeature = js.native
  /**
  * Returns the direction of the hole.
  */
  val direction: Vector3D = js.native
  /**
  * Property that returns the faces at the bottom of the hole. This will typically be a single face but could return more than one face in the case where the bottom of the hole is uneven.
  */
  val endFaces: BRepFaces = js.native
  /**
  * Gets the definition object that is defining the extent of the hole. Modifying the definition object will cause the hole to recompute. The extent type of a hole is currently limited to a distance extent.
  */
  val extentDefinition: ExtentDefinition = js.native
  /**
  * Returns the model parameter controlling the hole diameter. The diameter of the hole can be edited through the returned parameter object.
  */
  val holeDiameter: ModelParameter = js.native
  /**
  * Returns a HolePositionDefinition object that provides access to the information used to define the position of the hole. This returns null in the case where IsParametric is false.
  */
  val holePositionDefinition: HolePositionDefinition = js.native
  /**
  * Returns the current type of hole this feature represents.
  */
  val holeType: HoleTypes = js.native
  /**
  * Gets and sets if the hole is in the default direction or not.
  */
  var isDefaultDirection: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: HoleFeature = js.native
  /**
  * Returns the position of the hole.
  */
  val position: Point3D = js.native
  /**
  * Defines the extent of the hole to be through-all. The direction can be either positive, negative.
  */
  def setAllExtent(direction: ExtentDirections): Boolean = js.native
  /**
  * Defines the depth of the hole using a specific distance.
  */
  def setDistanceExtent(distance: ValueInput): Boolean = js.native
  /**
  * Sets the extent of the hole to be from the sketch plane to the specified "to" face.
  */
  def setOneSideToExtent(toEntity: Base, matchShape: Boolean, directionHint: Vector3D): Boolean = js.native
  /**
  * Redefines the position of the hole at the center of a circular or elliptical edge of the face.
  */
  def setPositionAtCenter(planarEntity: Base, centerEdge: BRepEdge): Boolean = js.native
  /**
  * Redefines the orientation of the hole using a planar face or construction plane. The position of the hole is defined by the distance from one or two edges.
  */
  def setPositionByPlaneAndOffsets(planarEntity: Base, point: Point3D, edgeOne: BRepEdge, offsetOne: ValueInput, edgeTwo: BRepEdge, offsetTwo: ValueInput): Boolean = js.native
  /**
  * Redefines the position of a the hole using a point. The point can be a vertex on the face or it can be a Point3D object to define any location on the face. If a Point3D object is provided it will be projected onto the plane along the planes normal. The orientation of the hole is defined by the planar face or construction plane. If a vertex is used, the position of the hole is associative to that vertex. If a Point3D object is used the position of the hole is not associative.
  */
  def setPositionByPoint(planarEntity: Base, point: Base): Boolean = js.native
  /**
  * Redefines the position and orienation of the hole using a sketch point.
  */
  def setPositionBySketchPoint(sketchPoint: SketchPoint): Boolean = js.native
  /**
  * Redefines the position and orientation of the hole to be on the start, end or center of an edge.
  */
  def setPositionOnEdge(planarEntity: Base, edge: BRepEdge, position: HoleEdgePositions): Boolean = js.native
  /**
  * Calling this method will change the hole to a counterbore hole.
  */
  def setToCounterbore(counterboreDiameter: ValueInput, counterboreDepth: ValueInput): Boolean = js.native
  /**
  * Calling this method will change the hole to a countersink hole.
  */
  def setToCountersink(countersinkDiameter: ValueInput, countersinkAngle: ValueInput): Boolean = js.native
  /**
  * Calling this method will change the hole to a simple hole.
  */
  def setToSimple(): Boolean = js.native
  /**
  * Property that returns all of the side faces of the hole.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Returns the model parameter controlling the angle of the tip of the hole. The tip angle of the hole can be edited through the returned parameter object.
  */
  val tipAngle: ModelParameter = js.native
}

  object HoleFeatureUtilities {
    // no toSeq

  }
       
