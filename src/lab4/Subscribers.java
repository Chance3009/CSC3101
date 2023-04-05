// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 4

package lab4;

public class Subscribers {
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		// Create two NewspaperSubscriber objects
		NewspaperSubscriber news1 = createNews();
		NewspaperSubscriber news2 = createNews();
		
		// Invoke equals method
		System.out.println("Two newspaper subscribers have the same address: " + news1.equals(news2));
	}
	
	
	// Invoke respective toString method based on class of object
	public static void PrintDetails(Object o) {
		System.out.println();
		if(o instanceof SevenDaySubscriber) 
			System.out.println("Seven day subscriber\n" + ((SevenDaySubscriber)o).toString());
		else if (o instanceof WeekDaySubscriber)
			System.out.println("Weekday subscriber\n" + ((WeekDaySubscriber)o).toString());
		else 
			System.out.println("Weekend subscriber\n" + ((WeekendSubscriber)o).toString());
		System.out.println();
	}
	
	// Create and return respective object based on service type inputed by user
	public static NewspaperSubscriber createNews() {
		NewspaperSubscriber news;
		
		System.out.print("Service Type (Seven day subscriber | Weekday subscriber | Weekend subscriber): ");
		String type = sc.nextLine().strip().toUpperCase().replace(" ", "");
		
		if (type.equals("SEVENDAYSUBSCRIBER"))
			news = new SevenDaySubscriber();
		else if (type.equals("WEEKDAYSUBSCRIBER"))
			news = new WeekDaySubscriber();
		else 
			news = new WeekendSubscriber();
		
		System.out.print("Enter address: ");
		String address = sc.nextLine().strip();
		news.setAddress(address);
		
		PrintDetails(news);
		return news;
	}
}
