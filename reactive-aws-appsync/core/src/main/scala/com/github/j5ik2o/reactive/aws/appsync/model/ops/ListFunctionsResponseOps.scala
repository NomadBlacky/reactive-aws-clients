// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListFunctionsResponseBuilderOps(val self: ListFunctionsResponse.Builder) extends AnyVal {

  final def withFunctionsAsScala(value: Option[Seq[FunctionConfiguration]]): ListFunctionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.functions(v.asJava)
    } // Seq[FunctionConfiguration]
  }

  final def withNextTokenAsScala(value: Option[String]): ListFunctionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListFunctionsResponseOps(val self: ListFunctionsResponse) extends AnyVal {

  final def functionsAsScala: Option[Seq[FunctionConfiguration]] = Option(self.functions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[FunctionConfiguration]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsResponseOps {

  implicit def toListFunctionsResponseBuilderOps(v: ListFunctionsResponse.Builder): ListFunctionsResponseBuilderOps =
    new ListFunctionsResponseBuilderOps(v)

  implicit def toListFunctionsResponseOps(v: ListFunctionsResponse): ListFunctionsResponseOps =
    new ListFunctionsResponseOps(v)

}
