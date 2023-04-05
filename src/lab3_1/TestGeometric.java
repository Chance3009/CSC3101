// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_1;

import java.util.Scanner;


public class TestGeometric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to input side1, side2, side3
		System.out.print("Enter length of side1: ");
		double side1 = sc.nextDouble();
		System.out.print("Enter length of side2: ");
		double side2 = sc.nextDouble();
		System.out.print("Enter length of side3: ");
		double side3 = sc.nextDouble();
		sc.nextLine();
		
		// Prompt user to input color
		System.out.print("Enter color of triangle: ");
		String color = sc.nextLine().trim();
		
		// Prompt user to input filled
		System.out.println("Is the triangle filled? [Y|N]: ");
		boolean filled = Character.toUpperCase(sc.next().charAt(0)) == 'Y';

		// Create triangle object
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		// Output info of triangle
		System.out.println("\n__________________________________________________________________\n");
		System.out.println(triangle);
		System.out.printf("Area: %.2f\n", triangle.getArea());
		System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("IsFilled: " + triangle.isFilled());
	}
}
