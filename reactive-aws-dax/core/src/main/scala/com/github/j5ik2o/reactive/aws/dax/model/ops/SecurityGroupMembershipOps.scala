// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SecurityGroupMembershipBuilderOps(val self: SecurityGroupMembership.Builder) extends AnyVal {

  final def securityGroupIdentifierAsScala(value: Option[String]): SecurityGroupMembership.Builder = {
    value.fold(self) { v =>
      self.securityGroupIdentifier(v)
    }
  }

  final def statusAsScala(value: Option[String]): SecurityGroupMembership.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class SecurityGroupMembershipOps(val self: SecurityGroupMembership) extends AnyVal {

  final def securityGroupIdentifierAsScala: Option[String] = Option(self.securityGroupIdentifier)

  final def statusAsScala: Option[String] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecurityGroupMembershipOps {

  implicit def toSecurityGroupMembershipBuilderOps(
      v: SecurityGroupMembership.Builder
  ): SecurityGroupMembershipBuilderOps = new SecurityGroupMembershipBuilderOps(v)

  implicit def toSecurityGroupMembershipOps(v: SecurityGroupMembership): SecurityGroupMembershipOps =
    new SecurityGroupMembershipOps(v)

}
