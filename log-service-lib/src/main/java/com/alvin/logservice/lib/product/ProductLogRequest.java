// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductLogService.proto

package com.alvin.logservice.lib.product;

/**
 * Protobuf type {@code com.alvin.logservice.lib.product.ProductLogRequest}
 */
public  final class ProductLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.alvin.logservice.lib.product.ProductLogRequest)
    ProductLogRequestOrBuilder {
  // Use ProductLogRequest.newBuilder() to construct.
  private ProductLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductLogRequest() {
    orderId_ = "";
    message_ = "";
    logAt_ = 0L;
    opType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductLogRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 24: {

            logAt_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            opType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alvin.logservice.lib.product.ProductLogServiceOuter.internal_static_com_alvin_logservice_lib_product_ProductLogRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alvin.logservice.lib.product.ProductLogServiceOuter.internal_static_com_alvin_logservice_lib_product_ProductLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alvin.logservice.lib.product.ProductLogRequest.class, com.alvin.logservice.lib.product.ProductLogRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code com.alvin.logservice.lib.product.ProductLogRequest.OPTypes}
   */
  public enum OPTypes
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CREATED = 0;</code>
     */
    CREATED(0),
    /**
     * <code>EDIT = 1;</code>
     */
    EDIT(1),
    /**
     * <code>INBOUND = 2;</code>
     */
    INBOUND(2),
    /**
     * <code>OUTBOUND = 3;</code>
     */
    OUTBOUND(3),
    /**
     * <code>DELETE = 4;</code>
     */
    DELETE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CREATED = 0;</code>
     */
    public static final int CREATED_VALUE = 0;
    /**
     * <code>EDIT = 1;</code>
     */
    public static final int EDIT_VALUE = 1;
    /**
     * <code>INBOUND = 2;</code>
     */
    public static final int INBOUND_VALUE = 2;
    /**
     * <code>OUTBOUND = 3;</code>
     */
    public static final int OUTBOUND_VALUE = 3;
    /**
     * <code>DELETE = 4;</code>
     */
    public static final int DELETE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OPTypes valueOf(int value) {
      return forNumber(value);
    }

    public static OPTypes forNumber(int value) {
      switch (value) {
        case 0: return CREATED;
        case 1: return EDIT;
        case 2: return INBOUND;
        case 3: return OUTBOUND;
        case 4: return DELETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OPTypes>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OPTypes> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OPTypes>() {
            public OPTypes findValueByNumber(int number) {
              return OPTypes.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.alvin.logservice.lib.product.ProductLogRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final OPTypes[] VALUES = values();

    public static OPTypes valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OPTypes(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.alvin.logservice.lib.product.ProductLogRequest.OPTypes)
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string orderId = 1;</code>
   */
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string orderId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOGAT_FIELD_NUMBER = 3;
  private long logAt_;
  /**
   * <code>int64 logAt = 3;</code>
   */
  public long getLogAt() {
    return logAt_;
  }

  public static final int OPTYPE_FIELD_NUMBER = 4;
  private int opType_;
  /**
   * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
   */
  public int getOpTypeValue() {
    return opType_;
  }
  /**
   * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
   */
  public com.alvin.logservice.lib.product.ProductLogRequest.OPTypes getOpType() {
    com.alvin.logservice.lib.product.ProductLogRequest.OPTypes result = com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.valueOf(opType_);
    return result == null ? com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (logAt_ != 0L) {
      output.writeInt64(3, logAt_);
    }
    if (opType_ != com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.CREATED.getNumber()) {
      output.writeEnum(4, opType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (logAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, logAt_);
    }
    if (opType_ != com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.CREATED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, opType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alvin.logservice.lib.product.ProductLogRequest)) {
      return super.equals(obj);
    }
    com.alvin.logservice.lib.product.ProductLogRequest other = (com.alvin.logservice.lib.product.ProductLogRequest) obj;

    boolean result = true;
    result = result && getOrderId()
        .equals(other.getOrderId());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && (getLogAt()
        == other.getLogAt());
    result = result && opType_ == other.opType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + LOGAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLogAt());
    hash = (37 * hash) + OPTYPE_FIELD_NUMBER;
    hash = (53 * hash) + opType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alvin.logservice.lib.product.ProductLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alvin.logservice.lib.product.ProductLogRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.alvin.logservice.lib.product.ProductLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.alvin.logservice.lib.product.ProductLogRequest)
      com.alvin.logservice.lib.product.ProductLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alvin.logservice.lib.product.ProductLogServiceOuter.internal_static_com_alvin_logservice_lib_product_ProductLogRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alvin.logservice.lib.product.ProductLogServiceOuter.internal_static_com_alvin_logservice_lib_product_ProductLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alvin.logservice.lib.product.ProductLogRequest.class, com.alvin.logservice.lib.product.ProductLogRequest.Builder.class);
    }

    // Construct using com.alvin.logservice.lib.product.ProductLogRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      orderId_ = "";

      message_ = "";

      logAt_ = 0L;

      opType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alvin.logservice.lib.product.ProductLogServiceOuter.internal_static_com_alvin_logservice_lib_product_ProductLogRequest_descriptor;
    }

    public com.alvin.logservice.lib.product.ProductLogRequest getDefaultInstanceForType() {
      return com.alvin.logservice.lib.product.ProductLogRequest.getDefaultInstance();
    }

    public com.alvin.logservice.lib.product.ProductLogRequest build() {
      com.alvin.logservice.lib.product.ProductLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alvin.logservice.lib.product.ProductLogRequest buildPartial() {
      com.alvin.logservice.lib.product.ProductLogRequest result = new com.alvin.logservice.lib.product.ProductLogRequest(this);
      result.orderId_ = orderId_;
      result.message_ = message_;
      result.logAt_ = logAt_;
      result.opType_ = opType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alvin.logservice.lib.product.ProductLogRequest) {
        return mergeFrom((com.alvin.logservice.lib.product.ProductLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alvin.logservice.lib.product.ProductLogRequest other) {
      if (other == com.alvin.logservice.lib.product.ProductLogRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getLogAt() != 0L) {
        setLogAt(other.getLogAt());
      }
      if (other.opType_ != 0) {
        setOpTypeValue(other.getOpTypeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alvin.logservice.lib.product.ProductLogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alvin.logservice.lib.product.ProductLogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string orderId = 1;</code>
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private long logAt_ ;
    /**
     * <code>int64 logAt = 3;</code>
     */
    public long getLogAt() {
      return logAt_;
    }
    /**
     * <code>int64 logAt = 3;</code>
     */
    public Builder setLogAt(long value) {
      
      logAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 logAt = 3;</code>
     */
    public Builder clearLogAt() {
      
      logAt_ = 0L;
      onChanged();
      return this;
    }

    private int opType_ = 0;
    /**
     * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
     */
    public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
     */
    public Builder setOpTypeValue(int value) {
      opType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
     */
    public com.alvin.logservice.lib.product.ProductLogRequest.OPTypes getOpType() {
      com.alvin.logservice.lib.product.ProductLogRequest.OPTypes result = com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.valueOf(opType_);
      return result == null ? com.alvin.logservice.lib.product.ProductLogRequest.OPTypes.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
     */
    public Builder setOpType(com.alvin.logservice.lib.product.ProductLogRequest.OPTypes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      opType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.alvin.logservice.lib.product.ProductLogRequest.OPTypes opType = 4;</code>
     */
    public Builder clearOpType() {
      
      opType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.alvin.logservice.lib.product.ProductLogRequest)
  }

  // @@protoc_insertion_point(class_scope:com.alvin.logservice.lib.product.ProductLogRequest)
  private static final com.alvin.logservice.lib.product.ProductLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alvin.logservice.lib.product.ProductLogRequest();
  }

  public static com.alvin.logservice.lib.product.ProductLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<ProductLogRequest>() {
    public ProductLogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductLogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductLogRequest> getParserForType() {
    return PARSER;
  }

  public com.alvin.logservice.lib.product.ProductLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

