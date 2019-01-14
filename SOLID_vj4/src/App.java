
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mexican mex = new Mexican();
		Mediterranean med = new Mediterranean();
		Chinese chi = new Chinese();
		Indian ind = new Indian();
		
		mex.generateMexicanRecipe();
		med.generateMediterraneanRecipe();
		chi.generateChineseRecipe();
		ind.generateIndianRecipe();
	}

}
