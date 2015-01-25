
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing fillet features in a component and supports the ability to create new fillet features. 
 */
@JSName("adsk.fusion.FilletFeatures")
trait FilletFeatures extends Base {
  /**
  * Creates a new fillet feature.
  */
  def add(input: FilletFeatureInput): FilletFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of fillet features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a FilletFeatureInput object. Use properties and methods on this object to define the fillet you want to create and then use the Add method, passing in the FilletFeatureInput object.
  */
  def createInput(): FilletFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified fillet feature using an index into the collection.
  */
  def item(index: uinteger): FilletFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing fillet features in a component and supports the ability to create new fillet features. 
 */
@JSName("adsk.fusion.FilletFeatures")
object FilletFeatures extends js.Object {
  /**
  * Creates a new fillet feature.
  */
  def add(input: FilletFeatureInput): FilletFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of fillet features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a FilletFeatureInput object. Use properties and methods on this object to define the fillet you want to create and then use the Add method, passing in the FilletFeatureInput object.
  */
  def createInput(): FilletFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified fillet feature using an index into the collection.
  */
  def item(index: uinteger): FilletFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object FilletFeaturesUtilities {
    def toSeq(xs: FilletFeatures): IndexedSeq[FilletFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
