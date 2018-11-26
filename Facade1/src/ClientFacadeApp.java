
public class ClientFacadeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			AirCondSysFacade facade = new AirCondSysFacade();
			
			facade.startAirConditioningSystem();
			System.out.println("*******");
			facade.stoptAirConditioningSystem();
	}

}
