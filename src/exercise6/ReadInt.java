package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadInt {
	public static void main(String[] args) {
		int sum = 0;
		try (Scanner sc = new Scanner(new File("./data.txt"))) {
			while (sc.hasNextLine()) {
				sum  += sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file cannot be found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Error with input file.");
		} catch (NumberFormatException e) {
			System.out.println("Something wrong with the score in the file.");
		}
		
		System.out.println("Sum is " + sum);
	}
}
