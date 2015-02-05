
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient sphere. A transient sphere is not displayed or saved in a document. Transient spheres are used as a wrapper to work with raw sphere information. A transient sphere is a full sphere defined by a point and a radius. 
 */
@JSName("adsk.core.Sphere")
class Sphere extends Surface {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Sphere object.
  */
  def copy(): Sphere = js.native
  /**
  * Creates a transient sphere object.
  */
  def create(origin: Point3D, radius: double): Sphere = js.native

  /**
  * Gets all of the data defining the sphere.
  */
  def getData(/* out */ origin: Point3D, /* out */ radius: double): Boolean = js.native


  /**
  * Gets and sets the origin point (center) of the sphere.
  */
  var origin: Point3D = js.native
  /**
  * Gets and sets the radius of the sphere.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the sphere.
  */
  def set(origin: Point3D, radius: double): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient sphere. A transient sphere is not displayed or saved in a document. Transient spheres are used as a wrapper to work with raw sphere information. A transient sphere is a full sphere defined by a point and a radius. 
 */
@JSName("adsk.core.Sphere")
object Sphere extends js.Object {
  /**
  * Creates and returns an independent copy of this Sphere object.
  */
  def copy(): Sphere = js.native
  /**
  * Creates a transient sphere object.
  */
  def create(origin: Point3D, radius: double): Sphere = js.native
  /**
  * Gets all of the data defining the sphere.
  */
  def getData(/* out */ origin: Point3D, /* out */ radius: double): Boolean = js.native
  /**
  * Gets and sets the origin point (center) of the sphere.
  */
  var origin: Point3D = js.native
  /**
  * Gets and sets the radius of the sphere.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the sphere.
  */
  def set(origin: Point3D, radius: double): Boolean = js.native
}

  object SphereUtilities {
    // no toSeq
/**
* Gets all of the data defining the sphere.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Sphere): (Boolean, Point3D, double) = {

val origin = js.Dynamic.literal(value = 0)
val radius = js.Dynamic.literal(value = 0)
val result = activeObject.getData(origin.asInstanceOf[Point3D], radius.asInstanceOf[double])
(result, origin.value.asInstanceOf[Point3D], radius.value.asInstanceOf[double])
}
  }
       
