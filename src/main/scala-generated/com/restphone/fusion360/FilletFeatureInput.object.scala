
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a fillet feature. 
 */
@JSName("adsk.fusion.FilletFeatureInput")
class FilletFeatureInput extends Base {
  /**
  * Adds a set of edges with a constant radius to this input.
  */
  def addConstantRadiusEdgeSet(edges: ObjectCollection, radius: ValueInput, isTangentChain: Boolean): Boolean = js.native
  /**
  * Adds a single edge or set of tangent edges along with radius information to this input.
  */
  def addVariableRadiusEdgeSet(tangentEdges: ObjectCollection, startRadius: ValueInput, endRadius: ValueInput, positions: Array[ValueInput], radii: Array[ValueInput]): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if the fillet uses the G2 (curvature-continuity) surface quality option .
  */
  var isG2: Boolean = js.native
  /**
  * Gets and sets if a rolling ball solution is to be used in any corners.
  */
  var isRollingBallCorner: Boolean = js.native
  /**
  * Gets and sets if any edges that are tangentially connected to any of filleted edges will also be included in the fillet.
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
}
/** 
  * This class defines the methods and properties that pertain to the definition of a fillet feature. 
 */
@JSName("adsk.fusion.FilletFeatureInput")
object FilletFeatureInput extends js.Object {
  /**
  * Adds a set of edges with a constant radius to this input.
  */
  def addConstantRadiusEdgeSet(edges: ObjectCollection, radius: ValueInput, isTangentChain: Boolean): Boolean = js.native
  /**
  * Adds a single edge or set of tangent edges along with radius information to this input.
  */
  def addVariableRadiusEdgeSet(tangentEdges: ObjectCollection, startRadius: ValueInput, endRadius: ValueInput, positions: Array[ValueInput], radii: Array[ValueInput]): Boolean = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets if the fillet uses the G2 (curvature-continuity) surface quality option .
  */
  var isG2: Boolean = js.native
  /**
  * Gets and sets if a rolling ball solution is to be used in any corners.
  */
  var isRollingBallCorner: Boolean = js.native
  /**
  * Gets and sets if any edges that are tangentially connected to any of filleted edges will also be included in the fillet.
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
}

  object FilletFeatureInputUtilities {
    // no toSeq

  }
       
