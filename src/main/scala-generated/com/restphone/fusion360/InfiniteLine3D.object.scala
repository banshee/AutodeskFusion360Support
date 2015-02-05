
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D infinite line. An infinite line is defined by a position and direction in space and has no start or end points. 
 */
@JSName("adsk.core.InfiniteLine3D")
class InfiniteLine3D extends Curve3D {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): InfiniteLine3D = js.native
  /**
  * Creates a transient 3D infinite line.
  */
  def create(origin: Point3D, direction: Vector3D): InfiniteLine3D = js.native

  /**
  * Gets and sets the direction of the line.
  */
  var direction: Vector3D = js.native

  /**
  * Gets all of the data defining the infinite line.
  */
  def getData(/* out */ origin: Point3D, /* out */ direction: Vector3D): Boolean = js.native
  /**
  * Intersect this line with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Intersect this line with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Compare this line with another to check for colinearity.
  */
  def isColinearTo(line: InfiniteLine3D): Boolean = js.native


  /**
  * Gets and sets the origin point of the line.
  */
  var origin: Point3D = js.native
  /**
  * Sets all of the data defining the infinite line.
  */
  def set(origin: Point3D, direction: Vector3D): Boolean = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D infinite line. An infinite line is defined by a position and direction in space and has no start or end points. 
 */
@JSName("adsk.core.InfiniteLine3D")
object InfiniteLine3D extends js.Object {
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): InfiniteLine3D = js.native
  /**
  * Creates a transient 3D infinite line.
  */
  def create(origin: Point3D, direction: Vector3D): InfiniteLine3D = js.native
  /**
  * Gets and sets the direction of the line.
  */
  var direction: Vector3D = js.native
  /**
  * Gets all of the data defining the infinite line.
  */
  def getData(/* out */ origin: Point3D, /* out */ direction: Vector3D): Boolean = js.native
  /**
  * Intersect this line with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Intersect this line with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Compare this line with another to check for colinearity.
  */
  def isColinearTo(line: InfiniteLine3D): Boolean = js.native
  /**
  * Gets and sets the origin point of the line.
  */
  var origin: Point3D = js.native
  /**
  * Sets all of the data defining the infinite line.
  */
  def set(origin: Point3D, direction: Vector3D): Boolean = js.native
}

  object InfiniteLine3DUtilities {
    // no toSeq
/**
* Gets all of the data defining the infinite line.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: InfiniteLine3D): (Boolean, Point3D, Vector3D) = {

val origin = js.Dynamic.literal(value = 0)
val direction = js.Dynamic.literal(value = 0)
val result = activeObject.getData(origin.asInstanceOf[Point3D], direction.asInstanceOf[Vector3D])
(result, origin.value.asInstanceOf[Point3D], direction.value.asInstanceOf[Vector3D])
}
  }
       
