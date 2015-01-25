
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
object FeatureOperationsEnum {
  val CutFeatureOperation: Int = 1 // The feature cuts or removes materials.
  val IntersectFeatureOperation: Int = 2 // The feature intersects with an existing body and the result is the intersecting volume.
  val JoinFeatureOperation: Int = 0 // The feature joins or adds material.
  val NewBodyFeatureOperation: Int = 3 // Results in the creation of a new body.
  val NewComponentFeatureOperation: Int = 4 // Results in the creation of a new component that contains the new body.
}
