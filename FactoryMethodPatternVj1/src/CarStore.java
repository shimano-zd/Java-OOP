
public abstract class CarStore {


	public Car orderCar(String type, String color){
		
		Car car;

		car = createCar(type, color);
		car.manufacture();
		car.paint(color);
		car.deliver();
		return car;
	}

	protected abstract Car createCar(String type, String color);

	//we may have more methods here
}
