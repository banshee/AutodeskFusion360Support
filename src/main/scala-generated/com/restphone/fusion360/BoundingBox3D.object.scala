
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient object that represents a 3D bounding box. It defines a rectangular box whose sides are parallel to the model space x, y, and z planes. Because of the fixed orientation of the box it can be fully defined by two points at opposing corners; the min and max points. This object is usually used to provide a rough approximation of the volume in space that an entity occupies. It also provides some convenience function when working with the bounding box data. 
 */
@JSName("adsk.core.BoundingBox3D")
class BoundingBox3D extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Determines if the specified point is within the bound box.
  */
  def contains(point: Point3D): Boolean = js.native
  /**
  * Creates an independent copy of this bounding box.
  */
  def copy(): BoundingBox3D = js.native
  /**
  * Creates a transient bounding box object.
  */
  def create(minPoint: Point3D, maxPoint: Point3D): BoundingBox3D = js.native
  /**
  * Expands the size of bounding box to include the specified point.
  */
  def expand(point: Point3D): Boolean = js.native
  /**
  * Determines if the two bounding boxes intersect.
  */
  def intersects(boundingBox: BoundingBox3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the maximum point corner of the box.
  */
  var maxPoint: Point3D = js.native
  /**
  * Gets and sets the minimum point corner of the box.
  */
  var minPoint: Point3D = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Transient object that represents a 3D bounding box. It defines a rectangular box whose sides are parallel to the model space x, y, and z planes. Because of the fixed orientation of the box it can be fully defined by two points at opposing corners; the min and max points. This object is usually used to provide a rough approximation of the volume in space that an entity occupies. It also provides some convenience function when working with the bounding box data. 
 */
@JSName("adsk.core.BoundingBox3D")
object BoundingBox3D extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Determines if the specified point is within the bound box.
  */
  def contains(point: Point3D): Boolean = js.native
  /**
  * Creates an independent copy of this bounding box.
  */
  def copy(): BoundingBox3D = js.native
  /**
  * Creates a transient bounding box object.
  */
  def create(minPoint: Point3D, maxPoint: Point3D): BoundingBox3D = js.native
  /**
  * Expands the size of bounding box to include the specified point.
  */
  def expand(point: Point3D): Boolean = js.native
  /**
  * Determines if the two bounding boxes intersect.
  */
  def intersects(boundingBox: BoundingBox3D): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the maximum point corner of the box.
  */
  var maxPoint: Point3D = js.native
  /**
  * Gets and sets the minimum point corner of the box.
  */
  var minPoint: Point3D = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BoundingBox3DUtilities {
    // no toSeq

  }
       
