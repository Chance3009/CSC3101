// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 9

package lab9;

import java.util.Scanner;

public class shapeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape[] arr = new Shape[10];
		
		// Create 10 rectangle or circle in an array
		for(int i=0; i<10; i++) {
			while (true) {
				// Prompt user to input code for shape to be created
				System.out.println("\nEnter 1 to create rectangle\nEnter 2 to create circle");
				int choice = sc.nextInt();
				if (choice == 1) {
					sc.nextLine();
					arr[i] = createRectangle(sc);
					break;
				} else if (choice == 2) {
					sc.nextLine();
					arr[i] = createCircle(sc);
					break;
				} else {
					sc.nextLine();
					System.out.println("Invalid code, please enter again");
				}
			}
		}
		
		// Display color, area and perimeter of each shape in array
		for (int i=0; i<10; i++) {
			System.out.println("\nShape " + (i+1) + " with color " + arr[i].getColor());
			if (arr[i] instanceof Rectangle) {
				((Rectangle) arr[i]).printArea();
				((Rectangle) arr[i]).printPerimeter();
			} else {
				((Circle) arr[i]).printArea();
				((Circle) arr[i]).printPerimeter();
			}
			
		}
	}
	
	// Create rectangle object with user-inputed color, width and height
	public static Rectangle createRectangle(Scanner sc) {
		System.out.print("\nEnter color: ");
		String color = sc.nextLine();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		return new Rectangle(color, width, height);
	}
	
	// Create circle object with user-inputed color and radius
	public static Circle createCircle(Scanner sc) {
		System.out.print("\nEnter color: ");
		String color = sc.nextLine();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		sc.nextLine();
		
		return new Circle(color, radius);
	}
}
