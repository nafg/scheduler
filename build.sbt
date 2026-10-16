name := "scheduler"

ThisBuild / organization := "io.github.nafg.scheduler"
ThisBuild / crossScalaVersions := Seq("2.12.21", "2.13.18", "3.9.0")
ThisBuild / scalaVersion := crossScalaVersions.value.last
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("17"))
