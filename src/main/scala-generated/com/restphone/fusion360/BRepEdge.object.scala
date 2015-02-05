
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a one-dimensional topological element that can be used to bound a BRepFace A BRepEdge uses a single, connected and bounded subset of a curve for it geometry. 
 */
@JSName("adsk.fusion.BRepEdge")
class BRepEdge extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepEdge object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the edge.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the BRepCoEdges on the edge.
  */
  val coEdges: BRepCoEdges = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepEdge = js.native
  /**
  * Returns the BRepVertex that bounds its high parameter end.
  */
  val endVertex: BRepVertex = js.native
  /**
  * Returns CurveEvaluator3D for evaluation.
  */
  val evaluator: CurveEvaluator3D = js.native
  /**
  * Returns the BRepFaces that are associated with this edge through its BRepCoEdges.
  */
  val faces: BRepFaces = js.native
  /**
  * Returns the underlying curve geometry of the edge.
  */
  val geometry: Curve3D = js.native
  /**
  * Returns if the edge's geometry is degenerate. For example, the apex of a cone is a degerate edge.
  */
  val isDegenerate: Boolean = js.native
  /**
  * Returns if the parametric direction of this edge is reversed from the parametric direction of the underlying curve obtained from the geometry property. An edge's parametric direction is from the start vertex to the end vertex. But the underlying curve geometry may have the opposite parameterization. This property indicates if the parameterization order of the evaluator obtained from this edge is reversed from the order of the geometry curve's evaluator.
  */
  val isParamReversed: Boolean = js.native
  /**
  * Returns if the edge is tolerant. The tolerance used is available from the tolerance property.
  */
  val isTolerant: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a sample point guaranteed to lie on the edge's curve, within its boundaries, and not on a vertex (unless this is a degenerate edge).
  */
  val pointOnEdge: Point3D = js.native
  /**
  * Returns the parent shell of the edge.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the BRepVertex that bounds its low parameter end.
  */
  val startVertex: BRepVertex = js.native
  /**
  * Returns a collection of edges that includes all of the edges tangentially connected to this edge. The result includes this edge. The edges are in the collection in their connected order.
  */
  val tangentiallyConnectedEdges: ObjectCollection = js.native
  /**
  * Returns the tolerance used by a tolerant edge. This value is only useful when isTolerant is true.
  */
  val tolerance: double = js.native
}
/** 
  * Represents a one-dimensional topological element that can be used to bound a BRepFace A BRepEdge uses a single, connected and bounded subset of a curve for it geometry. 
 */
@JSName("adsk.fusion.BRepEdge")
object BRepEdge extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this BRepEdge object is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly. but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns the parent body of the edge.
  */
  val body: BRepBody = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the BRepCoEdges on the edge.
  */
  val coEdges: BRepCoEdges = js.native
  /**
  * Returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): BRepEdge = js.native
  /**
  * Returns the BRepVertex that bounds its high parameter end.
  */
  val endVertex: BRepVertex = js.native
  /**
  * Returns CurveEvaluator3D for evaluation.
  */
  val evaluator: CurveEvaluator3D = js.native
  /**
  * Returns the BRepFaces that are associated with this edge through its BRepCoEdges.
  */
  val faces: BRepFaces = js.native
  /**
  * Returns the underlying curve geometry of the edge.
  */
  val geometry: Curve3D = js.native
  /**
  * Returns if the edge's geometry is degenerate. For example, the apex of a cone is a degerate edge.
  */
  val isDegenerate: Boolean = js.native
  /**
  * Returns if the parametric direction of this edge is reversed from the parametric direction of the underlying curve obtained from the geometry property. An edge's parametric direction is from the start vertex to the end vertex. But the underlying curve geometry may have the opposite parameterization. This property indicates if the parameterization order of the evaluator obtained from this edge is reversed from the order of the geometry curve's evaluator.
  */
  val isParamReversed: Boolean = js.native
  /**
  * Returns if the edge is tolerant. The tolerance used is available from the tolerance property.
  */
  val isTolerant: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: BRepEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns a sample point guaranteed to lie on the edge's curve, within its boundaries, and not on a vertex (unless this is a degenerate edge).
  */
  val pointOnEdge: Point3D = js.native
  /**
  * Returns the parent shell of the edge.
  */
  val shell: BRepShell = js.native
  /**
  * Returns the BRepVertex that bounds its low parameter end.
  */
  val startVertex: BRepVertex = js.native
  /**
  * Returns a collection of edges that includes all of the edges tangentially connected to this edge. The result includes this edge. The edges are in the collection in their connected order.
  */
  val tangentiallyConnectedEdges: ObjectCollection = js.native
  /**
  * Returns the tolerance used by a tolerant edge. This value is only useful when isTolerant is true.
  */
  val tolerance: double = js.native
}

  object BRepEdgeUtilities {
    // no toSeq

  }
       
