
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides information to create a constant radius fillet. 
 */
@JSName("adsk.fusion.ConstantRadiusFilletEdgeSet")
trait ConstantRadiusFilletEdgeSet extends FilletEdgeSet {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Gets and sets the edges that will be filleted.
  */
  var edges: ObjectCollection = js.native


  /**
  * Returns the model parameter that controls the radius of the fillet. You can edit the radius by using the properties on the returned ModelParameter object.
  */
  val radius: ModelParameter = js.native
}
/** 
  * Provides information to create a constant radius fillet. 
 */
@JSName("adsk.fusion.ConstantRadiusFilletEdgeSet")
object ConstantRadiusFilletEdgeSet extends js.Object {
  /**
  * Gets and sets the edges that will be filleted.
  */
  var edges: ObjectCollection = js.native
  /**
  * Returns the model parameter that controls the radius of the fillet. You can edit the radius by using the properties on the returned ModelParameter object.
  */
  val radius: ModelParameter = js.native
}
// no utilities
