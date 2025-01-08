import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

crossScalaVersions := Seq("2.13.12", "3.4.3")

lazy val root = (project in file("."))
  .settings(
    name := "Scala Seed Project",
    // https://github.com/scalatest/scalatestplus-mockito
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.10" % Test,
      "org.scalatestplus" %% "mockito-5-12" % "3.2.19.0" % Test,
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
