
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._

/**
 * A collection of sketch curves in a sketch. This also provides access to collections for the specific types of curves where you can get the curves based on type and create new curves.
 */
@JSName("adsk.fusion.SketchCurves")
trait SketchCurves extends Base {
  /**
   * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
   */
  def classType(): String = js.native

  /**
   * Returns the number of sketch curves in the sketch.
   */
  val count: uinteger = js.native
  /**
   * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
   */
  val isValid: Boolean = js.native

  /**
   * Function that returns the specified sketch curve using an index into the collection.
   */
  def item(index: uinteger): SketchCurve = js.native

  /**
   * Returns a string indicating the type of the object.
   */
  val objectType: String = js.native
  /**
   * Returns the sketch arcs collection associated with this sketch. This provides access to the existing sketch arcs and supports the creation of new sketch arcs.
   */
  val sketchArcs: SketchArcs = js.native
  /**
   * Returns the sketch circles collection associated with this sketch. This provides access to the existing sketch circles and supports the creation of new sketch circles.
   */
  val sketchCircles: SketchCircles = js.native
  /**
   * Returns the conic curves collection associated with this sketch.
   *
   * This provides access to the existing conic curves and
   * support the creation of new conic curves.
   */
  val sketchConicCurves: SketchConicCurves = js.native
  /**
   * Returns the sketch ellipses collection associated with this sketch. This provides access to the existing sketch ellipses and supports the creation of new sketch ellipses.
   */
  val sketchEllipses: SketchEllipses = js.native
  /**
   * Returns the sketch elliptical arcs collection associated with this sketch. This provides access to the existing sketch elliptical arcs and supports the creation of new sketch elliptical arcs.
   */
  val sketchEllipticalArcs: SketchEllipticalArcs = js.native
  /**
   * Returns the sketch splines collection associated with this sketch. This provides access to the existing sketch splines and supports the creation of new sketch splines.
   */
  val sketchFittedSplines: SketchFittedSplines = js.native
  /**
   * Returns the fixed sketch splines collection associated with this sketch. This provides access to the existing fixed sketch splines and supports the creation of new fixed sketch splines.
   */
  val sketchFixedSplines: SketchFixedSplines = js.native
  /**
   * Returns the sketch lines collection associated with this sketch. This provides access to the existing sketch lines and supports the creation of new sketch lines.
   */
  val sketchLines: SketchLines = js.native
}

/**
 * A collection of sketch curves in a sketch. This also provides access to collections for the specific types of curves where you can get the curves based on type and create new curves.
 */
@JSName("adsk.fusion.SketchCurves")
object SketchCurves extends js.Object {
  /**
   * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
   */
  def classType(): String = js.native

  /**
   * Returns the number of sketch curves in the sketch.
   */
  val count: uinteger = js.native
  /**
   * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
   */
  val isValid: Boolean = js.native

  /**
   * Function that returns the specified sketch curve using an index into the collection.
   */
  def item(index: uinteger): SketchCurve = js.native

  /**
   * Returns a string indicating the type of the object.
   */
  val objectType: String = js.native
  /**
   * Returns the sketch arcs collection associated with this sketch. This provides access to the existing sketch arcs and supports the creation of new sketch arcs.
   */
  val sketchArcs: SketchArcs = js.native
  /**
   * Returns the sketch circles collection associated with this sketch. This provides access to the existing sketch circles and supports the creation of new sketch circles.
   */
  val sketchCircles: SketchCircles = js.native
  /**
   * Returns the conic curves collection associated with this sketch. This provides access to the existing conic curves and support the creation of new conic curves.
   */
  val sketchConicCurves: SketchConicCurves = js.native
  /**
   * Returns the sketch ellipses collection associated with this sketch. This provides access to the existing sketch ellipses and supports the creation of new sketch ellipses.
   */
  val sketchEllipses: SketchEllipses = js.native
  /**
   * Returns the sketch elliptical arcs collection associated with this sketch. This provides access to the existing sketch elliptical arcs and supports the creation of new sketch elliptical arcs.
   */
  val sketchEllipticalArcs: SketchEllipticalArcs = js.native
  /**
   * Returns the sketch splines collection associated with this sketch. This provides access to the existing sketch splines and supports the creation of new sketch splines.
   */
  val sketchFittedSplines: SketchFittedSplines = js.native
  /**
   * Returns the fixed sketch splines collection associated with this sketch. This provides access to the existing fixed sketch splines and supports the creation of new fixed sketch splines.
   */
  val sketchFixedSplines: SketchFixedSplines = js.native
  /**
   * Returns the sketch lines collection associated with this sketch. This provides access to the existing sketch lines and supports the creation of new sketch lines.
   */
  val sketchLines: SketchLines = js.native
}

object SketchCurvesUtilities {
  def toSeq(xs: SketchCurves): IndexedSeq[SketchCurve] = {
    val n = xs.count - 1
    (0 to n) map {xs.item(_)}
  }
}
           
