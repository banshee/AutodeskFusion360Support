
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D line. A transient line is not displayed or saved in a document. Transient 2D lines are used as a wrapper to work with raw 2D line information. 
 */
@JSName("adsk.core.Line2D")
class Line2D extends Curve2D {
  /**
  * Returns a NURBS curve that is geometrically identical to the line.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): Line2D = js.native
  /**
  * Creates a transient line.
  */
  def create(startPoint: Point2D, endPoint: Point2D): Line2D = js.native

  /**
  * Gets and sets the end point of the line.
  */
  var endPoint: Point2D = js.native

  /**
  * Gets all of the data defining the line segment.
  */
  def getData(/* out */ startPoint: Point2D, /* out */ endPoint: Point2D): Boolean = js.native


  /**
  * Sets all of the data defining the line segment.
  */
  def set(startPoint: Point2D, endPoint: Point2D): Boolean = js.native
  /**
  * Gets and sets the start point of the line.
  */
  var startPoint: Point2D = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D line. A transient line is not displayed or saved in a document. Transient 2D lines are used as a wrapper to work with raw 2D line information. 
 */
@JSName("adsk.core.Line2D")
object Line2D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the line.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Creates and returns a copy of this line object.
  */
  def copy(): Line2D = js.native
  /**
  * Creates a transient line.
  */
  def create(startPoint: Point2D, endPoint: Point2D): Line2D = js.native
  /**
  * Gets and sets the end point of the line.
  */
  var endPoint: Point2D = js.native
  /**
  * Gets all of the data defining the line segment.
  */
  def getData(/* out */ startPoint: Point2D, /* out */ endPoint: Point2D): Boolean = js.native
  /**
  * Sets all of the data defining the line segment.
  */
  def set(startPoint: Point2D, endPoint: Point2D): Boolean = js.native
  /**
  * Gets and sets the start point of the line.
  */
  var startPoint: Point2D = js.native
}

  object Line2DUtilities {
    // no toSeq
/**
* Gets all of the data defining the line segment.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Line2D): (Boolean, Point2D, Point2D) = {

val startPoint = js.Dynamic.literal(value = 0)
val endPoint = js.Dynamic.literal(value = 0)
val result = activeObject.getData(startPoint.asInstanceOf[Point2D], endPoint.asInstanceOf[Point2D])
(result, startPoint.value.asInstanceOf[Point2D], endPoint.value.asInstanceOf[Point2D])
}
  }
       
