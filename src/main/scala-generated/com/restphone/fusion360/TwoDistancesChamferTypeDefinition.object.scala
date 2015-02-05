
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides information to create a chamfer that is defined by a two distances from the edge. 
 */
@JSName("adsk.fusion.TwoDistancesChamferTypeDefinition")
class TwoDistancesChamferTypeDefinition extends ChamferTypeDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the parameter controlling the first distance. You can edit the distance by editing the value of the parameter object.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Returns the parameter controlling the second distance. You can edit the distance by editing the value of the parameter object.
  */
  val distanceTwo: ModelParameter = js.native



}
/** 
  * Provides information to create a chamfer that is defined by a two distances from the edge. 
 */
@JSName("adsk.fusion.TwoDistancesChamferTypeDefinition")
object TwoDistancesChamferTypeDefinition extends js.Object {
  /**
  * Returns the parameter controlling the first distance. You can edit the distance by editing the value of the parameter object.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Returns the parameter controlling the second distance. You can edit the distance by editing the value of the parameter object.
  */
  val distanceTwo: ModelParameter = js.native
}

  object TwoDistancesChamferTypeDefinitionUtilities {
    // no toSeq

  }
       
