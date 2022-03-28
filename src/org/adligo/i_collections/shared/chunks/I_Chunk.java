package org.adligo.i_collections.shared.chunks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Optional;

import org.adligo.i_collections.shared.streams.I_StreamableRange;

/**
 * A chunk is a surrogate for an Array that is similar to {@link Optional}
 * but allows for multiple implementations. Implementations MAY be mutable or 
 * immutable.<br/>
 * Immutable implementations items are stored in a shrunken array
 * with a relative pointer system where bytes are used as tiny integer values
 * to point to the indices of the shrunken array.  This relative 
 * pointer system allows  allows for the optimization of space through 
 * the removal of any null pointers, which take 8 bytes on 64 bit
 * java and 4 bytes on 32 bit java.  <br/>
 *   Mutable implementations are usually backed by a simple array.<br/>
 *  All implementations mimic the Functional style by using the following 
 *  methods <br/>
 *  {@link #overlay(int, Object)} <br/>
 *  {@link #reduce(int)} <br/>
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
   * Immutable implementations of this interface will 
   * create a new I_Chunk either replacing or adding
   * a element T ad index idx.  This is done in a functional 
   * style similar to {@link BigInteger#add(BigInteger)} <br/>
   * Mutable implementations of this interface will 
   * return the current chunk after either replacing or 
   * adding a element T ad index idx. This is done
   * in a imperative style similar to {@link ArrayList#set(int, Object)} <br/>
   * @param idx
   * @param t
   * @return immutable implementations will return a new I_Chunk<br/>
   *   mutable implementations MAY return this<br/>
   */
  I_NewChunk<T> overlay(int idx, T t);
  
  /**
   * Immutable implementations of this interface will 
   * create a new I_Chunk either removing the 
   * element at idx if present.  This is done in a functional 
   * style similar to {@link BigInteger#add(BigInteger)} <br/>
   * Mutable implementations of this interface will 
   * return the current chunk after either replacing or 
   * adding a element T ad index idx.
   * This is done in a imperative style 
   * similar to {@link ArrayList#remove(int)} <br/>
   * @param idx
   * @return immutable implementations will return a new I_Chunk<br/>
   *   mutable implementations MAY return this<br/>
   */
  I_NewChunk<T> reduce(int idx);
  
  /**
   * This returns the delegate chunk, with out the origin information.
   * @return
   */
  I_Chunk<T> toChunk();
}
