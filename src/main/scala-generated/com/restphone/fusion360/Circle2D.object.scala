
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D circle. A transient circle is not displayed or saved in a document. Transient circles are used as a wrapper to work with raw 2D arc information. 
 */
@JSName("adsk.core.Circle2D")
trait Circle2D extends Curve2D {
  /**
  * Returns a NURBS curve that is geometrically identical to the circle.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the circle.
  */
  var center: Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Circle2D object.
  */
  def copy(): Circle2D = js.native
  /**
  * Creates a transient 2D circle object by specifying a center and radius.
  */
  def createByCenter(center: Point2D, radius: double): Circle2D = js.native
  /**
  * Creates a transient 2D circle through three points.
  */
  def createByThreePoints(pointOne: Point2D, pointTwo: Point2D, pointThree: Point2D): Circle2D = js.native


  /**
  * Gets all of the data defining the circle.
  */
  def getData(/* out */ center: Point2D, /* out */ radius: double): Boolean = js.native


  /**
  * Gets and sets the radius of the circle.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the circle.
  */
  def set(center: Point2D, radius: double): Boolean = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D circle. A transient circle is not displayed or saved in a document. Transient circles are used as a wrapper to work with raw 2D arc information. 
 */
@JSName("adsk.core.Circle2D")
object Circle2D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the circle.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the circle.
  */
  var center: Point2D = js.native
  /**
  * Creates and returns an independent copy of this Circle2D object.
  */
  def copy(): Circle2D = js.native
  /**
  * Creates a transient 2D circle object by specifying a center and radius.
  */
  def createByCenter(center: Point2D, radius: double): Circle2D = js.native
  /**
  * Creates a transient 2D circle through three points.
  */
  def createByThreePoints(pointOne: Point2D, pointTwo: Point2D, pointThree: Point2D): Circle2D = js.native
  /**
  * Gets all of the data defining the circle.
  */
  def getData(/* out */ center: Point2D, /* out */ radius: double): Boolean = js.native
  /**
  * Gets and sets the radius of the circle.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the circle.
  */
  def set(center: Point2D, radius: double): Boolean = js.native
}
// no utilities
