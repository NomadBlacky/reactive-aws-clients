// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSubnetsResponseBuilderOps(val self: DescribeSubnetsResponse.Builder) extends AnyVal {

  final def subnetsAsScala(value: Option[Seq[Subnet]]): DescribeSubnetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    }
  }

}

final class DescribeSubnetsResponseOps(val self: DescribeSubnetsResponse) extends AnyVal {

  final def subnetsAsScala: Option[Seq[Subnet]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetsResponseOps {

  implicit def toDescribeSubnetsResponseBuilderOps(
      v: DescribeSubnetsResponse.Builder
  ): DescribeSubnetsResponseBuilderOps = new DescribeSubnetsResponseBuilderOps(v)

  implicit def toDescribeSubnetsResponseOps(v: DescribeSubnetsResponse): DescribeSubnetsResponseOps =
    new DescribeSubnetsResponseOps(v)

}
