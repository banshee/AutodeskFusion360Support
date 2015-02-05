
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a sweep feature. 
 */
@JSName("adsk.fusion.SweepFeatureInput")
class SweepFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the sweep is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the sweep) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets and sets the distance for the first side. The distance is a value from 0 to 1 indicating the position along the path where 0 is at the start and 1 is at the end. The value is default to 1.0.
  */
  var distanceOne: ValueInput = js.native
  /**
  * Gets and sets the distance for the second side. The distance is a value from 0 to 1 indicating the position along the path where 0 is at the start and 1 is at the end. The value is default to 1.0, and is ignored if the path is only in one side of the profile. It's always the distance against the normal of the profile if available.
  */
  var distanceTwo: ValueInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the type of operation performed by the sweep.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the sweep orientation. It defaults to PerpendicularOrientationType.
  */
  var orientation: SweepOrientationTypes = js.native
  /**
  * Gets and sets the path to create the sweep.
  */
  var path: Path = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the sweep. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar.
  */
  var profile: Base = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a sweep feature. 
 */
@JSName("adsk.fusion.SweepFeatureInput")
object SweepFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * In order for geometry to be transformed correctly, an Occurrence for creation needs to be specified when the sweep is created based on geometry (e.g. a profile and/or face(s)) in another component AND (the sweep) is not in the root component. The CreationOccurrence is analogous to the active occurrence in the UI
  */
  var creationOccurrence: Occurrence = js.native
  /**
  * Gets and sets the distance for the first side. The distance is a value from 0 to 1 indicating the position along the path where 0 is at the start and 1 is at the end. The value is default to 1.0.
  */
  var distanceOne: ValueInput = js.native
  /**
  * Gets and sets the distance for the second side. The distance is a value from 0 to 1 indicating the position along the path where 0 is at the start and 1 is at the end. The value is default to 1.0, and is ignored if the path is only in one side of the profile. It's always the distance against the normal of the profile if available.
  */
  var distanceTwo: ValueInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the type of operation performed by the sweep.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the sweep orientation. It defaults to PerpendicularOrientationType.
  */
  var orientation: SweepOrientationTypes = js.native
  /**
  * Gets and sets the path to create the sweep.
  */
  var path: Path = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the sweep. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar.
  */
  var profile: Base = js.native
}

  object SweepFeatureInputUtilities {
    // no toSeq

  }
       
