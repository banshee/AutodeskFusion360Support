
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the sketches within a design and provides methods to create new sketches. 
 */
@JSName("adsk.fusion.Sketches")
class Sketches extends Base {
  /**
  * Creates a new sketch on the specified planar entity.
  */
  def add(planarEntity: Base, occurrenceForCreation: Occurrence): Sketch = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketches in a component
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch using an index into the collection.
  */
  def item(index: uinteger): Sketch = js.native
  /**
  * Returns the sketch with the specified name.
  */
  def itemByName(name: String): Sketch = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Provides access to the sketches within a design and provides methods to create new sketches. 
 */
@JSName("adsk.fusion.Sketches")
object Sketches extends js.Object {
  /**
  * Creates a new sketch on the specified planar entity.
  */
  def add(planarEntity: Base, occurrenceForCreation: Occurrence): Sketch = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketches in a component
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch using an index into the collection.
  */
  def item(index: uinteger): Sketch = js.native
  /**
  * Returns the sketch with the specified name.
  */
  def itemByName(name: String): Sketch = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchesUtilities {
    
    def toSeq(xs: Sketches): IndexedSeq[Sketch] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
