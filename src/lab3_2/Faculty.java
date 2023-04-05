// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Faculty extends Employee{
	private int officeHour;
	private String rank;
	
	// Create Faculty object with name, address, hpNo, email, office, salary, dateHired, officeHour, rank
	public Faculty(String name, String address, String hpNo, String email, 
			String office, double salary, MyDate dateHired, int officeHour, String rank) {
		super(name, address, hpNo, email, office, salary, dateHired);
		this.officeHour = officeHour;
		this.rank = rank;
	}
	
	// Return officeHour
	public int getOfficeHour() {
		return officeHour;
	}
	
	// Return rank
	public String getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		return super.toString() + "  |  " + getOfficeHour() + " hours  |  " + getRank();
	}
}
