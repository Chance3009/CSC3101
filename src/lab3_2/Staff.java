// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Staff extends Employee{
	private String title;
	
	// Create Staff object with name, address, hpNo, email, office, salary, dateHired, title
	public Staff(String name, String address, String hpNo, String email, 
			String office, double salary, MyDate dateHired, String title) {
		super(name, address, hpNo, email, office, salary, dateHired);
		this.title = title;
	}

	// Return title
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "  |  " + getTitle();
	}
}
