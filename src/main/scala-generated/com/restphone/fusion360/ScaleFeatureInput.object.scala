
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a scale feature. 
 */
@JSName("adsk.fusion.ScaleFeatureInput")
trait ScaleFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. This collection can contain sketches, BRep bodies and T-Spline bodies in parametric modeling. It can contain sketches, BRep bodies, T-Spline bodies, mesh bodies, root component and occurrences in non-parametric modeling. If the scaling is non-uniform (the isUniform property is false), this collection cannot contain sketches or components.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets if the scale is uniform.
  */
  val isUniform: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the origin point of the scale. This can be a BRepVertex, a SketchPoint or a ConstructionPoint.
  */
  var point: Base = js.native
  /**
  * Gets and sets the scale factor used for a uniform scale. Setting this value will cause the isUniform property to be set to true.
  */
  var scaleFactor: ValueInput = js.native
  /**
  * Sets the scale factor for the x, y, z directions to define a non-uniform scale. Calling this method will cause the isUniform property to be set to false. This will fail if the inputEntities collection contains sketches or components.
  */
  def setToNonUniform(xScale: ValueInput, yScale: ValueInput, zScale: ValueInput): Boolean = js.native
  /**
  * Gets the scale in X direction.
  */
  val xScale: ValueInput = js.native
  /**
  * Gets the scale in Y direction.
  */
  val yScale: ValueInput = js.native
  /**
  * Gets the scale in Z direction.
  */
  val zScale: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a scale feature. 
 */
@JSName("adsk.fusion.ScaleFeatureInput")
object ScaleFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input entities. This collection can contain sketches, BRep bodies and T-Spline bodies in parametric modeling. It can contain sketches, BRep bodies, T-Spline bodies, mesh bodies, root component and occurrences in non-parametric modeling. If the scaling is non-uniform (the isUniform property is false), this collection cannot contain sketches or components.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets if the scale is uniform.
  */
  val isUniform: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the origin point of the scale. This can be a BRepVertex, a SketchPoint or a ConstructionPoint.
  */
  var point: Base = js.native
  /**
  * Gets and sets the scale factor used for a uniform scale. Setting this value will cause the isUniform property to be set to true.
  */
  var scaleFactor: ValueInput = js.native
  /**
  * Sets the scale factor for the x, y, z directions to define a non-uniform scale. Calling this method will cause the isUniform property to be set to false. This will fail if the inputEntities collection contains sketches or components.
  */
  def setToNonUniform(xScale: ValueInput, yScale: ValueInput, zScale: ValueInput): Boolean = js.native
  /**
  * Gets the scale in X direction.
  */
  val xScale: ValueInput = js.native
  /**
  * Gets the scale in Y direction.
  */
  val yScale: ValueInput = js.native
  /**
  * Gets the scale in Z direction.
  */
  val zScale: ValueInput = js.native
}
// no utilities
