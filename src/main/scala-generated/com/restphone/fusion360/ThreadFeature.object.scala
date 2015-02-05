
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing thread feature in a design. 
 */
@JSName("adsk.fusion.ThreadFeature")
class ThreadFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ThreadFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native

  /**
  * Gets and sets the input cylindrical face.
  */
  var inputCylindricalFace: BRepFace = js.native
  /**
  * Gets and sets if this thread is the full length of the cylinder. It only can be set to true.
  */
  var isFullLength: Boolean = js.native
  /**
  * Gets and sets if the thread is physical or cosmetic thread. A value of true indicates a physical thread. It defaults to false.
  */
  var isModeled: Boolean = js.native

  /**
  * Gets and sets if the thread is right or left-handed thread. A value of true indicates a right-handed thread. It defaults to true.
  */
  var isRightHanded: Boolean = js.native




  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ThreadFeature = js.native


  /**
  * Sets the thread offset, length and location. Calling this method will cause the isFullLength property to be set to false.
  */
  def setThreadOffsetLength(threadOffset: ValueInput, threadLength: ValueInput, threadLocation: ThreadLocations): Boolean = js.native
  /**
  * Gets and sets the thread data. Also can edit the thread through the properties and methods on the ThreadInfo object.
  */
  var threadInfo: ThreadInfo = js.native
  /**
  * Gets the parameter that controls the depth of the thread. Even though the parameter for the thread depth is always created and accessible through this property, it is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  val threadLength: ModelParameter = js.native
  /**
  * Gets and sets where the thread length is measured from. This property is only used in the case where the isFullLength property is false.
  */
  var threadLocation: ThreadLocations = js.native
  /**
  * Gets the parameter that controls the offset value of the thread. The offset is the distance along the axis of the cylinder from the edge to the start of the thread, it is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  val threadOffset: ModelParameter = js.native

}
/** 
  * Object that represents an existing thread feature in a design. 
 */
@JSName("adsk.fusion.ThreadFeature")
object ThreadFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): ThreadFeature = js.native
  /**
  * Gets and sets the input cylindrical face.
  */
  var inputCylindricalFace: BRepFace = js.native
  /**
  * Gets and sets if this thread is the full length of the cylinder. It only can be set to true.
  */
  var isFullLength: Boolean = js.native
  /**
  * Gets and sets if the thread is physical or cosmetic thread. A value of true indicates a physical thread. It defaults to false.
  */
  var isModeled: Boolean = js.native
  /**
  * Gets and sets if the thread is right or left-handed thread. A value of true indicates a right-handed thread. It defaults to true.
  */
  var isRightHanded: Boolean = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: ThreadFeature = js.native
  /**
  * Sets the thread offset, length and location. Calling this method will cause the isFullLength property to be set to false.
  */
  def setThreadOffsetLength(threadOffset: ValueInput, threadLength: ValueInput, threadLocation: ThreadLocations): Boolean = js.native
  /**
  * Gets and sets the thread data. Also can edit the thread through the properties and methods on the ThreadInfo object.
  */
  var threadInfo: ThreadInfo = js.native
  /**
  * Gets the parameter that controls the depth of the thread. Even though the parameter for the thread depth is always created and accessible through this property, it is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  val threadLength: ModelParameter = js.native
  /**
  * Gets and sets where the thread length is measured from. This property is only used in the case where the isFullLength property is false.
  */
  var threadLocation: ThreadLocations = js.native
  /**
  * Gets the parameter that controls the offset value of the thread. The offset is the distance along the axis of the cylinder from the edge to the start of the thread, it is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  val threadOffset: ModelParameter = js.native
}

  object ThreadFeatureUtilities {
    // no toSeq

  }
       
