// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 13

package lab13;

public class TestStorage {
	public static void main(String[] args) {
		// Create three storages to store different type of items
		Storage<Integer> storage1 = new Storage<>();
		Storage<String> storage2 = new Storage<>();
		Storage<Number> storage3 = new Storage<>();
		
		// Add items to storage1
		storage1.addItem(1);
		storage1.addItem(13);
		storage1.addItem(1521);
		
		// Add items to storage2
		storage2.addItem("Hi");
		storage2.addItem("Test");
		storage2.addItem("Java");
		storage2.addItem("Python");
		
		// Display items stored in storage1
		System.out.println("Storage 1");
		for(int i=0; i<storage1.size; i++) {
			System.out.printf("Item with index %d: %s\n", i, storage1.getItem(i));
		}
		
		// Display items stored in storage2
		System.out.println("\nStorage 2");
		for(int i=0; i<storage2.size; i++) {
			System.out.printf("Item with index %d: %s\n", i, storage2.getItem(i));
		}
		
		// Check if storages are empty and display the results
		System.out.println("\nStorage 1 is empty: " + storage1.isEmpty());
		System.out.println("Storage 2 is empty: " + storage2.isEmpty());
		System.out.println("Storage 3 is empty: " + storage3.isEmpty());
	}
}
