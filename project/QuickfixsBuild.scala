import sbt._
import sbt.Keys._

object QuickfixsBuild extends Build {

  lazy val quickfixs = Project(
    id = "quickfixs",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "quickfixs",
      organization := "com.bostontechnologies",
      version := "1.0.0",
      scalaVersion := "2.11.5",
      scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-language:postfixOps"), 
      // crossScalaVersions := Seq("2.9.1", "2.9.3", "2.10.2"),
      libraryDependencies += "org.apache.servicemix.bundles" % "org.apache.servicemix.bundles.quickfix" % "1.5.3_1",
      libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.12", 
      // libraryDependencies += "org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
      libraryDependencies += "junit" % "junit" % "4.11" % "test"
    )
  )
}
