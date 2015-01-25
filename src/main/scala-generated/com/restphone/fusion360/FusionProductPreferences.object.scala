
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Fusion General Design Preferences 
 */
@JSName("adsk.fusion.FusionProductPreferences")
trait FusionProductPreferences extends ProductPreferences {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets the Design History (default design type) setting
  */
  var defaultDesignType: DefaultDesignTypeOptions = js.native
  /**
  * Gets and sets the Default workspace setting. (Model, Sculpt or Patch)
  */
  var defaultWorkspace: DefaultWorkspaces = js.native
  /**
  * Gets and sets the Allow 3D sketching of lines and splines option which controls if 3D sketching is allowed or if sketching is forced to be on the x-y plane of the sketch.
  */
  var is3DSketchingAllowed: Boolean = js.native
  /**
  * Gets and sets the Active Component Visibility option
  */
  var isActiveComponentVisibilityUsed: Boolean = js.native
  /**
  * Gets and sets the Animate joint preview option
  */
  var isJointPreviewAnimated: Boolean = js.native



}
/** 
  * Fusion General Design Preferences 
 */
@JSName("adsk.fusion.FusionProductPreferences")
object FusionProductPreferences extends js.Object {
  /**
  * Gets and sets the Design History (default design type) setting
  */
  var defaultDesignType: DefaultDesignTypeOptions = js.native
  /**
  * Gets and sets the Default workspace setting. (Model, Sculpt or Patch)
  */
  var defaultWorkspace: DefaultWorkspaces = js.native
  /**
  * Gets and sets the Allow 3D sketching of lines and splines option which controls if 3D sketching is allowed or if sketching is forced to be on the x-y plane of the sketch.
  */
  var is3DSketchingAllowed: Boolean = js.native
  /**
  * Gets and sets the Active Component Visibility option
  */
  var isActiveComponentVisibilityUsed: Boolean = js.native
  /**
  * Gets and sets the Animate joint preview option
  */
  var isJointPreviewAnimated: Boolean = js.native
}
// no utilities
