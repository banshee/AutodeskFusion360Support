
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The BRepBodies collection provides access to all of the B-Rep bodies within a component. 
 */
@JSName("adsk.fusion.BRepBodies")
class BRepBodies extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified body using an index into the collection.
  */
  def item(index: uinteger): BRepBody = js.native
  /**
  * Returns a specific body using the name of the body within the collection.
  */
  def itemByName(name: String): BRepBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The BRepBodies collection provides access to all of the B-Rep bodies within a component. 
 */
@JSName("adsk.fusion.BRepBodies")
object BRepBodies extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified body using an index into the collection.
  */
  def item(index: uinteger): BRepBody = js.native
  /**
  * Returns a specific body using the name of the body within the collection.
  */
  def itemByName(name: String): BRepBody = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BRepBodiesUtilities {
    
    def toSeq(xs: BRepBodies): IndexedSeq[BRepBody] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
