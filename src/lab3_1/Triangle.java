// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_1;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	// Construct a default triangle object
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	// Construct a triangle object with the specified side1, side2, side3 ,color and filled
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Return side1
	public double getSide1 () {
        return side1;
    }
	
	// Return side2
	public double getSide2 () {
        return side2;
    }
	
	// Return side3
	public double getSide3 () {
        return side3;
    }
	
	// Return area 
	public double getArea() {
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	//Return perimeter
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	// Return a string representation of Triangle object
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " | side2 = " + side2 + " | side3 = " + side3;
	}
}
