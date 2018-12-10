import java.util.Random;

public class BankAccount {

	private double balance;

	public BankAccount() {
		Random n = new Random();
		this.balance = (1000 + (2000 - 1000) * n.nextDouble());
		this.balance = Math.round(balance * 100.0) / 100.0;
		System.out.println("Total Account Money: " + balance);
		
	}


	public double getBalance() {

		return balance;

	}


	public void withdrawFromAcc(double amnt) {
		balance = balance - amnt;
		
		
	}

}
