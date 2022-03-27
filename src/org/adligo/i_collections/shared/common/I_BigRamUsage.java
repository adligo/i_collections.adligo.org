package org.adligo.i_collections.shared.common;

/**
 * This interface provides a system for calculating exacatly how much 
 * RAM is being used by a object.
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
public interface I_BigRamUsage extends I_RamUsage {
  /**
   * return the amount of RAM used by an Object. <br/>
   * When deep is false only the amount of ram
   *   in the current object should be calculated, for collections
   *   this includes the entire collection structure. <br/>
   * When deep is true only the amount of ram
   *   in the current object should be calculated, for collections
   *   this includes the entire collection structure, and 
   *   all of the elements in the collection. <br/>
   * Implementations should detect cycles in the pointer structure
   * and throw exceptions when circular structures exist.
   * @param deep
   * @return
   * @throws and IllegalStateException 
   *   if the collection contains elements that do NOT implement
   *   this interface.
   */
  BigUInt getBigRam32(boolean deep);

  /**
   * return the amount of RAM used by an Object. <br/>
   * When deep is false only the amount of ram
   *   in the current object should be calculated, for collections
   *   this includes the entire collection structure. <br/>
   * When deep is true only the amount of ram
   *   in the current object should be calculated, for collections
   *   this includes the entire collection structure, and 
   *   all of the elements in the collection. <br/>
   * Implementations should detect cycles in the pointer structure
   * and throw exceptions when circular structures exist.
   * @param deep
   * @return
   * @throws and IllegalStateException 
   *   if the collection contains elements that do NOT implement
   *   this interface.
   */
  BigUInt getBigRam64(boolean deep);

}
