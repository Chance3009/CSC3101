// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 6

package lab6_1;

import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", 
					"August", "September", "October", "November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to input an integer
		System.out.print("Enter an integer between 1 and 12: ");
		int num = sc.nextInt();
		
		// Access and print the elements of months and dom array if the integer inputed is between 1 and 12
		try {
			System.out.println("Month: " + months[num-1]);
			System.out.println("Number of days: " + dom[num-1]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Wrong number");
		}
	}
}
