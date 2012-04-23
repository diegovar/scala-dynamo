name := "scala-dynamo"

organization := "com.recurisivity.dynamo"

version := "1.0.0-SNAPSHOT"

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-Xcheckinit")

publishTo := Some(Resolver.file("local repo",Path.userHome / ".m2/repository" asFile))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.6.1" % "test"
  , "org.apache.httpcomponents" % "httpclient" % "4.1.3"
  , "org.codehaus.jackson" % "jackson-mapper-asl" % "1.5.0"
  , "com.amazonaws" % "aws-java-sdk" % "1.3.7"
  , "com.recursivity" %% "recursivity-commons" % "0.5.7"
)

