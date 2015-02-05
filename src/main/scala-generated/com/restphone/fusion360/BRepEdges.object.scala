
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * BRepEdge collection. 
 */
@JSName("adsk.fusion.BRepEdges")
class BRepEdges extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of edges in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified edge using an index into the collection.
  */
  def item(index: uinteger): BRepEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * BRepEdge collection. 
 */
@JSName("adsk.fusion.BRepEdges")
object BRepEdges extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of edges in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified edge using an index into the collection.
  */
  def item(index: uinteger): BRepEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BRepEdgesUtilities {
    
    def toSeq(xs: BRepEdges): IndexedSeq[BRepEdge] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
