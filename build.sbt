name := "qrcode4s"

version := "0.0.1"

libraryDependencies ++= List(
  "org.scalactic" %% "scalactic" % "3.1.1",
  "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)

resolvers ++= List(
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)
