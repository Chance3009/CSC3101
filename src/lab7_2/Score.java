// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 7

package lab7_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		List<String> matric = new ArrayList<>();
		List<Integer> mark = new ArrayList<>();
		
		try (Scanner sc = new Scanner(new File("src/lab7_2/input/scores.txt"))) {
			while (sc.hasNextLine()) {
				// Add the first token in the text file into the matric list and add the total of next five integer tokens to the mark list
				matric.add(sc.next());
				mark.add(sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt());
			}
		} catch (IOException e) {
			System.out.println("Error with input file.");
		} catch (NumberFormatException e) {
			System.out.println("Something wrong with the score in the file.");
		}
		
		// Write matric, total mark and grade into a file 
		try (PrintWriter output = new PrintWriter(new File("src/lab7_2/output/grades.txt"))) {
			for (int i=0; i<matric.size(); i++) {
				output.print(matric.get(i) + "\t");
				output.print(mark.get(i) + "\t");
				output.println(getGrade(mark.get(i)));
			}
		} catch (IOException e) {
			System.out.println("Error with output file");
		} 
	}
	
	// Convert mark to grade 
	public static String getGrade(int mark) {
		if (mark >= 80) return "A";
		if (mark >= 75) return "A-";
		if (mark >= 70) return "B+";
		if (mark >= 65) return "B";
		if (mark >= 60) return "B-";
		if (mark >= 55) return "C+";
		if (mark >= 50) return "C";
		if (mark >= 47) return "C-";
		if (mark >= 44) return "D+";
		if (mark >= 40) return "D";
		return "F";
	}
}
