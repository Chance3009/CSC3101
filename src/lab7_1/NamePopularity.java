// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 7

package lab7_1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NamePopularity {
	
	public static void main(String[] args) {
		try (
			Scanner input = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt").openStream());
			Scanner sc = new Scanner(System.in);
		){
			// Prompt user to input name
			System.out.print("Enter the name: ");
			String name = sc.nextLine().trim();
			
			int count = 0;
			boolean isFound = false;
			
			// Repeat until reach the end of the file
			while (input.hasNext()) {
				count++;						// Count the number of line read, which equivalents to the rank of the names appear in the current line
				if (input.nextLine().toLowerCase().contains(name.toLowerCase())) {
					System.out.println(name + " is ranked no. " + count);
					isFound = true;
					break; 						// Break from the loop if the name is found in the file
				} 
			} 
			
			if (!isFound) {
				System.out.println("The name " + name + " is not listed in the ranking.");
			}
	
		} catch (MalformedURLException e1) {
			System.out.print("Something wrong with the URL.");
		} catch (IOException e2) {
			System.out.print("Something wrong with the scanner.");
		} 
	}
}
