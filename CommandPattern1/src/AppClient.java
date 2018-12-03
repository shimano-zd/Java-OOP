
public class AppClient {

	public static void main(String[] args) {
		
		// invoker
		RemoteController rc = new RemoteController();
		
		// receivers
		Light light = new Light();
		Stereo stereo = new Stereo();
		GarageDoor garage = new GarageDoor();
		
		// command objects
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lighOffCommand = new LightOffCommand(light);
		StereoCommand stereoOnCommand = new StereoCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		GarageDoorOpenedCommand garageOnCommand = new GarageDoorOpenedCommand(garage);
		GarageOffCommand garageOffCommand = new GarageOffCommand(garage);
		
		// programming buttons
		rc.setCommand(0, lightOnCommand, lighOffCommand);
		rc.setCommand(1, stereoOnCommand, stereoOffCommand);
		rc.setCommand(2, garageOnCommand, garageOffCommand);
		
		// info for Invoker
		System.out.println(rc.toString());
		
		// buttons pressed
		for(int i = 0 ; i < rc.commandSlotsON.length; i++) {
			rc.buttonOnWasPressed(i);
			rc.buttonOffWasPressed(i);
			
		}
		
		// undo for stereo
		System.out.println("---------------");
		System.out.println("Let's turn the stereo ON again");
		rc.buttonOnWasPressed(1);
		rc.buttonUndoWasPressed();
		
		
		
		
	}

}
