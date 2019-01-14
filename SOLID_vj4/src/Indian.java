
public class Indian implements GenerateIndianRecipe, AdditionalInfoAndSources{

	@Override
	public void provideAdditionalInfo() {
		System.out.println("You can find more info on www.india.com");
		
	}

	@Override
	public void recommendWebSources() {
		System.out.println("More sources can be found on www.india-source.com");
		
	}

	@Override
	public void generateIndianRecipe() {
		System.out.println("Indian chicken: 400g chicken");
		
	}

}
