
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D arc. A transient arc is not displayed or saved in a document. Transient 3D arcs are used as a wrapper to work with raw 3D arc information. 
 */
@JSName("adsk.core.Arc3D")
trait Arc3D extends Curve3D {
  /**
  * Returns a NURBS curve that is geometrically identical to the arc.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the arc.
  */
  var center: Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Arc3D object.
  */
  def copy(): Arc3D = js.native
  /**
  * Creates a transient 3D arc object by specifying a center point and radius.
  */
  def createByCenter(center: Point3D, normal: Vector3D, referenceVector: Vector3D, radius: double, startAngle: double, endAngle: double): Arc3D = js.native
  /**
  * Creates a transient 3D arc by specifying 3 points. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 3D arc information.
  */
  def createByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): Arc3D = js.native

  /**
  * Gets and sets the end angle of the arc in radians. This angle is measured from the reference vector using the right hand rule around the normal vector.
  */
  var endAngle: double = js.native
  /**
  * Gets the end point of the arc.
  */
  val endPoint: Point3D = js.native

  /**
  * Gets all of the data defining the arc.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ referenceVector: Vector3D, /* out */ radius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native

  /**
  * Gets and sets the normal of the arc.
  */
  val normal: Vector3D = js.native

  /**
  * Gets and sets the radius of the arc.
  */
  var radius: double = js.native
  /**
  * Gets and sets the reference vector of the arc.
  */
  val referenceVector: Vector3D = js.native
  /**
  * Sets all of the data defining the arc.
  */
  def set(center: Point3D, normal: Vector3D, referenceVector: Vector3D, radius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Sets the normal and reference vectors of the arc.
  */
  def setAxes(normal: Vector3D, referenceVector: Vector3D): Boolean = js.native
  /**
  * Gets and sets the start angle of the arc in radians. This angle is measured from the reference vector using the right hand rule around the normal vector.
  */
  var startAngle: double = js.native
  /**
  * Gets the start point of the arc.
  */
  val startPoint: Point3D = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D arc. A transient arc is not displayed or saved in a document. Transient 3D arcs are used as a wrapper to work with raw 3D arc information. 
 */
@JSName("adsk.core.Arc3D")
object Arc3D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the arc.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the arc.
  */
  var center: Point3D = js.native
  /**
  * Creates and returns an independent copy of this Arc3D object.
  */
  def copy(): Arc3D = js.native
  /**
  * Creates a transient 3D arc object by specifying a center point and radius.
  */
  def createByCenter(center: Point3D, normal: Vector3D, referenceVector: Vector3D, radius: double, startAngle: double, endAngle: double): Arc3D = js.native
  /**
  * Creates a transient 3D arc by specifying 3 points. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 3D arc information.
  */
  def createByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): Arc3D = js.native
  /**
  * Gets and sets the end angle of the arc in radians. This angle is measured from the reference vector using the right hand rule around the normal vector.
  */
  var endAngle: double = js.native
  /**
  * Gets the end point of the arc.
  */
  val endPoint: Point3D = js.native
  /**
  * Gets all of the data defining the arc.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ referenceVector: Vector3D, /* out */ radius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native
  /**
  * Gets and sets the normal of the arc.
  */
  val normal: Vector3D = js.native
  /**
  * Gets and sets the radius of the arc.
  */
  var radius: double = js.native
  /**
  * Gets and sets the reference vector of the arc.
  */
  val referenceVector: Vector3D = js.native
  /**
  * Sets all of the data defining the arc.
  */
  def set(center: Point3D, normal: Vector3D, referenceVector: Vector3D, radius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Sets the normal and reference vectors of the arc.
  */
  def setAxes(normal: Vector3D, referenceVector: Vector3D): Boolean = js.native
  /**
  * Gets and sets the start angle of the arc in radians. This angle is measured from the reference vector using the right hand rule around the normal vector.
  */
  var startAngle: double = js.native
  /**
  * Gets the start point of the arc.
  */
  val startPoint: Point3D = js.native
}
// no utilities
