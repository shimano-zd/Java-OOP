import java.util.Scanner;

public class AbstractFactoryV1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Application ap;
			
			String ui;
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi OS");
			ui = sc.nextLine();
			
			if(ui.equals("win")) {
				ap = new Application(new WINGUIfactory());
				ap.createUI();
				ap.paint();
			}
			else if(ui.equals("mac")) {
				ap = new Application(new MACGUIfactory());
				ap.createUI();
				ap.paint();
				
			}
			else {
				System.out.println("Unijeli ste glupost, nemojte to");
			}
			
	}

}
