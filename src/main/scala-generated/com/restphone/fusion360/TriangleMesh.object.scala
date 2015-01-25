
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The TriangleMesh object represents all of the data defining a triangular mesh. 
 */
@JSName("adsk.fusion.TriangleMesh")
trait TriangleMesh extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if the associated face has an image based texture. This can only return true when this TriangleMesh object was obtained from a BRepFace object. If false, the TextureCoordinates and TextureMap properties should be ignored. A texture is returned by a face when an appearance has been applied that has an associated image based texture.
  */
  val hasTexture: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinates: Point3D = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinatesAsDouble: Double = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinatesAsFloat: Single = js.native
  /**
  * Returns the total number of nodes in the mesh.
  */
  val nodeCount: Integer = js.native
  /**
  * Returns an array of indices that define which nodes are used for each triangle. This is used to look-up the coordinates in the NodeCoordinates array to get the three coordinates of each triangle.
  */
  val nodeIndices: Int32 = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectors: Vector3D = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectorsAsDouble: Double = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectorsAsFloat: Single = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the surface tolerance that was used to generate this mesh. This is most useful when using display meshes that have already been calculated.
  */
  val surfaceTolerance: double = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinates: Point2D = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinatesAsDouble: Double = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinatesAsFloat: Single = js.native
  /**
  * Returns the texture image associated with the texture.
  */
  val textureImage: TextureImage = js.native
  /**
  * Returns the number of triangles in the mesh.
  */
  val triangleCount: Integer = js.native
}
/** 
  * The TriangleMesh object represents all of the data defining a triangular mesh. 
 */
@JSName("adsk.fusion.TriangleMesh")
object TriangleMesh extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if the associated face has an image based texture. This can only return true when this TriangleMesh object was obtained from a BRepFace object. If false, the TextureCoordinates and TextureMap properties should be ignored. A texture is returned by a face when an appearance has been applied that has an associated image based texture.
  */
  val hasTexture: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinates: Point3D = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinatesAsDouble: Double = js.native
  /**
  * Returns the node coordinates as an array of doubles where they are the x, y, z components of each coordinate.
  */
  val nodeCoordinatesAsFloat: Single = js.native
  /**
  * Returns the total number of nodes in the mesh.
  */
  val nodeCount: Integer = js.native
  /**
  * Returns an array of indices that define which nodes are used for each triangle. This is used to look-up the coordinates in the NodeCoordinates array to get the three coordinates of each triangle.
  */
  val nodeIndices: Int32 = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectors: Vector3D = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectorsAsDouble: Double = js.native
  /**
  * Returns the normal vectors of the mesh where there is a normal vector at each node. The normals are returned as an array of doubles where they are the x, y, z components of each vector.
  */
  val normalVectorsAsFloat: Single = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the surface tolerance that was used to generate this mesh. This is most useful when using display meshes that have already been calculated.
  */
  val surfaceTolerance: double = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinates: Point2D = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinatesAsDouble: Double = js.native
  /**
  * Returns the texture coordinates used when mapping a texture to this face. The coordinates are returned as an array of doubles where they are the u and v components of each coordinate as defined in parametric space. There is a texture coordinate for each vertex in the face mesh.
  */
  val textureCoordinatesAsFloat: Single = js.native
  /**
  * Returns the texture image associated with the texture.
  */
  val textureImage: TextureImage = js.native
  /**
  * Returns the number of triangles in the mesh.
  */
  val triangleCount: Integer = js.native
}
// no utilities
