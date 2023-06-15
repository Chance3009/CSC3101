// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 2

package lab2;

import java.util.ArrayList;


public class Student {
	private String studentName;
	private ArrayList<Course> courseList = new ArrayList<>();
	private int noOfCourse;
	
	//Create a student with studentName
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	//Add course to courseList if no duplicates
	public void addCourse(Course c) {
		if (!courseList.contains(c)) {
			courseList.add(c);
			c.addStudent(this);
		}
	}
	
	//Remove course from courseList if course is in courseList
	public void dropCourse(Course c) {
		if (courseList.contains(c)) {
			courseList.remove(c);
			c.dropStudent(this);
		}
	}
	

	//Getter of studentName
	public String getStudentName() {
		return studentName;
	}
	
	//Getter of courseList
	public ArrayList<Course> getCourses() {
		return courseList;
	}
	
	//Getter of noOfCourse
	public int getNoOfCourse() {
		return noOfCourse;
	}
	
	@Override
    public String toString() {
        return studentName;
    }
}
