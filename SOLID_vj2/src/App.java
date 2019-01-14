
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// previous status members
		
		BookClub club = new BookClub();
		
		Member silver = new SilverMember("George", 45, 200);
		club.newMember(silver);
		Member gold = new GoldenMember("Janice", 48, 320);
		club.newMember(gold);
		Member bronze = new BronzeMember("Steven", 27, 50);
		club.newMember(bronze);
		Member platinum = new PlatinumMember("Duško", 72, 500);
		club.newMember(platinum);
		Member diamond = new DiamondMember("Sigmund", 91, 1024);
		club.newMember(diamond);
		
		club.info();
		
		
	}

}
