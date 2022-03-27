package org.adligo.i_collections.shared.chunks;

public enum ChunkOrigin implements I_ChunkOrigin {
  New(NEW), Overlay(OVERLAY), Reduce(REDUCE);
  
  private final byte _id;

  private ChunkOrigin(byte id) {
    _id = id;
  }

  @Override
  public I_ChunkOrigin getOrigin() {
    return this;
  }

  @Override
  public byte getOriginId() {
    return _id;
  }
}
