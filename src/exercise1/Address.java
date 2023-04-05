package exercise1;

public class Address {
	public String line1;
	public String line2;
	public String line3;
	public String postcode;
	public String country;
	
	@Override
	public String toString() {
		return line1 + ", " + line2 + ", " + line3 + ", " + postcode + ", " + country;
	}
	
}
