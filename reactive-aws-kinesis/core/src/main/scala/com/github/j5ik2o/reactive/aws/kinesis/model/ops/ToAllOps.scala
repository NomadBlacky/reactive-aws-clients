package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
    extends ToOptionSupport
    with ToAddTagsToStreamRequestOps
    with ToConsumerDescriptionOps
    with ToConsumerOps
    with ToCreateStreamRequestOps
    with ToDecreaseStreamRetentionPeriodRequestOps
    with ToDeleteStreamRequestOps
    with ToDeregisterStreamConsumerRequestOps
    with ToDescribeLimitsResponseOps
    with ToDescribeStreamConsumerRequestOps
    with ToDescribeStreamConsumerResponseOps
    with ToDescribeStreamRequestOps
    with ToDescribeStreamResponseOps
    with ToDescribeStreamSummaryRequestOps
    with ToDescribeStreamSummaryResponseOps
    with ToDisableEnhancedMonitoringRequestOps
    with ToDisableEnhancedMonitoringResponseOps
    with ToEnableEnhancedMonitoringRequestOps
    with ToEnableEnhancedMonitoringResponseOps
    with ToEnhancedMetricsOps
    with ToGetRecordsRequestOps
    with ToGetRecordsResponseOps
    with ToGetShardIteratorRequestOps
    with ToGetShardIteratorResponseOps
    with ToHashKeyRangeOps
    with ToIncreaseStreamRetentionPeriodRequestOps
    with ToListShardsRequestOps
    with ToListShardsResponseOps
    with ToListStreamConsumersRequestOps
    with ToListStreamConsumersResponseOps
    with ToListStreamsRequestOps
    with ToListStreamsResponseOps
    with ToListTagsForStreamRequestOps
    with ToListTagsForStreamResponseOps
    with ToMergeShardsRequestOps
    with ToPutRecordRequestOps
    with ToPutRecordResponseOps
    with ToPutRecordsRequestEntryOps
    with ToPutRecordsRequestOps
    with ToPutRecordsResponseOps
    with ToPutRecordsResultEntryOps
    with ToRecordOps
    with ToRegisterStreamConsumerRequestOps
    with ToRegisterStreamConsumerResponseOps
    with ToRemoveTagsFromStreamRequestOps
    with ToSequenceNumberRangeOps
    with ToShardOps
    with ToSplitShardRequestOps
    with ToStartStreamEncryptionRequestOps
    with ToStartingPositionOps
    with ToStopStreamEncryptionRequestOps
    with ToStreamDescriptionOps
    with ToStreamDescriptionSummaryOps
    with ToSubscribeToShardEventOps
    with ToSubscribeToShardRequestOps
    with ToTagOps
    with ToUpdateShardCountRequestOps
    with ToUpdateShardCountResponseOps
