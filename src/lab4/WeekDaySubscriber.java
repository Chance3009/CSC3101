// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 4

package lab4;

public class WeekDaySubscriber extends NewspaperSubscriber{
	// Create WeekSevenDaySubscriber object with default subscriberRate of 3.5
	public WeekDaySubscriber() {
		setSubscriberRate(3.5);
	}
	
	// Return string representation of WeekDaySubscribers
	@Override
	public String toString() {
		return String.format("Service Type: Weekday Subscriber" + "\nStreet Address: " + getAddress() 
								+ "\nSubscription Rate: RM%.2f/week", getSubscriberRate());
	}
}	
