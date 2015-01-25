
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a TwoSidesToExtentDefinition object This defines a feature extent where the extents of feature go up to faces or construction planes in both directions. 
 */
@JSName("adsk.fusion.TwoSidesToExtentDefinition")
trait TwoSidesToExtentDefinition extends ExtentDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Gets and sets whether the toEntity is extended to fully intersect the extrusion.
  */
  var matchShape: Boolean = js.native


  /**
  * Gets and sets the entity that defines the extent on side one. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntityOne: Base = js.native
  /**
  * Gets and sets the entity that defines the extent on side two. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntityTwo: Base = js.native
}
/** 
  * Defines the inputs for a TwoSidesToExtentDefinition object This defines a feature extent where the extents of feature go up to faces or construction planes in both directions. 
 */
@JSName("adsk.fusion.TwoSidesToExtentDefinition")
object TwoSidesToExtentDefinition extends js.Object {
  /**
  * Gets and sets whether the toEntity is extended to fully intersect the extrusion.
  */
  var matchShape: Boolean = js.native
  /**
  * Gets and sets the entity that defines the extent on side one. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntityOne: Base = js.native
  /**
  * Gets and sets the entity that defines the extent on side two. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntityTwo: Base = js.native
}
// no utilities
