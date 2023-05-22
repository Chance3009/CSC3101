package exercise6;

public abstract class Animal extends LivingThings implements Comparable {
	private int numberOfLegs;
	
	public Animal(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	@Override 
	public String howToMove() {
		return "Move";
	}
	
	@Override 
	public String howToGrow() {
		return "Grow";
	}
	
	public abstract String sound();
	
	@Override 
	public int compareTo(Object o) {
		if (o instanceof Animal) {
			if (numberOfLegs > ((Animal) o).numberOfLegs) {
				return 1;
			} else if (numberOfLegs > ((Animal) o).numberOfLegs) {
				return -1;
			}
		} 
		return 0;
	}
}
