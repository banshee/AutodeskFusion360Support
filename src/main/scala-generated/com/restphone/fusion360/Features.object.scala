
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The features collection which provides access to all existing features. This collection provides direct access to all features regardless of type. It also provides access to type specific collections where you can get features of a specific type and also create new features of that type. 
 */
@JSName("adsk.fusion.Features")
class Features extends Base {
  /**
  * Returns the collection that provides access to the circular pattern features within the component and supports the creation of new circular pattern features.
  */
  val circularPatternFeatures: CircularPatternFeatures = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the collection that provides access to the Coil Primitive features within the component and supports the creation of new Coil Primitive features.
  */
  val coilFeatures: CoilFeatures = js.native
  /**
  * Returns the number of bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Method that creates a path used to define the shape of several features such as Sweep, etc.
  */
  def createPath(curve: Base): Path = js.native
  /**
  * Method that creates a path used to define the shape of several features such as Sweep, etc.
  */
  def createPath(curve: Base, /* optional */ isChain: Boolean): Path = js.native
  /**
  * Returns the collection that provides access to the draft features within the component and supports the creation of new draft features.
  */
  val draftFeatures: DraftFeatures = js.native
  /**
  * Returns the collection that provides access to the extrude features within the component and supports the creation of new extrude features.
  */
  val extrudeFeatures: ExtrudeFeatures = js.native
  /**
  * Returns the collection that provides access to the hole features within the component and supports the creation of new hole features.
  */
  val holeFeatures: HoleFeatures = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified feature using an index into the collection.
  */
  def item(index: uinteger): Feature = js.native
  /**
  * Returns the collection that provides access to the mirror features within the component and supports the creation of new mirror features.
  */
  val mirrorFeatures: MirrorFeatures = js.native
  /**
  * Returns the collection that provides access to the Move features within the component and supports the creation of new Move features.
  */
  val moveFeatures: MoveFeatures = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the collection that provides access to the rectangular pattern features within the component and supports the creation of new rectangular pattern features.
  */
  val rectangularPatternFeatures: RectangularPatternFeatures = js.native
  /**
  * Returns the collection that provides access to the replaceFace features within the component and supports the creation of new replaceFace features.
  */
  val replaceFaceFeatures: ReplaceFaceFeatures = js.native
  /**
  * Returns the collection that provides access to the revolve features within the component and supports the creation of new revolved features.
  */
  val revolveFeatures: RevolveFeatures = js.native
  /**
  * Returns the collection that provides access to the scale features within the component and supports the creation of new scale features.
  */
  val scaleFeatures: ScaleFeatures = js.native
  /**
  * Returns the collection that provides access to the shell features within the component and supports the creation of new shell features.
  */
  val shellFeatures: ShellFeatures = js.native
  /**
  * Returns the collection that provides access to the sweep features within the component and supports the creation of new sweep features.
  */
  val sweepFeatures: SweepFeatures = js.native
  /**
  * Returns the collection that provides access to the thread features within the component and supports the creation of new thread features.
  */
  val threadFeatures: ThreadFeatures = js.native
}
/** 
  * The features collection which provides access to all existing features. This collection provides direct access to all features regardless of type. It also provides access to type specific collections where you can get features of a specific type and also create new features of that type. 
 */
@JSName("adsk.fusion.Features")
object Features extends js.Object {
  /**
  * Returns the collection that provides access to the circular pattern features within the component and supports the creation of new circular pattern features.
  */
  val circularPatternFeatures: CircularPatternFeatures = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the collection that provides access to the Coil Primitive features within the component and supports the creation of new Coil Primitive features.
  */
  val coilFeatures: CoilFeatures = js.native
  /**
  * Returns the number of bodies in the collection.
  */
  val count: uinteger = js.native
  /**
  * Method that creates a path used to define the shape of several features such as Sweep, etc.
  */
  def createPath(curve: Base): Path = js.native
  /**
  * Method that creates a path used to define the shape of several features such as Sweep, etc.
  */
  def createPath(curve: Base, /* optional */ isChain: Boolean): Path = js.native
  /**
  * Returns the collection that provides access to the draft features within the component and supports the creation of new draft features.
  */
  val draftFeatures: DraftFeatures = js.native
  /**
  * Returns the collection that provides access to the extrude features within the component and supports the creation of new extrude features.
  */
  val extrudeFeatures: ExtrudeFeatures = js.native
  /**
  * Returns the collection that provides access to the hole features within the component and supports the creation of new hole features.
  */
  val holeFeatures: HoleFeatures = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified feature using an index into the collection.
  */
  def item(index: uinteger): Feature = js.native
  /**
  * Returns the collection that provides access to the mirror features within the component and supports the creation of new mirror features.
  */
  val mirrorFeatures: MirrorFeatures = js.native
  /**
  * Returns the collection that provides access to the Move features within the component and supports the creation of new Move features.
  */
  val moveFeatures: MoveFeatures = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the collection that provides access to the rectangular pattern features within the component and supports the creation of new rectangular pattern features.
  */
  val rectangularPatternFeatures: RectangularPatternFeatures = js.native
  /**
  * Returns the collection that provides access to the replaceFace features within the component and supports the creation of new replaceFace features.
  */
  val replaceFaceFeatures: ReplaceFaceFeatures = js.native
  /**
  * Returns the collection that provides access to the revolve features within the component and supports the creation of new revolved features.
  */
  val revolveFeatures: RevolveFeatures = js.native
  /**
  * Returns the collection that provides access to the scale features within the component and supports the creation of new scale features.
  */
  val scaleFeatures: ScaleFeatures = js.native
  /**
  * Returns the collection that provides access to the shell features within the component and supports the creation of new shell features.
  */
  val shellFeatures: ShellFeatures = js.native
  /**
  * Returns the collection that provides access to the sweep features within the component and supports the creation of new sweep features.
  */
  val sweepFeatures: SweepFeatures = js.native
  /**
  * Returns the collection that provides access to the thread features within the component and supports the creation of new thread features.
  */
  val threadFeatures: ThreadFeatures = js.native
}

  object FeaturesUtilities {
    
    def toSeq(xs: Features): IndexedSeq[Feature] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
