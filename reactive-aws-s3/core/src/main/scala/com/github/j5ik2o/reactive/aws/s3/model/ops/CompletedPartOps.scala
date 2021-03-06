// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompletedPartBuilderOps(val self: CompletedPart.Builder) extends AnyVal {

  final def eTagAsScala(value: Option[String]): CompletedPart.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  final def partNumberAsScala(value: Option[Int]): CompletedPart.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  }

}

final class CompletedPartOps(val self: CompletedPart) extends AnyVal {

  final def eTagAsScala: Option[String] = Option(self.eTag)

  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompletedPartOps {

  implicit def toCompletedPartBuilderOps(v: CompletedPart.Builder): CompletedPartBuilderOps =
    new CompletedPartBuilderOps(v)

  implicit def toCompletedPartOps(v: CompletedPart): CompletedPartOps = new CompletedPartOps(v)

}
