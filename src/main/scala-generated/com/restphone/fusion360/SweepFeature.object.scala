
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing sweep feature in a design. 
 */
@JSName("adsk.fusion.SweepFeature")
class SweepFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SweepFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native
  /**
  * Gets the distance for the first side. This property returns nothing in the case where the feature is non-parametric.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the distance for the second side. Returns nothing if the path is only in one side of the profile. It's always the distance against the normal of the profile if available. This property returns nothing in the case where the feature is non-parametric.
  */
  val distanceTwo: ModelParameter = js.native
  /**
  * Property that returns the set of that cap one end of the sweep that are coincident with the sketch plane. The end faces are those not coincident to the sketch plane of the feature's profile. In the case of a symmetric revolution these faces are the ones on the negative normal side of the sketch plane. In the cases where there aren't any end faces this property will return Nothing.
  */
  val endFaces: BRepFaces = js.native






  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SweepFeature = js.native

  /**
  * Gets and sets the type of operation performed by the sweep.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the sweep orientation. It defaults to PerpendicularOrientationType.
  */
  var orientation: SweepOrientationTypes = js.native

  /**
  * Gets and sets the path to create the sweep. This property returns nothing in the case where the feature is non-parametric.
  */
  var path: Path = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the sweep. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns nothing in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Property that returns a object that provides access to all of the faces created around the perimeter of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of that cap one end of the sweep that are coincident with the sketch plane. In the cases where there aren't any start faces this property will return Nothing.
  */
  val startFaces: BRepFaces = js.native

}
/** 
  * Object that represents an existing sweep feature in a design. 
 */
@JSName("adsk.fusion.SweepFeature")
object SweepFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): SweepFeature = js.native
  /**
  * Gets the distance for the first side. This property returns nothing in the case where the feature is non-parametric.
  */
  val distanceOne: ModelParameter = js.native
  /**
  * Gets the distance for the second side. Returns nothing if the path is only in one side of the profile. It's always the distance against the normal of the profile if available. This property returns nothing in the case where the feature is non-parametric.
  */
  val distanceTwo: ModelParameter = js.native
  /**
  * Property that returns the set of that cap one end of the sweep that are coincident with the sketch plane. The end faces are those not coincident to the sketch plane of the feature's profile. In the case of a symmetric revolution these faces are the ones on the negative normal side of the sketch plane. In the cases where there aren't any end faces this property will return Nothing.
  */
  val endFaces: BRepFaces = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: SweepFeature = js.native
  /**
  * Gets and sets the type of operation performed by the sweep.
  */
  var operation: FeatureOperations = js.native
  /**
  * Gets and sets the sweep orientation. It defaults to PerpendicularOrientationType.
  */
  var orientation: SweepOrientationTypes = js.native
  /**
  * Gets and sets the path to create the sweep. This property returns nothing in the case where the feature is non-parametric.
  */
  var path: Path = js.native
  /**
  * Gets and sets the profiles or planar faces used to define the shape of the sweep. This property can return or be set with a single Profile, a single planar face, or an ObjectCollection consisting of multiple profiles and planar faces. When an ObjectCollection is used all of the profiles and faces must be co-planar. This property returns nothing in the case where the feature is non-parametric.
  */
  var profile: Base = js.native
  /**
  * Property that returns a object that provides access to all of the faces created around the perimeter of the feature.
  */
  val sideFaces: BRepFaces = js.native
  /**
  * Property that returns the set of that cap one end of the sweep that are coincident with the sketch plane. In the cases where there aren't any start faces this property will return Nothing.
  */
  val startFaces: BRepFaces = js.native
}

  object SweepFeatureUtilities {
    // no toSeq

  }
       
