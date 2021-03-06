name := "scala-dynamo"

organization := "com.recursivity.dynamo"

version := "1.1.2cv-SNAPSHOT"

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-Xcheckinit")

publishTo := Some(Resolver.file("local repo",Path.userHome / ".m2/repository" asFile))

resolvers += "OSS Sonatype" at "https://oss.sonatype.org/content/repositories/releases"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.6.1" % "test",
  "com.amazonaws" % "aws-java-sdk" % "1.3.7", 
  "com.recursivity" %% "recursivity-commons" % "0.6",
  "joda-time" % "joda-time" % "2.1"
)

