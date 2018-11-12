
public class UKStore extends CarStore {

	@Override
	protected Car createCar(String type, String color) {
		
		Car car;
		if (type.equals("SUV")) {
			car = new SUVCarUK();
		} else if (type.equals("Sedan")) {
			car = new SedanCarUK();
		} else if (type.equals("Cabriolet")) {
			car = new CabrioletCar();
		} else if (type.equals("Hatchback")) {
			car = new HatchbackCar();
		} else {

			System.out.println("Not possible to manufacture!!!");
			car = null;
		}

		return car;

	
	}

}
