
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The GraphicsPreferences object provides access to the various graphics related preferences. 
 */
@JSName("adsk.core.GraphicsPreferences")
trait GraphicsPreferences extends Base {
  /**
  * Gets and sets if automatically disable or degrade visual effects to keep the video memory pressure under a safe threshold.
  */
  var autoThrottleEffects: Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the style of display for degraded selections.
  */
  var degradedSelectionDisplayStyle: DegradedSelectionDisplayStyles = js.native
  /**
  * Gets and sets the dimming percentage to use for hidden edges. the value is a percentage expressed by a value between 0 and 100.
  */
  var hiddenEdgeDimming: Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the minimum frames per second.
  */
  var minimumFramesPerSecond: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the style of display to use for selections.
  */
  var selectionDisplayStyle: SelectionDisplayStyles = js.native
  /**
  * Gets and sets the style of display for transparency effects.
  */
  var transparencyEffects: TransparencyDisplayEffects = js.native
}
/** 
  * The GraphicsPreferences object provides access to the various graphics related preferences. 
 */
@JSName("adsk.core.GraphicsPreferences")
object GraphicsPreferences extends js.Object {
  /**
  * Gets and sets if automatically disable or degrade visual effects to keep the video memory pressure under a safe threshold.
  */
  var autoThrottleEffects: Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the style of display for degraded selections.
  */
  var degradedSelectionDisplayStyle: DegradedSelectionDisplayStyles = js.native
  /**
  * Gets and sets the dimming percentage to use for hidden edges. the value is a percentage expressed by a value between 0 and 100.
  */
  var hiddenEdgeDimming: Integer = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets and sets the minimum frames per second.
  */
  var minimumFramesPerSecond: double = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the style of display to use for selections.
  */
  var selectionDisplayStyle: SelectionDisplayStyles = js.native
  /**
  * Gets and sets the style of display for transparency effects.
  */
  var transparencyEffects: TransparencyDisplayEffects = js.native
}
// no utilities
