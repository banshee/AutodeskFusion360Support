
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D elliptical arc. A transient elliptical arc is not displayed or saved in a document. Transient 3D elliptical arcs are used as a wrapper to work with raw 3D elliptical arc information. 
 */
@JSName("adsk.core.EllipticalArc3D")
class EllipticalArc3D extends Curve3D {
  /**
  * Returns a NURBS curve that is geometrically identical to the elliptical arc.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center point of the elliptical arc.
  */
  var center: Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this EllipticalArc3D object.
  */
  def copy(): EllipticalArc3D = js.native
  /**
  * Creates a transient 3D elliptical arc.
  */
  def create(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): EllipticalArc3D = js.native

  /**
  * Gets and sets the end angle of the elliptical arc.
  */
  var endAngle: double = js.native

  /**
  * Gets all of the data defining the elliptical arc.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native

  /**
  * Gets and sets the major axis of the elliptical arc.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the elliptical arc.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the elliptical arc.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the normal of the elliptical arc.
  */
  val normal: Vector3D = js.native

  /**
  * Sets all of the data defining the elliptical arc.
  */
  def set(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Gets and sets the start angle of the elliptical arc.
  */
  var startAngle: double = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D elliptical arc. A transient elliptical arc is not displayed or saved in a document. Transient 3D elliptical arcs are used as a wrapper to work with raw 3D elliptical arc information. 
 */
@JSName("adsk.core.EllipticalArc3D")
object EllipticalArc3D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the elliptical arc.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center point of the elliptical arc.
  */
  var center: Point3D = js.native
  /**
  * Creates and returns a copy of this EllipticalArc3D object.
  */
  def copy(): EllipticalArc3D = js.native
  /**
  * Creates a transient 3D elliptical arc.
  */
  def create(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): EllipticalArc3D = js.native
  /**
  * Gets and sets the end angle of the elliptical arc.
  */
  var endAngle: double = js.native
  /**
  * Gets all of the data defining the elliptical arc.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double, /* out */ startAngle: double, /* out */ endAngle: double): Boolean = js.native
  /**
  * Gets and sets the major axis of the elliptical arc.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the elliptical arc.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the elliptical arc.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the normal of the elliptical arc.
  */
  val normal: Vector3D = js.native
  /**
  * Sets all of the data defining the elliptical arc.
  */
  def set(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double, startAngle: double, endAngle: double): Boolean = js.native
  /**
  * Gets and sets the start angle of the elliptical arc.
  */
  var startAngle: double = js.native
}

  object EllipticalArc3DUtilities {
    // no toSeq
/**
* Gets all of the data defining the elliptical arc.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: EllipticalArc3D): (Boolean, Point3D, Vector3D, Vector3D, double, double, double, double) = {

val center = js.Dynamic.literal(value = 0)
val normal = js.Dynamic.literal(value = 0)
val majorAxis = js.Dynamic.literal(value = 0)
val majorRadius = js.Dynamic.literal(value = 0)
val minorRadius = js.Dynamic.literal(value = 0)
val startAngle = js.Dynamic.literal(value = 0)
val endAngle = js.Dynamic.literal(value = 0)
val result = activeObject.getData(center.asInstanceOf[Point3D], normal.asInstanceOf[Vector3D], majorAxis.asInstanceOf[Vector3D], majorRadius.asInstanceOf[double], minorRadius.asInstanceOf[double], startAngle.asInstanceOf[double], endAngle.asInstanceOf[double])
(result, center.value.asInstanceOf[Point3D], normal.value.asInstanceOf[Vector3D], majorAxis.value.asInstanceOf[Vector3D], majorRadius.value.asInstanceOf[double], minorRadius.value.asInstanceOf[double], startAngle.value.asInstanceOf[double], endAngle.value.asInstanceOf[double])
}
  }
       
