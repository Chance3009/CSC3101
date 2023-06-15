// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 12

package lab12_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestStudentExamScore {
	public static void main(String[] args) {
		// Create 5 StudentExamScore object
		StudentExamScore student1 = new StudentExamScore(111, "Ali", 10);
		StudentExamScore student2 = new StudentExamScore(112, "Ben", 31);
		StudentExamScore student3 = new StudentExamScore(113, "Cindy", 52);
		StudentExamScore student4 = new StudentExamScore(114, "Don", 72.3);
		StudentExamScore student5 = new StudentExamScore(115, "Elyn", 24.5);
		
		// Create an output stream for Exercise17_06.dat
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Exercise17_06.dat", true))) {
			// Write 5 StudentExamScore object into the file
			out.writeObject(student1);
			out.writeObject(student2);
			out.writeObject(student3);
			out.writeObject(student4);
			out.writeObject(student5);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}