
public class AirConditionFanTemp {

	private int speed;
	private float temp;
	
	public AirConditionFanTemp() {
		// TODO Auto-generated constructor stub
	}

	protected int getSpeed() {
		
		return speed;
	}

	protected void setSpeed(int speed) {
		System.out.println("Setting the fan speed to "+speed);
		this.speed = speed;
	}

	protected float getTemp() {
		return temp;
	}

	protected void setTemp(float temp) {
		System.out.println("Setting the temperature to "+temp);
		this.temp = temp;
	}
	
	
}
