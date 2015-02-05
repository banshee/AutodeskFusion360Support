
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * 3D curve evaluator that is obtained from a transient curve and allows you to perform various evaluations on the curve. 
 */
@JSName("adsk.core.CurveEvaluator3D")
class CurveEvaluator3D extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature value at a parameter position on the curve.
  */
  def getCurvature(parameter: double, /* out */ direction: Vector3D, /* out */ curvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the curve.
  */
  def getCurvatures(parameters: Array[Double], /* out */ directions: Array[Vector3D], /* out */ curvatures: Array[Double]): Boolean = js.native
  /**
  * Get the end points of the curve.
  */
  def getEndPoints(/* out */ startPoint: Point3D, /* out */ endPoint: Point3D): Boolean = js.native
  /**
  * Get the first derivative of the curve at the specified parameter position.
  */
  def getFirstDerivative(parameter: double, /* out */ firstDerivative: Vector3D): Boolean = js.native
  /**
  * Get the first derivatives of the curve at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Double], /* out */ firstDerivatives: Array[Vector3D]): Boolean = js.native
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
  def getParameterAtPoint(point: Point3D, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parametric range of the curve.
  */
  def getParameterExtents(/* out */ startParameter: double, /* out */ endParameter: double): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the curve. For reliable results, the points should lie on the curve within model tolerance. If the points do not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point3D], /* out */ parameters: Array[Double]): Boolean = js.native
  /**
  * Get the point on the curve that corresponds to evaluating a parameter position on the curve.
  */
  def getPointAtParameter(parameter: double, /* out */ point: Point3D): Boolean = js.native
  /**
  * Get the points on the curve that correspond to evaluating a set of parameter positions on the curve.
  */
  def getPointsAtParameters(parameters: Array[Double], /* out */ points: Array[Point3D]): Boolean = js.native
  /**
  * Get the second derivative of the curve at the specified parameter position.
  */
  def getSecondDerivative(parameter: double, /* out */ secondDerivative: Vector3D): Boolean = js.native
  /**
  * Get the second derivatives of the curve at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Double], /* out */ secondDerivatives: Array[Vector3D]): Boolean = js.native
  /**
  * Get a sequence of points between two curve parameter positions. The points will be a linear interpolation along the curve between these two parameter positions where the maximum deviation between the curve and each line segment will not exceed the specified tolerance value.
  */
  def getStrokes(fromParameter: double, toParameter: double, tolerance: double, /* out */ vertexCoordinates: Array[Point3D]): Boolean = js.native
  /**
  * Get the tangent to the curve at a parameter position on the curve.
  */
  def getTangent(parameter: double, /* out */ tangent: Vector3D): Boolean = js.native
  /**
  * Get the tanget to the curve at a number of parameter positions on the curve.
  */
  def getTangents(parameters: Array[Double], /* out */ tangents: Array[Vector3D]): Boolean = js.native
  /**
  * Get the third derivative of the curve at the specified parameter position.
  */
  def getThirdDerivative(parameter: double, /* out */ thirdDerivative: Vector3D): Boolean = js.native
  /**
  * Get the third derivatives of the curve at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Double], /* out */ thirdDerivatives: Array[Vector3D]): Boolean = js.native
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
  * 3D curve evaluator that is obtained from a transient curve and allows you to perform various evaluations on the curve. 
 */
