// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Employee extends Person{
	private String office;
	private double salary;
	private MyDate dateHired;
	
	// Create Employee object with name, address, hpNo, email, office, salary, dateHired
	public Employee(String name, String address, String hpNo, String email, 
			String office, double salary, MyDate dateHired) {
		super(name, address, hpNo, email);
		this.office = office;
		this.salary = salary; 
		this.dateHired = dateHired;
	}
	
	// Return office
	public String getOffice() {
		return office;
	}
	
	// Return salary
	public double getSalary() {
		return salary;
	}

	// Return dateHired
	public MyDate getDateHired() {
		return dateHired;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "  |  " + office + "  |  RM" + salary + "  |  " + dateHired;
	}
}
