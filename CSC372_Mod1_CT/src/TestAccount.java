
public class TestAccount {
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount("Evan", "Hofstadter", 1074); 
		myAccount.getBalance();
		
		myAccount.deposit(600);
		myAccount.getBalance();
		
		myAccount.withdrawal(200);		
		myAccount.accountSummary();
		
		myAccount.setFirstName("Chadwick");

		System.out.println(myAccount.getFirstName() + " " +
				myAccount.getAccountID() + " " +
				myAccount.getLastName());
		
		System.out.println("\n\n\nSwitching to checking account \n\n\n");
		
		CheckingAccount myChecking = new CheckingAccount("Boss", "Hog", 5541);
		myChecking.getBalance();
		
		myChecking.deposit(400);
		myChecking.getBalance();
		
		myChecking.processWithdrawal(500);		
		myChecking.displayAccount();
		
		myChecking.setFirstName("Chadwick");

		System.out.println(myChecking.getFirstName() + " " +
				myChecking.getAccountID() + " " +
				myChecking.getLastName());
	}
}
