package exercise2;

public class Employee {
	private String name;
	private String ID;
	
	Employee(String name, String idNo) {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString() {
		return name + " (" + ID + ")";
	}
}
