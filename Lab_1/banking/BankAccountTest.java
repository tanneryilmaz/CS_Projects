package banking;

public class BankAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount();
		CheckingAccount checking = new CheckingAccount("Sarah", 500.0);
		
		savings.deposit(1000.0);
		checking.withdraw(100.0);
		savings.transfer(checking, 200.0);
		
		System.out.println(savings.toString());
		System.out.println("\n" + checking.toString());
		
		savings.addInterest(5.0);
		checking.deductFees();
		
		System.out.println("\n" + savings.toString());
		System.out.println("\n" + checking.toString());
		
	}
}
