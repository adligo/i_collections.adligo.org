package org.adligo.i_collections.shared;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * A index is a type of collection where things are indexed by an 
 * integer simmilar to an array.
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

public interface I_Index<T> extends I_Size {

  /**
   * get the value at the index idx
   * @param idx
   * @return
   */
  public Optional<T> find(int idx);
  
  /**
   * get the value at the index idx
   * @param idx
   * @return
   */
  public T get(int idx);

  /**
   * stream all values
   * @param idx
   * @return
   */
  public Stream<T> stream();

  /**
   * stream all values at or after the fromIdx
   * @param idx
   * @return
   */
  public Stream<T> stream(int fromIdx);

  /**
   * stream all values in the range inclusive
   * @param fromIdx
   * @param toIdx
   * @return
   */
  public Stream<T> stream(int fromIdx, int toIdx);

  /**
   * Streams the predecessor if one exists,
   * the item at the index if it exists and
   * the successor if one exists
   * @param idx
   * @return
   */
  public Stream<T> streamNeighbors(int idx);
  
  /**
   * Stream all values up to the index 
   * @param toIdx
   * @return
   */
  public Stream<T> streamTo(int toIdx);
}
