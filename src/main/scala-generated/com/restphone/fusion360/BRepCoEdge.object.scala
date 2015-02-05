
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents the use of a BRepEdge by a BRepFace. 
 */
@JSName("adsk.fusion.BRepCoEdge")
class BRepCoEdge extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepCoEdge object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the body this co-edge is part of.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepCoEdge = js.native
  /**
  * Returns the edge this co-edge is associated with.
  */
  val edge: BRepEdge = js.native
  /**
  * Returns a curve evaluator that can be used to perform geometric evaluations on the co-edge.
  */
  val evaluator: CurveEvaluator2D = js.native
  /**
  * Returns a geometry object that represents the shape of this co-edge in parameter space of the parent face's surface.
  */
  val geometry: Curve2D = js.native
  /**
  * Indicates if the orientation of this co-edge is in the same direction or opposed to its associated edge.
  */
  val isOpposedToEdge: Boolean = js.native
  /**
  * Returns if the parametric direction of this co-edge is reversed from the parametric direction of the underlying curve obtained from the geometry property. A co-edge's parametric direction is from the start vertex to the end vertex. But the underlying curve geometry may have the opposite parameterization. This property indicates if the parameterization order of the evaluator obtained from this co-edge is reversed from the order of the geometry curve's evaluator.
  */
  val isParamReversed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the loop this co-edge is part of.
  */
  val loop: BRepLoop = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepCoEdge = js.native
  /**
  * Returns the next co-edge in the loop.
  */
  val next: BRepCoEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the co-edge on the adjacent face
  */
  val partner: BRepCoEdge = js.native
  /**
  * Returns the previous co-edge in the loop.
  */
  val previous: BRepCoEdge = js.native
}
/** 
  * Represents the use of a BRepEdge by a BRepFace. 
 */
@JSName("adsk.fusion.BRepCoEdge")
object BRepCoEdge extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepCoEdge object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the body this co-edge is part of.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepCoEdge = js.native
  /**
  * Returns the edge this co-edge is associated with.
  */
  val edge: BRepEdge = js.native
  /**
  * Returns a curve evaluator that can be used to perform geometric evaluations on the co-edge.
  */
  val evaluator: CurveEvaluator2D = js.native
  /**
  * Returns a geometry object that represents the shape of this co-edge in parameter space of the parent face's surface.
  */
  val geometry: Curve2D = js.native
  /**
  * Indicates if the orientation of this co-edge is in the same direction or opposed to its associated edge.
  */
  val isOpposedToEdge: Boolean = js.native
  /**
  * Returns if the parametric direction of this co-edge is reversed from the parametric direction of the underlying curve obtained from the geometry property. A co-edge's parametric direction is from the start vertex to the end vertex. But the underlying curve geometry may have the opposite parameterization. This property indicates if the parameterization order of the evaluator obtained from this co-edge is reversed from the order of the geometry curve's evaluator.
  */
  val isParamReversed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the loop this co-edge is part of.
  */
  val loop: BRepLoop = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepCoEdge = js.native
  /**
  * Returns the next co-edge in the loop.
  */
  val next: BRepCoEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the co-edge on the adjacent face
  */
  val partner: BRepCoEdge = js.native
  /**
  * Returns the previous co-edge in the loop.
  */
  val previous: BRepCoEdge = js.native
}

  object BRepCoEdgeUtilities {
    // no toSeq

  }
       
