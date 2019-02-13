package banking;
/**
 * This class represents a savings account. 
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount() {
		super();
		this.interestRate = 1;  
	}
	
	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public SavingsAccount(String name, double initBalance, double interestRate) {
		super(name, initBalance);
		this.interestRate = interestRate;
	}
	
	/**
	 *  Pays the account interest using default interest rate
	 */
	public void addInterest() {
		deposit(((interestRate / 100.0) * balance));
	} 
	
	/**
	 *  Pays the account interest given an interest rate
	 *  @param interestRate is the interest rate 
	 */
	public void addInterest(double interestRate) {
		deposit(((interestRate / 100.0) * balance));
	}	
}