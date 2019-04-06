// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketRequestPaymentResponseBuilderOps(val self: GetBucketRequestPaymentResponse.Builder)
    extends AnyVal {

  final def withPayerAsScala(value: Option[Payer]): GetBucketRequestPaymentResponse.Builder = {
    value.fold(self) { v =>
      self.payer(v)
    }
  } // String

}

final class GetBucketRequestPaymentResponseOps(val self: GetBucketRequestPaymentResponse) extends AnyVal {

  final def payerAsScala: Option[Payer] = Option(self.payer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketRequestPaymentResponseOps {

  implicit def toGetBucketRequestPaymentResponseBuilderOps(
      v: GetBucketRequestPaymentResponse.Builder
  ): GetBucketRequestPaymentResponseBuilderOps = new GetBucketRequestPaymentResponseBuilderOps(v)

  implicit def toGetBucketRequestPaymentResponseOps(
      v: GetBucketRequestPaymentResponse
  ): GetBucketRequestPaymentResponseOps = new GetBucketRequestPaymentResponseOps(v)

}