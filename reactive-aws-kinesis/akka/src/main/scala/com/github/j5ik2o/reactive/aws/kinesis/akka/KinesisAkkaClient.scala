// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient
import software.amazon.awssdk.services.kinesis.model._

object KinesisAkkaClient {

  def apply(asyncClient: KinesisAsyncClient): KinesisAkkaClient = new KinesisAkkaClient {
    override val underlying: KinesisAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait KinesisAkkaClient {

  import KinesisAkkaClient._

  val underlying: KinesisAsyncClient

  def addTagsToStreamSource(
      addTagsToStreamRequest: AddTagsToStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AddTagsToStreamResponse, NotUsed] =
    Source.single(addTagsToStreamRequest).via(addTagsToStreamFlow(parallelism))

  def addTagsToStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AddTagsToStreamRequest, AddTagsToStreamResponse, NotUsed] =
    Flow[AddTagsToStreamRequest].mapAsync(parallelism) { addTagsToStreamRequest =>
      underlying.addTagsToStream(addTagsToStreamRequest)
    }

  def createStreamSource(
      createStreamRequest: CreateStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateStreamResponse, NotUsed] =
    Source.single(createStreamRequest).via(createStreamFlow(parallelism))

  def createStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateStreamRequest, CreateStreamResponse, NotUsed] =
    Flow[CreateStreamRequest].mapAsync(parallelism) { createStreamRequest =>
      underlying.createStream(createStreamRequest)
    }

  def decreaseStreamRetentionPeriodSource(
      decreaseStreamRetentionPeriodRequest: DecreaseStreamRetentionPeriodRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DecreaseStreamRetentionPeriodResponse, NotUsed] =
    Source.single(decreaseStreamRetentionPeriodRequest).via(decreaseStreamRetentionPeriodFlow(parallelism))

  def decreaseStreamRetentionPeriodFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DecreaseStreamRetentionPeriodRequest, DecreaseStreamRetentionPeriodResponse, NotUsed] =
    Flow[DecreaseStreamRetentionPeriodRequest].mapAsync(parallelism) { decreaseStreamRetentionPeriodRequest =>
      underlying.decreaseStreamRetentionPeriod(decreaseStreamRetentionPeriodRequest)
    }

  def deleteStreamSource(
      deleteStreamRequest: DeleteStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteStreamResponse, NotUsed] =
    Source.single(deleteStreamRequest).via(deleteStreamFlow(parallelism))

  def deleteStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteStreamRequest, DeleteStreamResponse, NotUsed] =
    Flow[DeleteStreamRequest].mapAsync(parallelism) { deleteStreamRequest =>
      underlying.deleteStream(deleteStreamRequest)
    }

  def deregisterStreamConsumerSource(
      deregisterStreamConsumerRequest: DeregisterStreamConsumerRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeregisterStreamConsumerResponse, NotUsed] =
    Source.single(deregisterStreamConsumerRequest).via(deregisterStreamConsumerFlow(parallelism))

  def deregisterStreamConsumerFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeregisterStreamConsumerRequest, DeregisterStreamConsumerResponse, NotUsed] =
    Flow[DeregisterStreamConsumerRequest].mapAsync(parallelism) { deregisterStreamConsumerRequest =>
      underlying.deregisterStreamConsumer(deregisterStreamConsumerRequest)
    }

  def describeLimitsSource(
      describeLimitsRequest: DescribeLimitsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeLimitsResponse, NotUsed] =
    Source.single(describeLimitsRequest).via(describeLimitsFlow(parallelism))

  def describeLimitsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLimitsRequest, DescribeLimitsResponse, NotUsed] =
    Flow[DescribeLimitsRequest].mapAsync(parallelism) { describeLimitsRequest =>
      underlying.describeLimits(describeLimitsRequest)
    }

  def describeLimitsSource(): Source[DescribeLimitsResponse, NotUsed] =
    Source.fromFuture(underlying.describeLimits())

  def describeStreamSource(
      describeStreamRequest: DescribeStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStreamResponse, NotUsed] =
    Source.single(describeStreamRequest).via(describeStreamFlow(parallelism))

  def describeStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStreamRequest, DescribeStreamResponse, NotUsed] =
    Flow[DescribeStreamRequest].mapAsync(parallelism) { describeStreamRequest =>
      underlying.describeStream(describeStreamRequest)
    }

  def describeStreamConsumerSource(
      describeStreamConsumerRequest: DescribeStreamConsumerRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStreamConsumerResponse, NotUsed] =
    Source.single(describeStreamConsumerRequest).via(describeStreamConsumerFlow(parallelism))

  def describeStreamConsumerFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStreamConsumerRequest, DescribeStreamConsumerResponse, NotUsed] =
    Flow[DescribeStreamConsumerRequest].mapAsync(parallelism) { describeStreamConsumerRequest =>
      underlying.describeStreamConsumer(describeStreamConsumerRequest)
    }

  def describeStreamSummarySource(
      describeStreamSummaryRequest: DescribeStreamSummaryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStreamSummaryResponse, NotUsed] =
    Source.single(describeStreamSummaryRequest).via(describeStreamSummaryFlow(parallelism))

  def describeStreamSummaryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStreamSummaryRequest, DescribeStreamSummaryResponse, NotUsed] =
    Flow[DescribeStreamSummaryRequest].mapAsync(parallelism) { describeStreamSummaryRequest =>
      underlying.describeStreamSummary(describeStreamSummaryRequest)
    }

  def disableEnhancedMonitoringSource(
      disableEnhancedMonitoringRequest: DisableEnhancedMonitoringRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableEnhancedMonitoringResponse, NotUsed] =
    Source.single(disableEnhancedMonitoringRequest).via(disableEnhancedMonitoringFlow(parallelism))

  def disableEnhancedMonitoringFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableEnhancedMonitoringRequest, DisableEnhancedMonitoringResponse, NotUsed] =
    Flow[DisableEnhancedMonitoringRequest].mapAsync(parallelism) { disableEnhancedMonitoringRequest =>
      underlying.disableEnhancedMonitoring(disableEnhancedMonitoringRequest)
    }

  def enableEnhancedMonitoringSource(
      enableEnhancedMonitoringRequest: EnableEnhancedMonitoringRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableEnhancedMonitoringResponse, NotUsed] =
    Source.single(enableEnhancedMonitoringRequest).via(enableEnhancedMonitoringFlow(parallelism))

  def enableEnhancedMonitoringFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableEnhancedMonitoringRequest, EnableEnhancedMonitoringResponse, NotUsed] =
    Flow[EnableEnhancedMonitoringRequest].mapAsync(parallelism) { enableEnhancedMonitoringRequest =>
      underlying.enableEnhancedMonitoring(enableEnhancedMonitoringRequest)
    }

  def getRecordsSource(
      getRecordsRequest: GetRecordsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetRecordsResponse, NotUsed] =
    Source.single(getRecordsRequest).via(getRecordsFlow(parallelism))

  def getRecordsFlow(parallelism: Int = DefaultParallelism): Flow[GetRecordsRequest, GetRecordsResponse, NotUsed] =
    Flow[GetRecordsRequest].mapAsync(parallelism) { getRecordsRequest =>
      underlying.getRecords(getRecordsRequest)
    }

  def getShardIteratorSource(
      getShardIteratorRequest: GetShardIteratorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetShardIteratorResponse, NotUsed] =
    Source.single(getShardIteratorRequest).via(getShardIteratorFlow(parallelism))

  def getShardIteratorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetShardIteratorRequest, GetShardIteratorResponse, NotUsed] =
    Flow[GetShardIteratorRequest].mapAsync(parallelism) { getShardIteratorRequest =>
      underlying.getShardIterator(getShardIteratorRequest)
    }

  def increaseStreamRetentionPeriodSource(
      increaseStreamRetentionPeriodRequest: IncreaseStreamRetentionPeriodRequest,
      parallelism: Int = DefaultParallelism
  ): Source[IncreaseStreamRetentionPeriodResponse, NotUsed] =
    Source.single(increaseStreamRetentionPeriodRequest).via(increaseStreamRetentionPeriodFlow(parallelism))

  def increaseStreamRetentionPeriodFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[IncreaseStreamRetentionPeriodRequest, IncreaseStreamRetentionPeriodResponse, NotUsed] =
    Flow[IncreaseStreamRetentionPeriodRequest].mapAsync(parallelism) { increaseStreamRetentionPeriodRequest =>
      underlying.increaseStreamRetentionPeriod(increaseStreamRetentionPeriodRequest)
    }

  def listShardsSource(
      listShardsRequest: ListShardsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListShardsResponse, NotUsed] =
    Source.single(listShardsRequest).via(listShardsFlow(parallelism))

  def listShardsFlow(parallelism: Int = DefaultParallelism): Flow[ListShardsRequest, ListShardsResponse, NotUsed] =
    Flow[ListShardsRequest].mapAsync(parallelism) { listShardsRequest =>
      underlying.listShards(listShardsRequest)
    }

  def listStreamConsumersSource(
      listStreamConsumersRequest: ListStreamConsumersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListStreamConsumersResponse, NotUsed] =
    Source.single(listStreamConsumersRequest).via(listStreamConsumersFlow(parallelism))

  def listStreamConsumersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStreamConsumersRequest, ListStreamConsumersResponse, NotUsed] =
    Flow[ListStreamConsumersRequest].mapAsync(parallelism) { listStreamConsumersRequest =>
      underlying.listStreamConsumers(listStreamConsumersRequest)
    }

  def listStreamConsumersPaginatorFlow: Flow[ListStreamConsumersRequest, ListStreamConsumersResponse, NotUsed] =
    Flow[ListStreamConsumersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStreamConsumersPaginator(request))
    }

  def listStreamsSource(
      listStreamsRequest: ListStreamsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListStreamsResponse, NotUsed] =
    Source.single(listStreamsRequest).via(listStreamsFlow(parallelism))

  def listStreamsFlow(parallelism: Int = DefaultParallelism): Flow[ListStreamsRequest, ListStreamsResponse, NotUsed] =
    Flow[ListStreamsRequest].mapAsync(parallelism) { listStreamsRequest =>
      underlying.listStreams(listStreamsRequest)
    }

  def listStreamsSource(): Source[ListStreamsResponse, NotUsed] =
    Source.fromFuture(underlying.listStreams())

  def listTagsForStreamSource(
      listTagsForStreamRequest: ListTagsForStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsForStreamResponse, NotUsed] =
    Source.single(listTagsForStreamRequest).via(listTagsForStreamFlow(parallelism))

  def listTagsForStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsForStreamRequest, ListTagsForStreamResponse, NotUsed] =
    Flow[ListTagsForStreamRequest].mapAsync(parallelism) { listTagsForStreamRequest =>
      underlying.listTagsForStream(listTagsForStreamRequest)
    }

  def mergeShardsSource(
      mergeShardsRequest: MergeShardsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[MergeShardsResponse, NotUsed] =
    Source.single(mergeShardsRequest).via(mergeShardsFlow(parallelism))

  def mergeShardsFlow(parallelism: Int = DefaultParallelism): Flow[MergeShardsRequest, MergeShardsResponse, NotUsed] =
    Flow[MergeShardsRequest].mapAsync(parallelism) { mergeShardsRequest =>
      underlying.mergeShards(mergeShardsRequest)
    }

  def putRecordSource(
      putRecordRequest: PutRecordRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutRecordResponse, NotUsed] =
    Source.single(putRecordRequest).via(putRecordFlow(parallelism))

  def putRecordFlow(parallelism: Int = DefaultParallelism): Flow[PutRecordRequest, PutRecordResponse, NotUsed] =
    Flow[PutRecordRequest].mapAsync(parallelism) { putRecordRequest =>
      underlying.putRecord(putRecordRequest)
    }

  def putRecordsSource(
      putRecordsRequest: PutRecordsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutRecordsResponse, NotUsed] =
    Source.single(putRecordsRequest).via(putRecordsFlow(parallelism))

  def putRecordsFlow(parallelism: Int = DefaultParallelism): Flow[PutRecordsRequest, PutRecordsResponse, NotUsed] =
    Flow[PutRecordsRequest].mapAsync(parallelism) { putRecordsRequest =>
      underlying.putRecords(putRecordsRequest)
    }

  def registerStreamConsumerSource(
      registerStreamConsumerRequest: RegisterStreamConsumerRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RegisterStreamConsumerResponse, NotUsed] =
    Source.single(registerStreamConsumerRequest).via(registerStreamConsumerFlow(parallelism))

  def registerStreamConsumerFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RegisterStreamConsumerRequest, RegisterStreamConsumerResponse, NotUsed] =
    Flow[RegisterStreamConsumerRequest].mapAsync(parallelism) { registerStreamConsumerRequest =>
      underlying.registerStreamConsumer(registerStreamConsumerRequest)
    }

  def removeTagsFromStreamSource(
      removeTagsFromStreamRequest: RemoveTagsFromStreamRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RemoveTagsFromStreamResponse, NotUsed] =
    Source.single(removeTagsFromStreamRequest).via(removeTagsFromStreamFlow(parallelism))

  def removeTagsFromStreamFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RemoveTagsFromStreamRequest, RemoveTagsFromStreamResponse, NotUsed] =
    Flow[RemoveTagsFromStreamRequest].mapAsync(parallelism) { removeTagsFromStreamRequest =>
      underlying.removeTagsFromStream(removeTagsFromStreamRequest)
    }

  def splitShardSource(
      splitShardRequest: SplitShardRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SplitShardResponse, NotUsed] =
    Source.single(splitShardRequest).via(splitShardFlow(parallelism))

  def splitShardFlow(parallelism: Int = DefaultParallelism): Flow[SplitShardRequest, SplitShardResponse, NotUsed] =
    Flow[SplitShardRequest].mapAsync(parallelism) { splitShardRequest =>
      underlying.splitShard(splitShardRequest)
    }

  def startStreamEncryptionSource(
      startStreamEncryptionRequest: StartStreamEncryptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartStreamEncryptionResponse, NotUsed] =
    Source.single(startStreamEncryptionRequest).via(startStreamEncryptionFlow(parallelism))

  def startStreamEncryptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartStreamEncryptionRequest, StartStreamEncryptionResponse, NotUsed] =
    Flow[StartStreamEncryptionRequest].mapAsync(parallelism) { startStreamEncryptionRequest =>
      underlying.startStreamEncryption(startStreamEncryptionRequest)
    }

  def stopStreamEncryptionSource(
      stopStreamEncryptionRequest: StopStreamEncryptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StopStreamEncryptionResponse, NotUsed] =
    Source.single(stopStreamEncryptionRequest).via(stopStreamEncryptionFlow(parallelism))

  def stopStreamEncryptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StopStreamEncryptionRequest, StopStreamEncryptionResponse, NotUsed] =
    Flow[StopStreamEncryptionRequest].mapAsync(parallelism) { stopStreamEncryptionRequest =>
      underlying.stopStreamEncryption(stopStreamEncryptionRequest)
    }

  def subscribeToShardSource(
      subscribeToShardRequest: SubscribeToShardRequest,
      asyncResponseHandler: SubscribeToShardResponseHandler,
      parallelism: Int = DefaultParallelism
  ): Source[Unit, NotUsed] =
    Source.single((subscribeToShardRequest, asyncResponseHandler)).via(subscribeToShardFlow(parallelism))

  def subscribeToShardFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(SubscribeToShardRequest, SubscribeToShardResponseHandler), Unit, NotUsed] =
    Flow[(SubscribeToShardRequest, SubscribeToShardResponseHandler)].mapAsync(parallelism) {
      case (subscribeToShardRequest, asyncResponseHandler) =>
        underlying.subscribeToShard(subscribeToShardRequest, asyncResponseHandler)
    }

  def updateShardCountSource(
      updateShardCountRequest: UpdateShardCountRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateShardCountResponse, NotUsed] =
    Source.single(updateShardCountRequest).via(updateShardCountFlow(parallelism))

  def updateShardCountFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateShardCountRequest, UpdateShardCountResponse, NotUsed] =
    Flow[UpdateShardCountRequest].mapAsync(parallelism) { updateShardCountRequest =>
      underlying.updateShardCount(updateShardCountRequest)
    }

}
