// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 14

package lab14;

public class TestStorageExtended {
	public static void main(String[] args) {	
		// Create three storages to store different type of items
		Storage<Integer> storage1 = new Storage<>();
		Storage<String> storage2 = new Storage<>();
		Storage<Double> storage3 = new Storage<>();
		
		// Add items to storage1
		storage1.addItem(1);
		storage1.addItem(13);
		storage1.addItem(1521);
		storage1.addItem(13);
		
		// Add items to storage2
		storage2.addItem("Hi");
		storage2.addItem("Test");
		storage2.addItem("Java");
		storage2.addItem("Python");
		
		// Add items to storage3
		storage3.addItem(1.2);
		storage3.addItem(5.42);
		storage3.addItem(0.5);
		storage3.addItem(23.23);
		
		// Display the smallest number in the storages
		System.out.println("Smallest value in Storage 1: " + storage1.smallValue());
		System.out.println("Smallest value in Storage 2: " + storage2.smallValue());
		System.out.println("Smallest value in Storage 3: " + storage3.smallValue());
		
		// Check if two strings are equal
		System.out.println("\nIs String 1 equals to String 2? " + storage2.equal(storage2.getItem(0), storage2.getItem(1)));
	}
}
