
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing shell features in a component and supports the ability to create new shell features. 
 */
@JSName("adsk.fusion.ShellFeatures")
class ShellFeatures extends Base {
  /**
  * Creates a new shell feature.
  */
  def add(input: ShellFeatureInput): ShellFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of shell features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ShellFeatureInput object. Use properties and methods on this object to define the shell you want to create and then use the Add method, passing in the ShellFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection): ShellFeatureInput = js.native
  /**
  * Creates a ShellFeatureInput object. Use properties and methods on this object to define the shell you want to create and then use the Add method, passing in the ShellFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, /* optional */ isTangentChain: Boolean): ShellFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified shell feature using an index into the collection.
  */
  def item(index: uinteger): ShellFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to all of the existing shell features in a component and supports the ability to create new shell features. 
 */
@JSName("adsk.fusion.ShellFeatures")
object ShellFeatures extends js.Object {
  /**
  * Creates a new shell feature.
  */
  def add(input: ShellFeatureInput): ShellFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of shell features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ShellFeatureInput object. Use properties and methods on this object to define the shell you want to create and then use the Add method, passing in the ShellFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection): ShellFeatureInput = js.native
  /**
  * Creates a ShellFeatureInput object. Use properties and methods on this object to define the shell you want to create and then use the Add method, passing in the ShellFeatureInput object.
  */
  def createInput(inputEntities: ObjectCollection, /* optional */ isTangentChain: Boolean): ShellFeatureInput = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified shell feature using an index into the collection.
  */
  def item(index: uinteger): ShellFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ShellFeaturesUtilities {
    
    def toSeq(xs: ShellFeatures): IndexedSeq[ShellFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
