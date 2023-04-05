// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_3;

import java.util.Date;


public class Account {
	private static double annualInterestRate;
	private int id;
	private double balance;
	private Date dateCreated;
	
	// Create default Account object
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	// Create Account object with id, balance, annualInterestRate
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		Account.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	
	// Return id
	public int getId() {
		return id;
	}
	
	// Set new id
	public void setId(int id) {
		this.id = id;
	}
	
	// Return balance
	public double getBalance() {
		return balance;
	}
	
	// Set new balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Return annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	// Set new annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	// Return dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Calculate and return monthlyInterestRate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	// Calculate and return monthlyInterest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	// Withdraw money
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// Deposit money
	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public String toString() {
		return String.format("\n_______________________Account %d_______________________\nBalance: RM%.2f\nMonthly Interest: RM%.2f\nDate Created: ", 
								id, balance, getMonthlyInterest()) + dateCreated;
	}
}
