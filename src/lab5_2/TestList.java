// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 5

package lab5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		testSort();
		testSum();
		testRemoveDuplicate();
	}
	
	// Test sort method in MyList class
	public static void testSort() {
		// Create an arraylist 
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("\n********************** Test Sort **********************\n");
		System.out.print("Enter five numbers: ");
		
		// Add five integer inputs into arraylist
		for (int i=0; i<5; i++) {
			list.add(sc.nextInt());
		}
		
		// Call sort method 
		MyList.sort(list);
		
		System.out.println("\n__________________ Display Numbers ___________________\n");
		
		// Loop over arraylist and print all the elements 
		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n*******************************************************\n");
	}
	
	// Test sum method in MyList class
	public static void testSum() {
		// Create an arraylist
		ArrayList<Double> list = new ArrayList<>();

		System.out.println("\n********************** Test Sum ***********************\n");
		System.out.print("Enter five numbers: ");
		
		// Add five double inputs into arraylist
		for (int i=0; i<5; i++) {
			list.add(sc.nextDouble());
		}
		
		// Call sum method and print the sum of elements in arraylist
		System.out.println("\nSum: " + MyList.sum(list));
		System.out.println("\n\n*******************************************************\n");
	}
	
	// Test removeDuplicate method in MyList
	public static void testRemoveDuplicate() {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("\n**************** Test Remove Duplicate ****************\n");
		System.out.print("Enter ten numbers: ");
		
		// Add 10 integer inputs into arraylist
		for (int i=0; i<10; i++) {
			list.add(sc.nextInt());
		}
		
		// Call removeDuplicate method
		MyList.removeDuplicate(list);
		
		System.out.println("\n__________________ Display Numbers ____________________\n");
		
		// Loop over arraylist and print all the elements
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n*******************************************************\n");
	}
}
