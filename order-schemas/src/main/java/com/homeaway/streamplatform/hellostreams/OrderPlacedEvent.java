/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.homeaway.streamplatform.hellostreams;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Order Placed events */
@org.apache.avro.specific.AvroGenerated
public class OrderPlacedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2621631589975918446L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderPlacedEvent\",\"namespace\":\"com.homeaway.streamplatform.hellostreams\",\"doc\":\"Order Placed events\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"the unique id of this command event\"},{\"name\":\"orderId\",\"type\":\"string\",\"doc\":\"the unique orderId to be used for the order if it is created\"},{\"name\":\"customerId\",\"type\":\"string\",\"doc\":\"the id of the customer\"},{\"name\":\"item\",\"type\":\"string\",\"doc\":\"the item that is to be ordered\"},{\"name\":\"created\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"doc\":\"the timestamp that this order was placed\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderPlacedEvent> ENCODER =
      new BinaryMessageEncoder<OrderPlacedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderPlacedEvent> DECODER =
      new BinaryMessageDecoder<OrderPlacedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<OrderPlacedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<OrderPlacedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderPlacedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this OrderPlacedEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a OrderPlacedEvent from a ByteBuffer. */
  public static OrderPlacedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** the unique id of this command event */
   private java.lang.CharSequence id;
  /** the unique orderId to be used for the order if it is created */
   private java.lang.CharSequence orderId;
  /** the id of the customer */
   private java.lang.CharSequence customerId;
  /** the item that is to be ordered */
   private java.lang.CharSequence item;
  /** the timestamp that this order was placed */
   private org.joda.time.DateTime created;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderPlacedEvent() {}

  /**
   * All-args constructor.
   * @param id the unique id of this command event
   * @param orderId the unique orderId to be used for the order if it is created
   * @param customerId the id of the customer
   * @param item the item that is to be ordered
   * @param created the timestamp that this order was placed
   */
  public OrderPlacedEvent(java.lang.CharSequence id, java.lang.CharSequence orderId, java.lang.CharSequence customerId, java.lang.CharSequence item, org.joda.time.DateTime created) {
    this.id = id;
    this.orderId = orderId;
    this.customerId = customerId;
    this.item = item;
    this.created = created;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return orderId;
    case 2: return customerId;
    case 3: return item;
    case 4: return created;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      TIMESTAMP_CONVERSION,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: orderId = (java.lang.CharSequence)value$; break;
    case 2: customerId = (java.lang.CharSequence)value$; break;
    case 3: item = (java.lang.CharSequence)value$; break;
    case 4: created = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return the unique id of this command event
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * the unique id of this command event
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'orderId' field.
   * @return the unique orderId to be used for the order if it is created
   */
  public java.lang.CharSequence getOrderId() {
    return orderId;
  }

  /**
   * Sets the value of the 'orderId' field.
   * the unique orderId to be used for the order if it is created
   * @param value the value to set.
   */
  public void setOrderId(java.lang.CharSequence value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return the id of the customer
   */
  public java.lang.CharSequence getCustomerId() {
    return customerId;
  }

  /**
   * Sets the value of the 'customerId' field.
   * the id of the customer
   * @param value the value to set.
   */
  public void setCustomerId(java.lang.CharSequence value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'item' field.
   * @return the item that is to be ordered
   */
  public java.lang.CharSequence getItem() {
    return item;
  }

  /**
   * Sets the value of the 'item' field.
   * the item that is to be ordered
   * @param value the value to set.
   */
  public void setItem(java.lang.CharSequence value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'created' field.
   * @return the timestamp that this order was placed
   */
  public org.joda.time.DateTime getCreated() {
    return created;
  }

  /**
   * Sets the value of the 'created' field.
   * the timestamp that this order was placed
   * @param value the value to set.
   */
  public void setCreated(org.joda.time.DateTime value) {
    this.created = value;
  }

  /**
   * Creates a new OrderPlacedEvent RecordBuilder.
   * @return A new OrderPlacedEvent RecordBuilder
   */
  public static com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder newBuilder() {
    return new com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder();
  }

  /**
   * Creates a new OrderPlacedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderPlacedEvent RecordBuilder
   */
  public static com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder newBuilder(com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder other) {
    return new com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder(other);
  }

  /**
   * Creates a new OrderPlacedEvent RecordBuilder by copying an existing OrderPlacedEvent instance.
   * @param other The existing instance to copy.
   * @return A new OrderPlacedEvent RecordBuilder
   */
  public static com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder newBuilder(com.homeaway.streamplatform.hellostreams.OrderPlacedEvent other) {
    return new com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder(other);
  }

  /**
   * RecordBuilder for OrderPlacedEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderPlacedEvent>
    implements org.apache.avro.data.RecordBuilder<OrderPlacedEvent> {

    /** the unique id of this command event */
    private java.lang.CharSequence id;
    /** the unique orderId to be used for the order if it is created */
    private java.lang.CharSequence orderId;
    /** the id of the customer */
    private java.lang.CharSequence customerId;
    /** the item that is to be ordered */
    private java.lang.CharSequence item;
    /** the timestamp that this order was placed */
    private org.joda.time.DateTime created;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.customerId)) {
        this.customerId = data().deepCopy(fields()[2].schema(), other.customerId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.item)) {
        this.item = data().deepCopy(fields()[3].schema(), other.item);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.created)) {
        this.created = data().deepCopy(fields()[4].schema(), other.created);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OrderPlacedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.homeaway.streamplatform.hellostreams.OrderPlacedEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.customerId)) {
        this.customerId = data().deepCopy(fields()[2].schema(), other.customerId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.item)) {
        this.item = data().deepCopy(fields()[3].schema(), other.item);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.created)) {
        this.created = data().deepCopy(fields()[4].schema(), other.created);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * the unique id of this command event
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * the unique id of this command event
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * the unique id of this command event
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * the unique id of this command event
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderId' field.
      * the unique orderId to be used for the order if it is created
      * @return The value.
      */
    public java.lang.CharSequence getOrderId() {
      return orderId;
    }

    /**
      * Sets the value of the 'orderId' field.
      * the unique orderId to be used for the order if it is created
      * @param value The value of 'orderId'.
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder setOrderId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.orderId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderId' field has been set.
      * the unique orderId to be used for the order if it is created
      * @return True if the 'orderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderId' field.
      * the unique orderId to be used for the order if it is created
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder clearOrderId() {
      orderId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * the id of the customer
      * @return The value.
      */
    public java.lang.CharSequence getCustomerId() {
      return customerId;
    }

    /**
      * Sets the value of the 'customerId' field.
      * the id of the customer
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder setCustomerId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.customerId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * the id of the customer
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'customerId' field.
      * the id of the customer
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder clearCustomerId() {
      customerId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'item' field.
      * the item that is to be ordered
      * @return The value.
      */
    public java.lang.CharSequence getItem() {
      return item;
    }

    /**
      * Sets the value of the 'item' field.
      * the item that is to be ordered
      * @param value The value of 'item'.
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder setItem(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.item = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * the item that is to be ordered
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'item' field.
      * the item that is to be ordered
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder clearItem() {
      item = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'created' field.
      * the timestamp that this order was placed
      * @return The value.
      */
    public org.joda.time.DateTime getCreated() {
      return created;
    }

    /**
      * Sets the value of the 'created' field.
      * the timestamp that this order was placed
      * @param value The value of 'created'.
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder setCreated(org.joda.time.DateTime value) {
      validate(fields()[4], value);
      this.created = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'created' field has been set.
      * the timestamp that this order was placed
      * @return True if the 'created' field has been set, false otherwise.
      */
    public boolean hasCreated() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'created' field.
      * the timestamp that this order was placed
      * @return This builder.
      */
    public com.homeaway.streamplatform.hellostreams.OrderPlacedEvent.Builder clearCreated() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderPlacedEvent build() {
      try {
        OrderPlacedEvent record = new OrderPlacedEvent();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0], record.getConversion(0));
        record.orderId = fieldSetFlags()[1] ? this.orderId : (java.lang.CharSequence) defaultValue(fields()[1], record.getConversion(1));
        record.customerId = fieldSetFlags()[2] ? this.customerId : (java.lang.CharSequence) defaultValue(fields()[2], record.getConversion(2));
        record.item = fieldSetFlags()[3] ? this.item : (java.lang.CharSequence) defaultValue(fields()[3], record.getConversion(3));
        record.created = fieldSetFlags()[4] ? this.created : (org.joda.time.DateTime) defaultValue(fields()[4], record.getConversion(4));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderPlacedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderPlacedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderPlacedEvent>
    READER$ = (org.apache.avro.io.DatumReader<OrderPlacedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
