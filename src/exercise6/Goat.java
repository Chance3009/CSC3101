package exercise6;

public class Goat extends Animal implements Edible {

	public Goat(int numberOfLegs) {
		super(numberOfLegs);
	}

	@Override
	public String sound() {
		return "Mekkkk";
	}

	@Override
	public String howToCook() {
		return null;
	}

}
