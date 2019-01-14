
public abstract class Member {

	private String name;
	private int age;
	private int booksRented;
	protected String membershipStatus;
	
	public Member(String name, int age, int booksRented) {
		
		this.name = name;
		this.age = age;
		this.booksRented = booksRented;
		
	}
	
	public void getInfo() {
		System.out.println("--- Member Info ---");
		System.out.println("Name: "+name);
		System.out.println("Membership status: " +membershipStatus);
	}
}
