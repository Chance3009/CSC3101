// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 7

package lab7_3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FriendList {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		File friendlist = new File("src/lab7_3/res/friendlist.txt");
		writeFile(friendlist);
		readFile(friendlist);
	}
	
	public static void writeFile(File file) {
		try (PrintWriter output = new PrintWriter(file)) {
			// Repeat until user enter character other than 'Y'
			while (true) {
				// Read and write name with respective phone number into the file passed to the method
				System.out.print("Enter name: ");
				output.print(sc.nextLine().trim() + "\t");
				System.out.print("Enter phone number: ");
				output.println(sc.nextLine().trim());
				
				System.out.print("Enter \"Y\" to continue: ");
				if(sc.nextLine().toUpperCase().charAt(0) != 'Y') {
					break;
				}
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("Something wrong when writing data into the file");
		}
	}
	
	public static void readFile(File file) {
		try (Scanner input = new Scanner(file)){ 
			// Prompt user to enter name that will be searched in the file given
			System.out.print("Enter the name you want to search: ");
			String name = sc.next();
			
			boolean isFound = false;
			
			// Repeat until reach the end of the file
			while (input.hasNext()) {
				String temp = input.next();
				
				// Break from the loop and print name with respective phone number if inputed name is found in the file
				if (temp.toLowerCase().equals(name.toLowerCase())) {
					isFound = true;
					System.out.println("Name: " + temp);
					System.out.println("Phone number: " + input.next());
					break;
				} 
			} 
			
			// Print "cannot find the name" if no equal name found in the file
			if (!isFound) {
				System.out.println("Cannot find " + name + " from the file");
			}
			
		} catch (IOException e) {
			System.out.println("Something wrong when reading data from the file");
		}
	}
}
