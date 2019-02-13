package token;
/**
 * Represents token dispensing machines. 
 * @author Tanner Yilmaz
 * @version 1.0
 */
public class Token {
	
	private int tokenInventory;
	private int quarterInventory;
	private String password;
	
	/**
	 * Initializes new token machine that contains zero quarters and zero tokens with 
	 * default password "123456".
	 */
	public Token() {
		tokenInventory = 0;
		quarterInventory = 0;
		password = "123456";
	}
	
	/**
	 * Initializes new token machine.
	 * @param password The desired password for the machine. 
	 * @param quarters The initial number of quarters that the machine has.
	 * @param tokens The initial number of tokens that the machine has. 
	 */
	public Token(String password, int quarters, int tokens) {
		this.password = password;
		tokenInventory = tokens;
		quarterInventory = quarters;
	}

	/**
	 * Adds tokens to the machine.
	 * @param password User must provide the password to reload the machine. 
	 * @param numTokens Number of tokens to be added.
	 */
	public void reloadMachine(String password, int numTokens) {
		if(authenticateUser(password)) {
			tokenInventory += numTokens;
		}
	}
	
	/**
	 * Empties all tokens from the token machine.
	 * @param password User must provide the password to reload the machine. 
	 */
	public void emptyMachine(String password) {
		if(authenticateUser(password)) {
			tokenInventory = 0;
		}
	}
	
	/**
	 * Allows user to purchase tokens from the machine. 
	 * @param NumTokens The number of tokens being purchased.
	 */
	public void buyTokens(int numTokens) {
		if(tokenInventory > 0) {
			tokenInventory -= numTokens;
			System.out.println("You have received " + numTokens + " tokens");
		}
	}
	
	/**
	 * Changes the old password to a new password. User must provide the correct old 
	 * password in order to change the password
	 * @param newPassword the new password 
	 * @param oldPassword the old password
	 */
	public void changePassword(String oldPassword, String newPassword) {
		if(authenticateUser(oldPassword)) {
			this.password = newPassword;
		}
	}
	
	/**
	 * Authenticates the token machine's user.
	 * @param password User entered password
	 * @return true if user has entered the correct password. false otherwise.
	 */
	private boolean authenticateUser(String password) {
		if(password.equals(this.password)) {
			return true;
		}
		else {
			System.out.println("You entered an invalid password.");
			return false;
		}
	}
	
	/**
	 * Returns the total number of tokens in the machine. 
	 * @return number of tokens in the machine. 
	 */
	public int getTokenInventory() {
		return tokenInventory;
	}
	
	/**
	 * Returns the amount of money in the machine. 
	 * @return Number of dollars in the machine.
	 */
	public double getDollarBalance() {
		return quarterInventory / 4.0;
	}

}
