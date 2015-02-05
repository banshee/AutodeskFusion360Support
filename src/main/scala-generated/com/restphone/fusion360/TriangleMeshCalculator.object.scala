
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Used to calculate new meshes for a B-Rep or T-Spline using defined criteria. 
 */
@JSName("adsk.fusion.TriangleMeshCalculator")
class TriangleMeshCalculator extends Base {
  /**
  * Calculates a new triangle mesh based on the current settings.
  */
  def calculate(): TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Specifies the maximum length to height ratio that a triangle can have. This helps to avoid long skinny triangles. A value of 0 (the default) indicates that no maximum aspect ratio is specified.
  */
  var maxAspectRatio: double = js.native
  /**
  * Specifies the maximum deviation between adjacent vertex normals. This value is the maximum angle allowed between normals and is specified in radians. A value of 0 (the default) indicates that no normal deviation is specified.
  */
  var maxNormalDeviation: double = js.native
  /**
  * Specifies the maximum side of any triangle in the mesh. A value of 0 (the default) indicates that no maximum length is specified. The value is specified in centimeters.
  */
  var maxSideLength: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent MeshManager object.
  */
  val parentMeshManager: MeshManager = js.native
  /**
  * This is a simplified way to set the various settings that control the resulting mesh. When used it automatically adjusts all of the property values appropriately. It does this for the given geometry by computing its bounding box diameter. Then the surface tolerance is calculated as shown below where the meshLOD is the "Level of Detail" and is described in more detail below. The diameter is the bounding box diameter. double nodeApproximateSize = std::pow(2.0, meshLOD); double fracTol = 1.0 / nodeApproximateSize; surfaceTolerance = fracTol * diameter;
  */
  def setQuality(triangleMeshQuality: TriangleMeshQualityOptions): Boolean = js.native
  /**
  * Specifies the maximum distance that the mesh can deviate from the smooth surface. The value is in centimeters. Smaller values can result in a much greater number of facets being returned and will require more processing time to calculate.
  */
  var surfaceTolerance: double = js.native
}
/** 
  * Used to calculate new meshes for a B-Rep or T-Spline using defined criteria. 
 */
@JSName("adsk.fusion.TriangleMeshCalculator")
object TriangleMeshCalculator extends js.Object {
  /**
  * Calculates a new triangle mesh based on the current settings.
  */
  def calculate(): TriangleMesh = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Specifies the maximum length to height ratio that a triangle can have. This helps to avoid long skinny triangles. A value of 0 (the default) indicates that no maximum aspect ratio is specified.
  */
  var maxAspectRatio: double = js.native
  /**
  * Specifies the maximum deviation between adjacent vertex normals. This value is the maximum angle allowed between normals and is specified in radians. A value of 0 (the default) indicates that no normal deviation is specified.
  */
  var maxNormalDeviation: double = js.native
  /**
  * Specifies the maximum side of any triangle in the mesh. A value of 0 (the default) indicates that no maximum length is specified. The value is specified in centimeters.
  */
  var maxSideLength: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent MeshManager object.
  */
  val parentMeshManager: MeshManager = js.native
  /**
  * This is a simplified way to set the various settings that control the resulting mesh. When used it automatically adjusts all of the property values appropriately. It does this for the given geometry by computing its bounding box diameter. Then the surface tolerance is calculated as shown below where the meshLOD is the "Level of Detail" and is described in more detail below. The diameter is the bounding box diameter. double nodeApproximateSize = std::pow(2.0, meshLOD); double fracTol = 1.0 / nodeApproximateSize; surfaceTolerance = fracTol * diameter;
  */
  def setQuality(triangleMeshQuality: TriangleMeshQualityOptions): Boolean = js.native
  /**
  * Specifies the maximum distance that the mesh can deviate from the smooth surface. The value is in centimeters. Smaller values can result in a much greater number of facets being returned and will require more processing time to calculate.
  */
  var surfaceTolerance: double = js.native
}

  object TriangleMeshCalculatorUtilities {
    // no toSeq

  }
       
