
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing scale feature in a design. 
 */
@JSName("adsk.fusion.ScaleFeature")
class ScaleFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ScaleFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native

  /**
  * Gets and sets the input entities. This collection can contain sketches, BRep bodies and T-Spline bodies in parametric modeling. It can contain sketches, BRep bodies, T-Spline bodies, mesh bodies, root component and occurrences in non-parametric modeling. If the scaling is non-uniform (the isUniform property is false), this collection cannot contain sketches or components.
  */
  var inputEntities: ObjectCollection = js.native


  /**
  * Gets if it's uniform scale.
  */
  val isUniform: Boolean = js.native



  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ScaleFeature = js.native


  /**
  * Gets and sets the point as reference to scale. This can be a BRepVertex, a SketchPoint or a ConstructionPoint.
  */
  var point: Base = js.native
  /**
  * Returns the parameter that controls the uniform scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val scaleFactor: ModelParameter = js.native
  /**
  * Calling this method will change to a non-uniform scale. Fails of the inputEntities collection contains sketches or components. The isUniform is set to false if successful.
  */
  def setToNonUniform(xScale: ValueInput, yScale: ValueInput, zScale: ValueInput): Boolean = js.native
  /**
  * Calling this method will change to a uniform scale. The isUniform is set to true if successful.
  */
  def setToUniform(scaleFactor: ValueInput): Boolean = js.native

  /**
  * Returns the parameter that controls the X scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val xScale: ModelParameter = js.native
  /**
  * Returns the parameter that controls the Y scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val yScale: ModelParameter = js.native
  /**
  * Returns the parameter that controls the Z scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val zScale: ModelParameter = js.native
}
/** 
  * Object that represents an existing scale feature in a design. 
 */
@JSName("adsk.fusion.ScaleFeature")
object ScaleFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ScaleFeature = js.native
  /**
  * Gets and sets the input entities. This collection can contain sketches, BRep bodies and T-Spline bodies in parametric modeling. It can contain sketches, BRep bodies, T-Spline bodies, mesh bodies, root component and occurrences in non-parametric modeling. If the scaling is non-uniform (the isUniform property is false), this collection cannot contain sketches or components.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets if it's uniform scale.
  */
  val isUniform: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ScaleFeature = js.native
  /**
  * Gets and sets the point as reference to scale. This can be a BRepVertex, a SketchPoint or a ConstructionPoint.
  */
  var point: Base = js.native
  /**
  * Returns the parameter that controls the uniform scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val scaleFactor: ModelParameter = js.native
  /**
  * Calling this method will change to a non-uniform scale. Fails of the inputEntities collection contains sketches or components. The isUniform is set to false if successful.
  */
  def setToNonUniform(xScale: ValueInput, yScale: ValueInput, zScale: ValueInput): Boolean = js.native
  /**
  * Calling this method will change to a uniform scale. The isUniform is set to true if successful.
  */
  def setToUniform(scaleFactor: ValueInput): Boolean = js.native
  /**
  * Returns the parameter that controls the X scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val xScale: ModelParameter = js.native
  /**
  * Returns the parameter that controls the Y scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val yScale: ModelParameter = js.native
  /**
  * Returns the parameter that controls the Z scale factor. This will return null in the case where isUniform is false or the feature is non-parametric. You can use the properties and methods on the ModelParameter object to get and set the value.
  */
  val zScale: ModelParameter = js.native
}

  object ScaleFeatureUtilities {
    // no toSeq

  }
       
