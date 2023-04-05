// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_3;

public class SavingsAccount extends Account{
	// Create default SavingsAccount object
	public SavingsAccount() {
		super();
	}
	
	// Create SavingsAccount object with id, balance, annualInterestRate
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
	}
	
	// Override withdraw method in Account class
	@Override
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			super.withdraw(amount);
		} else {
			System.out.printf("Error, cannot withdraw RM%.2f from your account\n", amount);
		}
	}
}
