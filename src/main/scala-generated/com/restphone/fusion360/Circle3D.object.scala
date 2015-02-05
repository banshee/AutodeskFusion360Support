
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D circle. A transient circle is not displayed or saved in a document. Transient 3D circles are used as a wrapper to work with raw 3D circle information. 
 */
@JSName("adsk.core.Circle3D")
class Circle3D extends Curve3D {
  /**
  * Returns a NURBS curve that is geometrically identical to the circle.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the circle.
  */
  var center: Point3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Circle3D object.
  */
  def copy(): Circle3D = js.native
  /**
  * Creates a transient 3D circle object by specifying a center and radius.
  */
  def createByCenter(center: Point3D, normal: Vector3D, radius: double): Circle3D = js.native
  /**
  * Creates a transient 3D circle through three points.
  */
  def createByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): Circle3D = js.native


  /**
  * Gets all of the data defining the circle.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ radius: double): Boolean = js.native

  /**
  * Gets and sets the normal of the circle.
  */
  var normal: Vector3D = js.native

  /**
  * Gets and sets the radius of the circle.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the circle.
  */
  def set(center: Point3D, normal: Vector3D, radius: double): Boolean = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D circle. A transient circle is not displayed or saved in a document. Transient 3D circles are used as a wrapper to work with raw 3D circle information. 
 */
@JSName("adsk.core.Circle3D")
object Circle3D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the circle.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Gets and sets the center position of the circle.
  */
  var center: Point3D = js.native
  /**
  * Creates and returns an independent copy of this Circle3D object.
  */
  def copy(): Circle3D = js.native
  /**
  * Creates a transient 3D circle object by specifying a center and radius.
  */
  def createByCenter(center: Point3D, normal: Vector3D, radius: double): Circle3D = js.native
  /**
  * Creates a transient 3D circle through three points.
  */
  def createByThreePoints(pointOne: Point3D, pointTwo: Point3D, pointThree: Point3D): Circle3D = js.native
  /**
  * Gets all of the data defining the circle.
  */
  def getData(/* out */ center: Point3D, /* out */ normal: Vector3D, /* out */ radius: double): Boolean = js.native
  /**
  * Gets and sets the normal of the circle.
  */
  var normal: Vector3D = js.native
  /**
  * Gets and sets the radius of the circle.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the circle.
  */
  def set(center: Point3D, normal: Vector3D, radius: double): Boolean = js.native
}

  object Circle3DUtilities {
    // no toSeq
/**
* Gets all of the data defining the circle.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Circle3D): (Boolean, Point3D, Vector3D, double) = {

val center = js.Dynamic.literal(value = 0)
val normal = js.Dynamic.literal(value = 0)
val radius = js.Dynamic.literal(value = 0)
val result = activeObject.getData(center.asInstanceOf[Point3D], normal.asInstanceOf[Vector3D], radius.asInstanceOf[double])
(result, center.value.asInstanceOf[Point3D], normal.value.asInstanceOf[Vector3D], radius.value.asInstanceOf[double])
}
  }
       
