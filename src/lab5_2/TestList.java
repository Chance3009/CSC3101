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
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("\n********************** Test Sort **********************\n");
		System.out.print("Enter five numbers: ");
		
		for (int i=0; i<5; i++) {
			list.add(sc.nextInt());
		}
		
		MyList.sort(list);
		
		System.out.println("\n__________________ Display Numbers ___________________\n");
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\n\n*******************************************************\n");
	}
	
	// Test sum method in MyList class
	public static void testSum() {
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("\n********************** Test Sum ***********************\n");
		System.out.print("Enter five numbers: ");
		
		for (int i=0; i<5; i++) {
			list.add(sc.nextDouble());
		}
		
		System.out.println("\nSum: " + MyList.sum(list));
		System.out.println("\n\n*******************************************************\n");
	}
	
	// Test removeDuplicate method in MyList
	public static void testRemoveDuplicate() {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("\n**************** Test Remove Duplicate ****************\n");
		System.out.print("Enter ten numbers: ");
		
		for (int i=0; i<10; i++) {
			list.add(sc.nextInt());
		}
		
		MyList.removeDuplicate(list);
		
		System.out.println("\n__________________ Display Numbers ____________________\n");
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n*******************************************************\n");
	}
}
