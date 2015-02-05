package com.restphone.fusion360

import scalaz.Show
import scala.scalajs.js

object ShowInstances {
  implicit val BaseShow: Show[Base] = Show.shows(x =>"Base!")
  implicit val Point3DShow: Show[Point3D] = Show.shows(x =>"Point3D")
}

object Fusion360TypeAliases {
  type UInt32 = Integer
  type Int32 = Integer
  type Int16 = Integer
  type Single = Integer
  type uinteger = Integer
  type double = Double
  type short = Integer
  type string = String
  type integer = Integer
  type boolean = Boolean
}

// Doc for these types is missing
trait Base extends js.Object

class CoilFeatures extends Base

class MoveFeatures extends Base

class ReplaceFaceFeatures extends Base

class SketchTexts extends Base

class EventHandler extends js.Object

/**
 * These are 
 */
object SelectionCommandInputValues {
  val Bodies = "Bodies"
  val SolidBodies = "SolidBodies"
  val SurfaceBodies = "SurfaceBodies"
  val Faces = "Faces"
  val SolidFaces = "SolidFaces"
  val SurfaceFaces = "SurfaceFaces"
  val PlanarFaces = "PlanarFaces"
  val CylindricalFaces = "CylindricalFaces"
  val ConicalFaces = "ConicalFaces"
  val SphericalFaces = "SphericalFaces"
  val ToroidalFaces = "ToroidalFaces"
  val SplineFaces = "SplineFaces"
  val Edges = "Edges"
  val LinearEdges = "LinearEdges"
  val CircularEdges = "CircularEdges"
  val EllipticalEdges = "EllipticalEdges"
  val TangentEdges = "TangentEdges"
  val NonTangentEdges = "NonTangentEdges"
  val Vertices = "Vertices"
  val RootComponents = "RootComponents"
  val Occurrences = "Occurrences"
  val Sketches = "Sketches"
  val SketchCurves = "SketchCurves"
  val SketchLines = "SketchLines"
  val SketchCircles = "SketchCircles"
  val SketchPoints = "SketchPoints"
  val ConstructionPoints = "ConstructionPoints"
  val ConstructionLines = "ConstructionLines"
  val ConstructionPlanes = "ConstructionPlanes"
}
