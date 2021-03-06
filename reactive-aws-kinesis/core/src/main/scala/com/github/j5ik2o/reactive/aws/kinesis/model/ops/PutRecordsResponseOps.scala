// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsResponseBuilderOps(val self: PutRecordsResponse.Builder) extends AnyVal {

  final def failedRecordCountAsScala(value: Option[Int]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.failedRecordCount(v)
    }
  }

  final def recordsAsScala(value: Option[Seq[PutRecordsResultEntry]]): PutRecordsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.records(v.asJava)
    }
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): PutRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

}

final class PutRecordsResponseOps(val self: PutRecordsResponse) extends AnyVal {

  final def failedRecordCountAsScala: Option[Int] = Option(self.failedRecordCount)

  final def recordsAsScala: Option[Seq[PutRecordsResultEntry]] = Option(self.records).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsResponseOps {

  implicit def toPutRecordsResponseBuilderOps(v: PutRecordsResponse.Builder): PutRecordsResponseBuilderOps =
    new PutRecordsResponseBuilderOps(v)

  implicit def toPutRecordsResponseOps(v: PutRecordsResponse): PutRecordsResponseOps = new PutRecordsResponseOps(v)

}
