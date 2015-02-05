
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Surface evaluator that is obtained from a transient surface and allows you to perform various evaluations on the surface. 
 */
@JSName("adsk.core.SurfaceEvaluator")
class SurfaceEvaluator extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature values at a parameter positions on the surface.
  */
  def getCurvature(parameter: Point2D, /* out */ maxTangent: Vector3D, /* out */ maxCurvature: double, /* out */ minCurvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the surface.
  */
  def getCurvatures(parameters: Array[Point2D], /* out */ maxTangents: Array[Vector3D], /* out */ maxCurvatures: Array[Double], /* out */ minCurvatures: Array[Double]): Boolean = js.native
  /**
  * Get the first derivative of the surface at the specified parameter position.
  */
  def getFirstDerivative(parameter: Point2D, /* out */ partialU: Vector3D, /* out */ partialV: Vector3D): Boolean = js.native
  /**
  * Get the first derivatives of the surface at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Point2D], /* out */ partialsU: Array[Vector3D], /* out */ partialsV: Array[Vector3D]): Boolean = js.native
  /**
  * Gets (by extraction) a curve that follows a constant u or v parameter along the surface. The curve will have the same properties as the surface in the direction of the extraction. For example, when a curve is extracted from the periodic direction of a surface, the extracted curve will also be periodic. The type of curve returned is dependent on the shape the surface.
  */
  def getIsoCurve(parameter: double, isUDirection: Boolean): ObjectCollection = js.native
  /**
  * Creates the 3D equivalent curve in model space, of a 2D curve defined in the parmatric space of the surface.
  */
  def getModelCurveFromParametricCurve(parametricCurve: Curve2D): ObjectCollection = js.native
  /**
  * Gets the surface normal at a parameter position on the surface.
  */
  def getNormalAtParameter(parameter: Point2D, /* out */ normal: Vector3D): Boolean = js.native
  /**
  * Gets the surface normal at a point on the surface.
  */
  def getNormalAtPoint(point: Point3D, /* out */ normal: Vector3D): Boolean = js.native
  /**
  * Gets the surface normal at a number of parameter positions on the surface.
  */
  def getNormalsAtParameters(parameters: Array[Point2D], /* out */ normals: Array[Vector3D]): Boolean = js.native
  /**
  * Gets the surface normal at a number of positions on the surface.
  */
  def getNormalsAtPoints(points: Array[Point3D], /* out */ normals: Array[Vector3D]): Boolean = js.native
  /**
  * Gets details about anomalies in parameter space of the surface. This includes information about periodic intervals, singularities, or unbounded parameter ranges.
  */
  def getParamAnomaly(/* out */ periodicityU: Array[Double], /* out */ periodicityV: Array[Double], /* out */ singularitiesU: Array[Double], /* out */ singularitiesV: Array[Double], /* out */ unboundedParameters: Array[Boolean]): Boolean = js.native
  /**
  * Get the parameter position that correspond to a point on the surface. For reliable results, the point should lie on the surface within model tolerance. If the point does not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
  */
  def getParameterAtPoint(point: Point3D, /* out */ parameter: Point2D): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the surface. For reliable results, the points should lie on the surface within model tolerance. If the points do not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point3D], /* out */ parameters: Array[Point2D]): Boolean = js.native
  /**
  * Get the point on the surface that correspond to evaluating a parameter position on the surface.
  */
  def getPointAtParameter(parameter: Point2D, /* out */ point: Point3D): Boolean = js.native
  /**
  * Get the points on the surface that correspond to evaluating a set of parameter positions on the surface.
  */
  def getPointsAtParameters(parameters: Array[Point2D], /* out */ points: Array[Point3D]): Boolean = js.native
  /**
  * Get the second derivative of the surface at the specified parameter position.
  */
  def getSecondDerivative(parameter: Point2D, /* out */ partialUU: Vector3D, /* out */ partialUV: Vector3D, /* out */ partialVV: Vector3D): Boolean = js.native
  /**
  * Get the second derivatives of the surface at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Point2D], /* out */ partialsUU: Array[Vector3D], /* out */ partialsUV: Array[Vector3D], /* out */ partialsVV: Array[Vector3D]): Boolean = js.native
  /**
  * Get the third derivative of the surface at the specified parameter position.
  */
  def getThirdDerivative(parameter: Point2D, /* out */ partialUUU: Vector3D, /* out */ partialVVV: Vector3D): Boolean = js.native
  /**
  * Get the third derivatives of the surface at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Point2D], /* out */ partialsUUU: Array[Vector3D], /* out */ partialsVVV: Array[Vector3D]): Boolean = js.native
  /**
  * Indicates if the surface is closed (forms a loop) in the U direction
  */
  val isClosedInU: Boolean = js.native
  /**
  * Indicates if the surface is closed (forms a loop) in the V direction
  */
  val isClosedInV: Boolean = js.native
  /**
  * Determines if the specified parameter position lies with the parametric range of the surface.
  */
  def isParameterOnFace(parameter: Point2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parametric range of the surface. If the surface is periodic in a direction, the range is set to the principle period's range. If the surface is only upper bounded in a direction, the lower bound is set to -double-max. If the surface is only lower bounded in a direction, the upper bound is set to double-max. If the surface is unbounded in a direction, the lower bound and upper bound of the range will both be zero.
  */
  def parametricRange(): BoundingBox2D = js.native
}
/** 
  * Surface evaluator that is obtained from a transient surface and allows you to perform various evaluations on the surface. 
 */
