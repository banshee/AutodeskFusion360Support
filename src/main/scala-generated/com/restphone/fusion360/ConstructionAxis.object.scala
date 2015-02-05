
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionAxis Object 
 */
@JSName("adsk.fusion.ConstructionAxis")
class ConstructionAxis extends Base {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component this construction plane belongs to.
  */
  val component: Component = js.native
  /**
  * Returns the ConstructionAxes collection that contains this ConstructionAxis.
  */
  val constructionAxes: ConstructionAxes = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionAxis = js.native
  /**
  * Returns the construction axis definition object which provides access to the information defining the construction axis.
  */
  val definition: ConstructionAxisDefinition = js.native
  /**
  * Deletes the construction axis.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns an infinite line that represents the position and orientation of the construction axis. This geometry is defined in the AssemblyContext of this ConstructionAxis.
  */
  val geometry: InfiniteLine3D = js.native
  /**
  * Indicates if this construction axis can be deleted. Base construction axes can not be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction axis will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this construction axis is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the construction plane is visible. This property is affected by the AssemblyContext of the construction axis.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the construction axis as it is shown in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction axis are parametric, the parent will be a component. If the design is parametric and the construction axis is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction axis.
  */
  val timelineObject: TimelineObject = js.native
}
/** 
  * ConstructionAxis Object 
 */
@JSName("adsk.fusion.ConstructionAxis")
object ConstructionAxis extends js.Object {
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this is acting as a proxy in an assembly. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the component this construction plane belongs to.
  */
  val component: Component = js.native
  /**
  * Returns the ConstructionAxes collection that contains this ConstructionAxis.
  */
  val constructionAxes: ConstructionAxes = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionAxis = js.native
  /**
  * Returns the construction axis definition object which provides access to the information defining the construction axis.
  */
  val definition: ConstructionAxisDefinition = js.native
  /**
  * Deletes the construction axis.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Returns an infinite line that represents the position and orientation of the construction axis. This geometry is defined in the AssemblyContext of this ConstructionAxis.
  */
  val geometry: InfiniteLine3D = js.native
  /**
  * Indicates if this construction axis can be deleted. Base construction axes can not be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction axis will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this construction axis is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets if the construction plane is visible. This property is affected by the AssemblyContext of the construction axis.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the construction axis as it is shown in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionAxis = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction axis are parametric, the parent will be a component. If the design is parametric and the construction axis is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction axis.
  */
  val timelineObject: TimelineObject = js.native
}

  object ConstructionAxisUtilities {
    // no toSeq

  }
       
