
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A point within a sketch. 
 */
@JSName("adsk.fusion.SketchPoint")
trait SketchPoint extends SketchEntity {


  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchPoint = js.native
  /**
  * Deletes the entity from the sketch.
  */
  override def deleteMe(): Boolean = js.native

  /**
  * Returns a Point3D object which provides the position of the sketch point. The returned geometry is always in sketch space.
  */
  val geometry: Point3D = js.native





  /**
  * Merges the input sketch point into this sketch point. This effectively deletes the other sketch point and changes all entities that referenced that sketch point to reference this sketch point. This is the equivalent of dragging a sketch point on top of another sketch point in the user interface.
  */
  def merge(point: SketchPoint): Boolean = js.native
  /**
  * Moves the sketch geometry using the specified transform. Move respects any constraints that would normally prohibit the move. This will fail in the case where the IsReference property is true.
  */
  def move(translation: Vector3D): Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchPoint = js.native




  /**
  * Returns a Point3D object which provides the position of the sketch point in world space. The returned coordinate takes into account the assembly context and the position of the sketch in it's parent component, which means the coordinate will be returned in the root component space.
  */
  val worldGeometry: Point3D = js.native
}
/** 
  * A point within a sketch. 
 */
@JSName("adsk.fusion.SketchPoint")
object SketchPoint extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SketchPoint = js.native
  /**
  * Returns a Point3D object which provides the position of the sketch point. The returned geometry is always in sketch space.
  */
  val geometry: Point3D = js.native
  /**
  * Merges the input sketch point into this sketch point. This effectively deletes the other sketch point and changes all entities that referenced that sketch point to reference this sketch point. This is the equivalent of dragging a sketch point on top of another sketch point in the user interface.
  */
  def merge(point: SketchPoint): Boolean = js.native
  /**
  * Moves the sketch geometry using the specified transform. Move respects any constraints that would normally prohibit the move. This will fail in the case where the IsReference property is true.
  */
  def move(translation: Vector3D): Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SketchPoint = js.native
  /**
  * Returns a Point3D object which provides the position of the sketch point in world space. The returned coordinate takes into account the assembly context and the position of the sketch in it's parent component, which means the coordinate will be returned in the root component space.
  */
  val worldGeometry: Point3D = js.native
}
// no utilities
