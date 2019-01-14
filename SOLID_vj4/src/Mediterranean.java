
public class Mediterranean implements GenerateMediterraneanRecipe, AdditionalInfoAndSources{

	@Override
	public void provideAdditionalInfo() {
		System.out.println("More info on www.medi-cooking.com");
		
	}

	@Override
	public void recommendWebSources() {
		System.out.println("Recommended sources www.adriatic-boiling.com");
		
	}

	@Override
	public void generateMediterraneanRecipe() {
		System.out.println("Mediterranean recipe: some fish, seafood, tomatoes...");
		
	}

}
