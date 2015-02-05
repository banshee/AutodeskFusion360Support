
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 3D line. A transient line is not displayed or saved in a document. Transient 3D lines are used as a wrapper to work with raw 3D line information. 
 */
@JSName("adsk.core.Line3D")
class Line3D extends Curve3D {
  /**
  * Creates an equivalent InfiniteLine3D.
  */
  def asInfiniteLine(): InfiniteLine3D = js.native
  /**
  * Returns a NURBS curve that is geometrically identical to the line.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): Line3D = js.native
  /**
  * Creates a transient line.
  */
  def create(startPoint: Point3D, endPoint: Point3D): Line3D = js.native

  /**
  * Gets and sets the end point of the line.
  */
  var endPoint: Point3D = js.native

  /**
  * Gets all of the data defining the line segment.
  */
  def getData(/* out */ startPoint: Point3D, /* out */ endPoint: Point3D): Boolean = js.native
  /**
  * Intersect this line with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Intersect this line with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Compare this line with another to check for colinearity
  */
  def isColinearTo(line: Line3D): Boolean = js.native


  /**
  * Sets all of the data defining the line segment.
  */
  def set(startPoint: Point3D, endPoint: Point3D): Boolean = js.native
  /**
  * Gets and sets the start point of the line.
  */
  var startPoint: Point3D = js.native
  /**
  * Transforms this curve in 3D space.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient 3D line. A transient line is not displayed or saved in a document. Transient 3D lines are used as a wrapper to work with raw 3D line information. 
 */
@JSName("adsk.core.Line3D")
object Line3D extends js.Object {
  /**
  * Creates an equivalent InfiniteLine3D.
  */
  def asInfiniteLine(): InfiniteLine3D = js.native
  /**
  * Returns a NURBS curve that is geometrically identical to the line.
  */
  val asNurbsCurve: NurbsCurve3D = js.native
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): Line3D = js.native
  /**
  * Creates a transient line.
  */
  def create(startPoint: Point3D, endPoint: Point3D): Line3D = js.native
  /**
  * Gets and sets the end point of the line.
  */
  var endPoint: Point3D = js.native
  /**
  * Gets all of the data defining the line segment.
  */
  def getData(/* out */ startPoint: Point3D, /* out */ endPoint: Point3D): Boolean = js.native
  /**
  * Intersect this line with a curve to get the intersection point(s).
  */
  def intersectWithCurve(curve: Curve3D): ObjectCollection = js.native
  /**
  * Intersect this line with a surface to get the intersection point(s).
  */
  def intersectWithSurface(surface: Surface): ObjectCollection = js.native
  /**
  * Compare this line with another to check for colinearity
  */
  def isColinearTo(line: Line3D): Boolean = js.native
  /**
  * Sets all of the data defining the line segment.
  */
  def set(startPoint: Point3D, endPoint: Point3D): Boolean = js.native
  /**
  * Gets and sets the start point of the line.
  */
  var startPoint: Point3D = js.native
}

  object Line3DUtilities {
    // no toSeq
/**
* Gets all of the data defining the line segment.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Line3D): (Boolean, Point3D, Point3D) = {

val startPoint = js.Dynamic.literal(value = 0)
val endPoint = js.Dynamic.literal(value = 0)
val result = activeObject.getData(startPoint.asInstanceOf[Point3D], endPoint.asInstanceOf[Point3D])
(result, startPoint.value.asInstanceOf[Point3D], endPoint.value.asInstanceOf[Point3D])
}
  }
       
