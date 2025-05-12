package org.adligo.i_collections.shared.linked;

import java.util.LinkedList;

/**
 * This is a interface of a immutable DoubleyLinkedNode, you can check if this node is mutable by seeing if it is also a 
 * {@link I_DoublyLinkedNodeMutant}.  It was created because Java's {@link LinkedList} uses integer accessing methods, so it will 
 * for ever be backed by some kind of array.
 * <br/>
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
 * ---------------- Apache LICENSE-2.0 --------------------------
 *
 * Copyright 2025 Adligo Inc
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
public interface I_DoublyLinkedNode<V> {
	/**
	 * The value at this node
	 * @return
	 */
	public V getValue();
	
	/**
	 * The next node or null.
	 * @return
	 */
	public I_DoublyLinkedNode<V> getNext();
	/**
	 * The previous node or null.
	 * @return
	 */
	public I_DoublyLinkedNode<V> getPrevious();
	/**
	 * If there is a next node or if this is the end
	 * @return
	 */
	public boolean hasNext();
	/**
	 * If there is a previous node or if this is the first node.
	 * @return
	 */
	public boolean hasPrevious();
}
