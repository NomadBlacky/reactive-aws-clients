// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeStreamResponse => ScalaDescribeStreamResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeStreamResult => JavaDescribeStreamResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamResponseOps {

  implicit class JavaDescribeStreamResponseOps(val self: JavaDescribeStreamResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamResponse = {
      ScalaDescribeStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamDescription(Option(self.getStreamDescription).map { v =>
          import StreamDescriptionOps._; v.toScala
        }) // StreamDescription
    }

  }

}
