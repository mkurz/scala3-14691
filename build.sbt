lazy val root = project
  .enablePlugins(SbtTwirl)
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.3.3",
    crossScalaVersions := Seq("2.13.14", "3.3.3"),
  )
