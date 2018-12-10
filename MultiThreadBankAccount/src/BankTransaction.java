import java.util.Random;

public class BankTransaction implements Runnable {

	private BankAccount account;

	public BankTransaction(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {

		for (int k = 1; k <= 10; k++) {
			Random r = new Random();
			double money = Math.round(((50 + 300)*r.nextDouble())*100)/100.0;
			
			if(account.getBalance() > 0) {
			makeWithdrawal(money);
			}
			else {
				System.out.println("The account has no more money");
				Thread.currentThread().stop();
			}
			
		}

	}

	public synchronized void makeWithdrawal(double amount) {

		if (account.getBalance() > amount) {

			System.out.println(Thread.currentThread().getName() + " is ready to withdraw " + amount);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			account.withdrawFromAcc(amount);
			System.out.println(Thread.currentThread().getName() + " withdrew "+ amount);
			System.out.println("Remaining account: " + account.getBalance());


		} else {
			System.out.println(Thread.currentThread().getName() + " wants to withdraw "+amount +" but he can only withdraw " + account.getBalance());
			
			System.out.println("Withdrew "+ account.getBalance() +" for " + Thread.currentThread().getName());
			account.withdrawFromAcc(account.getBalance());
			System.out.println("No more money on the account!");
			Thread.currentThread().stop();
			
		}

	}

}
