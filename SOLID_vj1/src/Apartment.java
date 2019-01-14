
public class Apartment{

	private String location;
	private String category;
	private Categorize cat;
	
	public Apartment() {
		
	}
	
	public void setCategorization(Categorize cat) {
		this.cat = cat;
		cat.categorize();
	}
	public void description() {
		System.out.println("This apartment is located in Zadar");
	}
	
	public void categorize() {
		cat.categorize();
	}
	
	/*
	 * ako booking servis promijeni sustav rezervacije, morati cemo mijenjati API kod klijenata
	 * umjesto na servisu ili u klasi apartman
	 */
	
	/*
	 * ako se promijeni nacin kategorizacije, morati cemo svakom apartmanu njegovom metodom
	 * mijenjati polje
	 */
	
	/*
	 * ako se pojavi novi nacin placanja, morati cemo u svaki user postaviti novu metodu
	 * bilo bi dobro implementirati strategy u tom slucaju
	 */
}
