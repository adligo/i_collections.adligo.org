package org.adligo.i_collections.shared.streams;

import java.util.stream.Stream;

import org.adligo.i_collections.shared.common.I_Size;


/**
 * A stream-able collection with various optimizations that allow
 * faster seek time to start and terminate streams.
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
public interface I_StreamableRange<T> extends I_Size, I_Streamable<T> {

  /**
   * This provides a more optimal way to stream
   * from a data structure to the Consumer of this Stream.
   *  (i.e. O(log n), O(log log n) or O(1))
   * performance to find the starting point and O(1) to find the
   * end, instead of the less optimal.<br/><br/>
   * Outperforms; <br/>
   * {@link Stream#skip(long)} <br/>
   * {@link Stream#limit(long)}
   */
  public Stream<T> stream(int from, int to);
  
  /**
   * This provides a more optimal way to stream
   * from a data structure to the Consumer of this Stream.
   *  (i.e. O(log n), O(log log n) or O(1))
   * performance to find the starting point and
   * streams to the end of the collection.<br/><br/>
   * Outperforms; <br/>
   * {@link Stream#skip(long)} 
   */
  public Stream<T> streamFrom(int from);
  
  /**
   * This provides a more optimal way to stream
   * from a data structure to the Consumer of this Stream.
   *  (i.e. O(log n), O(log log n) or O(1))
   * performance to find the starting point and
   * streams to the end of the collection.<br/><br/>
   * Outperforms; <br/>
   * {@link Stream#limit(long)}
   */
  public Stream<T> streamTo(int to);
  
  /**
   * Provides the ability to combine streams from
   * multiple collections into a single stream.
   * @return stream of Optional that returns everything 
   * in this collection.
   */
  public I_SizedSupplier<T> supply(int from , int to);
  
  /**
   * Supply items in this collection in a external iterator
   * from the from index to the end.
   * @param from the starting index.
   * @return
   */
  public I_SizedSupplier<T> supplyFrom(int from);  
  
  /**
   * Supply items in this collection in a external iterator
   * from the begining to the to paramater's index.
   * @param to
   * @return
   */
  public I_SizedSupplier<T> supplyTo(int to);  
}
