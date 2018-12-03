
public class GarageDoorOpenedCommand implements CommandInterface {

	GarageDoor gd;
	
	public GarageDoorOpenedCommand(GarageDoor g) {
		this.gd = g;
	}
	@Override
	public void execute() {
		System.out.println("------");
		gd.open();
		gd.lightOn();
		gd.stop();
	}

	@Override
	public void undo() {
		System.out.println("------");
		gd.close();
		gd.lightOff();
	}

}
