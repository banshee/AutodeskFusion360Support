
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing scale features in a component and supports the ability to create new scale features. 
 */
@JSName("adsk.fusion.ScaleFeatures")
class ScaleFeatures extends Base {
  /**
  * Creates a new scale feature.
  */
  def add(input: ScaleFeatureInput): ScaleFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of scale features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ScaleFeatureInput object. Use properties and methods on this object to define the scale you want to create and then use the Add method, passing in the ScaleFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, point: Base, scaleFactor: ValueInput): ScaleFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified scale feature using an index into the collection.
  */
  def item(index: uinteger): ScaleFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing scale features in a component and supports the ability to create new scale features. 
 */
@JSName("adsk.fusion.ScaleFeatures")
object ScaleFeatures extends js.Object {
  /**
  * Creates a new scale feature.
  */
  def add(input: ScaleFeatureInput): ScaleFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of scale features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ScaleFeatureInput object. Use properties and methods on this object to define the scale you want to create and then use the Add method, passing in the ScaleFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, point: Base, scaleFactor: ValueInput): ScaleFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified scale feature using an index into the collection.
  */
  def item(index: uinteger): ScaleFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ScaleFeaturesUtilities {
    
    def toSeq(xs: ScaleFeatures): IndexedSeq[ScaleFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
