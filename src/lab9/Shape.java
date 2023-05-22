// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 9

package lab9;

public abstract class Shape {
	private String color;
	
	// Create Shape object with color
	public Shape(String color) {
		setColor(color);
	}

	// Return color
	public String getColor() {
		return color;
	}
	
	// Set a new color
	public void setColor(String color) {
		this.color = color;
	}
	
	// Abstract method that calculate area
	public abstract double getArea();
	
	// Abstract method that calculate perimeter
	public abstract double getPerimeter();
	
}	