@JSName("adsk.core.CurveEvaluator3D")
object CurveEvaluator3D extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature value at a parameter position on the curve.
  */
  def getCurvature(parameter: double, /* out */ direction: Vector3D, /* out */ curvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the curve.
  */
  def getCurvatures(parameters: Array[Double], /* out */ directions: Array[Vector3D], /* out */ curvatures: Array[Double]): Boolean = js.native
  /**
  * Get the end points of the curve.
  */
  def getEndPoints(/* out */ startPoint: Point3D, /* out */ endPoint: Point3D): Boolean = js.native
  /**
  * Get the first derivative of the curve at the specified parameter position.
  */
  def getFirstDerivative(parameter: double, /* out */ firstDerivative: Vector3D): Boolean = js.native
  /**
  * Get the first derivatives of the curve at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Double], /* out */ firstDerivatives: Array[Vector3D]): Boolean = js.native
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
  def getParameterAtPoint(point: Point3D, /* out */ parameter: double): Boolean = js.native
  /**
  * Get the parametric range of the curve.
  */
  def getParameterExtents(/* out */ startParameter: double, /* out */ endParameter: double): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the curve. For reliable results, the points should lie on the curve within model tolerance. If the points do not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point3D], /* out */ parameters: Array[Double]): Boolean = js.native
  /**
  * Get the point on the curve that corresponds to evaluating a parameter position on the curve.
  */
  def getPointAtParameter(parameter: double, /* out */ point: Point3D): Boolean = js.native
  /**
  * Get the points on the curve that correspond to evaluating a set of parameter positions on the curve.
  */
  def getPointsAtParameters(parameters: Array[Double], /* out */ points: Array[Point3D]): Boolean = js.native
  /**
  * Get the second derivative of the curve at the specified parameter position.
  */
  def getSecondDerivative(parameter: double, /* out */ secondDerivative: Vector3D): Boolean = js.native
  /**
  * Get the second derivatives of the curve at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Double], /* out */ secondDerivatives: Array[Vector3D]): Boolean = js.native
  /**
  * Get a sequence of points between two curve parameter positions. The points will be a linear interpolation along the curve between these two parameter positions where the maximum deviation between the curve and each line segment will not exceed the specified tolerance value.
  */
  def getStrokes(fromParameter: double, toParameter: double, tolerance: double, /* out */ vertexCoordinates: Array[Point3D]): Boolean = js.native
  /**
  * Get the tangent to the curve at a parameter position on the curve.
  */
  def getTangent(parameter: double, /* out */ tangent: Vector3D): Boolean = js.native
  /**
  * Get the tanget to the curve at a number of parameter positions on the curve.
  */
  def getTangents(parameters: Array[Double], /* out */ tangents: Array[Vector3D]): Boolean = js.native
  /**
  * Get the third derivative of the curve at the specified parameter position.
  */
  def getThirdDerivative(parameter: double, /* out */ thirdDerivative: Vector3D): Boolean = js.native
  /**
  * Get the third derivatives of the curve at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Double], /* out */ thirdDerivatives: Array[Vector3D]): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object CurveEvaluator3DUtilities {
    // no toSeq
/**
* Get the curvature value at a parameter position on the curve.
*
* Out parameters are returned in a tuple.
*/
def getCurvatureWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Vector3D, double) = {

val direction = js.Dynamic.literal(value = 0)
val curvature = js.Dynamic.literal(value = 0)
val result = activeObject.getCurvature(parameter.asInstanceOf[double], direction.asInstanceOf[Vector3D], curvature.asInstanceOf[double])
(result, direction.value.asInstanceOf[Vector3D], curvature.value.asInstanceOf[double])
}
/**
* Get the curvature values at a number of parameter positions on the curve.
*
* Out parameters are returned in a tuple.
*/
def getCurvaturesWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Vector3D, Double) = {

val directions = js.Dynamic.literal(value = 0)
val curvatures = js.Dynamic.literal(value = 0)
val result = activeObject.getCurvatures(parameters.asInstanceOf[Array[Double]], directions.asInstanceOf[Array[Vector3D]], curvatures.asInstanceOf[Array[Double]])
(result, directions.value.asInstanceOf[Vector3D], curvatures.value.asInstanceOf[Double])
}
/**
* Get the end points of the curve.
*
* Out parameters are returned in a tuple.
*/
def getEndPointsWithResults(activeObject: CurveEvaluator3D): (Boolean, Point3D, Point3D) = {

val startPoint = js.Dynamic.literal(value = 0)
val endPoint = js.Dynamic.literal(value = 0)
val result = activeObject.getEndPoints(startPoint.asInstanceOf[Point3D], endPoint.asInstanceOf[Point3D])
(result, startPoint.value.asInstanceOf[Point3D], endPoint.value.asInstanceOf[Point3D])
}
/**
* Get the first derivative of the curve at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getFirstDerivativeWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Vector3D) = {

val firstDerivative = js.Dynamic.literal(value = 0)
val result = activeObject.getFirstDerivative(parameter.asInstanceOf[double], firstDerivative.asInstanceOf[Vector3D])
(result, firstDerivative.value.asInstanceOf[Vector3D])
}
/**
* Get the first derivatives of the curve at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getFirstDerivativesWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Vector3D) = {

val firstDerivatives = js.Dynamic.literal(value = 0)
val result = activeObject.getFirstDerivatives(parameters.asInstanceOf[Array[Double]], firstDerivatives.asInstanceOf[Array[Vector3D]])
(result, firstDerivatives.value.asInstanceOf[Vector3D])
}
/**
* Get the length of the curve between two parameter positions on the curve.
*
* Out parameters are returned in a tuple.
*/
def getLengthAtParameterWithResults(activeObject: CurveEvaluator3D, fromParameter: double, toParameter: double): (Boolean, double) = {

val length = js.Dynamic.literal(value = 0)
val result = activeObject.getLengthAtParameter(fromParameter.asInstanceOf[double], toParameter.asInstanceOf[double], length.asInstanceOf[double])
(result, length.value.asInstanceOf[double])
}
/**
* Get the parameter position on the curve that is the specified curve length from the specified starting parameter position.
*
* Out parameters are returned in a tuple.
*/
def getParameterAtLengthWithResults(activeObject: CurveEvaluator3D, fromParameter: double, length: double): (Boolean, double) = {

val parameter = js.Dynamic.literal(value = 0)
val result = activeObject.getParameterAtLength(fromParameter.asInstanceOf[double], length.asInstanceOf[double], parameter.asInstanceOf[double])
(result, parameter.value.asInstanceOf[double])
}
/**
* Get the parameter position that correspond to a point on the curve. For reliable results, the point should lie on the curve within model tolerance. If the point does not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
*
* Out parameters are returned in a tuple.
*/
def getParameterAtPointWithResults(activeObject: CurveEvaluator3D, point: Point3D): (Boolean, double) = {

val parameter = js.Dynamic.literal(value = 0)
val result = activeObject.getParameterAtPoint(point.asInstanceOf[Point3D], parameter.asInstanceOf[double])
(result, parameter.value.asInstanceOf[double])
}
/**
* Get the parametric range of the curve.
*
* Out parameters are returned in a tuple.
*/
def getParameterExtentsWithResults(activeObject: CurveEvaluator3D): (Boolean, double, double) = {

val startParameter = js.Dynamic.literal(value = 0)
val endParameter = js.Dynamic.literal(value = 0)
val result = activeObject.getParameterExtents(startParameter.asInstanceOf[double], endParameter.asInstanceOf[double])
(result, startParameter.value.asInstanceOf[double], endParameter.value.asInstanceOf[double])
}
/**
* Get the parameter positions that correspond to a set of points on the curve. For reliable results, the points should lie on the curve within model tolerance. If the points do not lie on the curve, the parameter of the nearest point on the curve will generally be returned.
*
* Out parameters are returned in a tuple.
*/
def getParametersAtPointsWithResults(activeObject: CurveEvaluator3D, points: Array[Point3D]): (Boolean, Double) = {

val parameters = js.Dynamic.literal(value = 0)
val result = activeObject.getParametersAtPoints(points.asInstanceOf[Array[Point3D]], parameters.asInstanceOf[Array[Double]])
(result, parameters.value.asInstanceOf[Double])
}
/**
* Get the point on the curve that corresponds to evaluating a parameter position on the curve.
*
* Out parameters are returned in a tuple.
*/
def getPointAtParameterWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Point3D) = {

val point = js.Dynamic.literal(value = 0)
val result = activeObject.getPointAtParameter(parameter.asInstanceOf[double], point.asInstanceOf[Point3D])
(result, point.value.asInstanceOf[Point3D])
}
/**
* Get the points on the curve that correspond to evaluating a set of parameter positions on the curve.
*
* Out parameters are returned in a tuple.
*/
def getPointsAtParametersWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Point3D) = {

val points = js.Dynamic.literal(value = 0)
val result = activeObject.getPointsAtParameters(parameters.asInstanceOf[Array[Double]], points.asInstanceOf[Array[Point3D]])
(result, points.value.asInstanceOf[Point3D])
}
/**
* Get the second derivative of the curve at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getSecondDerivativeWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Vector3D) = {

val secondDerivative = js.Dynamic.literal(value = 0)
val result = activeObject.getSecondDerivative(parameter.asInstanceOf[double], secondDerivative.asInstanceOf[Vector3D])
(result, secondDerivative.value.asInstanceOf[Vector3D])
}
/**
* Get the second derivatives of the curve at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getSecondDerivativesWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Vector3D) = {

val secondDerivatives = js.Dynamic.literal(value = 0)
val result = activeObject.getSecondDerivatives(parameters.asInstanceOf[Array[Double]], secondDerivatives.asInstanceOf[Array[Vector3D]])
(result, secondDerivatives.value.asInstanceOf[Vector3D])
}
/**
* Get a sequence of points between two curve parameter positions. The points will be a linear interpolation along the curve between these two parameter positions where the maximum deviation between the curve and each line segment will not exceed the specified tolerance value.
*
* Out parameters are returned in a tuple.
*/
def getStrokesWithResults(activeObject: CurveEvaluator3D, fromParameter: double, toParameter: double, tolerance: double): (Boolean, Point3D) = {

val vertexCoordinates = js.Dynamic.literal(value = 0)
val result = activeObject.getStrokes(fromParameter.asInstanceOf[double], toParameter.asInstanceOf[double], tolerance.asInstanceOf[double], vertexCoordinates.asInstanceOf[Array[Point3D]])
(result, vertexCoordinates.value.asInstanceOf[Point3D])
}
/**
* Get the tangent to the curve at a parameter position on the curve.
*
* Out parameters are returned in a tuple.
*/
def getTangentWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Vector3D) = {

val tangent = js.Dynamic.literal(value = 0)
val result = activeObject.getTangent(parameter.asInstanceOf[double], tangent.asInstanceOf[Vector3D])
(result, tangent.value.asInstanceOf[Vector3D])
}
/**
* Get the tanget to the curve at a number of parameter positions on the curve.
*
* Out parameters are returned in a tuple.
*/
def getTangentsWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Vector3D) = {

val tangents = js.Dynamic.literal(value = 0)
val result = activeObject.getTangents(parameters.asInstanceOf[Array[Double]], tangents.asInstanceOf[Array[Vector3D]])
(result, tangents.value.asInstanceOf[Vector3D])
}
/**
* Get the third derivative of the curve at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getThirdDerivativeWithResults(activeObject: CurveEvaluator3D, parameter: double): (Boolean, Vector3D) = {

val thirdDerivative = js.Dynamic.literal(value = 0)
val result = activeObject.getThirdDerivative(parameter.asInstanceOf[double], thirdDerivative.asInstanceOf[Vector3D])
(result, thirdDerivative.value.asInstanceOf[Vector3D])
}
/**
* Get the third derivatives of the curve at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getThirdDerivativesWithResults(activeObject: CurveEvaluator3D, parameters: Array[Double]): (Boolean, Vector3D) = {

val thirdDerivatives = js.Dynamic.literal(value = 0)
val result = activeObject.getThirdDerivatives(parameters.asInstanceOf[Array[Double]], thirdDerivatives.asInstanceOf[Array[Vector3D]])
(result, thirdDerivatives.value.asInstanceOf[Vector3D])
}
  }
       
