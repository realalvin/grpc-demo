// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderLogService.proto

package com.alvin.logservice.lib.order;

public interface OrderLogRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.alvin.logservice.lib.order.OrderLogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int64 logAt = 3;</code>
   */
  long getLogAt();

  /**
   * <code>.com.alvin.logservice.lib.order.OrderLogRequest.OPTypes opType = 4;</code>
   */
  int getOpTypeValue();
  /**
   * <code>.com.alvin.logservice.lib.order.OrderLogRequest.OPTypes opType = 4;</code>
   */
  com.alvin.logservice.lib.order.OrderLogRequest.OPTypes getOpType();
}
