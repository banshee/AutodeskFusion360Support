
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing circular pattern features in a component and supports the ability to create new circular pattern features. 
 */
@JSName("adsk.fusion.CircularPatternFeatures")
class CircularPatternFeatures extends Base {
  /**
  * Creates a new circular pattern feature.
  */
  def add(input: CircularPatternFeatureInput): CircularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of circular pattern features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a CircularPatternFeatureInput object. Use properties and methods on this object to define the circular pattern you want to create and then use the Add method, passing in the CircularPatternFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, axis: Base): CircularPatternFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified circular pattern feature using an index into the collection.
  */
  def item(index: uinteger): CircularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing circular pattern features in a component and supports the ability to create new circular pattern features. 
 */
@JSName("adsk.fusion.CircularPatternFeatures")
object CircularPatternFeatures extends js.Object {
  /**
  * Creates a new circular pattern feature.
  */
  def add(input: CircularPatternFeatureInput): CircularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of circular pattern features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a CircularPatternFeatureInput object. Use properties and methods on this object to define the circular pattern you want to create and then use the Add method, passing in the CircularPatternFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, axis: Base): CircularPatternFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified circular pattern feature using an index into the collection.
  */
  def item(index: uinteger): CircularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object CircularPatternFeaturesUtilities {
    
    def toSeq(xs: CircularPatternFeatures): IndexedSeq[CircularPatternFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
