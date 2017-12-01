/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-12-01")
public class SetFinalBuildStatusRequest implements org.apache.thrift.TBase<SetFinalBuildStatusRequest, SetFinalBuildStatusRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetFinalBuildStatusRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetFinalBuildStatusRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BUILD_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildStatus", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("buildStatusMessage", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetFinalBuildStatusRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetFinalBuildStatusRequestTupleSchemeFactory());
  }

  public StampedeId stampedeId; // optional
  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus buildStatus; // optional
  public String buildStatusMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    /**
     * 
     * @see BuildStatus
     */
    BUILD_STATUS((short)2, "buildStatus"),
    BUILD_STATUS_MESSAGE((short)3, "buildStatusMessage");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // BUILD_STATUS
          return BUILD_STATUS;
        case 3: // BUILD_STATUS_MESSAGE
          return BUILD_STATUS_MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.BUILD_STATUS,_Fields.BUILD_STATUS_MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.BUILD_STATUS, new org.apache.thrift.meta_data.FieldMetaData("buildStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildStatus.class)));
    tmpMap.put(_Fields.BUILD_STATUS_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("buildStatusMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetFinalBuildStatusRequest.class, metaDataMap);
  }

  public SetFinalBuildStatusRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetFinalBuildStatusRequest(SetFinalBuildStatusRequest other) {
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetBuildStatus()) {
      this.buildStatus = other.buildStatus;
    }
    if (other.isSetBuildStatusMessage()) {
      this.buildStatusMessage = other.buildStatusMessage;
    }
  }

  public SetFinalBuildStatusRequest deepCopy() {
    return new SetFinalBuildStatusRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.buildStatus = null;
    this.buildStatusMessage = null;
  }

  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public SetFinalBuildStatusRequest setStampedeId(StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus getBuildStatus() {
    return this.buildStatus;
  }

  /**
   * 
   * @see BuildStatus
   */
  public SetFinalBuildStatusRequest setBuildStatus(BuildStatus buildStatus) {
    this.buildStatus = buildStatus;
    return this;
  }

  public void unsetBuildStatus() {
    this.buildStatus = null;
  }

  /** Returns true if field buildStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildStatus() {
    return this.buildStatus != null;
  }

  public void setBuildStatusIsSet(boolean value) {
    if (!value) {
      this.buildStatus = null;
    }
  }

  public String getBuildStatusMessage() {
    return this.buildStatusMessage;
  }

  public SetFinalBuildStatusRequest setBuildStatusMessage(String buildStatusMessage) {
    this.buildStatusMessage = buildStatusMessage;
    return this;
  }

  public void unsetBuildStatusMessage() {
    this.buildStatusMessage = null;
  }

  /** Returns true if field buildStatusMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildStatusMessage() {
    return this.buildStatusMessage != null;
  }

  public void setBuildStatusMessageIsSet(boolean value) {
    if (!value) {
      this.buildStatusMessage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case BUILD_STATUS:
      if (value == null) {
        unsetBuildStatus();
      } else {
        setBuildStatus((BuildStatus)value);
      }
      break;

    case BUILD_STATUS_MESSAGE:
      if (value == null) {
        unsetBuildStatusMessage();
      } else {
        setBuildStatusMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case BUILD_STATUS:
      return getBuildStatus();

    case BUILD_STATUS_MESSAGE:
      return getBuildStatusMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case BUILD_STATUS:
      return isSetBuildStatus();
    case BUILD_STATUS_MESSAGE:
      return isSetBuildStatusMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetFinalBuildStatusRequest)
      return this.equals((SetFinalBuildStatusRequest)that);
    return false;
  }

  public boolean equals(SetFinalBuildStatusRequest that) {
    if (that == null)
      return false;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_buildStatus = true && this.isSetBuildStatus();
    boolean that_present_buildStatus = true && that.isSetBuildStatus();
    if (this_present_buildStatus || that_present_buildStatus) {
      if (!(this_present_buildStatus && that_present_buildStatus))
        return false;
      if (!this.buildStatus.equals(that.buildStatus))
        return false;
    }

    boolean this_present_buildStatusMessage = true && this.isSetBuildStatusMessage();
    boolean that_present_buildStatusMessage = true && that.isSetBuildStatusMessage();
    if (this_present_buildStatusMessage || that_present_buildStatusMessage) {
      if (!(this_present_buildStatusMessage && that_present_buildStatusMessage))
        return false;
      if (!this.buildStatusMessage.equals(that.buildStatusMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_buildStatus = true && (isSetBuildStatus());
    list.add(present_buildStatus);
    if (present_buildStatus)
      list.add(buildStatus.getValue());

    boolean present_buildStatusMessage = true && (isSetBuildStatusMessage());
    list.add(present_buildStatusMessage);
    if (present_buildStatusMessage)
      list.add(buildStatusMessage);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetFinalBuildStatusRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildStatus()).compareTo(other.isSetBuildStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildStatus, other.buildStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildStatusMessage()).compareTo(other.isSetBuildStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildStatusMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildStatusMessage, other.buildStatusMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SetFinalBuildStatusRequest(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetBuildStatus()) {
      if (!first) sb.append(", ");
      sb.append("buildStatus:");
      if (this.buildStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.buildStatus);
      }
      first = false;
    }
    if (isSetBuildStatusMessage()) {
      if (!first) sb.append(", ");
      sb.append("buildStatusMessage:");
      if (this.buildStatusMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.buildStatusMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetFinalBuildStatusRequestStandardSchemeFactory implements SchemeFactory {
    public SetFinalBuildStatusRequestStandardScheme getScheme() {
      return new SetFinalBuildStatusRequestStandardScheme();
    }
  }

  private static class SetFinalBuildStatusRequestStandardScheme extends StandardScheme<SetFinalBuildStatusRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetFinalBuildStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUILD_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.buildStatus = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
              struct.setBuildStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buildStatusMessage = iprot.readString();
              struct.setBuildStatusMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetFinalBuildStatusRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildStatus != null) {
        if (struct.isSetBuildStatus()) {
          oprot.writeFieldBegin(BUILD_STATUS_FIELD_DESC);
          oprot.writeI32(struct.buildStatus.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildStatusMessage != null) {
        if (struct.isSetBuildStatusMessage()) {
          oprot.writeFieldBegin(BUILD_STATUS_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.buildStatusMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetFinalBuildStatusRequestTupleSchemeFactory implements SchemeFactory {
    public SetFinalBuildStatusRequestTupleScheme getScheme() {
      return new SetFinalBuildStatusRequestTupleScheme();
    }
  }

  private static class SetFinalBuildStatusRequestTupleScheme extends TupleScheme<SetFinalBuildStatusRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetFinalBuildStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetBuildStatus()) {
        optionals.set(1);
      }
      if (struct.isSetBuildStatusMessage()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetBuildStatus()) {
        oprot.writeI32(struct.buildStatus.getValue());
      }
      if (struct.isSetBuildStatusMessage()) {
        oprot.writeString(struct.buildStatusMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetFinalBuildStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buildStatus = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
        struct.setBuildStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildStatusMessage = iprot.readString();
        struct.setBuildStatusMessageIsSet(true);
      }
    }
  }

}

