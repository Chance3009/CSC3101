// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 10

package lab10;

public abstract class BankAccount {
	protected String id;
	protected double balance;
	
	// Create BankAccount with id and balance
	public BankAccount(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// Return id
	public String getId() {
		return id;
	}
	
	// Return balance
	public double getBalance() {
		return balance;
	}
	
	// Return String representation of BankAccount
	@Override
	public String toString() {
		return String.format("Customer ID: %s\nBalance: RM%.2f\n", id, balance);
	}
	
	// Abstract method withdraw
	public abstract boolean withdraw(double amount);
	
	// Abstract method deposit
	public abstract void deposit(double amount);
}
