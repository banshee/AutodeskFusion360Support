
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing mirror features in a component and supports the ability to create new mirror features. 
 */
@JSName("adsk.fusion.MirrorFeatures")
class MirrorFeatures extends Base {
  /**
  * Creates a new mirror feature.
  */
  def add(input: MirrorFeatureInput): MirrorFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of mirror features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a MirrorFeatureInput object. Use properties and methods on this object to define the mirror you want to create and then use the Add method, passing in the MirrorFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, mirrorPlane: Base): MirrorFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified mirror feature using an index into the collection.
  */
  def item(index: uinteger): MirrorFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing mirror features in a component and supports the ability to create new mirror features. 
 */
@JSName("adsk.fusion.MirrorFeatures")
object MirrorFeatures extends js.Object {
  /**
  * Creates a new mirror feature.
  */
  def add(input: MirrorFeatureInput): MirrorFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of mirror features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a MirrorFeatureInput object. Use properties and methods on this object to define the mirror you want to create and then use the Add method, passing in the MirrorFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, mirrorPlane: Base): MirrorFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified mirror feature using an index into the collection.
  */
  def item(index: uinteger): MirrorFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object MirrorFeaturesUtilities {
    
    def toSeq(xs: MirrorFeatures): IndexedSeq[MirrorFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