@JSName("adsk.core.SurfaceEvaluator")
object SurfaceEvaluator extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Get the curvature values at a parameter positions on the surface.
  */
  def getCurvature(parameter: Point2D, /* out */ maxTangent: Vector3D, /* out */ maxCurvature: double, /* out */ minCurvature: double): Boolean = js.native
  /**
  * Get the curvature values at a number of parameter positions on the surface.
  */
  def getCurvatures(parameters: Array[Point2D], /* out */ maxTangents: Array[Vector3D], /* out */ maxCurvatures: Array[Double], /* out */ minCurvatures: Array[Double]): Boolean = js.native
  /**
  * Get the first derivative of the surface at the specified parameter position.
  */
  def getFirstDerivative(parameter: Point2D, /* out */ partialU: Vector3D, /* out */ partialV: Vector3D): Boolean = js.native
  /**
  * Get the first derivatives of the surface at the specified parameter positions.
  */
  def getFirstDerivatives(parameters: Array[Point2D], /* out */ partialsU: Array[Vector3D], /* out */ partialsV: Array[Vector3D]): Boolean = js.native
  /**
  * Gets (by extraction) a curve that follows a constant u or v parameter along the surface. The curve will have the same properties as the surface in the direction of the extraction. For example, when a curve is extracted from the periodic direction of a surface, the extracted curve will also be periodic. The type of curve returned is dependent on the shape the surface.
  */
  def getIsoCurve(parameter: double, isUDirection: Boolean): ObjectCollection = js.native
  /**
  * Creates the 3D equivalent curve in model space, of a 2D curve defined in the parmatric space of the surface.
  */
  def getModelCurveFromParametricCurve(parametricCurve: Curve2D): ObjectCollection = js.native
  /**
  * Gets the surface normal at a parameter position on the surface.
  */
  def getNormalAtParameter(parameter: Point2D, /* out */ normal: Vector3D): Boolean = js.native
  /**
  * Gets the surface normal at a point on the surface.
  */
  def getNormalAtPoint(point: Point3D, /* out */ normal: Vector3D): Boolean = js.native
  /**
  * Gets the surface normal at a number of parameter positions on the surface.
  */
  def getNormalsAtParameters(parameters: Array[Point2D], /* out */ normals: Array[Vector3D]): Boolean = js.native
  /**
  * Gets the surface normal at a number of positions on the surface.
  */
  def getNormalsAtPoints(points: Array[Point3D], /* out */ normals: Array[Vector3D]): Boolean = js.native
  /**
  * Gets details about anomalies in parameter space of the surface. This includes information about periodic intervals, singularities, or unbounded parameter ranges.
  */
  def getParamAnomaly(/* out */ periodicityU: Array[Double], /* out */ periodicityV: Array[Double], /* out */ singularitiesU: Array[Double], /* out */ singularitiesV: Array[Double], /* out */ unboundedParameters: Array[Boolean]): Boolean = js.native
  /**
  * Get the parameter position that correspond to a point on the surface. For reliable results, the point should lie on the surface within model tolerance. If the point does not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
  */
  def getParameterAtPoint(point: Point3D, /* out */ parameter: Point2D): Boolean = js.native
  /**
  * Get the parameter positions that correspond to a set of points on the surface. For reliable results, the points should lie on the surface within model tolerance. If the points do not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
  */
  def getParametersAtPoints(points: Array[Point3D], /* out */ parameters: Array[Point2D]): Boolean = js.native
  /**
  * Get the point on the surface that correspond to evaluating a parameter position on the surface.
  */
  def getPointAtParameter(parameter: Point2D, /* out */ point: Point3D): Boolean = js.native
  /**
  * Get the points on the surface that correspond to evaluating a set of parameter positions on the surface.
  */
  def getPointsAtParameters(parameters: Array[Point2D], /* out */ points: Array[Point3D]): Boolean = js.native
  /**
  * Get the second derivative of the surface at the specified parameter position.
  */
  def getSecondDerivative(parameter: Point2D, /* out */ partialUU: Vector3D, /* out */ partialUV: Vector3D, /* out */ partialVV: Vector3D): Boolean = js.native
  /**
  * Get the second derivatives of the surface at the specified parameter positions.
  */
  def getSecondDerivatives(parameters: Array[Point2D], /* out */ partialsUU: Array[Vector3D], /* out */ partialsUV: Array[Vector3D], /* out */ partialsVV: Array[Vector3D]): Boolean = js.native
  /**
  * Get the third derivative of the surface at the specified parameter position.
  */
  def getThirdDerivative(parameter: Point2D, /* out */ partialUUU: Vector3D, /* out */ partialVVV: Vector3D): Boolean = js.native
  /**
  * Get the third derivatives of the surface at the specified parameter positions.
  */
  def getThirdDerivatives(parameters: Array[Point2D], /* out */ partialsUUU: Array[Vector3D], /* out */ partialsVVV: Array[Vector3D]): Boolean = js.native
  /**
  * Indicates if the surface is closed (forms a loop) in the U direction
  */
  val isClosedInU: Boolean = js.native
  /**
  * Indicates if the surface is closed (forms a loop) in the V direction
  */
  val isClosedInV: Boolean = js.native
  /**
  * Determines if the specified parameter position lies with the parametric range of the surface.
  */
  def isParameterOnFace(parameter: Point2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parametric range of the surface. If the surface is periodic in a direction, the range is set to the principle period's range. If the surface is only upper bounded in a direction, the lower bound is set to -double-max. If the surface is only lower bounded in a direction, the upper bound is set to double-max. If the surface is unbounded in a direction, the lower bound and upper bound of the range will both be zero.
  */
  def parametricRange(): BoundingBox2D = js.native
}

  object SurfaceEvaluatorUtilities {
    // no toSeq
/**
* Get the curvature values at a parameter positions on the surface.
*
* Out parameters are returned in a tuple.
*/
def getCurvatureWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Vector3D, double, double) = {

val maxTangent = js.Dynamic.literal(value = 0)
val maxCurvature = js.Dynamic.literal(value = 0)
val minCurvature = js.Dynamic.literal(value = 0)
val result = activeObject.getCurvature(parameter.asInstanceOf[Point2D], maxTangent.asInstanceOf[Vector3D], maxCurvature.asInstanceOf[double], minCurvature.asInstanceOf[double])
(result, maxTangent.value.asInstanceOf[Vector3D], maxCurvature.value.asInstanceOf[double], minCurvature.value.asInstanceOf[double])
}
/**
* Get the curvature values at a number of parameter positions on the surface.
*
* Out parameters are returned in a tuple.
*/
def getCurvaturesWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Vector3D, Double, Double) = {

val maxTangents = js.Dynamic.literal(value = 0)
val maxCurvatures = js.Dynamic.literal(value = 0)
val minCurvatures = js.Dynamic.literal(value = 0)
val result = activeObject.getCurvatures(parameters.asInstanceOf[Array[Point2D]], maxTangents.asInstanceOf[Array[Vector3D]], maxCurvatures.asInstanceOf[Array[Double]], minCurvatures.asInstanceOf[Array[Double]])
(result, maxTangents.value.asInstanceOf[Vector3D], maxCurvatures.value.asInstanceOf[Double], minCurvatures.value.asInstanceOf[Double])
}
/**
* Get the first derivative of the surface at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getFirstDerivativeWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Vector3D, Vector3D) = {

val partialU = js.Dynamic.literal(value = 0)
val partialV = js.Dynamic.literal(value = 0)
val result = activeObject.getFirstDerivative(parameter.asInstanceOf[Point2D], partialU.asInstanceOf[Vector3D], partialV.asInstanceOf[Vector3D])
(result, partialU.value.asInstanceOf[Vector3D], partialV.value.asInstanceOf[Vector3D])
}
/**
* Get the first derivatives of the surface at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getFirstDerivativesWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Vector3D, Vector3D) = {

val partialsU = js.Dynamic.literal(value = 0)
val partialsV = js.Dynamic.literal(value = 0)
val result = activeObject.getFirstDerivatives(parameters.asInstanceOf[Array[Point2D]], partialsU.asInstanceOf[Array[Vector3D]], partialsV.asInstanceOf[Array[Vector3D]])
(result, partialsU.value.asInstanceOf[Vector3D], partialsV.value.asInstanceOf[Vector3D])
}
/**
* Gets the surface normal at a parameter position on the surface.
*
* Out parameters are returned in a tuple.
*/
def getNormalAtParameterWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Vector3D) = {

val normal = js.Dynamic.literal(value = 0)
val result = activeObject.getNormalAtParameter(parameter.asInstanceOf[Point2D], normal.asInstanceOf[Vector3D])
(result, normal.value.asInstanceOf[Vector3D])
}
/**
* Gets the surface normal at a point on the surface.
*
* Out parameters are returned in a tuple.
*/
def getNormalAtPointWithResults(activeObject: SurfaceEvaluator, point: Point3D): (Boolean, Vector3D) = {

val normal = js.Dynamic.literal(value = 0)
val result = activeObject.getNormalAtPoint(point.asInstanceOf[Point3D], normal.asInstanceOf[Vector3D])
(result, normal.value.asInstanceOf[Vector3D])
}
/**
* Gets the surface normal at a number of parameter positions on the surface.
*
* Out parameters are returned in a tuple.
*/
def getNormalsAtParametersWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Vector3D) = {

val normals = js.Dynamic.literal(value = 0)
val result = activeObject.getNormalsAtParameters(parameters.asInstanceOf[Array[Point2D]], normals.asInstanceOf[Array[Vector3D]])
(result, normals.value.asInstanceOf[Vector3D])
}
/**
* Gets the surface normal at a number of positions on the surface.
*
* Out parameters are returned in a tuple.
*/
def getNormalsAtPointsWithResults(activeObject: SurfaceEvaluator, points: Array[Point3D]): (Boolean, Vector3D) = {

val normals = js.Dynamic.literal(value = 0)
val result = activeObject.getNormalsAtPoints(points.asInstanceOf[Array[Point3D]], normals.asInstanceOf[Array[Vector3D]])
(result, normals.value.asInstanceOf[Vector3D])
}
/**
* Gets details about anomalies in parameter space of the surface. This includes information about periodic intervals, singularities, or unbounded parameter ranges.
*
* Out parameters are returned in a tuple.
*/
def getParamAnomalyWithResults(activeObject: SurfaceEvaluator): (Boolean, Double, Double, Double, Double, Boolean) = {

val periodicityU = js.Dynamic.literal(value = 0)
val periodicityV = js.Dynamic.literal(value = 0)
val singularitiesU = js.Dynamic.literal(value = 0)
val singularitiesV = js.Dynamic.literal(value = 0)
val unboundedParameters = js.Dynamic.literal(value = 0)
val result = activeObject.getParamAnomaly(periodicityU.asInstanceOf[Array[Double]], periodicityV.asInstanceOf[Array[Double]], singularitiesU.asInstanceOf[Array[Double]], singularitiesV.asInstanceOf[Array[Double]], unboundedParameters.asInstanceOf[Array[Boolean]])
(result, periodicityU.value.asInstanceOf[Double], periodicityV.value.asInstanceOf[Double], singularitiesU.value.asInstanceOf[Double], singularitiesV.value.asInstanceOf[Double], unboundedParameters.value.asInstanceOf[Boolean])
}
/**
* Get the parameter position that correspond to a point on the surface. For reliable results, the point should lie on the surface within model tolerance. If the point does not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
*
* Out parameters are returned in a tuple.
*/
def getParameterAtPointWithResults(activeObject: SurfaceEvaluator, point: Point3D): (Boolean, Point2D) = {

val parameter = js.Dynamic.literal(value = 0)
val result = activeObject.getParameterAtPoint(point.asInstanceOf[Point3D], parameter.asInstanceOf[Point2D])
(result, parameter.value.asInstanceOf[Point2D])
}
/**
* Get the parameter positions that correspond to a set of points on the surface. For reliable results, the points should lie on the surface within model tolerance. If the points do not lie on the surface, the parameter of the nearest point on the surface will generally be returned.
*
* Out parameters are returned in a tuple.
*/
def getParametersAtPointsWithResults(activeObject: SurfaceEvaluator, points: Array[Point3D]): (Boolean, Point2D) = {

val parameters = js.Dynamic.literal(value = 0)
val result = activeObject.getParametersAtPoints(points.asInstanceOf[Array[Point3D]], parameters.asInstanceOf[Array[Point2D]])
(result, parameters.value.asInstanceOf[Point2D])
}
/**
* Get the point on the surface that correspond to evaluating a parameter position on the surface.
*
* Out parameters are returned in a tuple.
*/
def getPointAtParameterWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Point3D) = {

val point = js.Dynamic.literal(value = 0)
val result = activeObject.getPointAtParameter(parameter.asInstanceOf[Point2D], point.asInstanceOf[Point3D])
(result, point.value.asInstanceOf[Point3D])
}
/**
* Get the points on the surface that correspond to evaluating a set of parameter positions on the surface.
*
* Out parameters are returned in a tuple.
*/
def getPointsAtParametersWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Point3D) = {

val points = js.Dynamic.literal(value = 0)
val result = activeObject.getPointsAtParameters(parameters.asInstanceOf[Array[Point2D]], points.asInstanceOf[Array[Point3D]])
(result, points.value.asInstanceOf[Point3D])
}
/**
* Get the second derivative of the surface at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getSecondDerivativeWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Vector3D, Vector3D, Vector3D) = {

val partialUU = js.Dynamic.literal(value = 0)
val partialUV = js.Dynamic.literal(value = 0)
val partialVV = js.Dynamic.literal(value = 0)
val result = activeObject.getSecondDerivative(parameter.asInstanceOf[Point2D], partialUU.asInstanceOf[Vector3D], partialUV.asInstanceOf[Vector3D], partialVV.asInstanceOf[Vector3D])
(result, partialUU.value.asInstanceOf[Vector3D], partialUV.value.asInstanceOf[Vector3D], partialVV.value.asInstanceOf[Vector3D])
}
/**
* Get the second derivatives of the surface at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getSecondDerivativesWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Vector3D, Vector3D, Vector3D) = {

val partialsUU = js.Dynamic.literal(value = 0)
val partialsUV = js.Dynamic.literal(value = 0)
val partialsVV = js.Dynamic.literal(value = 0)
val result = activeObject.getSecondDerivatives(parameters.asInstanceOf[Array[Point2D]], partialsUU.asInstanceOf[Array[Vector3D]], partialsUV.asInstanceOf[Array[Vector3D]], partialsVV.asInstanceOf[Array[Vector3D]])
(result, partialsUU.value.asInstanceOf[Vector3D], partialsUV.value.asInstanceOf[Vector3D], partialsVV.value.asInstanceOf[Vector3D])
}
/**
* Get the third derivative of the surface at the specified parameter position.
*
* Out parameters are returned in a tuple.
*/
def getThirdDerivativeWithResults(activeObject: SurfaceEvaluator, parameter: Point2D): (Boolean, Vector3D, Vector3D) = {

val partialUUU = js.Dynamic.literal(value = 0)
val partialVVV = js.Dynamic.literal(value = 0)
val result = activeObject.getThirdDerivative(parameter.asInstanceOf[Point2D], partialUUU.asInstanceOf[Vector3D], partialVVV.asInstanceOf[Vector3D])
(result, partialUUU.value.asInstanceOf[Vector3D], partialVVV.value.asInstanceOf[Vector3D])
}
/**
* Get the third derivatives of the surface at the specified parameter positions.
*
* Out parameters are returned in a tuple.
*/
def getThirdDerivativesWithResults(activeObject: SurfaceEvaluator, parameters: Array[Point2D]): (Boolean, Vector3D, Vector3D) = {

val partialsUUU = js.Dynamic.literal(value = 0)
val partialsVVV = js.Dynamic.literal(value = 0)
val result = activeObject.getThirdDerivatives(parameters.asInstanceOf[Array[Point2D]], partialsUUU.asInstanceOf[Array[Vector3D]], partialsVVV.asInstanceOf[Array[Vector3D]])
(result, partialsUUU.value.asInstanceOf[Vector3D], partialsVVV.value.asInstanceOf[Vector3D])
}
  }
       
