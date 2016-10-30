lazy val commonSettings = Seq(
  organization := "com.github.gigurra",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation"),
  libraryDependencies ++= Seq(
    "com.github.gigurra" %% "glasciia-desktop"           % "0.2.13-SNAPSHOT",
    "com.github.gigurra" %% "service-utils"              % "0.1.14-SNAPSHOT",
    "com.github.gigurra" %% "scalego-serialization-json" % "0.3.7",
    "org.scalatest"      %% "scalatest"                  % "2.2.4"            % "test",
    "org.mockito"        %  "mockito-core"               % "1.10.19"          % "test"
  ),
  resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)


lazy val core = module("core")
lazy val client = module("game", dependencies = core)
lazy val server = module("server", dependencies = core)

def module(name: String, dependencies: sbt.ClasspathDep[sbt.ProjectReference]*): Project = Project(
  id = s"alienz-$name",
  base = file(s"alienz-$name"),
  settings = commonSettings,
  dependencies = dependencies
)
