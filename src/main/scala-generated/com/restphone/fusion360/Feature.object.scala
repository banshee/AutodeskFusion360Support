
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Base class object representing all features. 
 */
@JSName("adsk.fusion.Feature")
trait Feature extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  def dissolve(): Boolean = js.native
  /**
  * Returns the faces that were created by this feature. This works for both parametric and non-parametric features.
  */
  val faces: BRepFaces = js.native
  /**
  * Indicates if this feature is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Gets and sets if this feature is suppressed. This is only valid for parametric features.
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the set of features that are linked to this feature. The set of linked features are all of the features that were created in various components as the result of a single feature being created in the user interface.
  */
  val linkedFeatures: FeatureList = js.native
  /**
  * Returns the name of the feature as seen in the browser (non-parametric) or in the timeline (parametric).
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component that owns this feature.
  */
  val parentComponent: Component = js.native
  /**
  * Returns the timeline object associated with this feature.
  */
  val timelineObject: TimelineObject = js.native
}
/** 
  * Base class object representing all features. 
 */
@JSName("adsk.fusion.Feature")
object Feature extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  def dissolve(): Boolean = js.native
  /**
  * Returns the faces that were created by this feature. This works for both parametric and non-parametric features.
  */
  val faces: BRepFaces = js.native
  /**
  * Indicates if this feature is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Gets and sets if this feature is suppressed. This is only valid for parametric features.
  */
  var isSuppressed: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the set of features that are linked to this feature. The set of linked features are all of the features that were created in various components as the result of a single feature being created in the user interface.
  */
  val linkedFeatures: FeatureList = js.native
  /**
  * Returns the name of the feature as seen in the browser (non-parametric) or in the timeline (parametric).
  */
  val name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component that owns this feature.
  */
  val parentComponent: Component = js.native
  /**
  * Returns the timeline object associated with this feature.
  */
  val timelineObject: TimelineObject = js.native
}
// no utilities
