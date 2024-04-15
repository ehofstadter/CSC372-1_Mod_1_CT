import javax.swing.*;
import java.awt.event.*;

/*******************************************************************************
 * A simple GUI application to allow users to interact with a fake bank account
 * Allows user to set initial balance, make additional withdrawals and deposits
 * On application exit, displays final message with account balance
*******************************************************************************/
public class BankApplication {

	public static void main(String[] args) {
		
		//instantiate a new bank account
		BankAccount newAccount = new BankAccount();
		
		//create GUI frame with an event listener to display balance on close
		JFrame frame = new JFrame("Your Fake Bank Account");
			frame.setSize(300,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.addWindowListener(new WindowAdapter() {
		        @Override
		        public void windowClosing(WindowEvent e) {
		            JOptionPane.showMessageDialog(null, newAccount.getBalance());
		        }

		        @Override
		        public void windowClosed(WindowEvent e) {
		        }
		    });

		//create panel and static label for GUI
		JPanel panel = new JPanel();
		JLabel label = new JLabel("What would you like to do?");
			panel.add(label);
			
		//create buttons for deposit, withdrawal, balance
		//each button calls the corresponding method from BankAccount class upon action event
		JButton balanceButton = new JButton("Check my balance.");
			balanceButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(frame, newAccount.getBalance());
				}
			});
		JButton withdrawButton = new JButton("Make a withdrawal.");
			withdrawButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String withdrawString = JOptionPane.showInputDialog("Enter the amount to withdraw.");
					newAccount.withdrawal(Double.parseDouble(withdrawString));
					JOptionPane.showMessageDialog(frame, "$" + withdrawString + " has been withdrawn from your account.");
			}
		});
		JButton depositButton = new JButton("Make a deposit.");
			depositButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String depositString = JOptionPane.showInputDialog("Enter the amount to deposit.");
					newAccount.deposit(Double.parseDouble(depositString));
					JOptionPane.showMessageDialog(frame, "$" + depositString + " has been deposited to your account.");
			}
		});
			panel.add(balanceButton);
			panel.add(withdrawButton);
			panel.add(depositButton);
			frame.add(panel);
		 
		//on program start, display an initial option pane to request and set starting balance
		String balanceString = JOptionPane.showInputDialog("Welcome! Please enter your starting balance.");
			newAccount.balance = Double.parseDouble(balanceString); 
			JOptionPane.showMessageDialog(frame, newAccount.getBalance());
		
		//once balance is received, set frame visible to allow access to the GUI
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}	
}