// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 2

package lab2_1;

import java.util.ArrayList;


public class Course {
	private String courseName;
	private ArrayList<Student> classList = new ArrayList<>();
	private int noOfStudent;
	
	//Create course with name
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	//Add student to classsList if no duplicates
	public void addStudent(Student s) {
		if (!classList.contains(s)) {
			classList.add(s);
			s.addCourse(this);
		}
	}
	
	//Remove student from classList if student is in classList
	public void dropStudent(Student s) {
		if (classList.contains(s)) {
			classList.remove(s);
			s.dropCourse(this);
		}
	}
	
	//Getter of courseName
	public String getCourseName() {
		return courseName;
	}
	
	//Getter of classList
	public ArrayList<Student> getStudents() {
		return classList;
	}
	
	//Getter of noOfStudent
	public int getNoOfStudent() {
		return noOfStudent;
	}
	
	@Override
    public String toString() {
        return courseName;
    }
}
