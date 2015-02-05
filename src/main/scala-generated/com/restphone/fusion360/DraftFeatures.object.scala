
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing draft features in a component and supports the ability to create new draft features. 
 */
@JSName("adsk.fusion.DraftFeatures")
class DraftFeatures extends Base {
  /**
  * Creates a new draft feature.
  */
  def add(input: DraftFeatureInput): DraftFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of draft features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a DraftFeatureInput object. Use properties and methods on this object to define the draft you want to create and then use the Add method, passing in the DraftFeatureInput object.
  */
  def createInput(inputFaces: Array[BRepFace], plane: Base): DraftFeatureInput = js.native
  /**
  * Creates a DraftFeatureInput object. Use properties and methods on this object to define the draft you want to create and then use the Add method, passing in the DraftFeatureInput object.
  */
  def createInput(inputFaces: Array[BRepFace], plane: Base, /* optional */ isTangentChain: Boolean): DraftFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified draft feature using an index into the collection.
  */
  def item(index: uinteger): DraftFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing draft features in a component and supports the ability to create new draft features. 
 */
@JSName("adsk.fusion.DraftFeatures")
object DraftFeatures extends js.Object {
  /**
  * Creates a new draft feature.
  */
  def add(input: DraftFeatureInput): DraftFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of draft features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a DraftFeatureInput object. Use properties and methods on this object to define the draft you want to create and then use the Add method, passing in the DraftFeatureInput object.
  */
  def createInput(inputFaces: Array[BRepFace], plane: Base): DraftFeatureInput = js.native
  /**
  * Creates a DraftFeatureInput object. Use properties and methods on this object to define the draft you want to create and then use the Add method, passing in the DraftFeatureInput object.
  */
  def createInput(inputFaces: Array[BRepFace], plane: Base, /* optional */ isTangentChain: Boolean): DraftFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified draft feature using an index into the collection.
  */
  def item(index: uinteger): DraftFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object DraftFeaturesUtilities {
    
    def toSeq(xs: DraftFeatures): IndexedSeq[DraftFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
