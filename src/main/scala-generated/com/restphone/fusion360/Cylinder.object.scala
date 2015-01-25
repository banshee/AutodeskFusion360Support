
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient cylinder. A transient cylinder is not displayed or saved in a document. A transient cylinder is but is used as a wrapper to work with raw cylinder information. A transient cylinder has no boundaries and is infinite in length. 
 */
@JSName("adsk.core.Cylinder")
trait Cylinder extends Surface {
  /**
  * The center axis (along the length) of the cylinder that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Cylinder object.
  */
  def copy(): Cylinder = js.native
  /**
  * Creates a transient cylinder object.
  */
  def create(origin: Point3D, axis: Vector3D, radius: double): Cylinder = js.native

  /**
  * Gets the data that defines the cylinder.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ radius: double): Boolean = js.native


  /**
  * The origin point (center) of the base of the cylinder.
  */
  var origin: Point3D = js.native
  /**
  * The radius of the cylinder.
  */
  var radius: double = js.native
  /**
  * Sets the data that defines the cylinder.
  */
  def set(origin: Point3D, axis: Vector3D, radius: double): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient cylinder. A transient cylinder is not displayed or saved in a document. A transient cylinder is but is used as a wrapper to work with raw cylinder information. A transient cylinder has no boundaries and is infinite in length. 
 */
@JSName("adsk.core.Cylinder")
object Cylinder extends js.Object {
  /**
  * The center axis (along the length) of the cylinder that defines its normal direction.
  */
  var axis: Vector3D = js.native
  /**
  * Creates and returns an independent copy of this Cylinder object.
  */
  def copy(): Cylinder = js.native
  /**
  * Creates a transient cylinder object.
  */
  def create(origin: Point3D, axis: Vector3D, radius: double): Cylinder = js.native
  /**
  * Gets the data that defines the cylinder.
  */
  def getData(/* out */ origin: Point3D, /* out */ axis: Vector3D, /* out */ radius: double): Boolean = js.native
  /**
  * The origin point (center) of the base of the cylinder.
  */
  var origin: Point3D = js.native
  /**
  * The radius of the cylinder.
  */
  var radius: double = js.native
  /**
  * Sets the data that defines the cylinder.
  */
  def set(origin: Point3D, axis: Vector3D, radius: double): Boolean = js.native
}
// no utilities
