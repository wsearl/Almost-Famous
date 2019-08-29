// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LSMessage.proto

package com.liema.battle.LockstepProto;

/**
 * Protobuf enum {@code LockstepProto.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Int = 0;</code>
   */
  Int(0),
  /**
   * <code>UInt = 1;</code>
   */
  UInt(1),
  /**
   * <code>UShort = 2;</code>
   */
  UShort(2),
  /**
   * <code>Long = 3;</code>
   */
  Long(3),
  /**
   * <code>Byte = 4;</code>
   */
  Byte(4),
  /**
   * <code>Bool = 5;</code>
   */
  Bool(5),
  /**
   * <code>String = 6;</code>
   */
  String(6),
  /**
   * <code>ByteArray = 7;</code>
   */
  ByteArray(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Int = 0;</code>
   */
  public static final int Int_VALUE = 0;
  /**
   * <code>UInt = 1;</code>
   */
  public static final int UInt_VALUE = 1;
  /**
   * <code>UShort = 2;</code>
   */
  public static final int UShort_VALUE = 2;
  /**
   * <code>Long = 3;</code>
   */
  public static final int Long_VALUE = 3;
  /**
   * <code>Byte = 4;</code>
   */
  public static final int Byte_VALUE = 4;
  /**
   * <code>Bool = 5;</code>
   */
  public static final int Bool_VALUE = 5;
  /**
   * <code>String = 6;</code>
   */
  public static final int String_VALUE = 6;
  /**
   * <code>ByteArray = 7;</code>
   */
  public static final int ByteArray_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return Int;
      case 1: return UInt;
      case 2: return UShort;
      case 3: return Long;
      case 4: return Byte;
      case 5: return Bool;
      case 6: return String;
      case 7: return ByteArray;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
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
    return LSMessage.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:LockstepProto.DataType)
}
