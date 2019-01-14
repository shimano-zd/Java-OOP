
public class Apprentice extends Person {


	public Apprentice(String name) {
		this.name = name;
		if(description==null) {
			this.description = "Apprentice";
		}

	}

	@Override
	public void askforAdvice() {

		System.out.println(description + " ask for an advice...");

	}

	@Override
	public void bringTools() {

		System.out.println("Every repairman can and should bring a tool bag ...");

	}



}