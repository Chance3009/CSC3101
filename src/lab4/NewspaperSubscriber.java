// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 4

package lab4;

public class NewspaperSubscriber {
	private String address;
	private double subscriberRate;
	
	// Return address
	public String getAddress() {
		return address;
	}
	
	// Set a new address
	public void setAddress(String address) {
		this.address = address;
	}
	
	// Return subscriberRate
	public double getSubscriberRate() {
		return subscriberRate;
	}
	
	// Set a new subscriberRate
	public void setSubscriberRate(double subscriberRate) {
		this.subscriberRate = subscriberRate;
	}
	
	// Check whether address of two NewspaperSubscriber objects are equal, return false if the object compared is not an instance of NewspaperSubscriber
	public boolean equals(Object o) {
		if (o instanceof NewspaperSubscriber)
			return address.equals(((NewspaperSubscriber)o).getAddress());
		return false;
	}
}
