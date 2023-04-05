// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Person {
	private String name;
	private String address;
	private String hpNo;
	private String email;
	
	// Create Person object with name, address, hpNo, email
	public Person(String name, String address, String hpNo, String email) {
		this.name = name;
		this.address = address;
		this.hpNo = hpNo;
		this.email = email;
	}

	// Return name
	public String getName() {
		return name;
	}
	
	// Return address
	public String getAddress() {
		return address;
	}
	
	// Return hpNo
	public String getHpNo() {
		return hpNo;
	}

	// Return email
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " - " + name;
	}
		
}
