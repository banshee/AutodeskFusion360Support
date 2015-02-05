
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D arc. A transient arc is not displayed or saved in a document. Transient arcs are used as a wrapper to work with raw 2D arc information. 
 */
@JSName("adsk.core.Arc2D")
class Arc2D extends Curve2D {
  /**
  * Returns a NURBS curve that is geometrically identical to the arc.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the arc.
  */
  var center: Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns an independent copy of this Arc2D object.
  */
  def copy(): Arc2D = js.native
  /**
  * Creates a transient 2D arc object specifying the center, radius and start and end angles. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByCenter(center: Point2D, radius: double, startAngle: double, endAngle: double): Arc2D = js.native
  /**
  * Creates a transient 2D arc object specifying the center, radius and start and end angles. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByCenter(center: Point2D, radius: double, startAngle: double, endAngle: double, /* optional */ isClockwise: Boolean): Arc2D = js.native
  /**
  * Creates a transient 2D arc by specifying 3 points. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByThreePoints(startPoint: Point2D, point: Point2D, endPoint: Point2D): Arc2D = js.native

  /**
  * Gets and sets the end angle of the arc in radians, where 0 is along the x axis.
  */
  var endAngle: double = js.native
  /**
  * Gets the position of the end point of the arc.
  */
  val endPoint: Point2D = js.native

  /**
  * Gets all of the data defining the arc.
  */
  def getData(/* out */ center: Point2D, /* out */ radius: double, /* out */ startAngle: double, /* out */ endAngle: double, /* out */ isClockwise: Boolean): Boolean = js.native
  /**
  * Specifies if the sweep direction of the arc is clockwise or counterclockwise.
  */
  val isClockwise: Boolean = js.native


  /**
  * Gets and sets the radius of the arc.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the arc.
  */
  def set(center: Point2D, radius: double, startAngle: double, endAngle: double, isClockwise: Boolean): Boolean = js.native
  /**
  * Gets and sets the start angle of the arc in radians, where 0 is along the x axis.
  */
  var startAngle: double = js.native
  /**
  * Gets the position of the start point of the arc.
  */
  val startPoint: Point2D = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D arc. A transient arc is not displayed or saved in a document. Transient arcs are used as a wrapper to work with raw 2D arc information. 
 */
@JSName("adsk.core.Arc2D")
object Arc2D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the arc.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the arc.
  */
  var center: Point2D = js.native
  /**
  * Creates and returns an independent copy of this Arc2D object.
  */
  def copy(): Arc2D = js.native
  /**
  * Creates a transient 2D arc object specifying the center, radius and start and end angles. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByCenter(center: Point2D, radius: double, startAngle: double, endAngle: double): Arc2D = js.native
  /**
  * Creates a transient 2D arc object specifying the center, radius and start and end angles. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByCenter(center: Point2D, radius: double, startAngle: double, endAngle: double, /* optional */ isClockwise: Boolean): Arc2D = js.native
  /**
  * Creates a transient 2D arc by specifying 3 points. A transient arc is not displayed or saved in a document. Transient arcs arcs are used as a wrapper to work with raw 2D arc information.
  */
  def createByThreePoints(startPoint: Point2D, point: Point2D, endPoint: Point2D): Arc2D = js.native
  /**
  * Gets and sets the end angle of the arc in radians, where 0 is along the x axis.
  */
  var endAngle: double = js.native
  /**
  * Gets the position of the end point of the arc.
  */
  val endPoint: Point2D = js.native
  /**
  * Gets all of the data defining the arc.
  */
  def getData(/* out */ center: Point2D, /* out */ radius: double, /* out */ startAngle: double, /* out */ endAngle: double, /* out */ isClockwise: Boolean): Boolean = js.native
  /**
  * Specifies if the sweep direction of the arc is clockwise or counterclockwise.
  */
  val isClockwise: Boolean = js.native
  /**
  * Gets and sets the radius of the arc.
  */
  var radius: double = js.native
  /**
  * Sets all of the data defining the arc.
  */
  def set(center: Point2D, radius: double, startAngle: double, endAngle: double, isClockwise: Boolean): Boolean = js.native
  /**
  * Gets and sets the start angle of the arc in radians, where 0 is along the x axis.
  */
  var startAngle: double = js.native
  /**
  * Gets the position of the start point of the arc.
  */
  val startPoint: Point2D = js.native
}

  object Arc2DUtilities {
    // no toSeq
/**
* Gets all of the data defining the arc.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Arc2D): (Boolean, Point2D, double, double, double, boolean) = {

val center = js.Dynamic.literal(value = 0)
val radius = js.Dynamic.literal(value = 0)
val startAngle = js.Dynamic.literal(value = 0)
val endAngle = js.Dynamic.literal(value = 0)
val isClockwise = js.Dynamic.literal(value = 0)
val result = activeObject.getData(center.asInstanceOf[Point2D], radius.asInstanceOf[double], startAngle.asInstanceOf[double], endAngle.asInstanceOf[double], isClockwise.asInstanceOf[Boolean])
(result, center.value.asInstanceOf[Point2D], radius.value.asInstanceOf[double], startAngle.value.asInstanceOf[double], endAngle.value.asInstanceOf[double], isClockwise.value.asInstanceOf[boolean])
}
  }
       
