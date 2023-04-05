package exercise1;

import java.util.Date;

public class Student {
	public String matric;
	public Date dob;
	public Name name;
	public Address address;
	
	public int getAge() {
		return 0;
	}
	
	@Override
	public String toString() {
		return name + " (" + matric + ") : " + address;
	}
}
