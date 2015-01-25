enablePlugins(ScalaJSPlugin)

name := "AutodeskFusion360ScalaJsWrappers"

organization := "com.restphone"

version := "0.1-SNAPSHOT"

unmanagedSourceDirectories in Compile += baseDirectory.value / "src" / "main" / "scala-generated"

scalaVersion := "2.11.5"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies += "com.github.japgolly.fork.scalaz" %%%! "scalaz-core" % "7.1.0-4"
