name := """ADEDA-Test-Project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.7"

libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
