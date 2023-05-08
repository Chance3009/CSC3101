// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 6

package lab6_2;

public class Employee {
	private int idNum;
	private int age;
	
	// Create Employee with idNum and age
	public Employee (int idNum, int age) throws EmployeeException {
		try {
			setIdNum(idNum);
			setAge(age);
		} catch (IllegalArgumentException ex1) {			// Catch NumberFormatException and IllegalArgumentException
			System.out.println(ex1);			
		} catch(Exception ex2) { 
			throw new EmployeeException(idNum, age);		// Throw EmployeeException if any other undeclared exception is caught
		}
	}

	// Return idNum
	public int getIdNum() {
		return idNum;
	}
	
	// Set new value of idNum
	public void setIdNum(int idNum) {	
		if (idNum < 0 || idNum > 999) 		// Validate idNum 
			throw new NumberFormatException("Identification out of range!");
		this.idNum = idNum;
	}

	// Return age
	public int getAge() {
		return age;
	}

	// Set new value of age
	public void setAge(int age) {
		if (age < 0) 		// Validate age
			throw new IllegalArgumentException("Age cannot be negative!");
		this.age = age;
	}
}
