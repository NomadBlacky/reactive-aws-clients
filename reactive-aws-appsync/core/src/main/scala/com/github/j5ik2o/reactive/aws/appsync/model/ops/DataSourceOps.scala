// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DataSourceBuilderOps(val self: DataSource.Builder) extends AnyVal {

  final def dataSourceArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.dataSourceArn(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def typeAsScala(value: Option[DataSourceType]): DataSource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // DataSourceType

  final def serviceRoleArnAsScala(value: Option[String]): DataSource.Builder = {
    value.fold(self) { v =>
      self.serviceRoleArn(v)
    }
  } // String

  final def dynamodbConfigAsScala(value: Option[DynamodbDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.dynamodbConfig(v)
    }
  } // DynamodbDataSourceConfig

  final def lambdaConfigAsScala(value: Option[LambdaDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.lambdaConfig(v)
    }
  } // LambdaDataSourceConfig

  final def elasticsearchConfigAsScala(value: Option[ElasticsearchDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.elasticsearchConfig(v)
    }
  } // ElasticsearchDataSourceConfig

  final def httpConfigAsScala(value: Option[HttpDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.httpConfig(v)
    }
  } // HttpDataSourceConfig

  final def relationalDatabaseConfigAsScala(value: Option[RelationalDatabaseDataSourceConfig]): DataSource.Builder = {
    value.fold(self) { v =>
      self.relationalDatabaseConfig(v)
    }
  } // RelationalDatabaseDataSourceConfig

}

final class DataSourceOps(val self: DataSource) extends AnyVal {

  final def dataSourceArnAsScala: Option[String] = Option(self.dataSourceArn) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def typeAsScala: Option[DataSourceType] = Option(self.`type`) // DataSourceType

  final def serviceRoleArnAsScala: Option[String] = Option(self.serviceRoleArn) // String

  final def dynamodbConfigAsScala: Option[DynamodbDataSourceConfig] =
    Option(self.dynamodbConfig) // DynamodbDataSourceConfig

  final def lambdaConfigAsScala: Option[LambdaDataSourceConfig] = Option(self.lambdaConfig) // LambdaDataSourceConfig

  final def elasticsearchConfigAsScala: Option[ElasticsearchDataSourceConfig] =
    Option(self.elasticsearchConfig) // ElasticsearchDataSourceConfig

  final def httpConfigAsScala: Option[HttpDataSourceConfig] = Option(self.httpConfig) // HttpDataSourceConfig

  final def relationalDatabaseConfigAsScala: Option[RelationalDatabaseDataSourceConfig] =
    Option(self.relationalDatabaseConfig) // RelationalDatabaseDataSourceConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDataSourceOps {

  implicit def toDataSourceBuilderOps(v: DataSource.Builder): DataSourceBuilderOps = new DataSourceBuilderOps(v)

  implicit def toDataSourceOps(v: DataSource): DataSourceOps = new DataSourceOps(v)

}
