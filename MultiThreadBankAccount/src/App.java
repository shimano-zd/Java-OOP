
public class App {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		Runnable transaction = new BankTransaction(account);
		Thread entOne = new Thread(transaction);
		Thread entTwo = new Thread(transaction);


		entOne.setName("Ivan");
		entTwo.setName("Rebeka");

		entOne.start();
		entTwo.start();

	}

}
