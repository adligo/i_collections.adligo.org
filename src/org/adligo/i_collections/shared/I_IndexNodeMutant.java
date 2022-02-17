package org.adligo.i_collections.shared;

/**
 * A mutable version if {@link I_IndexNode}
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
public interface I_IndexNodeMutant<T> extends I_IndexNode<T> {

  /**
   * Set the value over writing what's there
   * @param t
   * @return true if it's overwriting a value
   */
  public boolean put(T t);
  
  /**
   * Set the value over writing what's there
   * @param t
   */
  public void set(T t);
}