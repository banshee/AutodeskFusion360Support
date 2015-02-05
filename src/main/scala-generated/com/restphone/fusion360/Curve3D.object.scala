
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for all 3D transient geometry classes. 
 */
@JSName("adsk.core.Curve3D")
class Curve3D extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the type of geometry this curve represents.
  */
  val curveType: Curve3DTypes = js.native
  /**
  * Returns an evaluator object that lets you perform additional evaluations on the curve.
  */
  val evaluator: CurveEvaluator3D = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Transforms this curve in 3D space.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * The base class for all 3D transient geometry classes. 
 */
@JSName("adsk.core.Curve3D")
object Curve3D extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the type of geometry this curve represents.
  */
  val curveType: Curve3DTypes = js.native
  /**
  * Returns an evaluator object that lets you perform additional evaluations on the curve.
  */
  val evaluator: CurveEvaluator3D = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Transforms this curve in 3D space.
  */
  def transformBy(matrix: Matrix3D): Boolean = js.native
}

  object Curve3DUtilities {
    // no toSeq

  }
       
