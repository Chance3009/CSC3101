// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 10

package lab10;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount acc1 = new SavingsAccount("J23455", 100.00);
		boolean result = acc1.withdraw(20.00);
		
		acc1.deposit(20.00);
	}
}
