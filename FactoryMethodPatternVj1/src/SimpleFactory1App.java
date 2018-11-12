
public class SimpleFactory1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		CarStore csEU = new EUStore();
		
		csEU.orderCar("SUV", "red");
		
		csEU.orderCar("Sedan", "blue");
		
		CarStore csUK = new UKStore();
		csUK.orderCar("SUV", "black");
		
		csUK.orderCar("Sedan", "blue");
		
		
		
		
	}

}
