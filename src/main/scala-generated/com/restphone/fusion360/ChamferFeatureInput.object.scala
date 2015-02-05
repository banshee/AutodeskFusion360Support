
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a chamfer feature. 
 */
@JSName("adsk.fusion.ChamferFeatureInput")
class ChamferFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the collection of edges that will be chamfered.
  */
  var edges: ObjectCollection = js.native
  /**
  * Gets and sets if any edges that are tangentially connected to any of chamfered edges will also be included in the chamfer.
  */
  var isTangentChain: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToDistanceAndAngle(distance: ValueInput, angle: ValueInput): Boolean = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToEqualDistance(distance: ValueInput): Boolean = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToTwoDistances(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a chamfer feature. 
 */
@JSName("adsk.fusion.ChamferFeatureInput")
object ChamferFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the collection of edges that will be chamfered.
  */
  var edges: ObjectCollection = js.native
  /**
  * Gets and sets if any edges that are tangentially connected to any of chamfered edges will also be included in the chamfer.
  */
  var isTangentChain: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToDistanceAndAngle(distance: ValueInput, angle: ValueInput): Boolean = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToEqualDistance(distance: ValueInput): Boolean = js.native
  /**
  * Adds a set of edges to this input.
  */
  def setToTwoDistances(distanceOne: ValueInput, distanceTwo: ValueInput): Boolean = js.native
}

  object ChamferFeatureInputUtilities {
    // no toSeq

  }
       
