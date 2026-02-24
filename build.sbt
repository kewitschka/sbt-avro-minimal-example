ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.8.2"

libraryDependencies += "org.apache.avro" % "avro" % "1.12.1"
Compile / sourceGenerators += (Compile / avroScalaGenerateSpecific).taskValue
Compile / avroSpecificScalaSource := (Compile / scalaSource).value

lazy val root = (project in file("."))
  .settings(
    name := "sbt-avro-example"
  )
