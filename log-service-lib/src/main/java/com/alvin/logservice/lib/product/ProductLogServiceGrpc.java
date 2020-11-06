package com.alvin.logservice.lib.product;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: ProductLogService.proto")
public final class ProductLogServiceGrpc {

  private ProductLogServiceGrpc() {}

  public static final String SERVICE_NAME = "com.alvin.logservice.lib.product.ProductLogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.alvin.logservice.lib.product.ProductLogRequest,
      com.alvin.logservice.lib.product.ProductLogReply> METHOD_SAVE_LOG =
      io.grpc.MethodDescriptor.<com.alvin.logservice.lib.product.ProductLogRequest, com.alvin.logservice.lib.product.ProductLogReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.alvin.logservice.lib.product.ProductLogService", "saveLog"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alvin.logservice.lib.product.ProductLogRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alvin.logservice.lib.product.ProductLogReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductLogServiceStub newStub(io.grpc.Channel channel) {
    return new ProductLogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductLogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductLogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductLogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductLogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductLogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveLog(com.alvin.logservice.lib.product.ProductLogRequest request,
        io.grpc.stub.StreamObserver<com.alvin.logservice.lib.product.ProductLogReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_LOG, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_LOG,
            asyncUnaryCall(
              new MethodHandlers<
                com.alvin.logservice.lib.product.ProductLogRequest,
                com.alvin.logservice.lib.product.ProductLogReply>(
                  this, METHODID_SAVE_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class ProductLogServiceStub extends io.grpc.stub.AbstractStub<ProductLogServiceStub> {
    private ProductLogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductLogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductLogServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveLog(com.alvin.logservice.lib.product.ProductLogRequest request,
        io.grpc.stub.StreamObserver<com.alvin.logservice.lib.product.ProductLogReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_LOG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductLogServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductLogServiceBlockingStub> {
    private ProductLogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductLogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductLogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alvin.logservice.lib.product.ProductLogReply saveLog(com.alvin.logservice.lib.product.ProductLogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_LOG, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductLogServiceFutureStub extends io.grpc.stub.AbstractStub<ProductLogServiceFutureStub> {
    private ProductLogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductLogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductLogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductLogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alvin.logservice.lib.product.ProductLogReply> saveLog(
        com.alvin.logservice.lib.product.ProductLogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_LOG, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_LOG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductLogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductLogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_LOG:
          serviceImpl.saveLog((com.alvin.logservice.lib.product.ProductLogRequest) request,
              (io.grpc.stub.StreamObserver<com.alvin.logservice.lib.product.ProductLogReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ProductLogServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alvin.logservice.lib.product.ProductLogServiceOuter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductLogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductLogServiceDescriptorSupplier())
              .addMethod(METHOD_SAVE_LOG)
              .build();
        }
      }
    }
    return result;
  }
}
