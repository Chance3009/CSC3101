// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_3;

public class TestAccount {
	public static void main(String[] args) {
		// Create account, savings, and checking object
		Account account = new Account(1122, 20_000, 4.5);
		SavingsAccount savings = new SavingsAccount(123, 1000, 3);
		CheckingAccount checking = new CheckingAccount(666, 1000, 3, -200);
		
		// Perform withdraw and deposit on account
		account.withdraw(2500);
		account.deposit(3000);
		
		// Perform withdraw and deposit on savings
		savings.withdraw(1500);
		savings.deposit(200);
		savings.withdraw(500);
		
		// Perform withdraw and deposit on checking
		checking.withdraw(1500);
		checking.deposit(200);
		checking.withdraw(1300);

		// Print info of account, savings, and checking
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
