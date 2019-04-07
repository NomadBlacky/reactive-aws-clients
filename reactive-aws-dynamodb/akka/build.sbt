import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

val typeName = "Akka"

scalaWrapperGenBaseSettings(typeName, packageName = "akka")

val baseName = "DynamoDb"

sdkBaseName := baseName

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"        => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}${typeName}Client")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    Seq(s"${sdkBaseName.value}Streams${typeName}Client")
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}${typeName}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}${typeName}Client.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}Streams${typeName}Client" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}Streams${typeName}Client.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
