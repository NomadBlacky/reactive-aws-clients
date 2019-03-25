package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Delete => ScalaDelete, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Delete => JavaDelete }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteOps {

  implicit class ScalaDeleteOps(val self: ScalaDelete) extends AnyVal {

    def toJava: JavaDelete = {
      val result = JavaDelete.builder()
      self.key.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                     // String, case String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.conditionExpression(v)) // String, case String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnValuesOnConditionCheckFailure.foreach { v =>
        import ReturnValuesOnConditionCheckFailureOps._; result.returnValuesOnConditionCheckFailure(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaDeleteOps(val self: JavaDelete) extends AnyVal {

    def toScala: ScalaDelete = {
      ScalaDelete()
        .withKey(Option(self.key).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withTableName(Option(self.tableName)) // String
        .withConditionExpression(Option(self.conditionExpression)) // String
        .withExpressionAttributeNames(Option(self.expressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
        .withExpressionAttributeValues(Option(self.expressionAttributeValues).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withReturnValuesOnConditionCheckFailure(Option(self.returnValuesOnConditionCheckFailure).map { v =>
          import ReturnValuesOnConditionCheckFailureOps._; v.toScala
        }) // String
    }

  }

}
