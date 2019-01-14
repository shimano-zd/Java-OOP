
public class App {

	public static void main(String[] args) {
		
		User user = new User("Satoshi Tonkatsu");
		Apartment apartment = new Apartment();
		
		apartment.setCategorization(new StarCategory());
		apartment.description();
		
		user.reserve(new OnlineBooking(), new CashPayment(), apartment);
		System.out.println("------");
		user.cancelBooking(apartment);

	}

}
