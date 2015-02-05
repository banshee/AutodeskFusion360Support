
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection of the dimensions in a sketch. This object also supports the methods to add new sketch dimensions. 
 */
@JSName("adsk.fusion.SketchDimensions")
class SketchDimensions extends Base {
  /**
  * Creates a new angular dimension constraint between the two input lines. The position of the text controls which of the four quadrants will be dimensioned.
  */
  def addAngularDimension(lineOne: SketchLine, lineTwo: SketchLine, textPoint: Point3D): SketchAngularDimension = js.native
  /**
  * Creates a new dimension constraint between to concentric circles or arcs.
  */
  def addConcentricCircleDimension(circleOne: SketchCurve, circleTwo: SketchCurve, textPoint: Point3D): SketchConcentricCircleDimension = js.native
  /**
  * Creates a new diameter dimension constraint on the arc or circle.
  */
  def addDiameterDimension(entity: SketchCurve, textPoint: Point3D): SketchDiameterDimension = js.native
  /**
  * Creates a new linear dimension constraint between the two input entities.
  */
  def addDistanceDimension(pointOne: SketchPoint, pointTwo: SketchPoint, orientation: DimensionOrientations, textPoint: Point3D): SketchLinearDimension = js.native
  /**
  * Creates a new dimension constraint on the major radius of an ellipse.
  */
  def addEllipseMajorRadiusDimension(ellipse: SketchCurve, textPoint: Point3D): SketchEllipseMajorRadiusDimension = js.native
  /**
  * Creates a new dimension constraint on the minor radius of an ellipse.
  */
  def addEllipseMinorRadiusDimension(ellipse: SketchCurve, textPoint: Point3D): SketchEllipseMinorRadiusDimension = js.native
  /**
  * Creates a new linear dimension constraint between the two input entities. The first input entity must be a sketch line. The second entity can be a point or a line that is parallel to the first. The dimension controls the distance as measured perpendicular to the first input line.
  */
  def addOffsetDimension(line: SketchLine, entityTwo: SketchEntity, textPoint: Point3D): SketchOffsetDimension = js.native
  /**
  * Creates a new radial dimension constraint on the arc or circle.
  */
  def addRadialDimension(entity: SketchCurve, textPoint: Point3D): SketchRadialDimension = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch dimensions in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch dimension using an index into the collection.
  */
  def item(index: uinteger): SketchDimension = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection of the dimensions in a sketch. This object also supports the methods to add new sketch dimensions. 
 */
@JSName("adsk.fusion.SketchDimensions")
object SketchDimensions extends js.Object {
  /**
  * Creates a new angular dimension constraint between the two input lines. The position of the text controls which of the four quadrants will be dimensioned.
  */
  def addAngularDimension(lineOne: SketchLine, lineTwo: SketchLine, textPoint: Point3D): SketchAngularDimension = js.native
  /**
  * Creates a new dimension constraint between to concentric circles or arcs.
  */
  def addConcentricCircleDimension(circleOne: SketchCurve, circleTwo: SketchCurve, textPoint: Point3D): SketchConcentricCircleDimension = js.native
  /**
  * Creates a new diameter dimension constraint on the arc or circle.
  */
  def addDiameterDimension(entity: SketchCurve, textPoint: Point3D): SketchDiameterDimension = js.native
  /**
  * Creates a new linear dimension constraint between the two input entities.
  */
  def addDistanceDimension(pointOne: SketchPoint, pointTwo: SketchPoint, orientation: DimensionOrientations, textPoint: Point3D): SketchLinearDimension = js.native
  /**
  * Creates a new dimension constraint on the major radius of an ellipse.
  */
  def addEllipseMajorRadiusDimension(ellipse: SketchCurve, textPoint: Point3D): SketchEllipseMajorRadiusDimension = js.native
  /**
  * Creates a new dimension constraint on the minor radius of an ellipse.
  */
  def addEllipseMinorRadiusDimension(ellipse: SketchCurve, textPoint: Point3D): SketchEllipseMinorRadiusDimension = js.native
  /**
  * Creates a new linear dimension constraint between the two input entities. The first input entity must be a sketch line. The second entity can be a point or a line that is parallel to the first. The dimension controls the distance as measured perpendicular to the first input line.
  */
  def addOffsetDimension(line: SketchLine, entityTwo: SketchEntity, textPoint: Point3D): SketchOffsetDimension = js.native
  /**
  * Creates a new radial dimension constraint on the arc or circle.
  */
  def addRadialDimension(entity: SketchCurve, textPoint: Point3D): SketchRadialDimension = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch dimensions in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch dimension using an index into the collection.
  */
  def item(index: uinteger): SketchDimension = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchDimensionsUtilities {
    
    def toSeq(xs: SketchDimensions): IndexedSeq[SketchDimension] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
