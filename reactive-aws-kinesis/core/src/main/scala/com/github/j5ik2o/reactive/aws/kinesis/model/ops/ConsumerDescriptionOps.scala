// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerDescriptionBuilderOps(val self: ConsumerDescription.Builder) extends AnyVal {

  final def consumerNameAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  } // String

  final def consumerARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  } // String

  final def consumerStatusAsScala(value: Option[ConsumerStatus]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerStatus(v)
    }
  } // ConsumerStatus

  final def consumerCreationTimestampAsScala(value: Option[java.time.Instant]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.consumerCreationTimestamp(v)
    }
  } // java.time.Instant

  final def streamARNAsScala(value: Option[String]): ConsumerDescription.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  } // String

}

final class ConsumerDescriptionOps(val self: ConsumerDescription) extends AnyVal {

  final def consumerNameAsScala: Option[String] = Option(self.consumerName) // String

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN) // String

  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus) // ConsumerStatus

  final def consumerCreationTimestampAsScala: Option[java.time.Instant] =
    Option(self.consumerCreationTimestamp) // java.time.Instant

  final def streamARNAsScala: Option[String] = Option(self.streamARN) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerDescriptionOps {

  implicit def toConsumerDescriptionBuilderOps(v: ConsumerDescription.Builder): ConsumerDescriptionBuilderOps =
    new ConsumerDescriptionBuilderOps(v)

  implicit def toConsumerDescriptionOps(v: ConsumerDescription): ConsumerDescriptionOps = new ConsumerDescriptionOps(v)

}
