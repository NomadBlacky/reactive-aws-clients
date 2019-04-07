// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class TagResourceRequestBuilderOps(val self: TagResourceRequest.Builder) extends AnyVal {

  final def withResourceNameAsScala(value: Option[String]): TagResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceName(v)
    }
  } // String

  final def withTagsAsScala(value: Option[Seq[Tag]]): TagResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

}

final class TagResourceRequestOps(val self: TagResourceRequest) extends AnyVal {

  final def resourceNameAsScala: Option[String] = Option(self.resourceName) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagResourceRequestOps {

  implicit def toTagResourceRequestBuilderOps(v: TagResourceRequest.Builder): TagResourceRequestBuilderOps =
    new TagResourceRequestBuilderOps(v)

  implicit def toTagResourceRequestOps(v: TagResourceRequest): TagResourceRequestOps = new TagResourceRequestOps(v)

}
