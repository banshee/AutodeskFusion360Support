
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an open Fusion design. This derives from the Design base class and adds the Fusion specific functionality. 
 */
@JSName("adsk.fusion.Design")
class Design extends Product {
  /**
  * Returns the component that is current being edited. This can return the root component or another component within the design.
  */
  val activeComponent: Component = js.native
  /**
  * Returns the current edit target as seen in the user interface. This edit target is defined as the container object that will be added to if something is created. For example, a component can be an edit target so that when new bodies are created they are added to that component. A sketch can also be an edit target.
  */
  val activeEditObject: Base = js.native
  /**
  * Returns the Components collection that provides access to existing components in a design
  */
  val allComponents: Components = js.native
  /**
  * Returns a read only list of all parameters in the design. This includes the user parameters and model parameters from all components in this design.
  */
  val allParameters: ParameterList = js.native

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the current design type (DirectDesignType or ParametricDesignType)
  */
  val designType: DesignTypes = js.native
  /**
  * Returns the ExportManager for this design. You use the ExportManager to export the current design in various formats.
  */
  val exportManager: ExportManager = js.native
  /**
  * Returns a specialized UnitsManager that can set the default length units and work with parameters.
  */
  val fusionUnitsManager: FusionUnitsManager = js.native




  /**
  * Returns the root Component
  */
  val rootComponent: Component = js.native
  /**
  * Returns the Snapshots object associated with this design which provides access to the existing snapshots and the creation of new snapshots.
  */
  val snapshots: Snapshots = js.native
  /**
  * Returns the timeline associated with this design.
  */
  val timeline: Timeline = js.native

  /**
  * Returns the collection of User Parameters in a design
  */
  val userParameters: UserParameters = js.native

}
/** 
  * Object that represents an open Fusion design. This derives from the Design base class and adds the Fusion specific functionality. 
 */
@JSName("adsk.fusion.Design")
object Design extends js.Object {
  /**
  * Returns the component that is current being edited. This can return the root component or another component within the design.
  */
  val activeComponent: Component = js.native
  /**
  * Returns the current edit target as seen in the user interface. This edit target is defined as the container object that will be added to if something is created. For example, a component can be an edit target so that when new bodies are created they are added to that component. A sketch can also be an edit target.
  */
  val activeEditObject: Base = js.native
  /**
  * Returns the Components collection that provides access to existing components in a design
  */
  val allComponents: Components = js.native
  /**
  * Returns a read only list of all parameters in the design. This includes the user parameters and model parameters from all components in this design.
  */
  val allParameters: ParameterList = js.native
  /**
  * Returns the current design type (DirectDesignType or ParametricDesignType)
  */
  val designType: DesignTypes = js.native
  /**
  * Returns the ExportManager for this design. You use the ExportManager to export the current design in various formats.
  */
  val exportManager: ExportManager = js.native
  /**
  * Returns a specialized UnitsManager that can set the default length units and work with parameters.
  */
  val fusionUnitsManager: FusionUnitsManager = js.native
  /**
  * Returns the root Component
  */
  val rootComponent: Component = js.native
  /**
  * Returns the Snapshots object associated with this design which provides access to the existing snapshots and the creation of new snapshots.
  */
  val snapshots: Snapshots = js.native
  /**
  * Returns the timeline associated with this design.
  */
  val timeline: Timeline = js.native
  /**
  * Returns the collection of User Parameters in a design
  */
  val userParameters: UserParameters = js.native
}

  object DesignUtilities {
    // no toSeq

  }
       
