// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 10

package lab10;

public class SavingsAccount extends BankAccount {
	
	// Create SavingsAccount with id and initialDeposit
	public SavingsAccount(String id, double initialDeposit) {
		super(id, initialDeposit);
	}
	
	// Withdraw money from account
	@Override
	public boolean withdraw(double amount) {
		// Return false if balance below 10 after withdrawal
		if (balance - amount - 2 < 10) {
			System.out.println("Insufficient balance, withdrawal failed.");
			return false;
		}
		
		// Perform withdrawal 
		balance -= (amount + 2);
		System.out.println(this);
		return true;
	}

	// Deposit money into account
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println(this);
	}

}
