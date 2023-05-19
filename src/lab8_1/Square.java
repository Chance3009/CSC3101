// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 8

package lab8_1;

public class Square extends GeometricObject implements Colorable{
	private double side;
	
	// Construct a default square object
	public Square() {
		side = 0;
	}
	
	// Construct a square with side
	public Square(double side) {
		setSide(side);
	}
	
	// Return side
	public double getSide() {
		return side;
	}
	
	// Set a new side
	public void setSide(double side) {
		this.side = side;
	}
	
	// Calculate area
	@Override
	public double getArea() {
		return side * side;
	}
	
	// Calculate perimeter
	@Override
	public double getPerimeter() {
		return side * 4;
	}
	
	// Display "Color all four sides."
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}
}
