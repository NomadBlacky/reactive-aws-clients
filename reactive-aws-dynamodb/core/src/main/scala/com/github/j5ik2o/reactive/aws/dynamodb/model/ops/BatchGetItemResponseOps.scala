// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BatchGetItemResponseBuilderOps(val self: BatchGetItemResponse.Builder) extends AnyVal {

  final def responsesAsScala(
      value: Option[Map[String, Seq[Map[String, AttributeValue]]]]
  ): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.responses(v.mapValues(_.map(_.asJava).asJava).asJava)
    }
  }

  final def unprocessedKeysAsScala(value: Option[Map[String, KeysAndAttributes]]): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unprocessedKeys(v.asJava)
    }
  }

  final def consumedCapacityAsScala(value: Option[Seq[ConsumedCapacity]]): BatchGetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.consumedCapacity(v.asJava)
    }
  }

}

final class BatchGetItemResponseOps(val self: BatchGetItemResponse) extends AnyVal {

  final def responsesAsScala: Option[Map[String, Seq[Map[String, AttributeValue]]]] = Option(self.responses).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap))
  }

  final def unprocessedKeysAsScala: Option[Map[String, KeysAndAttributes]] = Option(self.unprocessedKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def consumedCapacityAsScala: Option[Seq[ConsumedCapacity]] = Option(self.consumedCapacity).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetItemResponseOps {

  implicit def toBatchGetItemResponseBuilderOps(v: BatchGetItemResponse.Builder): BatchGetItemResponseBuilderOps =
    new BatchGetItemResponseBuilderOps(v)

  implicit def toBatchGetItemResponseOps(v: BatchGetItemResponse): BatchGetItemResponseOps =
    new BatchGetItemResponseOps(v)

}
