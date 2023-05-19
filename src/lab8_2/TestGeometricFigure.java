package lab8_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestGeometricFigure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Construct triangle and square objects 
		Triangle triangle = new Triangle();
		Square square = new Square();
		
		// Set width and height of triangle and square
		try {
			System.out.print("Width of triangle: ");
			triangle.setWidth(sc.nextDouble());
			System.out.print("Height of triangle: ");
			triangle.setHeight(sc.nextDouble());
			System.out.print("Width of square: ");
			square.setWidth(sc.nextDouble());
			System.out.print("Height of square: ");
			square.setHeight(sc.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println("Wrong data type, only numbers are accepted for width and height");
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid width/heigth");
		}
		
		System.out.println();
		// Display info of triangle and square
		triangle.printObjectType();
		triangle.printSides();
		System.out.println(triangle);
		
		System.out.println();
		
		square.printObjectType();		square.printSides();		System.out.println(square);
		
		System.out.println("\nIs triangle equal to square ? " + (triangle.equals(square)? "Yes" : "No"));
	}
}
