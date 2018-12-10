
public class ThreadJob implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		somethingSpecial();
		System.out.println("Final message from thread...");

	}

	public void somethingSpecial() {
		go2Special();
	}

	public void go2Special() {

		System.out.println("In the thread stack - first message...");
	}

}