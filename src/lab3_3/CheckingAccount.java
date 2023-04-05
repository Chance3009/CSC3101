// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_3;

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	// Create default CheckingAccount object
	public CheckingAccount() {
		super();
		overdraftLimit = -100;
	}
	
	// Create CheckingAccount object with id, balance, annualInterestRate, overdraftLimit
	public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
		super(id, balance, annualInterestRate);
		this.overdraftLimit = overdraftLimit;
	}

	// Return overdraftLimit
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	// Set new overdraftLimit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	// Override withdraw method in Account class
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= overdraftLimit) {
			setBalance(getBalance() - amount);
		} else {
			System.out.printf("Error, cannot withdraw RM%.2f from your account, overdraft limit has exceeded\n", amount);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\nOverdraft limit: RM%.2f", overdraftLimit);
	}
}	
