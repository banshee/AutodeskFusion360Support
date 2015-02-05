
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing sweep features in a component and supports the ability to create new sweep features. 
 */
@JSName("adsk.fusion.SweepFeatures")
class SweepFeatures extends Base {
  /**
  * Creates a new sweep feature.
  */
  def add(input: SweepFeatureInput): SweepFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of sweep features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a SweepFeatureInput object. Use properties and methods on this object to define the sweep you want to create and then use the Add method, passing in the SweepFeatureInput object.
  */
  def createInput(profile: Base, path: Path, operation: FeatureOperations): SweepFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sweep feature using an index into the collection.
  */
  def item(index: uinteger): SweepFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing sweep features in a component and supports the ability to create new sweep features. 
 */
@JSName("adsk.fusion.SweepFeatures")
object SweepFeatures extends js.Object {
  /**
  * Creates a new sweep feature.
  */
  def add(input: SweepFeatureInput): SweepFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of sweep features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a SweepFeatureInput object. Use properties and methods on this object to define the sweep you want to create and then use the Add method, passing in the SweepFeatureInput object.
  */
  def createInput(profile: Base, path: Path, operation: FeatureOperations): SweepFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sweep feature using an index into the collection.
  */
  def item(index: uinteger): SweepFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SweepFeaturesUtilities {
    
    def toSeq(xs: SweepFeatures): IndexedSeq[SweepFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
