// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 6

package lab6_2;

public class EmployeeException extends Exception{
	private int idNum;
	private int age;
	
	// Create EmployeeException
	public EmployeeException(int idNum, int age) {
		super("Invalid ID " + idNum + " or/and age " + age);
		this.idNum = idNum;
		this.age = age;
	}
	
	// Return idNum
	public int getIdNum() {
		return idNum;
	}
	
	// Return age
	public int getAge() {
		return age;
	}
}
