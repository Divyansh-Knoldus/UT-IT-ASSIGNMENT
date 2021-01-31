name := "UT-IT"

version := "1.0"

scalaVersion := "2.12.12"
val scalatest_dependency= "org.scalatest" %% "scalatest" % "3.2.2" % "test"
val mockito_dependency= "org.mockito" %% "mockito-scala" % "1.5.12" % "test"
lazy val module_For_Q1_Q2 = project.in(file("module_For_Q1_Q2")).settings(
  libraryDependencies +=scalatest_dependency
)
lazy val module_For_Q3 = project.in(file("module_For_Q3")).settings(
  libraryDependencies ++=Seq(scalatest_dependency, mockito_dependency)
)
