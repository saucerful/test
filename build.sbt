lazy val root = (project in file(".")).
  settings(
    name := "test",
    version := "1.0",
    libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.5.2",
    libraryDependencies += "org.apache.spark" % "spark-examples_2.10" % "1.1.1",
    libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.5.2",
    libraryDependencies += "org.apache.hbase" % "hbase-shell" % "0.98.16.1-hadoop2",
    libraryDependencies += "org.apache.hbase" % "hbase-common" % "0.98.16.1-hadoop2"
  )
