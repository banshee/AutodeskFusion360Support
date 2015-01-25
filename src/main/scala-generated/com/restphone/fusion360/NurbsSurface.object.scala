
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Transient NURBS surface. A transient NURBS surface is not displayed or saved in a document. A transient NURBS surface is used as a wrapper to work with raw NURBS surface information. A transient NURBS surface is bounded by it's natural boundaries and does not support the definition of arbitrary boundaries. A NURBS surface is typically obtained from a BREPFace object, which does have boundary information. 
 */
@JSName("adsk.core.NurbsSurface")
trait NurbsSurface extends Surface {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets the number of control points in the U direction.
  */
  val controlPointCountU: Integer = js.native
  /**
  * Gets the number of control points in the V direction.
  */
  val controlPointCountV: Integer = js.native
  /**
  * Gets an array of control points from the surface.
  */
  val controlPoints: Point3D = js.native
  /**
  * Creates and returns an independent copy of this NurbsSurface object.
  */
  def copy(): NurbsSurface = js.native
  /**
  * Creates a transient NURBS surface object.
  */
  def create(degreeU: Integer, degreeV: Integer, controlPointCountU: Integer, controlPointCountV: Integer, controlPoints: Array[Point3D], knotsU: Array[Double], knotsV: Array[Double], weights: Array[Double], propertiesU: NurbsSurfaceProperties, propertiesV: NurbsSurfaceProperties): NurbsSurface = js.native
  /**
  * Gets the degree in the U direction.
  */
  val degreeU: Integer = js.native
  /**
  * Gets the degree in the V direction.
  */
  val degreeV: Integer = js.native

  /**
  * Gets the data that defines the NURBS surface.
  */
  def getData(/* out */ degreeU: Integer, /* out */ degreeV: Integer, /* out */ controlPointCountU: Integer, /* out */ controlPointCountV: Integer, /* out */ controlPoints: Array[Point3D], /* out */ knotsU: Array[Double], /* out */ knotsV: Array[Double], /* out */ weights: Array[Double], /* out */ propertiesU: NurbsSurfaceProperties, /* out */ propertiesV: NurbsSurfaceProperties): Boolean = js.native

  /**
  * Gets the knot count in the U direction.
  */
  val knotCountU: Integer = js.native
  /**
  * Gets thekKnot count in the V direction.
  */
  val knotCountV: Integer = js.native
  /**
  * Get the knot vector from the U direction.
  */
  val knotsU: Double = js.native
  /**
  * Get the knot vector from the V direction
  */
  val knotsV: Double = js.native

  /**
  * Gets the properties (NurbsSurfaceProperties) of the surface in the U direction.
  */
  val propertiesU: NurbsSurfaceProperties = js.native
  /**
  * Gets the properties (NurbsSurfaceProperties) of the surface in the V direction.
  */
  val propertiesV: NurbsSurfaceProperties = js.native
  /**
  * Sets the data that defines the NURBS surface.
  */
  def set(degreeU: Integer, degreeV: Integer, controlPointCountU: Integer, controlPointCountV: Integer, controlPoints: Array[Point3D], knotsU: Array[Double], knotsV: Array[Double], weights: Array[Double], propertiesU: NurbsSurfaceProperties, propertiesV: NurbsSurfaceProperties): Boolean = js.native

  /**
  * Updates this surface by transforming it with a given input matrix.
  */
  override def transformBy(matrix: Matrix3D): Boolean = js.native
}
/** 
  * Transient NURBS surface. A transient NURBS surface is not displayed or saved in a document. A transient NURBS surface is used as a wrapper to work with raw NURBS surface information. A transient NURBS surface is bounded by it's natural boundaries and does not support the definition of arbitrary boundaries. A NURBS surface is typically obtained from a BREPFace object, which does have boundary information. 
 */
@JSName("adsk.core.NurbsSurface")
object NurbsSurface extends js.Object {
  /**
  * Gets the number of control points in the U direction.
  */
  val controlPointCountU: Integer = js.native
  /**
  * Gets the number of control points in the V direction.
  */
  val controlPointCountV: Integer = js.native
  /**
  * Gets an array of control points from the surface.
  */
  val controlPoints: Point3D = js.native
  /**
  * Creates and returns an independent copy of this NurbsSurface object.
  */
  def copy(): NurbsSurface = js.native
  /**
  * Creates a transient NURBS surface object.
  */
  def create(degreeU: Integer, degreeV: Integer, controlPointCountU: Integer, controlPointCountV: Integer, controlPoints: Array[Point3D], knotsU: Array[Double], knotsV: Array[Double], weights: Array[Double], propertiesU: NurbsSurfaceProperties, propertiesV: NurbsSurfaceProperties): NurbsSurface = js.native
  /**
  * Gets the degree in the U direction.
  */
  val degreeU: Integer = js.native
  /**
  * Gets the degree in the V direction.
  */
  val degreeV: Integer = js.native
  /**
  * Gets the data that defines the NURBS surface.
  */
  def getData(/* out */ degreeU: Integer, /* out */ degreeV: Integer, /* out */ controlPointCountU: Integer, /* out */ controlPointCountV: Integer, /* out */ controlPoints: Array[Point3D], /* out */ knotsU: Array[Double], /* out */ knotsV: Array[Double], /* out */ weights: Array[Double], /* out */ propertiesU: NurbsSurfaceProperties, /* out */ propertiesV: NurbsSurfaceProperties): Boolean = js.native
  /**
  * Gets the knot count in the U direction.
  */
  val knotCountU: Integer = js.native
  /**
  * Gets thekKnot count in the V direction.
  */
  val knotCountV: Integer = js.native
  /**
  * Get the knot vector from the U direction.
  */
  val knotsU: Double = js.native
  /**
  * Get the knot vector from the V direction
  */
  val knotsV: Double = js.native
  /**
  * Gets the properties (NurbsSurfaceProperties) of the surface in the U direction.
  */
  val propertiesU: NurbsSurfaceProperties = js.native
  /**
  * Gets the properties (NurbsSurfaceProperties) of the surface in the V direction.
  */
  val propertiesV: NurbsSurfaceProperties = js.native
  /**
  * Sets the data that defines the NURBS surface.
  */
  def set(degreeU: Integer, degreeV: Integer, controlPointCountU: Integer, controlPointCountV: Integer, controlPoints: Array[Point3D], knotsU: Array[Double], knotsV: Array[Double], weights: Array[Double], propertiesU: NurbsSurfaceProperties, propertiesV: NurbsSurfaceProperties): Boolean = js.native
}
// no utilities
