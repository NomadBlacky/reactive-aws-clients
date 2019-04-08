// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectRequestBuilderOps(val self: DeleteObjectRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def mfaAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.mfa(v)
    }
  } // String

  final def versionIdAsScala(value: Option[String]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

  final def bypassGovernanceRetentionAsScala(value: Option[Boolean]): DeleteObjectRequest.Builder = {
    value.fold(self) { v =>
      self.bypassGovernanceRetention(v)
    }
  } // Boolean

}

final class DeleteObjectRequestOps(val self: DeleteObjectRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def mfaAsScala: Option[String] = Option(self.mfa) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

  final def bypassGovernanceRetentionAsScala: Option[Boolean] = Option(self.bypassGovernanceRetention) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectRequestOps {

  implicit def toDeleteObjectRequestBuilderOps(v: DeleteObjectRequest.Builder): DeleteObjectRequestBuilderOps =
    new DeleteObjectRequestBuilderOps(v)

  implicit def toDeleteObjectRequestOps(v: DeleteObjectRequest): DeleteObjectRequestOps = new DeleteObjectRequestOps(v)

}
