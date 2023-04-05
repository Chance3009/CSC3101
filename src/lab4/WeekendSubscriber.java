// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 4

package lab4;

public class WeekendSubscriber extends NewspaperSubscriber{
	// Create WeekendSubscriber object with default subscriberRate of 4.5
	public WeekendSubscriber() {
		setSubscriberRate(2);
	}
	
	// Return string representation of WeekendSubscribers
	@Override
	public String toString() {
		return String.format("Service Type: Weekend Subscriber" + "\nStreet Address: " + getAddress() 
								+ "\nSubscription Rate: RM%.2f/week", getSubscriberRate());
	}
}	

