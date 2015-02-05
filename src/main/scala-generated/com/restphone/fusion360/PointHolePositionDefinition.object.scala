
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides positioning information for a hole that is positioned relative to a 3D coordinate point. 
 */
@JSName("adsk.fusion.PointHolePositionDefinition")
class PointHolePositionDefinition extends HolePositionDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native


  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
  /**
  * Returns the coordinates defining the position of the hole.
  */
  val point: Base = js.native
}
/** 
  * Provides positioning information for a hole that is positioned relative to a 3D coordinate point. 
 */
@JSName("adsk.fusion.PointHolePositionDefinition")
object PointHolePositionDefinition extends js.Object {
  /**
  * Returns the plane that defines the orientation and start of the hole.
  */
  val planarEntity: Base = js.native
  /**
  * Returns the coordinates defining the position of the hole.
  */
  val point: Base = js.native
}

  object PointHolePositionDefinitionUtilities {
    // no toSeq

  }
       
