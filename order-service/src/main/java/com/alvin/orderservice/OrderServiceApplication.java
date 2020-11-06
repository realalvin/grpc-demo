package com.alvin.orderservice;

import com.alvin.logservice.lib.order.OrderLogReply;
import com.alvin.logservice.lib.order.OrderLogRequest;
import com.alvin.logservice.lib.order.OrderLogServiceGrpc;
import com.google.common.base.Strings;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@Slf4j
@RestController
@EnableDiscoveryClient
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Autowired
    EurekaDiscoveryClient discoveryClient;
    @Autowired
    private ManagedChannel channel;

    public void onStart() {
        log.info("Available services->");
        discoveryClient.getServices().forEach(i -> {
            log.info("service:{}", i);
        });

        log.info("Available Instances->");
        discoveryClient.getInstances("log-service")
                .forEach(i -> log.info("http://{}:{}, ServiceId:{}", i.getHost(), i.getPort(), i.getServiceId()));
    }


    @Bean
    public ManagedChannel channel() {
        try {
            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("log-service");
            if (serviceInstanceList != null && !serviceInstanceList.isEmpty()) {
                return ManagedChannelBuilder.forAddress(serviceInstanceList.get(0).getHost(), 6565)
                        .usePlaintext()
                        .build();
            }
            return ManagedChannelBuilder.forAddress("log-service-01", 6565)
                    .usePlaintext()
                    .build();
        }catch (Exception e){
            return
                    ManagedChannelBuilder.forAddress("log-service-02", 6565)
                            .usePlaintext()
                            .build();
        }
    }


    @GetMapping(value = {"/order/create", "/order/create/{orderId}"})
    public ResponseEntity<String> orderCreate(@PathVariable(value = "orderId", required = false) String orderId) {
        onStart();
        if (Strings.isNullOrEmpty(orderId)) {
            orderId = UUID.randomUUID().toString();
        }

        OrderLogServiceGrpc.OrderLogServiceBlockingStub stub = OrderLogServiceGrpc.newBlockingStub(channel);
        OrderLogReply reply = stub.saveLog(OrderLogRequest.newBuilder()
                .setOrderId(orderId)
                .setOpType(OrderLogRequest.OPTypes.CREATED)
                .setMessage("Just create a Order")
                .setLogAt(System.currentTimeMillis())
                .build());
        return ResponseEntity.ok(reply.getDone() ? "success" : "Failed.");
    }

    @GetMapping(value = {"/order/edit", "/order/edit/{orderId}"})
    public ResponseEntity<String> orderEdit(@PathVariable(value = "orderId", required = false) String orderId) {
        onStart();
        if (Strings.isNullOrEmpty(orderId)) {
            orderId = UUID.randomUUID().toString();
        }

        OrderLogServiceGrpc.OrderLogServiceBlockingStub stub = OrderLogServiceGrpc.newBlockingStub(channel);
        long start = System.currentTimeMillis();
        OrderLogReply reply = stub.saveLog(OrderLogRequest.newBuilder()
                .setOrderId(orderId)
                .setOpType(OrderLogRequest.OPTypes.EDIT)
                .setMessage("Just edit a Order")
                .setLogAt(System.currentTimeMillis())
                .build());
        log.info("total:{}",System.currentTimeMillis()-start);
        return ResponseEntity.ok(reply.getDone() ? "success" : "Failed.");
    }


    @PreDestroy
    public void turnOff() {
        channel.shutdown();
    }
}
