
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * 2D curve evaluator that is obtained from a transient curve and allows you to perform various evaluations on the curve. 
 */
@JSName("adsk.core.CurveEvaluator2D")
trait CurveEvaluator2D extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature value at a parameter position on the curve.
  */
  def getCurvature(parameter: double, /* out */ direction: Vector2D, /* out */ curvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the curve.
  */
  def getCurvatures(parameters: Array[Double], /* out */ directions: Array[Vector2D], /* out */ curvatures: Array[Double]): Boolean = js.native
  /**
  * Get the end points of the curve.
  */
  def getEndPoints(/* out */ startPoint: Point2D, /* out */ endPoint: Point2D): Boolean = js.native
  /**
  * Get the first derivative of the curve at the specified parameter position.
  */
  def getFirstDerivative(parameter: double, /* out */ firstDerivative: Vector2D): Boolean = js.native
  /**
  * Get the first derivatives of the curve at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Double], /* out */ firstDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Get the length of the curve between two parameter positions on the curve.
  */
  def getLengthAtParameter(fromParameter: double, toParameter: double, /* out */ length: double): Boolean = js.native
  /**
  * Get the parameter position on the curve that is the specified curve length from the specified starting parameter position.
  */
  def getParameterAtLength(fromParameter: double, length: double, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parameter position that correspond to a point on the curve. For reliable results, the point should lie on the curve within model tolerance. If the point does not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParameterAtPoint(point: Point2D, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parametric range of the curve.
  */
  def getParameterExtents(/* out */ startParameter: double, /* out */ endParameter: double): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the curve. For reliable results, the points should lie on the curve within model tolerance. If the points do not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point2D], /* out */ parameters: Array[Double]): Boolean = js.native
  /**
  * Get the point on the curve that corresponds to evaluating a parameter position on the curve.
  */
  def getPointAtParameter(parameter: double, /* out */ point: Point2D): Boolean = js.native
  /**
  * Get the points on the curve that correspond to evaluating a set of parameter positions on the curve.
  */
  def getPointsAtParameters(parameters: Array[Double], /* out */ points: Array[Point2D]): Boolean = js.native
  /**
  * Get the second derivative of the curve at the specified parameter position.
  */
  def getSecondDerivative(parameter: double, /* out */ secondDerivative: Vector2D): Boolean = js.native
  /**
  * Get the second derivatives of the curve at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Double], /* out */ secondDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Get a sequence of points between two curve parameter positions. The points will be a linear interpolation along the curve between these two parameter positions where the maximum deviation between the curve and each line segment will not exceed the specified tolerance value.
  */
  def getStrokes(fromParameter: double, toParameter: double, tolerance: double, /* out */ vertexCoordinates: Array[Point2D]): Boolean = js.native
  /**
  * Get the tangent to the curve at a parameter position on the curve.
  */
  def getTangent(parameter: double, /* out */ tangent: Vector2D): Boolean = js.native
  /**
  * Get the tanget to the curve at a number of parameter positions on the curve.
  */
  def getTangents(parameters: Array[Double], /* out */ tangents: Array[Vector2D]): Boolean = js.native
  /**
  * Get the third derivative of the curve at the specified parameter position.
  */
  def getThirdDerivative(parameter: double, /* out */ thirdDerivative: Vector2D): Boolean = js.native
  /**
  * Get the third derivatives of the curve at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Double], /* out */ thirdDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * 2D curve evaluator that is obtained from a transient curve and allows you to perform various evaluations on the curve. 
 */
@JSName("adsk.core.CurveEvaluator2D")
object CurveEvaluator2D extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature value at a parameter position on the curve.
  */
  def getCurvature(parameter: double, /* out */ direction: Vector2D, /* out */ curvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the curve.
  */
  def getCurvatures(parameters: Array[Double], /* out */ directions: Array[Vector2D], /* out */ curvatures: Array[Double]): Boolean = js.native
  /**
  * Get the end points of the curve.
  */
  def getEndPoints(/* out */ startPoint: Point2D, /* out */ endPoint: Point2D): Boolean = js.native
  /**
  * Get the first derivative of the curve at the specified parameter position.
  */
  def getFirstDerivative(parameter: double, /* out */ firstDerivative: Vector2D): Boolean = js.native
  /**
  * Get the first derivatives of the curve at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Double], /* out */ firstDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Get the length of the curve between two parameter positions on the curve.
  */
  def getLengthAtParameter(fromParameter: double, toParameter: double, /* out */ length: double): Boolean = js.native
  /**
  * Get the parameter position on the curve that is the specified curve length from the specified starting parameter position.
  */
  def getParameterAtLength(fromParameter: double, length: double, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parameter position that correspond to a point on the curve. For reliable results, the point should lie on the curve within model tolerance. If the point does not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParameterAtPoint(point: Point2D, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parametric range of the curve.
  */
  def getParameterExtents(/* out */ startParameter: double, /* out */ endParameter: double): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the curve. For reliable results, the points should lie on the curve within model tolerance. If the points do not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point2D], /* out */ parameters: Array[Double]): Boolean = js.native
  /**
  * Get the point on the curve that corresponds to evaluating a parameter position on the curve.
  */
  def getPointAtParameter(parameter: double, /* out */ point: Point2D): Boolean = js.native
  /**
  * Get the points on the curve that correspond to evaluating a set of parameter positions on the curve.
  */
  def getPointsAtParameters(parameters: Array[Double], /* out */ points: Array[Point2D]): Boolean = js.native
  /**
  * Get the second derivative of the curve at the specified parameter position.
  */
  def getSecondDerivative(parameter: double, /* out */ secondDerivative: Vector2D): Boolean = js.native
  /**
  * Get the second derivatives of the curve at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Double], /* out */ secondDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Get a sequence of points between two curve parameter positions. The points will be a linear interpolation along the curve between these two parameter positions where the maximum deviation between the curve and each line segment will not exceed the specified tolerance value.
  */
  def getStrokes(fromParameter: double, toParameter: double, tolerance: double, /* out */ vertexCoordinates: Array[Point2D]): Boolean = js.native
  /**
  * Get the tangent to the curve at a parameter position on the curve.
  */
  def getTangent(parameter: double, /* out */ tangent: Vector2D): Boolean = js.native
  /**
  * Get the tanget to the curve at a number of parameter positions on the curve.
  */
  def getTangents(parameters: Array[Double], /* out */ tangents: Array[Vector2D]): Boolean = js.native
  /**
  * Get the third derivative of the curve at the specified parameter position.
  */
  def getThirdDerivative(parameter: double, /* out */ thirdDerivative: Vector2D): Boolean = js.native
  /**
  * Get the third derivatives of the curve at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Double], /* out */ thirdDerivatives: Array[Vector2D]): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
