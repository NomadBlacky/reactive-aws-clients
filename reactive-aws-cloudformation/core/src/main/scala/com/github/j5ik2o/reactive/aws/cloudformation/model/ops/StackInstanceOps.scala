// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceBuilderOps(val self: StackInstance.Builder) extends AnyVal {

  final def stackSetIdAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  final def regionAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  }

  final def accountAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  }

  final def stackIdAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def parameterOverridesAsScala(value: Option[Seq[Parameter]]): StackInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameterOverrides(v.asJava)
    }
  }

  final def statusAsScala(value: Option[StackInstanceStatus]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

}

final class StackInstanceOps(val self: StackInstance) extends AnyVal {

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  final def regionAsScala: Option[String] = Option(self.region)

  final def accountAsScala: Option[String] = Option(self.account)

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def parameterOverridesAsScala: Option[Seq[Parameter]] = Option(self.parameterOverrides).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[StackInstanceStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceOps {

  implicit def toStackInstanceBuilderOps(v: StackInstance.Builder): StackInstanceBuilderOps =
    new StackInstanceBuilderOps(v)

  implicit def toStackInstanceOps(v: StackInstance): StackInstanceOps = new StackInstanceOps(v)

}
