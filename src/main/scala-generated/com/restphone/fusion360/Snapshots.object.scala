
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to the Snapshots within a design and provides methods to create new Snapshots. 
 */
@JSName("adsk.fusion.Snapshots")
class Snapshots extends Base {
  /**
  * Creates a new snapshot. Creating a snapshot is only valid when the HasPendingTransforms property returns true.
  */
  def add(): Snapshot = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if there are any changes that have been made than can be snapshot.
  */
  val hasPendingSnapshot: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified snapshot in the collection using an index into the collection.
  */
  def item(index: uinteger): Snapshot = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Reverts and changes that have been made that can be snapshot. This effectively reverts the design back to the last snapshot. This is only valid when the HasPendingSnapshot property returns true.
  */
  def revertPendingSnapshot(): Boolean = js.native
}
/** 
  * Provides access to the Snapshots within a design and provides methods to create new Snapshots. 
 */
@JSName("adsk.fusion.Snapshots")
object Snapshots extends js.Object {
  /**
  * Creates a new snapshot. Creating a snapshot is only valid when the HasPendingTransforms property returns true.
  */
  def add(): Snapshot = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of items in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if there are any changes that have been made than can be snapshot.
  */
  val hasPendingSnapshot: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified snapshot in the collection using an index into the collection.
  */
  def item(index: uinteger): Snapshot = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Reverts and changes that have been made that can be snapshot. This effectively reverts the design back to the last snapshot. This is only valid when the HasPendingSnapshot property returns true.
  */
  def revertPendingSnapshot(): Boolean = js.native
}

  object SnapshotsUtilities {
    
    def toSeq(xs: Snapshots): IndexedSeq[Snapshot] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
