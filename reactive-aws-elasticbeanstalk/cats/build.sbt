import Settings._

coreSettings

scalaWrapperGenBaseSettings("CatsIO", "cats")

sdkBaseName := "ElasticBeanstalk"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
