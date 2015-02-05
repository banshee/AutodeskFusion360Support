
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This class defines the methods and properties that pertain to the definition of a thread feature. 
 */
@JSName("adsk.fusion.ThreadFeatureInput")
class ThreadFeatureInput extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input cylindrical face.
  */
  var inputCylindricalFace: BRepFace = js.native
  /**
  * Gets and sets if this thread is the full length of the cylinder. It defaults to true.
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
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the thread data.
  */
  var threadInfo: ThreadInfo = js.native
  /**
  * Gets and sets the thread length. It is only used in the case where the isFullLength property is false.
  */
  var threadLength: ValueInput = js.native
  /**
  * Gets and sets where the thread length is measured from. This property is only used in the case where the isFullLength property is false.
  */
  var threadLocation: ThreadLocations = js.native
  /**
  * Gets and sets the thread offset. The offset is the distance along the axis of the cylinder from the edge to the start of the thread. It is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  var threadOffset: ValueInput = js.native
}
/** 
  * This class defines the methods and properties that pertain to the definition of a thread feature. 
 */
@JSName("adsk.fusion.ThreadFeatureInput")
object ThreadFeatureInput extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets and sets the input cylindrical face.
  */
  var inputCylindricalFace: BRepFace = js.native
  /**
  * Gets and sets if this thread is the full length of the cylinder. It defaults to true.
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
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Gets and sets the thread data.
  */
  var threadInfo: ThreadInfo = js.native
  /**
  * Gets and sets the thread length. It is only used in the case where the isFullLength property is false.
  */
  var threadLength: ValueInput = js.native
  /**
  * Gets and sets where the thread length is measured from. This property is only used in the case where the isFullLength property is false.
  */
  var threadLocation: ThreadLocations = js.native
  /**
  * Gets and sets the thread offset. The offset is the distance along the axis of the cylinder from the edge to the start of the thread. It is only used in the case where the isFullLength property is false. Returns nothing in the case where the feature is non-parametric.
  */
  var threadOffset: ValueInput = js.native
}

  object ThreadFeatureInputUtilities {
    // no toSeq

  }
       
