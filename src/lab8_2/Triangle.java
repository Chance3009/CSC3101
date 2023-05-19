// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 8

package lab8_2;

public class Triangle extends GeometricFigure{
	private double height;
	private double width;
	
	// Return height
	public double getHeight() {
		return height;
	}
	
	// Set a new height, throw exception if height less than or equal to 0
	public void setHeight(double height) throws IllegalArgumentException {
		if (height <= 0) throw new IllegalArgumentException();
		this.height = height;
	}
	
	// Return width
	public double getWidth() {
		return width;
	}
	
	// Set a new width, throw exception if width less than or equal to 0
	public void setWidth(double width) throws IllegalArgumentException {
		if (width <= 0) throw new IllegalArgumentException();
		this.width = width;
	}
	
	// Calculate area
	@Override
	public double findArea() {
		return 0.5 * getHeight() * getWidth();
	}
	
	// Display number of side
	@Override
	public void printSides() {
		System.out.println("Triangle has 3 sides.");
	}
	
	// Display object type
	@Override
	public void printObjectType() {
		System.out.println("This object is a triangle.");		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Triangle)
			return (height == ((Triangle)obj).getHeight()) && 
					(width == ((Triangle)obj).getWidth()) && 
					(this.getObjectName().equals(((Triangle)obj).getObjectName()));
		return false;
	}
}
