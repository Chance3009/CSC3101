// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 8

package lab8_2;

public abstract class GeometricFigure implements ObjectType, SidedObject {
	private String objectName = getClass().getSimpleName();
	
	// Abstract method findArea
	public abstract double findArea();
	
	// Return objectName
	public String getObjectName() {
		return objectName;
	}
	
	@Override
	public String toString() {
		return objectName + " has an area of " + findArea();
	}
}
