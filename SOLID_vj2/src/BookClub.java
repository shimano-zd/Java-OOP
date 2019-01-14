import java.util.ArrayList;

public class BookClub {

	private ArrayList<Member> listOfMembers;
	
	public BookClub() {
		
		listOfMembers = new ArrayList<>();
		
	}
	
	public void newMember(Member m) {
		listOfMembers.add(m);
	}
	
	public void removeMember(Member m) {
		listOfMembers.remove(m);
	}
	
	public void info() {
		System.out.println("-----------");
		System.out.println("This book club has "+listOfMembers.size() +" members");
		for(Member m : listOfMembers) {
			m.getInfo();
		}
		
	}
}
