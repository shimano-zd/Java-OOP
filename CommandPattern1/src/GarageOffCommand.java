
public class GarageOffCommand implements CommandInterface {

	GarageDoor gd;
	
	public GarageOffCommand(GarageDoor d) {
		this.gd = d;
	}
	@Override
	public void execute() {

		gd.close();
		gd.lightOff();
	}

	@Override
	public void undo() {

		gd.open();
		gd.lightOn();
		gd.stop();
	}

}
