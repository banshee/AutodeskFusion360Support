
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a sketch within a component. 
 */
@JSName("adsk.fusion.Sketch")
trait Sketch extends Base {
  /**
  * Indicates if the dimensions of the sketch are displayed when the sketch is not active (in sketch edit mode)
  */
  var areDimensionsShown: Boolean = js.native
  /**
  * Indicates if the profiles of the sketch are displayed
  */
  var areProfilesShown: Boolean = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the 3D bounding box of the sketch
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies sketch entities (geometry, constraints, dimensions, etc), applying the specified transform. Transform respects any constraints that would normally prohibit the move.
  */
  def copy(sketchEntities: ObjectCollection, transform: Matrix3D): ObjectCollection = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): Sketch = js.native
  /**
  * Deletes the sketch.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Finds the sketch curves that are end connected to the input curve.
   * This can be useful for many cases but is especially useful in
   * gathering the input when creating an offset.
  */
  def findConnectedCurves(curve: SketchCurve): ObjectCollection = js.native
  /**
  * Returns the sketch constraints collection associated with this sketch.
   * This provides access to the existing sketch constraints
   * and supports the creation of new sketch constraints.
  */
  val geometricConstraints: GeometricConstraints = js.native
  /**
  * Imports the contents of an SVG file into the active sketch ///
  */
  def importSVG(fullFilename: String, xPosition: double, yPosition: double, scale: double): Boolean = js.native
  /**
  * Creates new sketch curves and points that represent the specified entity as sketch geometry.
  */
  def include(entity: Base): ObjectCollection = js.native
  /**
  * Temporarily turns off the compute of the sketch. This is used to increase the performance as sketch geometry is created. Once the sketch is drawn the this property should be set to false to allow the sketch to recompute. This setting is not saved by the file and is always false when a file is opened.
  */
  var isComputeDeferred: Boolean = js.native
  /**
  * Indicates if this sketch is parametric or not. For parametric sketches, you can also get the construction plane or face it is associative to using the ReferencePlane property.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Indicates if this sketch is visible or not. Sketches that are not visible are ignored in profile calculations.
  */
  var isVisible: Boolean = js.native
  /**
  * A specified point in model space returns the equivalent point in sketch space. This is sensitive to the assembly context.
  */
  def modelToSketchSpace(modelCoordinate: Point3D): Point3D = js.native
  /**
  * Moves the specified sketch entities using the specified transform. Transform respects any constraints that would normally prohibit the move.
  */
  def move(sketchEntities: ObjectCollection, transform: Matrix3D): Boolean = js.native
  /**
  * Gets and sets the name of this sketch as seen in the browser and timeline.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: Sketch = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Creates offset curves for the set of input curves. If the offset distance is not provided, the offset distance is defined by the direction point.
  */
  def offset(curves: ObjectCollection, directionPoint: Point3D): ObjectCollection = js.native
  /**
  * Creates offset curves for the set of input curves. If the offset distance is not provided, the offset distance is defined by the direction point.
  */
  def offset(curves: ObjectCollection, directionPoint: Point3D, /* optional */ offset: double): ObjectCollection = js.native
  /**
  * Returns the origin point of the sketch in model space.
  */
  val origin: Point3D = js.native
  /**
  * Returns the parent Component.
  */
  val parentComponent: Component = js.native
  /**
  * Returns the profiles currently computed for the sketch.
  */
  val profiles: Profiles = js.native
  /**
  * Projects the specified entity onto the x-y plane of the sketch and returns the created sketch entity(s).
  */
  def project(entity: Base): ObjectCollection = js.native
  /**
  * Intersects the specified body with the sketch plane and creates new curves representing the intersection.
  */
  def projectCutEdges(body: BRepBody): ObjectCollection = js.native
  /**
  * Provides access to the construction plane or planar face the sketch is associated to. This is only valid when the IsParametric property is True otherwise this returns null and setting the property will fail.
  */
  var referencePlane: Base = js.native
  /**
  * Saves the contents of the sketch to a specified DXF file. ///
  */
  def saveAsDXF(fullFilename: String): Boolean = js.native
  /**
  * Returns the sketch curves collection associated with this sketch. This provides access to the existing sketch curves which is all geometry in the sketch except for sketch points. It is through this collection that new sketch geometry gets created.
  */
  val sketchCurves: SketchCurves = js.native
  /**
  * Returns the sketch dimensions collection associated with this sketch. This provides access to the existing sketch dimensions and supports the creation of new sketch dimensions.
  */
  val sketchDimensions: SketchDimensions = js.native
  /**
  * Returns the sketch points collection associated with this sketch. This provides access to the existing sketch points and supports the creation of new sketch points.
  */
  val sketchPoints: SketchPoints = js.native
  /**
  * Returns the sketch text collection associated with this sketch. This provides access to existing text and supports the creation of new text.
  */
  val sketchTexts: SketchTexts = js.native
  /**
  * A specified point in sketch space returns the equivalent point in model space. This is sensitive to the assembly context.
  */
  def sketchToModelSpace(sketchCoordinate: Point3D): Point3D = js.native
  /**
  * Returns the timeline object associated with this sketch.
  */
  val timelineObject: TimelineObject = js.native
  /**
  * Gets and sets the transform of the sketch with respect to model space. This defines the transform from the parent component space to the sketch space. For example, if you have point coordinates in the space of the parent component and apply this transform it will result in the coordinates of the equivalent position in sketch space. The transform is sensitive to the assembly context. Setting the transform will fail in the case where the sketch is parametric
  */
  var transform: Matrix3D = js.native
  /**
  * Returns the X direction of the sketch as defined in model space.
  */
  val xDirection: Vector3D = js.native
  /**
  * Returns the Y direction of the sketch as defined in model space.
  */
  val yDirection: Vector3D = js.native
}
/** 
  * Represents a sketch within a component. 
 */
