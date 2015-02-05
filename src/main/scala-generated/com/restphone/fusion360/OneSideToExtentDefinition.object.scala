
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Defines the inputs for a OneSideToExtentDefinition object. This defines a feature extent that goes up to a face or construction plane in one direction. 
 */
@JSName("adsk.fusion.OneSideToExtentDefinition")
class OneSideToExtentDefinition extends ExtentDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native

  /**
  * Specifies if the face should be extended or use adjacent faces if necessary to define the termination of the extrusion. When used for a revolve feature this is ignored and is always treated as true.
  */
  var matchShape: Boolean = js.native


  /**
  * Gets and sets the entity that defines the extent. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntity: Base = js.native
}
/** 
  * Defines the inputs for a OneSideToExtentDefinition object. This defines a feature extent that goes up to a face or construction plane in one direction. 
 */
@JSName("adsk.fusion.OneSideToExtentDefinition")
object OneSideToExtentDefinition extends js.Object {
  /**
  * Specifies if the face should be extended or use adjacent faces if necessary to define the termination of the extrusion. When used for a revolve feature this is ignored and is always treated as true.
  */
  var matchShape: Boolean = js.native
  /**
  * Gets and sets the entity that defines the extent. The valid types of entities can vary depending on the type of feature this is being used with.
  */
  var toEntity: Base = js.native
}

  object OneSideToExtentDefinitionUtilities {
    // no toSeq

  }
       
