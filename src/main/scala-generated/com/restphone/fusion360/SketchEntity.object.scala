
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This object represents all geometry in a sketch, including points and lines and the various curves. 
 */
@JSName("adsk.fusion.SketchEntity")
class SketchEntity extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the bounding box of the entity in sketch space.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the entity from the sketch.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the sketch constraints that are attached to this curve.
  */
  val geometricConstraints: GeometricConstraintList = js.native
  /**
  * Indicates if this curve lies entirely on the sketch x-y plane.
  */
  val is2D: Boolean = js.native
  /**
  * Indicates if this geometry is "fixed".
  */
  var isFixed: Boolean = js.native
  /**
  * Indicates if this geometry is a reference. Changing this property from true to false removes the reference. This property can not be set to true if it is already false.
  */
  var isReference: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * When a sketch is created geometry is sometimes automatically included in the sketch. For example the origin point is always included and depending on what was selected to create the sketch one, geometry from the selected face will be included. This geometry behaves in a special way in that it is invisible but is available for selection and it also participates in profile calculations. It's not possible to make them visible but they can be deleted and they can be used for any other standard sketch operation.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch.
  */
  val parentSketch: Sketch = js.native
  /**
  * Returns the referenced entity in the case where IsReference is true. However, this property can also return null when IsReference is true in the case where the reference is not parametric.
  */
  val referencedEntity: Base = js.native
  /**
  * Returns the sketch dimensions that are attached to this curve.
  */
  val sketchDimensions: SketchDimensionList = js.native
}
/** 
  * This object represents all geometry in a sketch, including points and lines and the various curves. 
 */
@JSName("adsk.fusion.SketchEntity")
object SketchEntity extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the bounding box of the entity in sketch space.
  */
  val boundingBox: BoundingBox3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the entity from the sketch.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns the sketch constraints that are attached to this curve.
  */
  val geometricConstraints: GeometricConstraintList = js.native
  /**
  * Indicates if this curve lies entirely on the sketch x-y plane.
  */
  val is2D: Boolean = js.native
  /**
  * Indicates if this geometry is "fixed".
  */
  var isFixed: Boolean = js.native
  /**
  * Indicates if this geometry is a reference. Changing this property from true to false removes the reference. This property can not be set to true if it is already false.
  */
  var isReference: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * When a sketch is created geometry is sometimes automatically included in the sketch. For example the origin point is always included and depending on what was selected to create the sketch one, geometry from the selected face will be included. This geometry behaves in a special way in that it is invisible but is available for selection and it also participates in profile calculations. It's not possible to make them visible but they can be deleted and they can be used for any other standard sketch operation.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent sketch.
  */
  val parentSketch: Sketch = js.native
  /**
  * Returns the referenced entity in the case where IsReference is true. However, this property can also return null when IsReference is true in the case where the reference is not parametric.
  */
  val referencedEntity: Base = js.native
  /**
  * Returns the sketch dimensions that are attached to this curve.
  */
  val sketchDimensions: SketchDimensionList = js.native
}

  object SketchEntityUtilities {
    // no toSeq

  }
       