@JSName("adsk.fusion.Sketch")
object Sketch extends js.Object {
  /**
  * Indicates if the dimensions of the sketch are displayed when the sketch is not active (in sketch edit mode)
  */
  var areDimensionsShown: Boolean = js.native
  /**
  * Indicates if the profiles of the sketch are displayed
  */
  var areProfilesShown: Boolean = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the 3D bounding box of the sketch
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Copies sketch entities (geometry, constraints, dimensions, etc), applying the specified transform. Transform respects any constraints that would normally prohibit the move.
  */
  def copy(sketchEntities: ObjectCollection, transform: Matrix3D): ObjectCollection = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): Sketch = js.native
  /**
  * Deletes the sketch.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Finds the sketch curves that are end connected to the input curve. This can be useful for many cases but is especially useful in gathering the input when creating an offset.
  */
  def findConnectedCurves(curve: SketchCurve): ObjectCollection = js.native
  /**
  * Returns the sketch constraints collection associated with this sketch. This provides access to the existing sketch constraints and supports the creation of new sketch constraints.
  */
  val geometricConstraints: GeometricConstraints = js.native
  /**
  * Imports the contents of an SVG file into the active sketch ///
  */
  def importSVG(fullFilename: String, xPosition: double, yPosition: double, scale: double): Boolean = js.native
  /**
  * Creates new sketch curves and points that represent the specified entity as sketch geometry.
  */
  def include(entity: Base): ObjectCollection = js.native
  /**
  * Temporarily turns off the compute of the sketch. This is used to increase the performance as sketch geometry is created. Once the sketch is drawn the this property should be set to false to allow the sketch to recompute. This setting is not saved by the file and is always false when a file is opened.
  */
  var isComputeDeferred: Boolean = js.native
  /**
  * Indicates if this sketch is parametric or not. For parametric sketches, you can also get the construction plane or face it is associative to using the ReferencePlane property.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Indicates if this sketch is visible or not. Sketches that are not visible are ignored in profile calculations.
  */
  var isVisible: Boolean = js.native
  /**
  * A specified point in model space returns the equivalent point in sketch space. This is sensitive to the assembly context.
  */
  def modelToSketchSpace(modelCoordinate: Point3D): Point3D = js.native
  /**
  * Moves the specified sketch entities using the specified transform. Transform respects any constraints that would normally prohibit the move.
  */
  def move(sketchEntities: ObjectCollection, transform: Matrix3D): Boolean = js.native
  /**
  * Gets and sets the name of this sketch as seen in the browser and timeline.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: Sketch = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Creates offset curves for the set of input curves. If the offset distance is not provided, the offset distance is defined by the direction point.
  */
  def offset(curves: ObjectCollection, directionPoint: Point3D): ObjectCollection = js.native
  /**
  * Creates offset curves for the set of input curves. If the offset distance is not provided, the offset distance is defined by the direction point.
  */
  def offset(curves: ObjectCollection, directionPoint: Point3D, /* optional */ offset: double): ObjectCollection = js.native
  /**
  * Returns the origin point of the sketch in model space.
  */
  val origin: Point3D = js.native
  /**
  * Returns the parent Component.
  */
  val parentComponent: Component = js.native
  /**
  * Returns the profiles currently computed for the sketch.
  */
  val profiles: Profiles = js.native
  /**
  * Projects the specified entity onto the x-y plane of the sketch and returns the created sketch entity(s).
  */
  def project(entity: Base): ObjectCollection = js.native
  /**
  * Intersects the specified body with the sketch plane and creates new curves representing the intersection.
  */
  def projectCutEdges(body: BRepBody): ObjectCollection = js.native
  /**
  * Provides access to the construction plane or planar face the sketch is associated to. This is only valid when the IsParametric property is True otherwise this returns null and setting the property will fail.
  */
  var referencePlane: Base = js.native
  /**
  * Saves the contents of the sketch to a specified DXF file. ///
  */
  def saveAsDXF(fullFilename: String): Boolean = js.native
  /**
  * Returns the sketch curves collection associated with this sketch. This provides access to the existing sketch curves which is all geometry in the sketch except for sketch points. It is through this collection that new sketch geometry gets created.
  */
  val sketchCurves: SketchCurves = js.native
  /**
  * Returns the sketch dimensions collection associated with this sketch. This provides access to the existing sketch dimensions and supports the creation of new sketch dimensions.
  */
  val sketchDimensions: SketchDimensions = js.native
  /**
  * Returns the sketch points collection associated with this sketch. This provides access to the existing sketch points and supports the creation of new sketch points.
  */
  val sketchPoints: SketchPoints = js.native
  /**
  * Returns the sketch text collection associated with this sketch. This provides access to existing text and supports the creation of new text.
  */
  val sketchTexts: SketchTexts = js.native
  /**
  * A specified point in sketch space returns the equivalent point in model space. This is sensitive to the assembly context.
  */
  def sketchToModelSpace(sketchCoordinate: Point3D): Point3D = js.native
  /**
  * Returns the timeline object associated with this sketch.
  */
  val timelineObject: TimelineObject = js.native
  /**
  * Gets and sets the transform of the sketch with respect to model space. This defines the transform from the parent component space to the sketch space. For example, if you have point coordinates in the space of the parent component and apply this transform it will result in the coordinates of the equivalent position in sketch space. The transform is sensitive to the assembly context. Setting the transform will fail in the case where the sketch is parametric
  */
  var transform: Matrix3D = js.native
  /**
  * Returns the X direction of the sketch as defined in model space.
  */
  val xDirection: Vector3D = js.native
  /**
  * Returns the Y direction of the sketch as defined in model space.
  */
  val yDirection: Vector3D = js.native
}
// no utilities
