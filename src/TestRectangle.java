// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 1

public class TestRectangle {
	public static void main(String[] args) {
		//Construct a rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The width of rectangle1 is " + rectangle1.width);
		System.out.println("The height of rectangle1 is " + rectangle1.height);
		System.out.printf("The area of rectangle1 is %.2f\n", rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());
		
		
		//Construct a rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("\nThe width of rectangle2 is " + rectangle2.width);
		System.out.println("The height of rectangle2 is " + rectangle2.height);
		System.out.printf("The area of rectangle2 is %.2f\n", rectangle2.getArea());
		System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
	}
}

class Rectangle {
	double width = 1;
	double height = 1;
	
	//Construct a rectangle with width and height
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//Return the area of rectangle
	double getArea() {
		return this.width * this.height;
	}
	
	double getPerimeter() {
		return 2 * (this.width + this.height);
	}
}
