val alienz = Project(id = "alienz", base = file("."))
  .settings(
    organization := "com.github.gigurra",
    version := "SNAPSHOT",

    scalaVersion := "2.11.8",
    scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation"),

    libraryDependencies ++= Seq(
      "com.github.gigurra"    %%  "glasciia-deskto" % "0.2.10-SNAPSHOT",
      "com.github.gigurra"    %%  "service-utils"   % "0.1.14-SNAPSHOT"
    ),

    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  )

