package org.adligo.i_collections.shared.common;

public enum Crud implements I_Crud {
  Created(CREATED_BYTE), Read(READ_BYTE), 
  Updated(UPDATED_BYTE), Deleted(DELETED_BYTE);
  private final byte _value;
  private Crud(byte b) {
    _value = b;
  }

  public byte getValue() {
    return _value;
  }

  @Override
  public Crud getCrud() {
    return this;
  }

  @Override
  public byte getCrudByte() {
    return _value;
  }
}
