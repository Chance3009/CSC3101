// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 8

package lab8_2;

public class Square extends GeometricFigure {
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
		return height * width;
	}

	// Display number of side
	@Override
	public void printSides() {
		System.out.println("A square has 4 sides.");
	}
	
	// Display object type
	@Override
	public void printObjectType() {
		System.out.println("This object is a square.");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Square)
			return (height == ((Square)obj).getHeight()) && 
					(width == ((Square)obj).getWidth()) && 
					(this.getObjectName().equals(((Square)obj).getObjectName()));
		return false;
	}
}
