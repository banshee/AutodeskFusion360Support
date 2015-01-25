
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the general preferences. 
 */
@JSName("adsk.core.GeneralPreferences")
trait GeneralPreferences extends Base {
  /**
  * Gets and sets if Autodesk 360 notifications are shown.
  */
  var areAutodesk360NotificationsShown: Boolean = js.native
  /**
  * Gets and sets if in command errors and warnings are shown.
  */
  var areInCommandErrorsAndWarningsShown: Boolean = js.native
  /**
  * Gets and sets if in command tips and tricks are shown.
  */
  var areTipsAndTricksShown: Boolean = js.native
  /**
  * Gets and sets if tooltips are shown.
  */
  var areTooltipsShown: Boolean = js.native
  /**
  * Gets and sets the interval, in minutes, for automatic versioning.
  */
  var automateVersioningTimeInterval: Integer = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the default for which direction is considered "up".
  */
  var defaultModelingOrientation: DefaultModelingOrientations = js.native
  /**
  * Get and sets the type of orbit.
  */
  var defaultOrbit: DefaultOrbits = js.native
  /**
  * Gets and sets the graphics driver used to display the graphics.
  */
  var graphicsDriver: GraphicsDrivers = js.native
  /**
  * Gets and sets if the file is automatically saved on close.
  */
  var isAutomaticSaveOnCloseEnabled: Boolean = js.native
  /**
  * Gets and sets if a version of the file is automatically saved using a background thread.
  */
  var isAutomaticVersioningEnabled: Boolean = js.native
  /**
  * Gets and sets if zoom and orbit commands use camera pivot point for transition.
  */
  var isCameraPivotEnabled: Boolean = js.native
  /**
  * Gets and sets if the command prompt is shown.
  */
  var isCommandPromptShown: Boolean = js.native
  /**
  * Gets and sets if gesture based view navigation is used.
  */
  var isGestureBasedViewNavigationUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets if the direction of the zoom is reversed.
  */
  var isZoomDirectionReversed: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the length of time, in days, that the offline cache of a document will remain.
  */
  var offlineCachePeriod: double = js.native
  /**
  * Gets and sets the current language. Setting the language does not take effect until the next time Fusion is started.
  */
  var userLanguage: UserLanguages = js.native
}
/** 
  * Provides access to the general preferences. 
 */
@JSName("adsk.core.GeneralPreferences")
object GeneralPreferences extends js.Object {
  /**
  * Gets and sets if Autodesk 360 notifications are shown.
  */
  var areAutodesk360NotificationsShown: Boolean = js.native
  /**
  * Gets and sets if in command errors and warnings are shown.
  */
  var areInCommandErrorsAndWarningsShown: Boolean = js.native
  /**
  * Gets and sets if in command tips and tricks are shown.
  */
  var areTipsAndTricksShown: Boolean = js.native
  /**
  * Gets and sets if tooltips are shown.
  */
  var areTooltipsShown: Boolean = js.native
  /**
  * Gets and sets the interval, in minutes, for automatic versioning.
  */
  var automateVersioningTimeInterval: Integer = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the default for which direction is considered "up".
  */
  var defaultModelingOrientation: DefaultModelingOrientations = js.native
  /**
  * Get and sets the type of orbit.
  */
  var defaultOrbit: DefaultOrbits = js.native
  /**
  * Gets and sets the graphics driver used to display the graphics.
  */
  var graphicsDriver: GraphicsDrivers = js.native
  /**
  * Gets and sets if the file is automatically saved on close.
  */
  var isAutomaticSaveOnCloseEnabled: Boolean = js.native
  /**
  * Gets and sets if a version of the file is automatically saved using a background thread.
  */
  var isAutomaticVersioningEnabled: Boolean = js.native
  /**
  * Gets and sets if zoom and orbit commands use camera pivot point for transition.
  */
  var isCameraPivotEnabled: Boolean = js.native
  /**
  * Gets and sets if the command prompt is shown.
  */
  var isCommandPromptShown: Boolean = js.native
  /**
  * Gets and sets if gesture based view navigation is used.
  */
  var isGestureBasedViewNavigationUsed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets if the direction of the zoom is reversed.
  */
  var isZoomDirectionReversed: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the length of time, in days, that the offline cache of a document will remain.
  */
  var offlineCachePeriod: double = js.native
  /**
  * Gets and sets the current language. Setting the language does not take effect until the next time Fusion is started.
  */
  var userLanguage: UserLanguages = js.native
}
// no utilities
