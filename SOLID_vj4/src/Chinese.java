
public class Chinese implements GenerateChineseRecipe, AdditionalInfoAndSources{

	@Override
	public void provideAdditionalInfo() {
		System.out.println("More info on chinese-cooking.com");
		
	}

	@Override
	public void recommendWebSources() {
		System.out.println("We recommend Pei Ling for more advice");
		
	}

	@Override
	public void generateChineseRecipe() {
		System.out.println("Chinese duck: 500g duck, extra spices");
		
	}

	public void bla() {
		System.out.println("bla");
	}
}

	