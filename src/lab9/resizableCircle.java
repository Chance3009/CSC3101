// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 9

package lab9;

public class resizableCircle extends Circle implements resizable {
	// Create resizableCircle with radius and default color "White"
	public resizableCircle(double radius) {
		super("White", radius);
	}
	
	// Modify radius by given percentage
	@Override
	public void resize(int percent) {
		setRadius(getRadius() * (percent/100));
	}
	
}
