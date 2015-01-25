
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * This object provides methods to query the thread data contained in the XML files under ThreadData folder. 
 */
@JSName("adsk.fusion.ThreadDataQuery")
trait ThreadDataQuery extends Base {
  /**
  * Method that returns all the available classes for a thread type of a given thread designation.
  */
  def allClasses(isInternal: Boolean, threadType: String, designation: String): String = js.native
  /**
  * Method that returns all the available thread designations for a thread type of a given size.
  */
  def allDesignations(threadType: String, size: String): String = js.native
  /**
  * Method that returns all the available thread sizes for a given thread type.
  */
  def allSizes(threadType: String): String = js.native
  /**
  * Gets all the available thread types (families).
  */
  val allThreadTypes: String = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the default inch thread type.
  */
  val defaultInchThreadType: String = js.native
  /**
  * Gets the default metric thread type.
  */
  val defaultMetricThreadType: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Method that gets the recommended thread data for a given model diameter.
  */
  def recommendThreadData(modelDiameter: double, isInternal: Boolean, threadType: String, /* out */ designation: String, /* out */ threadClass: String): Boolean = js.native
  /**
  * Method that returns the custom name for a given thread type.
  */
  def threadTypeCustomName(threadType: String): String = js.native
  /**
  * Method that returns the unit for a given thread type.
  */
  def threadTypeUnit(threadType: String): String = js.native
}
/** 
  * This object provides methods to query the thread data contained in the XML files under ThreadData folder. 
 */
@JSName("adsk.fusion.ThreadDataQuery")
object ThreadDataQuery extends js.Object {
  /**
  * Method that returns all the available classes for a thread type of a given thread designation.
  */
  def allClasses(isInternal: Boolean, threadType: String, designation: String): String = js.native
  /**
  * Method that returns all the available thread designations for a thread type of a given size.
  */
  def allDesignations(threadType: String, size: String): String = js.native
  /**
  * Method that returns all the available thread sizes for a given thread type.
  */
  def allSizes(threadType: String): String = js.native
  /**
  * Gets all the available thread types (families).
  */
  val allThreadTypes: String = js.native
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the default inch thread type.
  */
  val defaultInchThreadType: String = js.native
  /**
  * Gets the default metric thread type.
  */
  val defaultMetricThreadType: String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Method that gets the recommended thread data for a given model diameter.
  */
  def recommendThreadData(modelDiameter: double, isInternal: Boolean, threadType: String, /* out */ designation: String, /* out */ threadClass: String): Boolean = js.native
  /**
  * Method that returns the custom name for a given thread type.
  */
  def threadTypeCustomName(threadType: String): String = js.native
  /**
  * Method that returns the unit for a given thread type.
  */
  def threadTypeUnit(threadType: String): String = js.native
}
// no utilities
