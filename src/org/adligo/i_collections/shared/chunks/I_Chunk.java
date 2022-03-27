package org.adligo.i_collections.shared.chunks;

import org.adligo.i_collections.shared.streams.I_StreamableRange;

/**
 * A chunk is a surrogate for an Array that is similar to {@link Optional}
 * but allows for multiple items in a shrunken array.  A Chunk 
 * also generally allows for the optimization of space through 
 * the removal of any null pointers, which take 8 bytes on 64 bit
 * java and 4 bytes on 32 bit java.  Implementations MAY be mutable or 
 * immutable.
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
public interface I_Chunk<T> extends I_StreamableRange<T> {
  

  /**
   * This method creates a new I_Chunk either replacing or adding
   * a element T ad index idx.
   * @param idx
   * @param t
   * @return immutable implementations will return a new I_Chunk<br/>
   *   mutable implementations MAY return this<br/>
   */
  I_NewChunk<T> overlay(int idx, T t);
  
  /**
   * This method creates a new I_Chunk either removing the 
   * element at idx if present.  If there is no element at idx,
   * then this method MAY return the current instance / this.
   * @param idx
   * @return immutable implementations will return a new I_Chunk<br/>
   *   mutable implementations MAY return this<br/>
   */
  I_NewChunk<T> reduce(int idx);
}
