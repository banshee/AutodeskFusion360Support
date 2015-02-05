
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The Camera class represents the information that specifies how a model is viewed and displayed. It's analogous to a real camera where it has a position in space, is pointed towards a specific point and is oriented in a particular way. 
 */
@JSName("adsk.core.Camera")
class Camera extends Base {
  /**
  * Gets and sets the current camera type.
  */
  var cameraType: CameraTypes = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the position of the eye in world space.
  */
  var eye: Point3D = js.native
  /**
  * If this property is true, when this camera is applied to a viewport it will modify the camera such that the entire model is displayed in the viewport. When getting a camera from a viewport this property is always initialized to false.
  */
  var isFitView: Boolean = js.native
  /**
  * Determines whether Fusion does a smooth transition to this camera positoin when the camera is assigned to a ViewPort. If this is true it will do a smooth transition from the current camera position to the new camera position. If false, the view will jump to the position defined by the camera with no intermediate steps. This is useful if you're providing a series of cameras to control the camera animation.
  */
  var isSmoothTransition: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the perspective angle of the camera. This property is only valid when the CameraType property is either Perspective or PerspectiveWithOrthoFaces.
  */
  var perspectiveAngle: double = js.native
  /**
  * Gets and sets the camera target point in world space.
  */
  var target: Point3D = js.native
  /**
  * Defines the "up" direction for the camera which controls the orientation of the camera around the line defined between the eye and target points.
  */
  var upVector: Vector3D = js.native
  /**
  * Defines the area that's visible by the camera. This value is the radius of a sphere centered at the target point. The camera will display everything within that sphere and everything in front and behind the sphere. Setting this value can cause the eye and/or perspective angle to be modified when the camera type is perspective.
  */
  var viewExtents: double = js.native
  /**
  * Sets the camera to a standard orientation. If this is set, it will result in resetting all of the camera values except the camera type.
  */
  var viewOrientation: ViewOrientations = js.native
}
/** 
  * The Camera class represents the information that specifies how a model is viewed and displayed. It's analogous to a real camera where it has a position in space, is pointed towards a specific point and is oriented in a particular way. 
 */
@JSName("adsk.core.Camera")
object Camera extends js.Object {
  /**
  * Gets and sets the current camera type.
  */
  var cameraType: CameraTypes = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the position of the eye in world space.
  */
  var eye: Point3D = js.native
  /**
  * If this property is true, when this camera is applied to a viewport it will modify the camera such that the entire model is displayed in the viewport. When getting a camera from a viewport this property is always initialized to false.
  */
  var isFitView: Boolean = js.native
  /**
  * Determines whether Fusion does a smooth transition to this camera positoin when the camera is assigned to a ViewPort. If this is true it will do a smooth transition from the current camera position to the new camera position. If false, the view will jump to the position defined by the camera with no intermediate steps. This is useful if you're providing a series of cameras to control the camera animation.
  */
  var isSmoothTransition: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the perspective angle of the camera. This property is only valid when the CameraType property is either Perspective or PerspectiveWithOrthoFaces.
  */
  var perspectiveAngle: double = js.native
  /**
  * Gets and sets the camera target point in world space.
  */
  var target: Point3D = js.native
  /**
  * Defines the "up" direction for the camera which controls the orientation of the camera around the line defined between the eye and target points.
  */
  var upVector: Vector3D = js.native
  /**
  * Defines the area that's visible by the camera. This value is the radius of a sphere centered at the target point. The camera will display everything within that sphere and everything in front and behind the sphere. Setting this value can cause the eye and/or perspective angle to be modified when the camera type is perspective.
  */
  var viewExtents: double = js.native
  /**
  * Sets the camera to a standard orientation. If this is set, it will result in resetting all of the camera values except the camera type.
  */
  var viewOrientation: ViewOrientations = js.native
}

  object CameraUtilities {
    // no toSeq

  }
       
