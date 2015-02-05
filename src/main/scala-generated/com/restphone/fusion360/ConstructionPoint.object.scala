
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPoint Object 
 */
@JSName("adsk.fusion.ConstructionPoint")
class ConstructionPoint extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component this construction point belongs to.
  */
  val component: Component = js.native
  /**
  * Returns the ConstructionPoints collection that contains this ConstructionPoint.
  */
  val constructionPoints: ConstructionPoints = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionPoint = js.native
  /**
  * Returns the construction point definition object which provides access to the information defining the construction point.
  */
  val definition: ConstructionPointDefinition = js.native
  /**
  * Deletes the construction point.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns a Point3D object that represents the position of the construction point. The returned geometry is in the AssemblyContext of this ConstructionPoint.
  */
  val geometry: Point3D = js.native
  /**
  * Indicates if this construction point can be deleted. The base construction point cannot be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction point will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if the construction point is parametric.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the construction point is visible. This property is affected by the AssemblyContext of the construction point.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the construction point as it is displayed in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction point are parametric, the parent will be a component. If the design is parametric and the construction point is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction point.
  */
  val timelineObject: TimelineObject = js.native
}
/** 
  * ConstructionPoint Object 
 */
@JSName("adsk.fusion.ConstructionPoint")
object ConstructionPoint extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component this construction point belongs to.
  */
  val component: Component = js.native
  /**
  * Returns the ConstructionPoints collection that contains this ConstructionPoint.
  */
  val constructionPoints: ConstructionPoints = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionPoint = js.native
  /**
  * Returns the construction point definition object which provides access to the information defining the construction point.
  */
  val definition: ConstructionPointDefinition = js.native
  /**
  * Deletes the construction point.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns a Point3D object that represents the position of the construction point. The returned geometry is in the AssemblyContext of this ConstructionPoint.
  */
  val geometry: Point3D = js.native
  /**
  * Indicates if this construction point can be deleted. The base construction point cannot be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction point will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if the construction point is parametric.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the construction point is visible. This property is affected by the AssemblyContext of the construction point.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the construction point as it is displayed in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionPoint = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction point are parametric, the parent will be a component. If the design is parametric and the construction point is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction point.
  */
  val timelineObject: TimelineObject = js.native
}

  object ConstructionPointUtilities {
    // no toSeq

  }
       
