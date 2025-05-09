name := "akka-quickstart-java"

version := "1.0"

scalaVersion := "2.13.12"

lazy val akkaVersion = "2.9.2"

resolvers += "Akka library repository".at("https://repo.akka.io/maven")

// Run in a separate JVM, to make sure sbt waits until all threads have
// finished before returning.
// If you want to keep the application running while executing other
// sbt tasks, consider https://github.com/spray/sbt-revolver/
fork := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "junit" % "junit" % "4.13.1" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test)


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0",
  "com.typesafe.akka" %% "akka-cluster-typed" % "2.8.0",
  "com.typesafe.akka" %% "akka-persistence-typed" % "2.8.0",
  "com.typesafe.akka" %% "akka-http" % "10.5.0"
)
