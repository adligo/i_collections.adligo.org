package org.adligo.i_collections.shared.common;

import java.math.BigInteger;
import java.util.Objects;

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
public class BigUInt implements I_UInt {
  public static final String A_NON_NULL_BIG_INTEGER_I_IS_REQUIRED = "A non null BigInteger i is required!";
  public static final String A_UNSIGNED_INTEGER_U_INT_MUST_BE_GREATER_THAN_ZERO = "A Unsigned Integer / UInt must be greater than zero!";
  private final BigInteger _i;
  
  public BigUInt(int i) {
    _i = BigInteger.valueOf(new UInt(i).toInt());
  }
  
  public BigUInt(BigInteger i) {
    Objects.requireNonNull(i, A_NON_NULL_BIG_INTEGER_I_IS_REQUIRED);
    if ( !i.equals(i.abs())) {
      throw new IllegalArgumentException(UInt.A_UNSIGNED_INTEGER_U_INT_MUST_BE_GREATER_THAN_ZERO);
    }
    _i = i;
  }
  
  @Override
  public int hashCode() {
    return _i.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass()) {
      if (obj instanceof Number) {
        return _i.equals(BigInteger.valueOf(((Number) obj).longValue())); 
      } 
      I_UInt other = (I_UInt) obj;
      return _i.intValue() == other.toInt();
    }
    return _i.equals(((I_UInt) obj).toBigInt());
  }

  public BigInteger toBigInt() {
    return _i;
  }

  @Override
  public boolean isBig() {
    int bc = _i.bitLength();
    if (bc <= 31) {
      return false;
    }
    return true;
  }
  
  @Override
  public String toString() {
    return _i.toString();
  }

  @Override
  public int toInt() {
    return _i.intValue();
  }

}
