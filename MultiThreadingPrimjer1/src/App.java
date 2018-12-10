
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot robi = new Robot("RoboCop");
		Runnable rnb = new ThreadJob();
		Thread thr = new Thread(rnb);
		thr.setName("Prva nit");
		
			
			
			System.out.println("****** Before in main ******* ");
			System.out.println("Message in main thread before our thread....");
			robi.robotDescription();
			
			
			thr.start();
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("****** After in main ******** ");
			System.out.println("Message - final in main");
			
			
			
		
		
	}

}
