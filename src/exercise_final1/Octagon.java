package exercise_final1;

import lab8_1.GeometricObject;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    private double side;   

    public Octagon() {
    	this(1);
    }
    
    public Octagon(double side) {
        setSide(side);
    }

    public Octagon(double side, String color, boolean filled) {
    	super(color, filled);
    	setSide(side);
    }
    
    public double getSide() {
        return side;
    }
 
    public void setSide(double side) {
         this.side = side;
    }
	
	@Override
	public double getArea() {
		return (2+4/Math.sqrt(2)) * side * side;	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Octagon) return side < ((Octagon)o).side? -1:1;
		return 1;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	@Override
	public String toString() {
		return "Octagon with side " + side;
	}
} 