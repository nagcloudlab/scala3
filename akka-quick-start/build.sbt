val scala3Version = "3.3.1"

val AkkaVersion = "2.8.5"

lazy val root = project
  .in(file("."))
  .settings(
    name := "akka-quick-start",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
    )
  )
