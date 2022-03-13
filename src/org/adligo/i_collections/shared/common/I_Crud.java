package org.adligo.i_collections.shared.common;

/**
 * The classic CRUD operations encoded as a single byte value
 * which conserves space.
 * 
 * @author scott
 *
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
public interface I_Crud {
  public static final String UNKNOWN_CRUD_BYTE = "Unknown CRUD byte; ";
  public static final byte CREATED_BYTE = 1;
  /**
   * indicates a read occured, also known as NO CHANGE
   */
  public static final byte READ_BYTE = 2;
  public static final byte UPDATED_BYTE = 3;
  public static final byte DELETED_BYTE = 4;
  
  public static Crud to(byte crudByte) {
    switch (crudByte) {
      case CREATED_BYTE: return Crud.Created;
      case READ_BYTE: return Crud.Read;
      case UPDATED_BYTE: return Crud.Updated;
      case DELETED_BYTE: return Crud.Deleted;
      default: 
        throw new IllegalArgumentException(UNKNOWN_CRUD_BYTE + crudByte);
    }
  }

  /**
   * return the crud operation that occurred
   * @return
   */
  public Crud getCrud();

  /**
   * @return the crud operation's byte value
   */
  public byte getCrudByte();
}
