// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 2

package lab2_1;

public class School {
	public static void main(String[] args) {
		//Create student and course object
		Student student1 = new Student("Peter Jones");
		Student student2 = new Student("Kim Smith");
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		
		//Add course to student
		student1.addCourse(course1);
		student2.addCourse(course1);
		
		//Add student to course (equivalent to add course to student)
		course2.addStudent(student2);
		
		//Output each courseList and each classList
		System.out.println("The course(s) that Peter Jones is taking: " + student1.getCourses());
		System.out.println("The course(s) that Kim Smith is taking: " + student2.getCourses());
		System.out.println("\nThe student(s) in the Data Structures course: " + course1.getStudents());
		System.out.println("The student(s) in the Database Systems course: " + course2.getStudents());
	}
}
