
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Object that represents an existing mirror feature in a design. 
 */
@JSName("adsk.fusion.MirrorFeature")
trait MirrorFeature extends Feature {

  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): MirrorFeature = js.native
  /**
  * Deletes the feature. This works for both parametric and non-parametric features.
  */
  override def deleteMe(): Boolean = js.native
  /**
  * Dissolves the feature so that the feature information is lost and only the B-Rep geometry defined by the feature remains. This is only valid for non-parametric features.
  */
  override def dissolve(): Boolean = js.native

  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native




  /**
  * Gets and sets the mirror plane. This can be either a planar face or construction plane. This works only for parametric features.
  */
  var mirrorPlane: Base = js.native

  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: MirrorFeature = js.native


  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Get the features that were created for this mirror. Returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native

}
/** 
  * Object that represents an existing mirror feature in a design. 
 */
@JSName("adsk.fusion.MirrorFeature")
object MirrorFeature extends js.Object {
  /**
  * Creates or returns a proxy for the native object - i.e. a new object that represents this object but adds the assembly context defined by the input occurrence.
  */
  def createForAssemblyContext(occurrence: Occurrence): MirrorFeature = js.native
  /**
  * Gets and sets the input entities. The collection could contain faces, features and bodies. In parametric modeling, the pattern compute type is set to pattern features when the collection only contains features, the pattern compute type is set to pattern bodies when the collection only contains bodies, otherwise the pattern compute type is set to pattern faces.
  */
  var inputEntities: ObjectCollection = js.native
  /**
  * Gets and sets the mirror plane. This can be either a planar face or construction plane. This works only for parametric features.
  */
  var mirrorPlane: Base = js.native
  /**
  * The NativeObject is the object outside the context of an assembly and in the context of it's parent component. Returns null in the case where this object is not in the context of an assembly but is already the native object.
  */
  val nativeObject: MirrorFeature = js.native
  /**
  * Gets the PatternElements collection that contains the elements created by this pattern.
  */
  val patternElements: PatternElements = js.native
  /**
  * Get the features that were created for this mirror. Returns null in the case where the feature is parametric.
  */
  val resultFeatures: ObjectCollection = js.native
}
// no utilities
