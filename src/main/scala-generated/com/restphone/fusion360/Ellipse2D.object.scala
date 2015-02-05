
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient 2D ellipse. A transient ellipse is not displayed or saved in a document. Transient 2D ellipses are used as a wrapper to work with raw 2D ellipse information. 
 */
@JSName("adsk.core.Ellipse2D")
class Ellipse2D extends Curve2D {
  /**
  * Returns a NURBS curve that is geometrically identical to the ellipse.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the ellipse.
  */
  var center: Point2D = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates and returns a copy of this Ellipse2D object.
  */
  def copy(): Ellipse2D = js.native
  /**
  * Creates a transient 2D ellipse by specifying a center position, major and minor axes, and major and minor radii.
  */
  def create(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double): Ellipse2D = js.native


  /**
  * Gets all of the data defining the ellipse.
  */
  def getData(/* out */ center: Point2D, /* out */ majorAxis: Vector2D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native

  /**
  * Gets and sets the major axis of the ellipse.
  */
  var majorAxis: Vector2D = js.native
  /**
  * Gets and sets the major radius of the ellipse.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse.
  */
  var minorRadius: double = js.native

  /**
  * Sets all of the data defining the ellipse.
  */
  def set(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double): Boolean = js.native
  /**
  * Transforms this curve in 2D space.
  */
  override def transformBy(matrix: Matrix2D): Boolean = js.native
}
/** 
  * Transient 2D ellipse. A transient ellipse is not displayed or saved in a document. Transient 2D ellipses are used as a wrapper to work with raw 2D ellipse information. 
 */
@JSName("adsk.core.Ellipse2D")
object Ellipse2D extends js.Object {
  /**
  * Returns a NURBS curve that is geometrically identical to the ellipse.
  */
  val asNurbsCurve: NurbsCurve2D = js.native
  /**
  * Gets and sets the center position of the ellipse.
  */
  var center: Point2D = js.native
  /**
  * Creates and returns a copy of this Ellipse2D object.
  */
  def copy(): Ellipse2D = js.native
  /**
  * Creates a transient 2D ellipse by specifying a center position, major and minor axes, and major and minor radii.
  */
  def create(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double): Ellipse2D = js.native
  /**
  * Gets all of the data defining the ellipse.
  */
  def getData(/* out */ center: Point2D, /* out */ majorAxis: Vector2D, /* out */ majorRadius: double, /* out */ minorRadius: double): Boolean = js.native
  /**
  * Gets and sets the major axis of the ellipse.
  */
  var majorAxis: Vector2D = js.native
  /**
  * Gets and sets the major radius of the ellipse.
  */
  var majorRadius: double = js.native
  /**
  * Gets and sets the minor radius of the ellipse.
  */
  var minorRadius: double = js.native
  /**
  * Sets all of the data defining the ellipse.
  */
  def set(center: Point2D, majorAxis: Vector2D, majorRadius: double, minorRadius: double): Boolean = js.native
}

  object Ellipse2DUtilities {
    // no toSeq
/**
* Gets all of the data defining the ellipse.
*
* Out parameters are returned in a tuple.
*/
def getDataWithResults(activeObject: Ellipse2D): (Boolean, Point2D, Vector2D, double, double) = {

val center = js.Dynamic.literal(value = 0)
val majorAxis = js.Dynamic.literal(value = 0)
val majorRadius = js.Dynamic.literal(value = 0)
val minorRadius = js.Dynamic.literal(value = 0)
val result = activeObject.getData(center.asInstanceOf[Point2D], majorAxis.asInstanceOf[Vector2D], majorRadius.asInstanceOf[double], minorRadius.asInstanceOf[double])
(result, center.value.asInstanceOf[Point2D], majorAxis.value.asInstanceOf[Vector2D], majorRadius.value.asInstanceOf[double], minorRadius.value.asInstanceOf[double])
}
  }
       
