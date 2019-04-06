// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MultipartUploadBuilderOps(val self: MultipartUpload.Builder) extends AnyVal {

  final def withUploadIdAsScala(value: Option[String]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withInitiatedAsScala(value: Option[java.time.Instant]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.initiated(v)
    }
  } // Instant

  final def withStorageClassAsScala(value: Option[StorageClass]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withOwnerAsScala(value: Option[Owner]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

  final def withInitiatorAsScala(value: Option[Initiator]): MultipartUpload.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  } // Initiator

}

final class MultipartUploadOps(val self: MultipartUpload) extends AnyVal {

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def initiatedAsScala: Option[java.time.Instant] = Option(self.initiated) // Instant

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

  final def initiatorAsScala: Option[Initiator] = Option(self.initiator) // Initiator

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMultipartUploadOps {

  implicit def toMultipartUploadBuilderOps(v: MultipartUpload.Builder): MultipartUploadBuilderOps =
    new MultipartUploadBuilderOps(v)

  implicit def toMultipartUploadOps(v: MultipartUpload): MultipartUploadOps = new MultipartUploadOps(v)

}