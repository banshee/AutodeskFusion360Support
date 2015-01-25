
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
object GenericErrorsEnum {
  val BadApiCallError: Int = 3 // The client made some sort of mistake calling the API object
  val ClassSpecificError: Int = 100 // Errors reserved for several functions in a class.
  val ExpressionError: Int = 6 // e.g. Errors related to bad value expressions or units - e.g. "1 in + 1 Kg" is an invalid expression
  val FunctionSpecificError: Int = 200 // Errors reserved for a specific function in a class.
  val InternalValidationError: Int = 2 // Internal API validation failed
  val InvalidGeometryError: Int = 7 // When creating or changing an object via reference geometry, the geometry wasn't specified correctly (e.g. an Occurrence needs to be specified).
  val Ok: Int = 0 // No error occurred.
  val OperationFailed: Int = 5 // The API operation failed with the supplied error message.
  val UnderlyingObjectDeletedError: Int = 4 // The API object is referencing a Neutron object that has been deleted.
  val UnexpectedError: Int = 1 // An internal error occurred - e.g. a library function throw an exception.
}
