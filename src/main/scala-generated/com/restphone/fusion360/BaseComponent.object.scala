
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The BaseComponent object that defines all of the common design data and is the base class for the product specific components. 
 */
@JSName("adsk.fusion.BaseComponent")
class BaseComponent extends Base {
  /**
  * Returns all of the occurrences in the assembly regardless of their level within the assembly structure. The returned list is read-only.
  */
  val allOccurrences: OccurrenceList = js.native
  /**
  * Returns all occurrences, at any level of the assembly, that reference the specified component. The returned list is read-only.
  */
  def allOccurrencesByComponent(component: Component): OccurrenceList = js.native
  /**
  * Returns the B-Rep bodies collection associated with this component.
  */
  val bRepBodies: BRepBodies = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the construction axes collection associated with this component. This provides access to the existing construction axes and supports the creation of new construction axes.
  */
  val constructionAxes: ConstructionAxes = js.native
  /**
  * Returns the construction planes collection associated with this component. This provides access to the existing construction planes and supports the creation of new construction planes.
  */
  val constructionPlanes: ConstructionPlanes = js.native
  /**
  * Returns the construction points collection associated with this component. This provides access to the existing construction points and supports the creation of new construction points.
  */
  val constructionPoints: ConstructionPoints = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Property that gets and sets the name of this component. This is the name shown in the browser for each occurrence referencing this component.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the Occurrences collection associated with this component. This provides access to the occurrences at the top-level of this component and provides the functionality to add new occurrences.
  */
  val occurrences: Occurrences = js.native
  /**
  * Returns all occurrences at the top-level of this component that reference the specified component. The returned list is read-only.
  */
  def occurrencesByComponent(component: Component): OccurrenceList = js.native
  /**
  * Returns the parent product this component is owned by.
  */
  val parentDesign: Design = js.native
}
/** 
  * The BaseComponent object that defines all of the common design data and is the base class for the product specific components. 
 */
@JSName("adsk.fusion.BaseComponent")
object BaseComponent extends js.Object {
  /**
  * Returns all of the occurrences in the assembly regardless of their level within the assembly structure. The returned list is read-only.
  */
  val allOccurrences: OccurrenceList = js.native
  /**
  * Returns all occurrences, at any level of the assembly, that reference the specified component. The returned list is read-only.
  */
  def allOccurrencesByComponent(component: Component): OccurrenceList = js.native
  /**
  * Returns the B-Rep bodies collection associated with this component.
  */
  val bRepBodies: BRepBodies = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the construction axes collection associated with this component. This provides access to the existing construction axes and supports the creation of new construction axes.
  */
  val constructionAxes: ConstructionAxes = js.native
  /**
  * Returns the construction planes collection associated with this component. This provides access to the existing construction planes and supports the creation of new construction planes.
  */
  val constructionPlanes: ConstructionPlanes = js.native
  /**
  * Returns the construction points collection associated with this component. This provides access to the existing construction points and supports the creation of new construction points.
  */
  val constructionPoints: ConstructionPoints = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Property that gets and sets the name of this component. This is the name shown in the browser for each occurrence referencing this component.
  */
  var name: String = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the Occurrences collection associated with this component. This provides access to the occurrences at the top-level of this component and provides the functionality to add new occurrences.
  */
  val occurrences: Occurrences = js.native
  /**
  * Returns all occurrences at the top-level of this component that reference the specified component. The returned list is read-only.
  */
  def occurrencesByComponent(component: Component): OccurrenceList = js.native
  /**
  * Returns the parent product this component is owned by.
  */
  val parentDesign: Design = js.native
}

  object BaseComponentUtilities {
    // no toSeq

  }
       
