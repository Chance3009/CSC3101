// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 8

package lab8_1;

public class TestColorable {
	public static void main(String[] args) {
		// Create an array with type GeometricObject that hold five Square object
		GeometricObject[] arr = {new Square(1), new Square(2), new Square(3), new Square(4), new Square(5)};
		
		// Loop over the array
		for(GeometricObject o : arr) {
			// Print area of each object
			System.out.println(o.getArea());
			// Call howToColor method if the object is an instance of Colorable
			if (o instanceof Colorable) {
				((Square) o).howToColor();
			}
		}
	}
}
