// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 9

package lab9;

public class Rectangle extends Shape implements printObject {
	private double height;
	private double width;
	
	// Create rectangle with color, width and height
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// Check if width and height are greater than 0
	public boolean checkWidthandHeight() {
		return width > 0 && height > 0;
	}
	
	// Calculate area
	@Override
	public double getArea() {
		return height * width;
	}
	
	// Calculate perimeter
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// Display area
	@Override
	public void printArea() {
		System.out.println("Area of rectangle is " + getArea());
	}

	// Display perimeter
	@Override
	public void printPerimeter() {
		System.out.println("Perimeter of rectangle is " + getPerimeter());
	}

}
