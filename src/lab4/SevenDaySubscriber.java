// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 4

package lab4;

public class SevenDaySubscriber extends NewspaperSubscriber{
	// Create SevenDaySubscriber object with default subscriberRate of 4.5
	public SevenDaySubscriber() {
		setSubscriberRate(4.5);
	}
	
	// Return string representation of SevenDaySubscribers
	@Override
	public String toString() {
		return String.format("Service Type: Seven Day Subscriber" + "\nStreet Address: " + getAddress() 
								+ "\nSubscription Rate: RM%.2f/week", getSubscriberRate());
	}
}	
