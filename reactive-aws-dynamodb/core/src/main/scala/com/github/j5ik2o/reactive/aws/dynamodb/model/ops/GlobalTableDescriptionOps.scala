// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GlobalTableDescriptionBuilderOps(val self: GlobalTableDescription.Builder) extends AnyVal {

  final def replicationGroupAsScala(value: Option[Seq[ReplicaDescription]]): GlobalTableDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.replicationGroup(v.asJava)
    }
  }

  final def globalTableArnAsScala(value: Option[String]): GlobalTableDescription.Builder = {
    value.fold(self) { v =>
      self.globalTableArn(v)
    }
  }

  final def creationDateTimeAsScala(value: Option[java.time.Instant]): GlobalTableDescription.Builder = {
    value.fold(self) { v =>
      self.creationDateTime(v)
    }
  }

  final def globalTableStatusAsScala(value: Option[GlobalTableStatus]): GlobalTableDescription.Builder = {
    value.fold(self) { v =>
      self.globalTableStatus(v)
    }
  }

  final def globalTableNameAsScala(value: Option[String]): GlobalTableDescription.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  }

}

final class GlobalTableDescriptionOps(val self: GlobalTableDescription) extends AnyVal {

  final def replicationGroupAsScala: Option[Seq[ReplicaDescription]] = Option(self.replicationGroup).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def globalTableArnAsScala: Option[String] = Option(self.globalTableArn)

  final def creationDateTimeAsScala: Option[java.time.Instant] = Option(self.creationDateTime)

  final def globalTableStatusAsScala: Option[GlobalTableStatus] = Option(self.globalTableStatus)

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGlobalTableDescriptionOps {

  implicit def toGlobalTableDescriptionBuilderOps(v: GlobalTableDescription.Builder): GlobalTableDescriptionBuilderOps =
    new GlobalTableDescriptionBuilderOps(v)

  implicit def toGlobalTableDescriptionOps(v: GlobalTableDescription): GlobalTableDescriptionOps =
    new GlobalTableDescriptionOps(v)

}
