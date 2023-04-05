// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

public class Test {
	public static void main(String[] args) {
		// Create object of Person, Student, Employee. Faculty, Staff
		Person person = new Person("Ali", "2, Jalan Durian, Taman Cempaka, 56000 Cheras, Kuala Lumpur", "0123456789", "ali123@gmail.com");
		
		Student student = new Student("Ben", "15, Kampung Baru, 43000 Kajang, Selangor", "0101010101", "ben@gmail.com", "FRESHMAN");
		
		Employee employee = new Employee("Cindy", "27, Persiaran Bercham, Taman Jaya, 47301 Petaling Jaya, Selangor", "0125353234", "cindy@gmail.com",
											"Bangunan Wisma Lee Yong, Kuala Lumpur", 3700, new MyDate());
		
		Faculty faculty = new Faculty("Don", "Lot 5, Lorong Gambut, 25000 Kuantan, Pahang", "0183428734", "don@gmail.com", 
										"FSKTM, UPM", 7500, new MyDate(), 30, "Professor");
		
		Staff staff = new Staff("Elly", "15, Lorong Mak Mandin 3, 12300 Butterworth, Pulau Pinang", "016123456", "elly@gmail.com", 
									"SPE, UPM", 4000, new MyDate(), "Assistant");
		
		// Print person, student, employee, faculty, staff and invoke their toString() methods implicitly
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
