
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Describes a two-dimensional topological, manifold in three-dimensional space. It is used as the underlying geometry for a BRepFace. 
 */
@JSName("adsk.core.Surface")
class Surface extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the surface evaluator.
  */
  val evaluator: SurfaceEvaluator = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the surface type.
  */
  val surfaceType: SurfaceTypes = js.native
  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Describes a two-dimensional topological, manifold in three-dimensional space. It is used as the underlying geometry for a BRepFace. 
 */
@JSName("adsk.core.Surface")
object Surface extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the surface evaluator.
  */
  val evaluator: SurfaceEvaluator = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the surface type.
  */
  val surfaceType: SurfaceTypes = js.native
  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
}

  object SurfaceUtilities {
    // no toSeq

  }
       
