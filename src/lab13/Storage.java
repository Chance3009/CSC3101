// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 13

package lab13;

import java.util.ArrayList;
import java.util.List;

public class Storage<E> {
	private List<E> items;
	public int size = 0;
	
	// Initialize list to store item
	public Storage() {
		items = new ArrayList<E>();
	}
	
	// Add item to storage
	public void addItem(E item) {
		items.add(item);
		size++;
	}
	
	// Get item at given index
	public E getItem(int index) {
		if (index >= size) return null;
		return items.get(index);
	}
	
	// Check if storage is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
}
