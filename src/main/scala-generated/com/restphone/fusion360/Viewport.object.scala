
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A viewport within Fusion. A viewport is the window where the model is displayed. 
 */
@JSName("adsk.core.Viewport")
class Viewport extends Base {
  /**
  * Gets and sets the camera associated with the view. The camera returned is a copy of the current camera settings of the view. Editing the properties of the camera will have no affect on the viewport until the camera is assigned back to the viewport.
  */
  var camera: Camera = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Forces a camera change so that all of the graphics are visible in the viewport.
  */
  def fit(): Boolean = js.native
  /**
  * Returns the height of the viewport in pixels.
  */
  val height: Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Forces the view to refresh. It is sometimes useful to force a refresh to be able to see edits that have been made using the API.
  */
  def refresh(): Boolean = js.native
  /**
  * Saves the current view to the specified image file. ///
  */
  def saveAsImageFile(filename: String, width: Integer, height: Integer): Boolean = js.native
  /**
  * Gets and sets the current visual style being used.
  */
  var visualStyle: VisualStyles = js.native
  /**
  * Returns the width of the viewport in pixels.
  */
  val width: Integer = js.native
}
/** 
  * A viewport within Fusion. A viewport is the window where the model is displayed. 
 */
@JSName("adsk.core.Viewport")
object Viewport extends js.Object {
  /**
  * Gets and sets the camera associated with the view. The camera returned is a copy of the current camera settings of the view. Editing the properties of the camera will have no affect on the viewport until the camera is assigned back to the viewport.
  */
  var camera: Camera = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Forces a camera change so that all of the graphics are visible in the viewport.
  */
  def fit(): Boolean = js.native
  /**
  * Returns the height of the viewport in pixels.
  */
  val height: Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Forces the view to refresh. It is sometimes useful to force a refresh to be able to see edits that have been made using the API.
  */
  def refresh(): Boolean = js.native
  /**
  * Saves the current view to the specified image file. ///
  */
  def saveAsImageFile(filename: String, width: Integer, height: Integer): Boolean = js.native
  /**
  * Gets and sets the current visual style being used.
  */
  var visualStyle: VisualStyles = js.native
  /**
  * Returns the width of the viewport in pixels.
  */
  val width: Integer = js.native
}

  object ViewportUtilities {
    // no toSeq

  }
       
