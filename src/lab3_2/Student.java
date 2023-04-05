// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Student extends Person{
	private final String STATUS;
	
	// Create Student object with name, address, hpNo, email, status
	public Student(String name, String address, String hpNo, String email, String status) {
		super(name, address, hpNo, email);
		STATUS = status;
	}
	
	//return STATUS
	public String getSTATUS() {
		return STATUS;
	}
	
	@Override
	public String toString() {
		return super.toString() + "  |  " +  getSTATUS();
	}

}

