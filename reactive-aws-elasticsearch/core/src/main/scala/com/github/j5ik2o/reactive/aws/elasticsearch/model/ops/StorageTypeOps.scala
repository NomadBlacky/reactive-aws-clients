// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StorageTypeBuilderOps(val self: StorageType.Builder) extends AnyVal {

  final def storageTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageTypeName(v)
    }
  }

  final def storageSubTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageSubTypeName(v)
    }
  }

  final def storageTypeLimitsAsScala(value: Option[Seq[StorageTypeLimit]]): StorageType.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.storageTypeLimits(v.asJava)
    }
  }

}

final class StorageTypeOps(val self: StorageType) extends AnyVal {

  final def storageTypeNameAsScala: Option[String] = Option(self.storageTypeName)

  final def storageSubTypeNameAsScala: Option[String] = Option(self.storageSubTypeName)

  final def storageTypeLimitsAsScala: Option[Seq[StorageTypeLimit]] = Option(self.storageTypeLimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageTypeOps {

  implicit def toStorageTypeBuilderOps(v: StorageType.Builder): StorageTypeBuilderOps = new StorageTypeBuilderOps(v)

  implicit def toStorageTypeOps(v: StorageType): StorageTypeOps = new StorageTypeOps(v)

}
