// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.{ DynamoDbStreamsAsyncClient => JavaDynamoDbStreamsAsyncClient }
import software.amazon.awssdk.services.dynamodb.streams.paginators._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DynamoDbStreamsAsyncClient {

  def apply(javaClient: JavaDynamoDbStreamsAsyncClient): DynamoDbStreamsAsyncClient =
    new DynamoDbStreamsAsyncClient {
      override val underlying: JavaDynamoDbStreamsAsyncClient = javaClient
    }

}

trait DynamoDbStreamsAsyncClient extends DynamoDbStreamsClient[Future] {
  val underlying: JavaDynamoDbStreamsAsyncClient

  override def describeStream(describeStreamRequest: DescribeStreamRequest): Future[DescribeStreamResponse] =
    underlying.describeStream(describeStreamRequest).toScala

  def describeStreamPaginator(describeStreamRequest: DescribeStreamRequest): DescribeStreamPublisher =
    underlying.describeStreamPaginator(describeStreamRequest)

  override def getRecords(getRecordsRequest: GetRecordsRequest): Future[GetRecordsResponse] =
    underlying.getRecords(getRecordsRequest).toScala

  override def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): Future[GetShardIteratorResponse] =
    underlying.getShardIterator(getShardIteratorRequest).toScala

  override def listStreams(listStreamsRequest: ListStreamsRequest): Future[ListStreamsResponse] =
    underlying.listStreams(listStreamsRequest).toScala

  override def listStreams(): Future[ListStreamsResponse] =
    underlying.listStreams().toScala

  def listStreamsPaginator(): ListStreamsPublisher =
    underlying.listStreamsPaginator()

  def listStreamsPaginator(listStreamsRequest: ListStreamsRequest): ListStreamsPublisher =
    underlying.listStreamsPaginator(listStreamsRequest)

}
