
public class CheckingAccount extends BankAccount {
	
	protected double interestRate = 0.03; 
	static final double OVERDRAFT_FEE = 30.00;
	
	CheckingAccount(String firstName, String lastName, int accountID) {
		super(firstName, lastName, accountID);
	}

	protected void processWithdrawal(double withdrawalAmount) {
		balance = balance - withdrawalAmount; 
		System.out.println("$" + withdrawalAmount + " has been withdrawn.");
		if (balance < 0) {
			balance = balance - OVERDRAFT_FEE;
			System.out.println("An additional $30.00 overdraft fee has been deducted.");
			super.getBalance();
		} else {
			super.getBalance();
		}
	}
	
	protected void displayAccount() {	
		System.out.println("Account Summary:\n"
				+ firstName + " " + lastName + "\n" 
				+ "Account ID: " + String.format("%08d", accountID) + "\n"
				+ "Current account balance: $" + balance + "\n" 
				+ "Current interest rate: " + interestRate + "%");
	}
}
