package org.adligo.i_collections.shared.common;

import java.math.BigInteger;

/**
 * A Unsigned / Positive Integer. <br/>
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
public class UInt implements I_UInt {
  public static final String A_UNSIGNED_INTEGER_U_INT_MUST_BE_GREATER_THAN_ZERO = "A Unsigned Integer / UInt must be greater than zero!";
  private final int _i;
  
  public UInt(int i) {
    if (i < 0) {
      throw new IllegalArgumentException(A_UNSIGNED_INTEGER_U_INT_MUST_BE_GREATER_THAN_ZERO);
    }
    _i = i;
  }
  
  @Override
  public String toString() {
    return "" + _i;
  }

  @Override
  public int hashCode() {
    return _i;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass()) {
      if (obj instanceof Number) {
        return _i == ((Number) obj).intValue();
      } 
      I_UInt other = (I_UInt) obj;
      if (other.isBig()) {
        return false;
      } else {
        return _i == other.toInt();
      }
    }
    return _i == ((I_UInt) obj).toInt();
  }

  public int toInt() {
    return _i;
  }

  @Override
  public boolean isBig() {
    return false;
  }

  @Override
  public BigInteger toBigInt() {
    return BigInteger.valueOf(_i);
  }
}
