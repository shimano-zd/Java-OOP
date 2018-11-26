
public class AirCondSysFacade {
	
		
	AirConditionFanTemp tempSystem;
	AirConditionIonizer ionSystem;
	AirConditionMode modeSystem;
	SubSystemEnergy energySystem;
	SubSystemTimer timerSystem;

	public AirCondSysFacade() {
		tempSystem = new AirConditionFanTemp();
		ionSystem = new AirConditionIonizer();
		modeSystem = new AirConditionMode();
		energySystem = new SubSystemEnergy();
		timerSystem = new SubSystemTimer();
	}

	public void startAirConditioningSystem() {

		tempSystem.setSpeed(5);
		tempSystem.setTemp(25);
		ionSystem.setIonON();
		modeSystem.setMode("Turbo");
		System.out.println("Mode set to " + modeSystem.getMode());
		energySystem.on();
		energySystem.setMode("Low Energy");
		System.out.println("Energy mode set to " + energySystem.getMode());
		timerSystem.program(2);
		System.out.println("Timer program set to " + timerSystem.getProgram() + " minutes");
		timerSystem.on();
	}

	public void stoptAirConditioningSystem() {

		tempSystem.setSpeed(0);
		tempSystem.setTemp(0);
		ionSystem.setIonOFF();
		modeSystem.setMode("OFF");
		System.out.println("Mode set to " + modeSystem.getMode());
		energySystem.off();
		energySystem.setMode("OFF");
		System.out.println("Energy mode set to " + energySystem.getMode());
		timerSystem.program(0);
		System.out.println("Timer program set to " + timerSystem.getProgram() + " minutes");
		timerSystem.off();
	}
}
