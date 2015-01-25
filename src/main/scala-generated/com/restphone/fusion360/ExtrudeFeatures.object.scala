
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing extrude features in a design and supports the ability to create new extrude features. 
 */
@JSName("adsk.fusion.ExtrudeFeatures")
trait ExtrudeFeatures extends Base {
  /**
  * Creates a new extrude feature based on the information defined by the provided ExtrudeFeatureInput object. To create a new extrusion use the CreateInput function to create a new input object and use the methods and properties on that object to define the required input for an extrusion. Once the information is defined on the input object you can pass it to the Add method to create the extrusion.
  */
  def add(input: ExtrudeFeatureInput): ExtrudeFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of extrude features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new ExtrudeFeatureInput object that is used to specify the input needed to create a new extrude feature.
  */
  def createInput(profile: Base, operation: FeatureOperations): ExtrudeFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified extrude feature using an index into the collection.
  */
  def item(index: uinteger): ExtrudeFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing extrude features in a design and supports the ability to create new extrude features. 
 */
@JSName("adsk.fusion.ExtrudeFeatures")
object ExtrudeFeatures extends js.Object {
  /**
  * Creates a new extrude feature based on the information defined by the provided ExtrudeFeatureInput object. To create a new extrusion use the CreateInput function to create a new input object and use the methods and properties on that object to define the required input for an extrusion. Once the information is defined on the input object you can pass it to the Add method to create the extrusion.
  */
  def add(input: ExtrudeFeatureInput): ExtrudeFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of extrude features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new ExtrudeFeatureInput object that is used to specify the input needed to create a new extrude feature.
  */
  def createInput(profile: Base, operation: FeatureOperations): ExtrudeFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified extrude feature using an index into the collection.
  */
  def item(index: uinteger): ExtrudeFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ExtrudeFeaturesUtilities {
    def toSeq(xs: ExtrudeFeatures): IndexedSeq[ExtrudeFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
