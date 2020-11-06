package com.alvin.logservice.service;

import com.alvin.logservice.lib.product.ProductLogReply;
import com.alvin.logservice.lib.product.ProductLogRequest;
import com.alvin.logservice.lib.product.ProductLogServiceGrpc;
import com.google.common.base.Strings;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

/**
 * <p>Nov05 17:20/2020</p>
 *
 * @author alvin
 */
@GRpcService
@Slf4j
public class ProductLogServiceImpl extends ProductLogServiceGrpc.ProductLogServiceImplBase {
    @Override
    public void saveLog(ProductLogRequest request, StreamObserver<ProductLogReply> responseObserver) {
        log.info("write order log-> orderId:{}, message:{},op_type:{},time:{}",
                Strings.nullToEmpty(request.getOrderId())
                , Strings.nullToEmpty(request.getMessage())
                , Strings.nullToEmpty(request.getOpType().toString())
                , request.getLogAt()
        );

        ProductLogReply reply = ProductLogReply.newBuilder().setDone(true).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
