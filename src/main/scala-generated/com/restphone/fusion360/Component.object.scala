
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents a component in the data model. A component represents a set of geometry, features, and parameters that make up an item in the design. A component can be referenced multiple times into a design with a Occurrence object. 
 */
@JSName("adsk.fusion.Component")
class Component extends BaseComponent {

  /**
  * Returns all occurrences, at any level of the assembly, that reference the specified component. The returned list is read-only.
  */
  override def allOccurrencesByComponent(component: Component): OccurrenceList = js.native

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native



  /**
  * Returns the collection that provides access to all of the features associated with this component.
  */
  val features: Features = js.native
  /**
  * Gets and sets if the light bulb of the construction folder as seen in the browser is on or off. This controls the visibility of the (non-origin) construction geometry (i.e. planes, points, axes).
  */
  var isConstructionFolderLightBulbOn: Boolean = js.native
  /**
  * Gets and sets if the light bulb of the origin folder as seen in the browser is on or off. This controls the visibility of the origin construction geometry.
  */
  var isOriginFolderLightBulbOn: Boolean = js.native

  /**
  * Returns the mesh bodies collection associated with this component.
  */
  val meshBodies: MeshBodies = js.native
  /**
  * Returns the collection of model parameters in the Component.
  */
  val modelParameters: ModelParameters = js.native



  /**
  * Returns all occurrences at the top-level of this component that reference the specified component. The returned list is read-only.
  */
  override def occurrencesByComponent(component: Component): OccurrenceList = js.native
  /**
  * Returns the origin construction point.
  */
  val originConstructionPoint: ConstructionPoint = js.native

  /**
  * Returns the sketches collection associated with this component. This provides access to the existing sketches and supports the creation of new sketches.
  */
  val sketches: Sketches = js.native
  /**
  * Returns the X origin construction axis.
  */
  val xConstructionAxis: ConstructionAxis = js.native
  /**
  * Returns the XY origin construction plane.
  */
  val xYConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the XZ origin construction plane.
  */
  val xZConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the Y origin construction axis.
  */
  val yConstructionAxis: ConstructionAxis = js.native
  /**
  * Returns the YZ origin construction plane.
  */
  val yZConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the Z origin construction axis.
  */
  val zConstructionAxis: ConstructionAxis = js.native
}
/** 
  * Represents a component in the data model. A component represents a set of geometry, features, and parameters that make up an item in the design. A component can be referenced multiple times into a design with a Occurrence object. 
 */
@JSName("adsk.fusion.Component")
object Component extends js.Object {
  /**
  * Returns the collection that provides access to all of the features associated with this component.
  */
  val features: Features = js.native
  /**
  * Gets and sets if the light bulb of the construction folder as seen in the browser is on or off. This controls the visibility of the (non-origin) construction geometry (i.e. planes, points, axes).
  */
  var isConstructionFolderLightBulbOn: Boolean = js.native
  /**
  * Gets and sets if the light bulb of the origin folder as seen in the browser is on or off. This controls the visibility of the origin construction geometry.
  */
  var isOriginFolderLightBulbOn: Boolean = js.native
  /**
  * Returns the mesh bodies collection associated with this component.
  */
  val meshBodies: MeshBodies = js.native
  /**
  * Returns the collection of model parameters in the Component.
  */
  val modelParameters: ModelParameters = js.native
  /**
  * Returns the origin construction point.
  */
  val originConstructionPoint: ConstructionPoint = js.native
  /**
  * Returns the sketches collection associated with this component. This provides access to the existing sketches and supports the creation of new sketches.
  */
  val sketches: Sketches = js.native
  /**
  * Returns the X origin construction axis.
  */
  val xConstructionAxis: ConstructionAxis = js.native
  /**
  * Returns the XY origin construction plane.
  */
  val xYConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the XZ origin construction plane.
  */
  val xZConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the Y origin construction axis.
  */
  val yConstructionAxis: ConstructionAxis = js.native
  /**
  * Returns the YZ origin construction plane.
  */
  val yZConstructionPlane: ConstructionPlane = js.native
  /**
  * Returns the Z origin construction axis.
  */
  val zConstructionAxis: ConstructionAxis = js.native
}

  object ComponentUtilities {
    // no toSeq

  }
       
