
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing revolve features in a design and supports the ability to create new revolve features. 
 */
@JSName("adsk.fusion.RevolveFeatures")
trait RevolveFeatures extends Base {
  /**
  * Creates a new revolve feature based on the information provided by the provided RevolveFeatureInput object. To create a new revolve, use the CreateInput function to create a new input object and then use the methods and properties on that object to define the required input for a revolve. Once the information is defined on the input object you can pass it to the Add method to create the revolve.
  */
  def add(input: RevolveFeatureInput): RevolveFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of revolve features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new RevolveFeatureInput object that is used to specify the input needed to create a new revolve feature.
  */
  def createInput(profile: Base, axis: Base, operation: FeatureOperations): RevolveFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified revolve feature using an index into the collection.
  */
  def item(index: uinteger): RevolveFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing revolve features in a design and supports the ability to create new revolve features. 
 */
@JSName("adsk.fusion.RevolveFeatures")
object RevolveFeatures extends js.Object {
  /**
  * Creates a new revolve feature based on the information provided by the provided RevolveFeatureInput object. To create a new revolve, use the CreateInput function to create a new input object and then use the methods and properties on that object to define the required input for a revolve. Once the information is defined on the input object you can pass it to the Add method to create the revolve.
  */
  def add(input: RevolveFeatureInput): RevolveFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of revolve features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a new RevolveFeatureInput object that is used to specify the input needed to create a new revolve feature.
  */
  def createInput(profile: Base, axis: Base, operation: FeatureOperations): RevolveFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified revolve feature using an index into the collection.
  */
  def item(index: uinteger): RevolveFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object RevolveFeaturesUtilities {
    def toSeq(xs: RevolveFeatures): IndexedSeq[RevolveFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
