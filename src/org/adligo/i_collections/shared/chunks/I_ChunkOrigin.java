package org.adligo.i_collections.shared.chunks;

/**
 * This interface contains the origins of the new chunks, or in other words
 * how the new chunk 
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
public interface I_ChunkOrigin {
  public static final byte NEW = 0;
  public static final byte OVERLAY = 1;
  public static final byte REDUCE = 2;
  
  /**
   * returns the origin of a new chunk
   * @return
   */
  public I_ChunkOrigin getOrigin();
  /**
   * Obtains the id, one of the constants in this interface
   * NEW, OVERLAY or REDUCE
   * @return
   */
  public byte getOriginId();
}
