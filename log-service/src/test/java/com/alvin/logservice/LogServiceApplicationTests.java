package com.alvin.logservice;

import com.alvin.logservice.lib.order.OrderLogReply;
import com.alvin.logservice.lib.order.OrderLogRequest;
import com.alvin.logservice.lib.order.OrderLogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


@SpringBootTest(webEnvironment = RANDOM_PORT
        , properties = {"grpc.enableReflection=true",
        "grpc.port=0",
        "grpc.shutdownGrace=-1"})
@Slf4j
class LogServiceApplicationTests {


    @Test
    public void test() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        OrderLogServiceGrpc.OrderLogServiceBlockingStub stub = OrderLogServiceGrpc.newBlockingStub(channel);

        OrderLogReply reply = stub.saveLog(OrderLogRequest.newBuilder()
                .setOrderId(UUID.randomUUID().toString())
                .setLogAt(System.currentTimeMillis())
                .setOpType(OrderLogRequest.OPTypes.CREATED)
                .setMessage("created")
                .build());
        log.info("replay:{}", reply.getDone());


        channel.shutdown();
    }


}
