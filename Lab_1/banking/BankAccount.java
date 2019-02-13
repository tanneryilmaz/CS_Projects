package banking;
/**
 * This class represents a bank account. 
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class BankAccount{
	
	protected String name;
	protected double balance;
	
	public BankAccount() {
		name = "default_name";
		balance = 0.0;
	}
	
	public BankAccount(String name, double initBalance) {
		this.name = name;
		this.balance = initBalance;
	}
	
	/**
	 * Transfers money to accounts. 
	 * @param depositAmt Amount being deposited
	 */
	public void deposit(double depositAmt) {
		setBalance(balance += depositAmt);
	}
	
	/**
	 * Withdraws money from accounts. 
	 * @param withdrawAmt Amount being withdrawn
	 */
	public void withdraw(double withdrawAmt) {
		setBalance(balance -= withdrawAmt);
	}
	
	/** Transfers money out of this account.
	 * @param receivingAccount is the account receiving the transfer.
	 * @param transferAmt is the amount being transferred.
	 */
	public void transfer(BankAccount receivingAccount, double transferAmt) {
		withdraw(transferAmt);
		receivingAccount.deposit(transferAmt);
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	@Override
	public String toString() {
		return "Account holder name: " + name + "\nAccount Balance: " + balance;
	}
}