// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeClustersRequestBuilderOps(val self: DescribeClustersRequest.Builder) extends AnyVal {

  final def clusterNamesAsScala(value: Option[Seq[String]]): DescribeClustersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clusterNames(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeClustersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClustersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClustersRequestOps(val self: DescribeClustersRequest) extends AnyVal {

  final def clusterNamesAsScala: Option[Seq[String]] = Option(self.clusterNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersRequestOps {

  implicit def toDescribeClustersRequestBuilderOps(
      v: DescribeClustersRequest.Builder
  ): DescribeClustersRequestBuilderOps = new DescribeClustersRequestBuilderOps(v)

  implicit def toDescribeClustersRequestOps(v: DescribeClustersRequest): DescribeClustersRequestOps =
    new DescribeClustersRequestOps(v)

}
