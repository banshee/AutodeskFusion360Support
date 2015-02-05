
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient torus. A transient torus is not displayed or saved in a document. A transient torus is used as a wrapper to work with raw torus information. A transient torus is a full torus with no boundaries. 
 */
@JSName("adsk.core.Torus")
class Torus extends Surface {
  /**
  * Gets and sets the center axis of the torus.
  */
  var axis: Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Torus object.
  */
  def copy(): Torus = js.native
  /**
  * Creates a transient torus object.
  */
  def create(origin: Point3D, axis: Vector3D, majorRadius: double, minorRadius: double): Torus = js.native

  /**
  * Gets all of the data defining the torus.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native

  /**
  * Gets and sets the major radius of the torus.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the torus.
  */
  var minorRadius: double = js.native

  /**
  * Gets and sets the origin point (center) of the torus.
  */
  var origin: Point3D = js.native
  /**
  * Sets all of the data defining the torus.
  */
  def set(origin: Point3D, axis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient torus. A transient torus is not displayed or saved in a document. A transient torus is used as a wrapper to work with raw torus information. A transient torus is a full torus with no boundaries. 
 */
@JSName("adsk.core.Torus")
object Torus extends js.Object {
  /**
  * Gets and sets the center axis of the torus.
  */
  var axis: Vector3D = js.native
  /**
  * Creates and returns an independent copy of this Torus object.
  */
  def copy(): Torus = js.native
  /**
  * Creates a transient torus object.
  */
  def create(origin: Point3D, axis: Vector3D, majorRadius: double, minorRadius: double): Torus = js.native
  /**
  * Gets all of the data defining the torus.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native
  /**
  * Gets and sets the major radius of the torus.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the torus.
  */
  var minorRadius: double = js.native
  /**
  * Gets and sets the origin point (center) of the torus.
  */
  var origin: Point3D = js.native
  /**
  * Sets all of the data defining the torus.
  */
  def set(origin: Point3D, axis: Vector3D, majorRadius: double, minorRadius: double): Boolean = js.native
}

  object TorusUtilities {
    // no toSeq
/**
* Gets all of the data defining the torus.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Torus): (Boolean, Point3D, Vector3D, double, double) = {

val origin = js.Dynamic.literal(value = 0)
val axis = js.Dynamic.literal(value = 0)
val majorRadius = js.Dynamic.literal(value = 0)
val minorRadius = js.Dynamic.literal(value = 0)
val result = activeObject.getData(origin.asInstanceOf[Point3D], axis.asInstanceOf[Vector3D], majorRadius.asInstanceOf[double], minorRadius.asInstanceOf[double])
(result, origin.value.asInstanceOf[Point3D], axis.value.asInstanceOf[Vector3D], majorRadius.value.asInstanceOf[double], minorRadius.value.asInstanceOf[double])
}
  }
       
