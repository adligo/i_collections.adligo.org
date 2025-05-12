package org.adligo.i_collections.shared.linked;

/**
 * This is the mutable variant of the DoublyLinkedList.
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
public interface I_DoublyLinkedListMutant<V> extends I_DoublyLinkedList<V> {
	
	/**
	 * Adds a value to the end of the list
	 * @param value
	 * @return
	 */
	public I_DoublyLinkedNodeMutant<V> add(V ... values);
	 

	/**
	 * Adds a value to the end of the list
	 * @param value
	 * @return
	 */
	public I_DoublyLinkedNodeMutant<V> addSingle(V value);
	
	
	/**
	 * 
	 * @return The node at the head.
	 */
	public I_DoublyLinkedNodeMutant<V> getHeadMutant();
	
	/**
	 * 
	 * @return The node at the tail.
	 */
	public I_DoublyLinkedNodeMutant<V> getTailMutant();
}
