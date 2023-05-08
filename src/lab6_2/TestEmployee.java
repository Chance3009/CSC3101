// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 6

package lab6_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		try {
			// Prompt user to input ID and age
			System.out.print("Enter employee's identification: ");
			int idNum = sc.nextInt();
			System.out.print("Enter employee's age: ");
			int age = sc.nextInt();
			
			// Try to create employee object
			Employee employee = new Employee(idNum, age);
			System.out.println("ID: " + employee.getIdNum());
			System.out.println("Age: " + employee.getAge());
			
		} catch (InputMismatchException ex1) {
			System.out.println("Age or ID must be an integer value!");
		} catch (EmployeeException ex2) {
			System.out.println(ex2);
		} finally {
			System.out.println("Done!");
		}
	}
}
