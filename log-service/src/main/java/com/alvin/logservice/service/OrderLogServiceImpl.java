package com.alvin.logservice.service;

import com.alvin.logservice.lib.order.OrderLogReply;
import com.alvin.logservice.lib.order.OrderLogRequest;
import com.alvin.logservice.lib.order.OrderLogServiceGrpc;
import com.google.common.base.Strings;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

/**
 * <p>Nov05 17:16/2020</p>
 *
 * @author alvin
 */
@GRpcService
@Slf4j
public class OrderLogServiceImpl extends OrderLogServiceGrpc.OrderLogServiceImplBase {
    @Override
    public void saveLog(OrderLogRequest request, StreamObserver<OrderLogReply> responseObserver) {
        log.info("write order log-> orderId:{}, message:{},op_type:{},time:{}",
                Strings.nullToEmpty(request.getOrderId())
                , Strings.nullToEmpty(request.getMessage())
                , Strings.nullToEmpty(request.getOpType().toString())
                , request.getLogAt()
        );

        OrderLogReply reply = OrderLogReply.newBuilder().setDone(true).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
