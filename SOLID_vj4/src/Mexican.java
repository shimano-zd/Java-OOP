
public class Mexican implements GenerateMexicanRecipe, AdditionalInfoAndSources{

	@Override
	public void provideAdditionalInfo() {
	System.out.println("More info at MexicanFood.com");
		
	}

	@Override
	public void recommendWebSources() {
		System.out.println("Find more info on mexico-web.com");
		
	}

	@Override
	public void generateMexicanRecipe() {
		System.out.println("Mexican tortilla: tomatoes, chicken, corn");
		
	}

}
