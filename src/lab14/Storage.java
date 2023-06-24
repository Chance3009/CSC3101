// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 14

package lab14;

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
	
	// Check if two strings are equal
	public boolean equal(String s1, String s2) {
		return s1.equals(s2);
	}
	
	// Find the smallest number in the storage, return null if no number is stored in the storage
	public Number smallValue() {
		if(isEmpty() || !Number.class.isInstance(items.get(1))) return null;
		Number min = (Number) items.get(0);
		for (E item: items) {
			if(((Number) item).doubleValue() < min.doubleValue()) {
				min = (Number) item;
			}
		}
		return min;
	}
}
