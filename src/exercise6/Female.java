package exercise6;

public class Female extends Child {
	Female(String name, char gender) {
		super(name, gender);
	}

	@Override
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Gender: Female");
	}
}