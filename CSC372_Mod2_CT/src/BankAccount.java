
public class BankAccount {
	
	//class variables
	double balance;
	
	//constructor method
	BankAccount() {	
	}
	
	
	//deposit and withdrawal methods for basic account adjustment functions
	protected void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}
	
	protected void withdrawal(double withdrawalAmount) {
		balance = balance - withdrawalAmount;
	}
	
	
	//balance function to report information to user
	protected String getBalance() {
		String balanceString = new String();
		balanceString = "Current account balance: $" + balance; 
		return balanceString;
	}
		
}
