// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 9

package lab9;

public class Circle extends Shape implements printObject {
	private double radius;
	
	// Create Circle with color and radius
	public Circle(String color, double radius) {
		super(color);
		setRadius(radius);
	}
	
	// Return radius
	public double getRadius() {
		return radius;
	}
	
	// Set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Check if radius is greater than 0
	public boolean checkRadius() {
		return getRadius() > 0;
	}
	
	// Calculate area
	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	// Calculate perimeter
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}

	// Display area
	@Override
	public void printArea() {
		System.out.println("Area of circle is " + getArea());
	}

	@Override
	public void printPerimeter() {
		System.out.println("Perimeter of circle is " + getPerimeter());
	}

}
