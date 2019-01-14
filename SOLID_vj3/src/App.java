
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Master> list = new ArrayList<>();

		list.add(new NoviceMaster("Marko"));
		list.add(new ExperiencedMaster("Josipa"));
		list.add(new SupremeMaster("Vedrana"));
		
		Apprentice appr = new Apprentice("Stipe");

		appr.bringTools();
		
		list.forEach(mst -> mst.askforAdvice());
		list.forEach(mst -> {
			try {
				mst.giveAdvice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

}