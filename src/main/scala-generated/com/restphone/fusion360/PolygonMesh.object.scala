
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The PolygonMesh represents a mesh that can contain any combination of polygons, quads, and triangles. 
 */
@JSName("adsk.fusion.PolygonMesh")
trait PolygonMesh extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the node coordinates as an array of Point3D objects.
  */
  val nodeCoordinates: Point3D = js.native
  /**
  * Returns the node coordinates as an array of doubles.
  */
  val nodeCoordinatesAsDouble: Double = js.native
  /**
  * Returns the node coordinates as an array of floats.
  */
  val nodeCoordinatesAsFloat: Single = js.native
  /**
  * Returns the number of nodes in the mesh.
  */
  val nodeCount: Integer = js.native
  /**
  * Returns the number of nodes that define each polygon. For example, if NodeCountPerPolygon[0] returns 6 it indicates the first polygon is defined using 6 nodes. The first six indices returned by the PolygonNodeInices properties provide the look-up into the NodeCoordinates array.
  */
  val nodeCountPerPolygon: Int32 = js.native
  /**
  * Returns the normal vectors as an array of vectors. There is one normal vector for each index.
  */
  val normalVectors: Vector3D = js.native
  /**
  * Returns the normal vectors as an array of doubles. There is one normal vector for each index.
  */
  val normalVectorsAsDouble: Double = js.native
  /**
  * Returns the normal vectors as an array of floats. There is one normal vector for each index.
  */
  val normalVectorsAsFloat: Single = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the number of polygons (more than 4 sides) in the mesh.
  */
  val polygonCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the four coordinates of each polygon and the corresponding normal.
  */
  val polygonNodeIndices: Int32 = js.native
  /**
  * Returns the number of quads in the mesh.
  */
  val quadCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the four coordinates of each quad and the corresponding normal.
  */
  val quadNodeIndices: Int32 = js.native
  /**
  * Returns the number of triangles in the mesh.
  */
  val triangleCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the three coordinates of each triangle and the corresponding normal.
  */
  val triangleNodeIndices: Int32 = js.native
}
/** 
  * The PolygonMesh represents a mesh that can contain any combination of polygons, quads, and triangles. 
 */
@JSName("adsk.fusion.PolygonMesh")
object PolygonMesh extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the node coordinates as an array of Point3D objects.
  */
  val nodeCoordinates: Point3D = js.native
  /**
  * Returns the node coordinates as an array of doubles.
  */
  val nodeCoordinatesAsDouble: Double = js.native
  /**
  * Returns the node coordinates as an array of floats.
  */
  val nodeCoordinatesAsFloat: Single = js.native
  /**
  * Returns the number of nodes in the mesh.
  */
  val nodeCount: Integer = js.native
  /**
  * Returns the number of nodes that define each polygon. For example, if NodeCountPerPolygon[0] returns 6 it indicates the first polygon is defined using 6 nodes. The first six indices returned by the PolygonNodeInices properties provide the look-up into the NodeCoordinates array.
  */
  val nodeCountPerPolygon: Int32 = js.native
  /**
  * Returns the normal vectors as an array of vectors. There is one normal vector for each index.
  */
  val normalVectors: Vector3D = js.native
  /**
  * Returns the normal vectors as an array of doubles. There is one normal vector for each index.
  */
  val normalVectorsAsDouble: Double = js.native
  /**
  * Returns the normal vectors as an array of floats. There is one normal vector for each index.
  */
  val normalVectorsAsFloat: Single = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the number of polygons (more than 4 sides) in the mesh.
  */
  val polygonCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the four coordinates of each polygon and the corresponding normal.
  */
  val polygonNodeIndices: Int32 = js.native
  /**
  * Returns the number of quads in the mesh.
  */
  val quadCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the four coordinates of each quad and the corresponding normal.
  */
  val quadNodeIndices: Int32 = js.native
  /**
  * Returns the number of triangles in the mesh.
  */
  val triangleCount: Integer = js.native
  /**
  * Returns the index values that index into the NodeCoordinates and NormalVectors arrays to define the three coordinates of each triangle and the corresponding normal.
  */
  val triangleNodeIndices: Int32 = js.native
}
// no utilities
