
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient object that represents a 2D bounding box. A 2D bounding box is a rectangle box that is parallel to the x and y axes. The box is defined by a minimum point (smallest x-y values) and maximum point (largest x-y values). This object is a wrapper for these points and serves as a way to pass bounding box information in and out of functions. It also provides some convenience function when working with the bounding box data. 
 */
@JSName("adsk.core.BoundingBox2D")
trait BoundingBox2D extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Determines if the specified point lies within the bounding box.
  */
  def contains(point: Point2D): Boolean = js.native
  /**
  * Create a copy of this bounding box.
  */
  def copy(): BoundingBox2D = js.native
  /**
  * Creates a transient bounding box object.
  */
  def create(minPoint: Point2D, maxPoint: Point2D): BoundingBox2D = js.native
  /**
  * Expand this bounding box to contain the specified point.
  */
  def expand(point: Point2D): Boolean = js.native
  /**
  * Test if this bounding box intersects with the specified bounding box.
  */
  def intersects(boundingBox: BoundingBox2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the maximum point of the box.
  */
  var maxPoint: Point2D = js.native
  /**
  * Gets and sets the minimum point of the box.
  */
  var minPoint: Point2D = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Transient object that represents a 2D bounding box. A 2D bounding box is a rectangle box that is parallel to the x and y axes. The box is defined by a minimum point (smallest x-y values) and maximum point (largest x-y values). This object is a wrapper for these points and serves as a way to pass bounding box information in and out of functions. It also provides some convenience function when working with the bounding box data. 
 */
@JSName("adsk.core.BoundingBox2D")
object BoundingBox2D extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Determines if the specified point lies within the bounding box.
  */
  def contains(point: Point2D): Boolean = js.native
  /**
  * Create a copy of this bounding box.
  */
  def copy(): BoundingBox2D = js.native
  /**
  * Creates a transient bounding box object.
  */
  def create(minPoint: Point2D, maxPoint: Point2D): BoundingBox2D = js.native
  /**
  * Expand this bounding box to contain the specified point.
  */
  def expand(point: Point2D): Boolean = js.native
  /**
  * Test if this bounding box intersects with the specified bounding box.
  */
  def intersects(boundingBox: BoundingBox2D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the maximum point of the box.
  */
  var maxPoint: Point2D = js.native
  /**
  * Gets and sets the minimum point of the box.
  */
  var minPoint: Point2D = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
