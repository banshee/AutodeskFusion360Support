
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Represents an occurrence of a component at any level within a subassembly. 
 */
@JSName("adsk.fusion.Occurrence")
class Occurrence extends Base {
  /**
  * Read-write property that gets and sets the appearance override for this occurrence. This property can return null indicating there is no override appearance and that the contents of the occurrence are displayed using there defined appearance. Setting the property to null will remove any override appearance for this occurrence.
  */
  var appearance: Appearance = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this references the component the object is defined within. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a read only list of child occurrences where only the occurrences in this occurrence's AssemblyContext are returned .
  */
  val childOccurrences: OccurrenceList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component this occurrence references.
  */
  val component: Component = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Fails if this object is not the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): Occurrence = js.native
  /**
  * Deletes the occurrence from the design. If this is the last occurrence referencing a specific Component, the component is also deleted.
  */
  def deleteMe(): Boolean = js.native
  /**
  * The name of the occurrence, including the full path of occurrences as seen in the browser. The top-level component will depend on the context but will typically be the root component of the design. A name for an occurrence that is at the third level of an assembly could be "Sub1:1+Sub2:1+PartA:1".
  */
  val fullPathName: String = js.native
  /**
  * Gets and sets if the light bulb of this occurrence as displayed in the browser is on or off. An occurrence will only be visible if the light bulb is switched on. However, the light bulb can be on and the occurrence still invisible if a higher level occurrence in the assembly context is not visible because its light bulb is off.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets whether the occurrence is visible. This property is affected by the assembly context.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the occurrence. This is the name as seen in the browser. It is a reflection of the component name with an added counter suffix (i.e. 'OccurrenceName:1').
  */
  val name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object. The return type is strongly typed for each object.
  */
  val nativeObject: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * This is the sourceComponent for the occurrence and is affected by the assembly context. This is the top-level component where the path begins.
  */
  val sourceComponent: Component = js.native
  /**
  * Returns the timeline object associated with the creation of this occurrence.
  */
  val timelineObject: TimelineObject = js.native
  /**
  * Gets and sets the 3d matrix data that defines this occurrences orientation and position in its assembly context
  */
  var transform: Matrix3D = js.native
}
/** 
  * Represents an occurrence of a component at any level within a subassembly. 
 */
@JSName("adsk.fusion.Occurrence")
object Occurrence extends js.Object {
  /**
  * Read-write property that gets and sets the appearance override for this occurrence. This property can return null indicating there is no override appearance and that the contents of the occurrence are displayed using there defined appearance. Setting the property to null will remove any override appearance for this occurrence.
  */
  var appearance: Appearance = js.native
  /**
  * Returns the assembly occurrence (i.e. the occurrence) of this object in an assembly. This is only valid in the case where this references the component the object is defined within. Returns null in the case where the object is not in the context of an assembly but is already the native object.
  */
  val assemblyContext: Occurrence = js.native
  /**
  * Returns a read only list of child occurrences where only the occurrences in this occurrence's AssemblyContext are returned .
  */
  val childOccurrences: OccurrenceList = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The component this occurrence references.
  */
  val component: Component = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence. Fails if this object is not the NativeObject.
  */
  def createForAssemblyContext(occurrence: Occurrence): Occurrence = js.native
  /**
  * Deletes the occurrence from the design. If this is the last occurrence referencing a specific Component, the component is also deleted.
  */
  def deleteMe(): Boolean = js.native
  /**
  * The name of the occurrence, including the full path of occurrences as seen in the browser. The top-level component will depend on the context but will typically be the root component of the design. A name for an occurrence that is at the third level of an assembly could be "Sub1:1+Sub2:1+PartA:1".
  */
  val fullPathName: String = js.native
  /**
  * Gets and sets if the light bulb of this occurrence as displayed in the browser is on or off. An occurrence will only be visible if the light bulb is switched on. However, the light bulb can be on and the occurrence still invisible if a higher level occurrence in the assembly context is not visible because its light bulb is off.
  */
  var isLightBulbOn: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Gets whether the occurrence is visible. This property is affected by the assembly context.
  */
  val isVisible: Boolean = js.native
  /**
  * The name of the occurrence. This is the name as seen in the browser. It is a reflection of the component name with an added counter suffix (i.e. 'OccurrenceName:1').
  */
  val name: String = js.native
  /**
  * The NativeObject is the object outside the context of an assembly. Returns null in the case where this object is not in the context of an assembly but is already the native object. The return type is strongly typed for each object.
  */
  val nativeObject: Occurrence = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * This is the sourceComponent for the occurrence and is affected by the assembly context. This is the top-level component where the path begins.
  */
  val sourceComponent: Component = js.native
  /**
  * Returns the timeline object associated with the creation of this occurrence.
  */
  val timelineObject: TimelineObject = js.native
  /**
  * Gets and sets the 3d matrix data that defines this occurrences orientation and position in its assembly context
  */
  var transform: Matrix3D = js.native
}

  object OccurrenceUtilities {
    // no toSeq

  }
       
