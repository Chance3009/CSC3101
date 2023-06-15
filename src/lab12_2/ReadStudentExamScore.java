// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 12

package lab12_2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lab12_1.StudentExamScore;

public class ReadStudentExamScore {
    public static void main(String[] args) {
    	// Create a list to store StudentExamScore object
    	List<StudentExamScore> list = new ArrayList<>();
    	// Create an input stream for Exercise17_06.dat
    	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"))) {
            // Read data from the file
            while (true) {
            	list.add((StudentExamScore)(in.readObject()));
            }
        } catch (EOFException e) {
        	System.out.println("All data from the file has been loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot perform class casting");
        } catch (IOException e) {
        	e.printStackTrace();
            System.out.println("Error when reading from the file");
        }
    	
    	// Calculate average score
    	double average = (list.stream().mapToDouble(StudentExamScore::getScore).sum())/list.size();
    	// Find the student with highest score
    	StudentExamScore highest = list.stream().max(Comparator.comparingDouble(StudentExamScore::getScore)).get();
    	
    	// Display the required output
    	System.out.println("\nAverage Examination Score: " + average);
    	System.out.println("Highest Examination Score: " + highest.getScore());
    	System.out.printf("Student who achieved the highest score: %s (%d)\n", highest.getName(), highest.getID());
    }
}
    
