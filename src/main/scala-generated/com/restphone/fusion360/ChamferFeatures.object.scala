
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing chamfer features in a component and supports the ability to create new chamfer features. 
 */
@JSName("adsk.fusion.ChamferFeatures")
trait ChamferFeatures extends Base {
  /**
  * Creates a new chamfer feature.
  */
  def add(input: ChamferFeatureInput): ChamferFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of chamfer features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ChamferFeatureInput object. Use properties and methods on this object to define the chamfer you want to create and then use the Add method, passing in the ChamferFeatureInput object.
  */
  def createInput(edges: ObjectCollection, isTangentChain: Boolean): ChamferFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified chamfer feature using an index into the collection.
  */
  def item(index: uinteger): ChamferFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing chamfer features in a component and supports the ability to create new chamfer features. 
 */
@JSName("adsk.fusion.ChamferFeatures")
object ChamferFeatures extends js.Object {
  /**
  * Creates a new chamfer feature.
  */
  def add(input: ChamferFeatureInput): ChamferFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of chamfer features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ChamferFeatureInput object. Use properties and methods on this object to define the chamfer you want to create and then use the Add method, passing in the ChamferFeatureInput object.
  */
  def createInput(edges: ObjectCollection, isTangentChain: Boolean): ChamferFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified chamfer feature using an index into the collection.
  */
  def item(index: uinteger): ChamferFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ChamferFeaturesUtilities {
    def toSeq(xs: ChamferFeatures): IndexedSeq[ChamferFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
