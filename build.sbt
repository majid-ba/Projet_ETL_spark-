name := "SparkPProject"

version := "0.1"

scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1",
  "org.apache.spark" %% "spark-sql" % "3.5.1"
)

resolvers += "Apache Snapshots" at "https://repository.apache.org/content/repositories/snapshots/"
resolvers += "Maven Central" at "https://repo1.maven.org/maven2/"

