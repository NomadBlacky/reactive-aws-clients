// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectLegalHoldRequestBuilderOps(val self: GetObjectLegalHoldRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): GetObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): GetObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): GetObjectLegalHoldRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

}

final class GetObjectLegalHoldRequestOps(val self: GetObjectLegalHoldRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectLegalHoldRequestOps {

  implicit def toGetObjectLegalHoldRequestBuilderOps(
      v: GetObjectLegalHoldRequest.Builder
  ): GetObjectLegalHoldRequestBuilderOps = new GetObjectLegalHoldRequestBuilderOps(v)

  implicit def toGetObjectLegalHoldRequestOps(v: GetObjectLegalHoldRequest): GetObjectLegalHoldRequestOps =
    new GetObjectLegalHoldRequestOps(v)

}
