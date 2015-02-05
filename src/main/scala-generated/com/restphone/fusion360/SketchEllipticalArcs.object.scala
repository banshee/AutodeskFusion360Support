
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The collection of elliptical arcs in a sketch. This provides access to the existing elliptical arcs and supports the methods to create new elliptical arcs. 
 */
@JSName("adsk.fusion.SketchEllipticalArcs")
class SketchEllipticalArcs extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of elliptical arcs in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch elliptical arc using an index into the collection.
  */
  def item(index: uinteger): SketchEllipticalArc = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * The collection of elliptical arcs in a sketch. This provides access to the existing elliptical arcs and supports the methods to create new elliptical arcs. 
 */
@JSName("adsk.fusion.SketchEllipticalArcs")
object SketchEllipticalArcs extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of elliptical arcs in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch elliptical arc using an index into the collection.
  */
  def item(index: uinteger): SketchEllipticalArc = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchEllipticalArcsUtilities {
    
    def toSeq(xs: SketchEllipticalArcs): IndexedSeq[SketchEllipticalArc] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
