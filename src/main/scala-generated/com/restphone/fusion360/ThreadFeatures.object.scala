
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to all of the existing thread features in a component and supports the ability to create new thread features. 
 */
@JSName("adsk.fusion.ThreadFeatures")
class ThreadFeatures extends Base {
  /**
  * Creates a new thread feature.
  */
  def add(input: ThreadFeatureInput): ThreadFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of thread features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ThreadFeatureInput object. Use properties and methods on this object to define the thread you want to create and then use the Add method, passing in the ThreadFeatureInput object.
  */
  def createInput(inputCylindricalFace: BRepFace, threadInfo: ThreadInfo): ThreadFeatureInput = js.native
  /**
  * Method that creates a new ThreadInfo object that can be used in creating thread features.
  */
  def createThreadInfo(isInternal: Boolean, threadType: String, threadDesignation: String, threadClass: String): ThreadInfo = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified thread feature using an index into the collection.
  */
  def item(index: uinteger): ThreadFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the ThreadDataQuery object. This object has methods to query the thread data contained in the XML files under ThreadData folder. It's a singleton object.
  */
  val threadDataQuery: ThreadDataQuery = js.native
}
/** 
  * Collection that provides access to all of the existing thread features in a component and supports the ability to create new thread features. 
 */
@JSName("adsk.fusion.ThreadFeatures")
object ThreadFeatures extends js.Object {
  /**
  * Creates a new thread feature.
  */
  def add(input: ThreadFeatureInput): ThreadFeature = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of thread features in the collection.
  */
  val count: uinteger = js.native
  /**
  * Creates a ThreadFeatureInput object. Use properties and methods on this object to define the thread you want to create and then use the Add method, passing in the ThreadFeatureInput object.
  */
  def createInput(inputCylindricalFace: BRepFace, threadInfo: ThreadInfo): ThreadFeatureInput = js.native
  /**
  * Method that creates a new ThreadInfo object that can be used in creating thread features.
  */
  def createThreadInfo(isInternal: Boolean, threadType: String, threadDesignation: String, threadClass: String): ThreadInfo = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified thread feature using an index into the collection.
  */
  def item(index: uinteger): ThreadFeature = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Property that returns the ThreadDataQuery object. This object has methods to query the thread data contained in the XML files under ThreadData folder. It's a singleton object.
  */
  val threadDataQuery: ThreadDataQuery = js.native
}

  object ThreadFeaturesUtilities {
    
    def toSeq(xs: ThreadFeatures): IndexedSeq[ThreadFeature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
