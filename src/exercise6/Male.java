package exercise6;

public class Male extends Child {
	Male(String name, char gender) {
		super(name, gender);
	}

	@Override
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Gender: Male");
	}
}
