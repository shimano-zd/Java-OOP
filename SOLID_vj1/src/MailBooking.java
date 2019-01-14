
public class MailBooking implements Booking {

	@Override
	public void book(Apartment a) {
		System.out.println("Booking via mail");

	}

	@Override
	public void cancelBooking(Apartment a) {
		System.out.println("Sending mail to cancel booking");
		
	}

}
