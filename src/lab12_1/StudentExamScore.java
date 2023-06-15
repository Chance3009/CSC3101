// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 12

package lab12_1;

import java.io.Serializable;

public class StudentExamScore implements Serializable {
	private static final long serialVersionUID = -7743513675297388937L;
	private int ID;
	private String name;
	private double score;
	
	// Create default object
	public StudentExamScore() {
		this(0, "Default", 0);
	}
	
	// Create object with ID, name and score
	public StudentExamScore(int ID, String name, double score) {
		setID(ID);
		setName(name);
		setScore(score);
	}
	
	// Return ID
	public int getID() {
		return ID;
	}
	
	// Set a new ID
	public void setID(int iD) {
		ID = iD;
	}
	
	// Return name
	public String getName() {
		return name;
	}
	
	// Set a new name
	public void setName(String name) {
		this.name = name;
	}
	
	// Return score
	public double getScore() {
		return score;
	}
	
	// Set a new score
	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d) got a score of %f", name, ID, score);
	}
}
