
public class OnlineBooking implements Booking {

	@Override
	public void book(Apartment a) {
		
		System.out.println("Booking online");
		
	}

	@Override
	public void cancelBooking(Apartment a) {
		System.out.println("Cancelling online booking");
		
	}

}
