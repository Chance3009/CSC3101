package exercise4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("This is a program to calculates the average of K integers");
		while (true) {
			try {
				System.out.print("Enter K: ");
				num = sc.nextInt();
				if (num <= 0) throw new IllegalArgumentException();
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("K must be positive\n");
			} catch (InputMismatchException e) {
				System.out.println("Enter number, not something else\n");
			}
		}
		
		System.out.println("Enter " + num + " positive integers");
		
		int[] arr = new int[num];
		for (int i=1; i<=num; i++) {
			while (true) {
				try {
					System.out.print("Number " + i + ": ");
					arr[i-1] = sc.nextInt();
					if (arr[i-1] <= 0) throw new IllegalArgumentException();
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Number must be positive\n");
				} catch (InputMismatchException e) {
					System.out.println("Enter number, not something else\n");
				}
			}
		}
		double avg = ((double) Arrays.stream(arr).sum())/num;
		System.out.println("Average of " + num + " integers is " + avg);
		;
	}
}
