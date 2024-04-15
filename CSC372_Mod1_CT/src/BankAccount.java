public class BankAccount {
	
	//class variables
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	

	//constructor method
	BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		balance = 0;	
	}

	//deposit and withdrawal methods for basic account adjustment functions
	protected void deposit(double depositAmount) {
		balance = balance + depositAmount;
		System.out.println("$" + depositAmount + " has been deposited.");
	}
	
	protected void withdrawal(double withdrawalAmount) {
		balance = balance - withdrawalAmount;
		System.out.println("$" + withdrawalAmount + " has been withdrawn.");
	}
	
	
	//setter methods
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	protected void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
	//getter methods
	protected String getFirstName() {
		return firstName;
	}
	
	protected String getLastName() {
		return lastName;
	}
	
	protected String getAccountID() {
		return String.format("%08d", accountID);
	}
	
	
	//balance and account summary functions to report account information to user
	protected void getBalance() {
		System.out.println("Current account balance: $" + balance); 
	}
	
	protected void accountSummary() {	
		System.out.println("Account Summary:\n"
				+ firstName + " " + lastName + "\n" 
				+ "Account ID: " + String.format("%08d", accountID) + "\n"
				+ "Current account balance: $" + balance);
	}
	
}
