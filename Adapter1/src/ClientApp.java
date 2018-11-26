
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewPrinter printer = new NewPrinter();
		
		Adapter ad = new Adapter(printer);
		
		// nova grafika
		ad.plotGraphics(new NewGraphics());
		
		// stara grafika
		printer.ispisGrafike();
		
	}

}
