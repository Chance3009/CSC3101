package exercise6;

public class Lion extends Animal{

	public Lion(int numberOfLegs) {
		super(numberOfLegs);
	}
	@Override
	public String sound() {
		return "Roar";
	}

}
