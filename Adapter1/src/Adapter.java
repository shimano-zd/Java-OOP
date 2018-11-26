
public class Adapter implements PrintInterface{

	 NewPrinter np;
	 
	 
	 
	 public Adapter(NewPrinter n) {
		 this.np = n;
	 }

	@Override
	public void plotGraphics(NewGraphics s) {
		
		System.out.println("Konvertiram grafiku");
		np.ispisGrafike();
		}
		
	}
	
	
	
	
	 
	

