/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package HiveKa.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Console extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Console\",\"namespace\":\"HiveKa.avro\",\"fields\":[{\"name\":\"message\",\"type\":\"string\",\"doc\":\"String sent by Console\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** String sent by Console */
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Console() {}

  /**
   * All-args constructor.
   */
  public Console(java.lang.CharSequence message) {
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'message' field.
   * String sent by Console   */
  public java.lang.CharSequence getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * String sent by Console   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /** Creates a new Console RecordBuilder */
  public static HiveKa.avro.Console.Builder newBuilder() {
    return new HiveKa.avro.Console.Builder();
  }
  
  /** Creates a new Console RecordBuilder by copying an existing Builder */
  public static HiveKa.avro.Console.Builder newBuilder(HiveKa.avro.Console.Builder other) {
    return new HiveKa.avro.Console.Builder(other);
  }
  
  /** Creates a new Console RecordBuilder by copying an existing Console instance */
  public static HiveKa.avro.Console.Builder newBuilder(HiveKa.avro.Console other) {
    return new HiveKa.avro.Console.Builder(other);
  }
  
  /**
   * RecordBuilder for Console instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Console>
    implements org.apache.avro.data.RecordBuilder<Console> {

    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(HiveKa.avro.Console.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(HiveKa.avro.Console.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.message)) {
        this.message = data().deepCopy(fields()[0].schema(), other.message);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Console instance */
    private Builder(HiveKa.avro.Console other) {
            super(HiveKa.avro.Console.SCHEMA$);
      if (isValidValue(fields()[0], other.message)) {
        this.message = data().deepCopy(fields()[0].schema(), other.message);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'message' field */
    public java.lang.CharSequence getMessage() {
      return message;
    }
    
    /** Sets the value of the 'message' field */
    public HiveKa.avro.Console.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.message = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'message' field has been set */
    public boolean hasMessage() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'message' field */
    public HiveKa.avro.Console.Builder clearMessage() {
      message = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Console build() {
      try {
        Console record = new Console();
        record.message = fieldSetFlags()[0] ? this.message : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
