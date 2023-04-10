// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 5

package lab5_1;

public class LibraryBook {
	private String title;
	private String author;
	private int page;
	private double price;
	
	// Create LibraryBook with title, author, page and price
	public LibraryBook(String title, String author, int page, double price) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
	}
	
	// Return title
	public String getTitle() {
		return title;
	}
	
	// Set a new title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Return author
	public String getAuthor() {
		return author;
	}
	
	// Set a new author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// Return page count
	public int getPage() {
		return page;
	}
	
	// Set a new page count
	public void setPage(int page) {
		this.page = page;
	}
	
	// Return price
	public double getPrice() {
		return price;
	}
	
	// Set a new price
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Return a string representation of LibraryBook
	@Override 
	public String toString() {
		return String.format("%s (%s) -- %d pages | RM%.2f |", title, author, page, price);
	}
}
