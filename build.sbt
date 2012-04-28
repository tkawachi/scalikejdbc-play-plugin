scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1")

externalResolvers ~= (_.filter(_.name != "Scala-Tools Maven2 Repository"))

resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases"
)

libraryDependencies <++= (scalaVersion) { scalaVersion =>
  Seq(
    "com.github.seratch" %% "scalikejdbc" % "[0.6,)",
    "play" %% "play" % "[2,)"
  )
}

// http://ls.implicit.ly/

seq(lsSettings :_*)

// https://github.com/typesafehub/sbtscalariform

seq(scalariformSettings: _*)

// publish

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://seratch.github.com/scalikejdbc</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:seratch/scalikejdbc.git</url>
    <connection>scm:git:git@github.com:seratch/scalikejdbc.git</connection>
  </scm>
  <developers>
    <developer>
      <id>seratch</id>
      <name>Kazuhuiro Sera</name>
      <url>http://seratch.net/</url>
    </developer>
  </developers>
)

