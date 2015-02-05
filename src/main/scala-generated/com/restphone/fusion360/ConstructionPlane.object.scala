
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * ConstructionPlane Object 
 */
@JSName("adsk.fusion.ConstructionPlane")
class ConstructionPlane extends Base {
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
  * Returns the ConstructionPlanes collection that contains this construction plane.
  */
  val constructionPlanes: ConstructionPlanes = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionPlane = js.native
  /**
  * Returns the ConstructionPlaneDefinition object which provides access to the information defining this ConstructionPlane.
  */
  val definition: ConstructionPlaneDefinition = js.native
  /**
  * Deletes the construction plane.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets and sets the display size of the construction plane. The bounding box defines the min and max corners of the plane as defined in the 2D space of the construction plane.
  */
  var displayBounds: BoundingBox2D = js.native
  /**
  * Returns a plane that represents the position and orientation of the construction plane. This geometry is defined in the AssemblyContext of this ConstructionPlane.
  */
  val geometry: Plane = js.native
  /**
  * Indicates if this construction plane can be deleted. Base construction planes can not be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction plane will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this construction plane is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Indicates if the construction plane is visible. This property is affected by the AssemblyContext of the construction plane.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns the name of the construction plane as it is shown in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction plane are parametric, the parent will be a component. If the design is parametric and the construction plane is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction plane.
  */
  val timelineObject: TimelineObject = js.native
}
/** 
  * ConstructionPlane Object 
 */
@JSName("adsk.fusion.ConstructionPlane")
object ConstructionPlane extends js.Object {
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
  * Returns the ConstructionPlanes collection that contains this construction plane.
  */
  val constructionPlanes: ConstructionPlanes = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ConstructionPlane = js.native
  /**
  * Returns the ConstructionPlaneDefinition object which provides access to the information defining this ConstructionPlane.
  */
  val definition: ConstructionPlaneDefinition = js.native
  /**
  * Deletes the construction plane.
  */
  def deleteMe(): Boolean = js.native
  /**
  * Gets and sets the display size of the construction plane. The bounding box defines the min and max corners of the plane as defined in the 2D space of the construction plane.
  */
  var displayBounds: BoundingBox2D = js.native
  /**
  * Returns a plane that represents the position and orientation of the construction plane. This geometry is defined in the AssemblyContext of this ConstructionPlane.
  */
  val geometry: Plane = js.native
  /**
  * Indicates if this construction plane can be deleted. Base construction planes can not be deleted.
  */
  val isDeletable: Boolean = js.native
  /**
  * Indicates if the light bulb (as displayed in the browser) is on. A construction plane will only be visible if it's light bulb, and that of it's containing folder and parent component/s are also on.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this construction plane is parametric or not.
  */
  val isParametric: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Indicates if the construction plane is visible. This property is affected by the AssemblyContext of the construction plane.
  */
  val isVisible: Boolean = js.native
  /**
  * Returns the name of the construction plane as it is shown in the browser.
  */
  var name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ConstructionPlane = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the parent component or base feature. If both the design and the construction plane are parametric, the parent will be a component. If the design is parametric and the construction plane is not, the parent will be a base feature. If the design is not parametric the parent will be a component.
  */
  val parent: Base = js.native
  /**
  * Returns the timeline object associated with this construction plane.
  */
  val timelineObject: TimelineObject = js.native
}

  object ConstructionPlaneUtilities {
    // no toSeq

  }
       
