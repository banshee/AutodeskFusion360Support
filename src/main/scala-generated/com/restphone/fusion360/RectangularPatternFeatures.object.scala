
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing rectangular pattern features in a component and supports the ability to create new rectangular pattern features. 
 */
@JSName("adsk.fusion.RectangularPatternFeatures")
class RectangularPatternFeatures extends Base {
  /**
  * Creates a new rectangular pattern feature.
  */
  def add(input: RectangularPatternFeatureInput): RectangularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of rectangular pattern features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a RectangularPatternFeatureInput object. Use properties and methods on this object to define the rectangular pattern you want to create and then use the Add method, passing in the RectangularPatternFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, directionOneEntity: Base, quantityOne: ValueInput, distanceOne: ValueInput, patternDistanceType: PatternDistanceType): RectangularPatternFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified rectangular pattern feature using an index into the collection.
  */
  def item(index: uinteger): RectangularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing rectangular pattern features in a component and supports the ability to create new rectangular pattern features. 
 */
@JSName("adsk.fusion.RectangularPatternFeatures")
object RectangularPatternFeatures extends js.Object {
  /**
  * Creates a new rectangular pattern feature.
  */
  def add(input: RectangularPatternFeatureInput): RectangularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of rectangular pattern features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a RectangularPatternFeatureInput object. Use properties and methods on this object to define the rectangular pattern you want to create and then use the Add method, passing in the RectangularPatternFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, directionOneEntity: Base, quantityOne: ValueInput, distanceOne: ValueInput, patternDistanceType: PatternDistanceType): RectangularPatternFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified rectangular pattern feature using an index into the collection.
  */
  def item(index: uinteger): RectangularPatternFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object RectangularPatternFeaturesUtilities {
    
    def toSeq(xs: RectangularPatternFeatures): IndexedSeq[RectangularPatternFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
