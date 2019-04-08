// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackInstanceRequestBuilderOps(val self: DescribeStackInstanceRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): DescribeStackInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def stackInstanceAccountAsScala(value: Option[String]): DescribeStackInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.stackInstanceAccount(v)
    }
  } // String

  final def stackInstanceRegionAsScala(value: Option[String]): DescribeStackInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.stackInstanceRegion(v)
    }
  } // String

}

final class DescribeStackInstanceRequestOps(val self: DescribeStackInstanceRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def stackInstanceAccountAsScala: Option[String] = Option(self.stackInstanceAccount) // String

  final def stackInstanceRegionAsScala: Option[String] = Option(self.stackInstanceRegion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackInstanceRequestOps {

  implicit def toDescribeStackInstanceRequestBuilderOps(
      v: DescribeStackInstanceRequest.Builder
  ): DescribeStackInstanceRequestBuilderOps = new DescribeStackInstanceRequestBuilderOps(v)

  implicit def toDescribeStackInstanceRequestOps(v: DescribeStackInstanceRequest): DescribeStackInstanceRequestOps =
    new DescribeStackInstanceRequestOps(v)

}
