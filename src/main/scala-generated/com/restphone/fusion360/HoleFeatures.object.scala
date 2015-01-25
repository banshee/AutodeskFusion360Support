
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing hole features in a component and supports the ability to create new hole features. 
 */
@JSName("adsk.fusion.HoleFeatures")
trait HoleFeatures extends Base {
  /**
  * Creates a new hole feature based on the information provided by a HoleFeatureInput object. To create a new hole, use one of CreateInput functions to define a new input object for the type of hole you want to create. Use the methods and properties on the input object to define any additional input. Once the information is defined on the input object, you can pass it to the Add method to create the hole.
  */
  def add(input: HoleFeatureInput): HoleFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of hole features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a HoleFeatureInput object that defines a counterbore hole. This is not a hole feature but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createCounterboreInput(holeDiameter: ValueInput, counterboreDiameter: ValueInput, counterboreDepth: ValueInput): HoleFeatureInput = js.native
  /**
  * Creates a HoleFeatureInput object that defines a countersink hole. This is not a hole feature but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createCountersinkInput(holeDiameter: ValueInput, countersinkDiameter: ValueInput, countersinkAngle: ValueInput): HoleFeatureInput = js.native
  /**
  * Creates a HoleFeatureInput object that defines a simple hole (a single diameter). This is not a hole feature, but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createSimpleInput(holeDiameter: ValueInput): HoleFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified hole feature using an index into the collection.
  */
  def item(index: uinteger): HoleFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing hole features in a component and supports the ability to create new hole features. 
 */
@JSName("adsk.fusion.HoleFeatures")
object HoleFeatures extends js.Object {
  /**
  * Creates a new hole feature based on the information provided by a HoleFeatureInput object. To create a new hole, use one of CreateInput functions to define a new input object for the type of hole you want to create. Use the methods and properties on the input object to define any additional input. Once the information is defined on the input object, you can pass it to the Add method to create the hole.
  */
  def add(input: HoleFeatureInput): HoleFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of hole features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a HoleFeatureInput object that defines a counterbore hole. This is not a hole feature but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createCounterboreInput(holeDiameter: ValueInput, counterboreDiameter: ValueInput, counterboreDepth: ValueInput): HoleFeatureInput = js.native
  /**
  * Creates a HoleFeatureInput object that defines a countersink hole. This is not a hole feature but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createCountersinkInput(holeDiameter: ValueInput, countersinkDiameter: ValueInput, countersinkAngle: ValueInput): HoleFeatureInput = js.native
  /**
  * Creates a HoleFeatureInput object that defines a simple hole (a single diameter). This is not a hole feature, but an object used to create a hole feature. Functionality on the returned HoleFeatureInput object is used to define the position and extent of the hole.
  */
  def createSimpleInput(holeDiameter: ValueInput): HoleFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified hole feature using an index into the collection.
  */
  def item(index: uinteger): HoleFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object HoleFeaturesUtilities {
    def toSeq(xs: HoleFeatures): IndexedSeq[HoleFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
