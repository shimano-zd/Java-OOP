
public class User {

	private String name;
	private int id;
	private static int cnt;
	private Booking booking; // user moze imati bilo koji oblik bookinga
	private Payment payment; // user moze imati bilo koji oblik placanja
	
	public User(String name) {

		this.name = name;
	}
	
	public void reserve(Booking b, Payment p, Apartment a) {
		setBooking(b);
		setPayment(p);
		pay();
		makeBooking(a);
		makeCommentOnAccommodation(a);
		
	}
	
	
	public void setBooking(Booking b) { // odabir bookinga
		this.booking = b;
	}
	public void makeBooking(Apartment a) { // booking apartmana
		
		booking.book(a);
	}
	
	public void setPayment(Payment p) {
		
		this.payment = p; // user odabire nacin placanja
	}
	
	public void pay() {
		System.out.println("User " + name + ":");
		payment.makePayment(); // user placa
	}
	
	public void cancelBooking(Apartment a) {
		System.out.println("User "+name+": ");
		booking.cancelBooking(a);
	}
	
	public void makeCommentOnAccommodation(Apartment a) {
		System.out.println(name + " made a comment about this apartment");
	}
	
	
}
