package exercise6;

public abstract class Child {
	public String name;
	public char gender;
	
	public Child(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public abstract void display();
}
