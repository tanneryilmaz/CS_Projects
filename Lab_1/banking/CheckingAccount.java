package banking;
/**
 * This class represents a checking account. 
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class CheckingAccount extends BankAccount{
	
	private int transactionCount = 0;
	private static final double TRANSACTION_FEE = 3.0;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(String name, double initBalance) {
		super(name, initBalance);
	}
	
	/**
	 * Deducts transaction fees from the account depending on the number of transactions that occurred since the 
	 * last time fees were deducted from the account. Transaction count is incremented by 1 each time money is deposited, or
	 * withdrawn, or transferred to/from this account. 
	 */
	public void deductFees() {
		balance -= transactionCount * TRANSACTION_FEE;
		transactionCount = 0;
	}
	
	/**
	 * It is desired that a checking account's transactionCount field be incremented by 1 each time a transaction in the checking account occurs. 
	 * The added functionality of increasing the transaction count of the checking account instance is achieved by overriding the setBalance() method defined
	 * in BankAccount.java
	 */
	@Override
	public void setBalance(double newBalance) {
		balance = newBalance;
		transactionCount += 1;
	}
}