
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D ellipse. A transient ellipse is n0t displayed or saved in a document. Transient 3D ellipses are used as a wrapper to work with raw 3D ellipse information. 
 */
@JSName("adsk.core.Ellipse3D")
trait Ellipse3D extends Curve3D {
  /**
  * Returns a NURBS curve that is geometrically identical to the ellipse.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the ellipse.
  */
  var center: Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates a copy of this Ellipse3D object.
  */
  def copy(): Ellipse3D = js.native
  /**
  * Creates a transient 3D ellipse object.
  */
  def create(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Ellipse3D = js.native


  /**
  * Gets all of the data defining the ellipse.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native

  /**
  * Gets and sets the major axis of the ellipse.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the ellipse.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the normal of the ellipse.
  */
  val normal: Vector3D = js.native

  /**
  * Sets all of the data defining the ellipse.
  */
  def set(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D ellipse. A transient ellipse is n0t displayed or saved in a document. Transient 3D ellipses are used as a wrapper to work with raw 3D ellipse information. 
 */
@JSName("adsk.core.Ellipse3D")
object Ellipse3D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the ellipse.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the ellipse.
  */
  var center: Point3D = js.native
  /**
  * Creates a copy of this Ellipse3D object.
  */
  def copy(): Ellipse3D = js.native
  /**
  * Creates a transient 3D ellipse object.
  */
  def create(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Ellipse3D = js.native
  /**
  * Gets all of the data defining the ellipse.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native
  /**
  * Gets and sets the major axis of the ellipse.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the ellipse.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the normal of the ellipse.
  */
  val normal: Vector3D = js.native
  /**
  * Sets all of the data defining the ellipse.
  */
  def set(center: Point3D, normal: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native
}
// no utilities
