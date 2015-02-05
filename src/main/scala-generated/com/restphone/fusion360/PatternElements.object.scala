
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection that provides access to pattern elements of mirror, pattern features. 
 */
@JSName("adsk.fusion.PatternElements")
class PatternElements extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of pattern elements in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified pattern element using an index into the collection.
  */
  def item(index: uinteger): PatternElement = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection that provides access to pattern elements of mirror, pattern features. 
 */
@JSName("adsk.fusion.PatternElements")
object PatternElements extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of pattern elements in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified pattern element using an index into the collection.
  */
  def item(index: uinteger): PatternElement = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object PatternElementsUtilities {
    
    def toSeq(xs: PatternElements): IndexedSeq[PatternElement] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
