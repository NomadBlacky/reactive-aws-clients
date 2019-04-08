// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BackupSummaryBuilderOps(val self: BackupSummary.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def tableIdAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableId(v)
    }
  } // String

  final def tableArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.tableArn(v)
    }
  } // String

  final def backupArnAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupArn(v)
    }
  } // String

  final def backupNameAsScala(value: Option[String]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupName(v)
    }
  } // String

  final def backupCreationDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupCreationDateTime(v)
    }
  } // java.time.Instant

  final def backupExpiryDateTimeAsScala(value: Option[java.time.Instant]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupExpiryDateTime(v)
    }
  } // java.time.Instant

  final def backupStatusAsScala(value: Option[BackupStatus]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupStatus(v)
    }
  } // BackupStatus

  final def backupTypeAsScala(value: Option[BackupType]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  } // BackupType

  final def backupSizeBytesAsScala(value: Option[Long]): BackupSummary.Builder = {
    value.fold(self) { v =>
      self.backupSizeBytes(v)
    }
  } // Long

}

final class BackupSummaryOps(val self: BackupSummary) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def tableIdAsScala: Option[String] = Option(self.tableId) // String

  final def tableArnAsScala: Option[String] = Option(self.tableArn) // String

  final def backupArnAsScala: Option[String] = Option(self.backupArn) // String

  final def backupNameAsScala: Option[String] = Option(self.backupName) // String

  final def backupCreationDateTimeAsScala: Option[java.time.Instant] =
    Option(self.backupCreationDateTime) // java.time.Instant

  final def backupExpiryDateTimeAsScala: Option[java.time.Instant] =
    Option(self.backupExpiryDateTime) // java.time.Instant

  final def backupStatusAsScala: Option[BackupStatus] = Option(self.backupStatus) // BackupStatus

  final def backupTypeAsScala: Option[BackupType] = Option(self.backupType) // BackupType

  final def backupSizeBytesAsScala: Option[Long] = Option(self.backupSizeBytes) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBackupSummaryOps {

  implicit def toBackupSummaryBuilderOps(v: BackupSummary.Builder): BackupSummaryBuilderOps =
    new BackupSummaryBuilderOps(v)

  implicit def toBackupSummaryOps(v: BackupSummary): BackupSummaryOps = new BackupSummaryOps(v)

}
