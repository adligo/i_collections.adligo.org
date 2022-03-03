package org.adligo.i_collections.shared.streams;

import org.adligo.i_collections.shared.common.I_Capacity;
import org.adligo.i_collections.shared.common.I_Size;

/**
 * A sort of a external iterator for a I_Streamable
 * that is backed by an simple array or something similar, 
 * which allows for aggregation
 * of I_Streamables into a single stream.
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
public interface I_SizedSupplier<T> extends I_Capacity, I_Size {

  /**
   * get the element at the index
   * @param idx
   * @return
   */
  public T get(int idx);
}
