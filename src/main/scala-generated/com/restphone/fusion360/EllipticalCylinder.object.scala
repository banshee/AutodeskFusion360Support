
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient elliptical cylinder. A transient elliptical cylinder is not displayed or saved in a document. A transient elliptical cylinder is used as a wrapper to work with raw elliptical cylinder information. A transient elliptical cylinder has no boundaries and is infinite in length. 
 */
@JSName("adsk.core.EllipticalCylinder")
class EllipticalCylinder extends Surface {
  /**
  * Gets and set the center axis (along the length) of the cylinder that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this EllipticalCylinder object.
  */
  def copy(): EllipticalCylinder = js.native
  /**
  * Creates a transient 3D elliptical cylinder object.
  */
  def create(origin: Point3D, axis: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): EllipticalCylinder = js.native

  /**
  * Gets the data defining the elliptical cylinder.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native

  /**
  * Gets and sets the direction of the major axis of the ellipse that defines the cylinder.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the ellipse that defines the cylinder.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse that defines the cylinder.
  */
  var minorRadius: double = js.native

  /**
  * Gets and sets the origin point (center) of the base of the cylinder.
  */
  var origin: Point3D = js.native
  /**
  * Sets the data defining the elliptical cylinder.
  */
  def set(origin: Point3D, axis: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient elliptical cylinder. A transient elliptical cylinder is not displayed or saved in a document. A transient elliptical cylinder is used as a wrapper to work with raw elliptical cylinder information. A transient elliptical cylinder has no boundaries and is infinite in length. 
 */
@JSName("adsk.core.EllipticalCylinder")
object EllipticalCylinder extends js.Object {
  /**
  * Gets and set the center axis (along the length) of the cylinder that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Creates and returns an independent copy of this EllipticalCylinder object.
  */
  def copy(): EllipticalCylinder = js.native
  /**
  * Creates a transient 3D elliptical cylinder object.
  */
  def create(origin: Point3D, axis: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): EllipticalCylinder = js.native
  /**
  * Gets the data defining the elliptical cylinder.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorAxis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native
  /**
  * Gets and sets the direction of the major axis of the ellipse that defines the cylinder.
  */
  var majorAxis: Vector3D = js.native
  /**
  * Gets and sets the major radius of the ellipse that defines the cylinder.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse that defines the cylinder.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the origin point (center) of the base of the cylinder.
  */
  var origin: Point3D = js.native
  /**
  * Sets the data defining the elliptical cylinder.
  */
  def set(origin: Point3D, axis: Vector3D, majorAxis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native
}

  object EllipticalCylinderUtilities {
    // no toSeq
/**
* Gets the data defining the elliptical cylinder.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: EllipticalCylinder): (Boolean, Point3D, Vector3D, Vector3D, double, double) = {

val origin = js.Dynamic.literal(value = 0)
val axis = js.Dynamic.literal(value = 0)
val majorAxis = js.Dynamic.literal(value = 0)
val majorRadius = js.Dynamic.literal(value = 0)
val minorRadius = js.Dynamic.literal(value = 0)
val result = activeObject.getData(origin.asInstanceOf[Point3D], axis.asInstanceOf[Vector3D], majorAxis.asInstanceOf[Vector3D], majorRadius.asInstanceOf[double], minorRadius.asInstanceOf[double])
(result, origin.value.asInstanceOf[Point3D], axis.value.asInstanceOf[Vector3D], majorAxis.value.asInstanceOf[Vector3D], majorRadius.value.asInstanceOf[double], minorRadius.value.asInstanceOf[double])
}
  }
       
