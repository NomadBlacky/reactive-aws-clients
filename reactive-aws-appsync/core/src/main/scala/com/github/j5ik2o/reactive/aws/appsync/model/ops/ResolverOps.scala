// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ResolverBuilderOps(val self: Resolver.Builder) extends AnyVal {

  final def typeNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def fieldNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

  final def dataSourceNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  final def resolverArnAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.resolverArn(v)
    }
  }

  final def requestMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  final def responseMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  final def kindAsScala(value: Option[ResolverKind]): Resolver.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  }

  final def pipelineConfigAsScala(value: Option[PipelineConfig]): Resolver.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  }

}

final class ResolverOps(val self: Resolver) extends AnyVal {

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  final def resolverArnAsScala: Option[String] = Option(self.resolverArn)

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  final def kindAsScala: Option[ResolverKind] = Option(self.kind)

  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResolverOps {

  implicit def toResolverBuilderOps(v: Resolver.Builder): ResolverBuilderOps = new ResolverBuilderOps(v)

  implicit def toResolverOps(v: Resolver): ResolverOps = new ResolverOps(v)

}
