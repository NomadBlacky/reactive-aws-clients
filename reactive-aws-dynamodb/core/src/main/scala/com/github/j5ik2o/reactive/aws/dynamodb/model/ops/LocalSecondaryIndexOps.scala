// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class LocalSecondaryIndexBuilderOps(val self: LocalSecondaryIndex.Builder) extends AnyVal {

  final def indexNameAsScala(value: Option[String]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.indexName(v)
    }
  }

  final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndex.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.keySchema(v.asJava)
    }
  }

  final def projectionAsScala(value: Option[Projection]): LocalSecondaryIndex.Builder = {
    value.fold(self) { v =>
      self.projection(v)
    }
  }

}

final class LocalSecondaryIndexOps(val self: LocalSecondaryIndex) extends AnyVal {

  final def indexNameAsScala: Option[String] = Option(self.indexName)

  final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def projectionAsScala: Option[Projection] = Option(self.projection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalSecondaryIndexOps {

  implicit def toLocalSecondaryIndexBuilderOps(v: LocalSecondaryIndex.Builder): LocalSecondaryIndexBuilderOps =
    new LocalSecondaryIndexBuilderOps(v)

  implicit def toLocalSecondaryIndexOps(v: LocalSecondaryIndex): LocalSecondaryIndexOps = new LocalSecondaryIndexOps(v)

}
