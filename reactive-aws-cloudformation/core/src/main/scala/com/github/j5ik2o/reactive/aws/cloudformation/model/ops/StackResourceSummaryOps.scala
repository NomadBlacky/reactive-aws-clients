// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceSummaryBuilderOps(val self: StackResourceSummary.Builder) extends AnyVal {

  final def logicalResourceIdAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def lastUpdatedTimestampAsScala(value: Option[java.time.Instant]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTimestamp(v)
    }
  }

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  }

  final def resourceStatusReasonAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  }

  final def driftInformationAsScala(
      value: Option[StackResourceDriftInformationSummary]
  ): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackResourceSummaryOps(val self: StackResourceSummary) extends AnyVal {

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def lastUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTimestamp)

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  final def driftInformationAsScala: Option[StackResourceDriftInformationSummary] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceSummaryOps {

  implicit def toStackResourceSummaryBuilderOps(v: StackResourceSummary.Builder): StackResourceSummaryBuilderOps =
    new StackResourceSummaryBuilderOps(v)

  implicit def toStackResourceSummaryOps(v: StackResourceSummary): StackResourceSummaryOps =
    new StackResourceSummaryOps(v)

}
