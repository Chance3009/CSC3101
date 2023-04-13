// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 5

package lab5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestLibraryBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<LibraryBook> books = new ArrayList<>();
		String title;
		String author;
		int page;
		double price;
		LibraryBook book; 
		boolean duplicate;
		String response = "Something else";
		
		// Loop until user input "QUIT"
		while (!response.equals("QUIT")) {
			duplicate = false;
			
			// Prompt user to input the information of book
			System.out.println("___________________________________________");
			System.out.print("Title: ");
			title = sc.nextLine().trim();
			System.out.print("Author: ");
			author = sc.nextLine().trim();
			System.out.print("Page: ");
			page = sc.nextInt();
			System.out.print("Price: RM");
			price = sc.nextDouble();
			sc.nextLine();
			
			// Loop books and check for duplicate title
			for (LibraryBook b : books) {
				if (b.getTitle().equals(title)) {
					// Set duplicate to true if the inputed title equals title of any book in the list
					System.out.println("Data already exists. Please input again.");
					duplicate = true;
					
					// Ask user to continue or quit
					System.out.print("Do you want to continue? [Enter QUIT to quit]: ");
					response = sc.nextLine().toUpperCase().trim();
					break;
				} 
			}
			// Skip the current loop if duplicate = true
			if (duplicate) continue;
			
			// Add the book into books if pass duplicate test
			book = new LibraryBook(title, author, page, price);
			books.add(book);
			
			// Ask user to continue or quit
			System.out.print("Do you want to continue? [Enter QUIT to quit]: ");
			response = sc.nextLine().toUpperCase().trim();
		}
		
		// Display LibraryBook in the list
		System.out.println("\n" + books);
		System.out.println("Thank you for using this program.");
	}
}
