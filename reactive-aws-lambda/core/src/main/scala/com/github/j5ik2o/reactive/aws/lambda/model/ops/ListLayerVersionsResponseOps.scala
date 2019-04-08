// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayerVersionsResponseBuilderOps(val self: ListLayerVersionsResponse.Builder) extends AnyVal {

  final def nextMarkerAsScala(value: Option[String]): ListLayerVersionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  } // String

  final def layerVersionsAsScala(value: Option[Seq[LayerVersionsListItem]]): ListLayerVersionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layerVersions(v.asJava)
    } // Seq[LayerVersionsListItem]
  }

}

final class ListLayerVersionsResponseOps(val self: ListLayerVersionsResponse) extends AnyVal {

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker) // String

  final def layerVersionsAsScala: Option[Seq[LayerVersionsListItem]] = Option(self.layerVersions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[LayerVersionsListItem]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayerVersionsResponseOps {

  implicit def toListLayerVersionsResponseBuilderOps(
      v: ListLayerVersionsResponse.Builder
  ): ListLayerVersionsResponseBuilderOps = new ListLayerVersionsResponseBuilderOps(v)

  implicit def toListLayerVersionsResponseOps(v: ListLayerVersionsResponse): ListLayerVersionsResponseOps =
    new ListLayerVersionsResponseOps(v)

}
