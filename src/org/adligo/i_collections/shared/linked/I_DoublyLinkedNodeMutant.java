package org.adligo.i_collections.shared.linked;

import java.util.LinkedList;

/**
 * This is a interface of a mutable DoubleyLinkedNode.
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
public interface I_DoublyLinkedNodeMutant<V> extends I_DoublyLinkedNode<V> {
	/**
	 * The next node or null.
	 * @return
	 */
	public I_DoublyLinkedNodeMutant<V> getNextMutant();
	/**
	 * The previous node or null.
	 * @return
	 */
	public I_DoublyLinkedNodeMutant<V> getPreviousMutant();
	
	/**
	 * Updates the pointer of the next node
	 * @param next
	 */
	public void setNext(I_DoublyLinkedNodeMutant<V> next);
	/**
	 * Updates the pointer of the next node.
	 * @param previous
	 */
	public void setPrevious(I_DoublyLinkedNodeMutant<V> previous);
	
	/**
	 * Sets the data of the current node with out modifying previous and next.
	 * @param value
	 */
	public void setValue(V value);
}
